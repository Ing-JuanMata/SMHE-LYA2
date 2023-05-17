/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintactico;

import analisis.LlaveTabla;
import herramientas.Funcion;
import herramientas.TablaErrores;
import herramientas.TablaFunciones;
import herramientas.TablaSimbolos;
import java.util.ArrayList;

/**
 *
 * @author jujemataso
 */
public class smheSintaxVisitor extends smheBaseVisitor<Object> {

    private String ambito = "";
    private String tipoActual;
    private TablaSimbolos tabla;
    private TablaFunciones funciones;
    private TablaErrores errores;
    private Funcion funcionActual;
    private boolean parametro = false, varGlobal = false, funcion = false;
    private int anidamiento = 0;
    private ArrayList<Integer> anidamientos = new ArrayList<>();

    public smheSintaxVisitor(TablaSimbolos tabla, TablaFunciones funciones, TablaErrores errores) {
        this.tabla = tabla;
        this.funciones = funciones;
        this.errores = errores;
    }

    // <editor-fold defaultstate="collapsed" desc="Control de anidamiento">
    private int agregarAnidamiento() {
        if (anidamiento == 0 && anidamientos.isEmpty()) {
            anidamientos.add(1);
            anidamientos.add(0);
            anidamiento++;
            return 1;
        }
        anidamientos.set(anidamiento, anidamientos.get(anidamiento) + 1);
        anidamientos.add(0);
        return anidamientos.get(anidamiento++);
    }

    private void quitarAnidamiento() {
        if (anidamiento == 0) {
            ambito = ambito.split(":")[0];
            //anidamientos.clear();
            return;
        }
        if (anidamiento == 1) {
            ambito = ambito.split(":")[0];
            anidamiento--;
            return;
        }
        anidamientos.remove(anidamiento--);
        anidamientos.remove(anidamiento--);
        String cadena = "";
        for (int i : anidamientos) {
            cadena += ":" + i;
        }
        ambito = ambito.split(":")[0] + cadena;
    }
    // </editor-fold>

    @Override
    public Object visitLblInicio(smheParser.LblInicioContext ctx) {
        this.ambito = "programa";
        if (ctx.decGlobales() != null) {
            visit(ctx.decGlobales());
        }
        visit(ctx.comienzo());
        /*
            errores.getErrores().forEach((linea, error) -> System.out.println(error));
        this.tabla.getTabla().forEach((llave, contenido) -> {
            String simbolo = String.format("L%d %s:%s valor?: %s ambito: %s", contenido.linea, llave.id, contenido.tipo, contenido.valor, llave.ambito);
            System.out.println(simbolo);
        });
         */
        return null;
    }

    @Override
    public Object visitLblDeclaracionesGlobales(smheParser.LblDeclaracionesGlobalesContext ctx) {
        varGlobal = true;
        LlaveTabla llave = (LlaveTabla) visit(ctx.declaracion());
        if (llave == null) {
            return null;
        }
        int inicioDec = ctx.declaracion().start.getLine();
        String tipo = this.tabla.getTipo(llave);
        String tipoRes = ctx.expresion() != null ? (String) visit(ctx.expresion()) : null;
        if (ctx.ASIGNACION() != null) {
            if (tipoRes == null) {
                errores.agregarErrorSemantico("ESM4", inicioDec, "SIN VALOR", llave.id, tipo);
            } else {
                if (!tipoRes.equals(this.tabla.getTipo(llave))) {
                    errores.agregarErrorSemantico("ESM4", inicioDec, tipoRes, llave.id, tipo);
                }
            }
            this.tabla.agregarValor(llave, true);
            if (ctx.decGlobales() != null) {
                visit(ctx.decGlobales());
            }
            varGlobal = false;
            return null;
        } else {
            if (tipoRes != null) {
                errores.agregarErrorSintactico("ES7", inicioDec, "=");
                if (!tipoRes.equals(this.tabla.getTipo(llave))) {
                    errores.agregarErrorSemantico("ESM4", inicioDec, tipoRes, llave.id, tipo);
                }
                this.tabla.agregarValor(llave, true);
            }
        }

        if (ctx.decGlobales() != null) {
            visit(ctx.decGlobales());
        }
        varGlobal = false;
        return null;
    }

    @Override
    public Object visitLblDeclaracionesGramas(smheParser.LblDeclaracionesGramasContext ctx) {
        LlaveTabla llave = (LlaveTabla) visit(ctx.declaracion());
        if (llave == null) {
            return null;
        }
        int inicioDec = ctx.declaracion().start.getLine();
        String tipo = this.tabla.getTipo(llave);
        String tipoRes = ctx.expresion() != null ? (String) visit(ctx.expresion()) : null;
        if (ctx.ASIGNACION() != null) {
            if (tipoRes == null) {
                errores.agregarErrorSemantico("ESM4", inicioDec, "SIN VALOR", llave.id, tipo);
            } else {
                if (!tipoRes.equals(this.tabla.getTipo(llave))) {
                    errores.agregarErrorSemantico("ESM4", inicioDec, tipoRes, llave.id, tipo);
                }
            }
            this.tabla.agregarValor(llave, true);
            return null;
        } else {
            if (tipoRes != null) {
                errores.agregarErrorSintactico("ES7", inicioDec, "=");
                if (!tipoRes.equals(this.tabla.getTipo(llave))) {
                    errores.agregarErrorSemantico("ESM4", inicioDec, tipoRes, llave.id, tipo);
                }
                this.tabla.agregarValor(llave, true);
            }
        }

        return null;
    }

    // <editor-fold defaultstate="collapsed" desc="Visitas a declaraciones">
    @Override
    public Object visitLblDeclaraciones(smheParser.LblDeclaracionesContext ctx) {
        if (ctx.ID() == null) {
            errores.agregarErrorSintactico("ES6", ctx.start.getLine(), "No se ha encontrado el ID de la declaración");
            return null;
        }
        if (ctx.DECLARAR() == null) {
            errores.agregarErrorSintactico("ES7", ctx.start.getLine(), "declarar");
        }
        LlaveTabla id = new LlaveTabla(ctx.ID().getText(), ambito);
        if (varGlobal || parametro) {
            return id;
        }

        if (this.tabla.existe(id)) {
            this.errores.agregarErrorSemantico("ESM3", ctx.start.getLine(), id.id);
            return id;
        }

        int linea = ctx.start.getLine();
        boolean bTipo = ctx.tipo() == null;
        if (bTipo) {
            this.errores.agregarErrorSintactico("ES3", linea);
        }
        String tipo = !bTipo ? ctx.tipo().getText() : "Sin Tipo";
        this.tabla.agregarSimbolo(id, ctx.ID().getSymbol().getLine());
        this.tabla.agregarTipo(id, tipo);
        return id;
    }

    @Override
    public Object visitLblTipo(smheParser.LblTipoContext ctx) {
        return ctx.td.getText();
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Visitas a expresiones">
    @Override
    public Object visitLblExpresion(smheParser.LblExpresionContext ctx) {
        tipoActual = (String) visit(ctx.op2());
        return ctx.op1() != null ? visit(ctx.op1()) : tipoActual;
    }

    @Override
    public Object visitLblAndOr(smheParser.LblAndOrContext ctx) {
        if (!tipoActual.equals("logico")) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), tipoActual, "logica");
            tipoActual = "logico";
        }
        String tipoOp2 = (String) visit(ctx.op2());
        if (!tipoOp2.equals("logico")) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), tipoOp2, "logica");
        }

        tipoActual = "logico";
        if (ctx.op1() != null) {
            return (String) visit(ctx.op1());
        }
        return tipoActual;
    }

    @Override
    public Object visitLblAndOr1(smheParser.LblAndOr1Context ctx) {
        if (ctx.op1() != null) {
            return (String) visit(ctx.op1());
        }
        return (String) visit(ctx.op2());
    }

    @Override
    public Object visitLblOp2(smheParser.LblOp2Context ctx) {
        tipoActual = (String) visit(ctx.op4());
        return ctx.op3() != null ? (String) visit(ctx.op3()) : tipoActual;
    }

    @Override
    public Object visitLblRelacionales(smheParser.LblRelacionalesContext ctx) {
        if (!tipoActual.equals("entero")) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), tipoActual, "entera");
            tipoActual = "entero";
        }
        String tipoOp4 = (String) visit(ctx.op4());
        if (!tipoActual.equals("entero")) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), tipoOp4, "entera");
        }

        tipoActual = "logico";
        return tipoActual;
    }

    @Override
    public Object visitLblOp4(smheParser.LblOp4Context ctx) {
        tipoActual = (String) visit(ctx.op6());
        return ctx.op5() != null ? (String) visit(ctx.op5()) : tipoActual;
    }

    @Override
    public Object visitLblSumaResta(smheParser.LblSumaRestaContext ctx) {
        if (!tipoActual.equals("entero")) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), tipoActual, "entera");
            tipoActual = "entero";
        }
        String tipoOp6 = (String) visit(ctx.op6());
        if (!tipoActual.equals("entero")) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), tipoOp6, "entera");
        }

        tipoActual = "entero";
        return tipoActual;
    }

    @Override
    public Object visitLblOp6(smheParser.LblOp6Context ctx) {
        tipoActual = (String) visit(ctx.op8());
        return ctx.op7() != null ? (String) visit(ctx.op7()) : tipoActual == null ? "Sin Tipo" : tipoActual;
    }

    @Override
    public Object visitLblMultDiv(smheParser.LblMultDivContext ctx) {
        if (!tipoActual.equals("entero")) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), tipoActual, "entera");
            tipoActual = "entero";
        }
        String tipoOp8 = (String) visit(ctx.op8());
        if (!tipoActual.equals("entero")) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), tipoOp8, "entera");
        }

        tipoActual = "entero";
        return tipoActual;
    }

    @Override
    public Object visitLblNegacionLog(smheParser.LblNegacionLogContext ctx) {
        tipoActual = (String) visit(ctx.op8());
        if (!tipoActual.equals("logico")) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), tipoActual, "logica");
        }

        return "logico";
    }

    @Override
    public Object visitLblNegacionAr(smheParser.LblNegacionArContext ctx) {
        tipoActual = (String) visit(ctx.op8());
        if (!tipoActual.equals("entero")) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), tipoActual, "entera");
        }

        return "entero";
    }

    @Override
    public Object visitLblIncDecPre(smheParser.LblIncDecPreContext ctx) {
        LlaveTabla llave = new LlaveTabla(ctx.ID().getText(), ambito);
        if (!this.tabla.existe(llave)) {
            this.errores.agregarErrorSemantico("ESM1", ctx.start.getLine(), llave.id);
            return "entero";
        }
        if (!this.tabla.getValor(llave)) {
            this.errores.agregarErrorSemantico("ESM2", ctx.start.getLine(), llave.id);
        }

        if (this.tabla.getTipo(llave).equals("Sin Tipo")) {
            this.errores.agregarErrorSemantico("ESM5", ctx.start.getLine(), llave.id);
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), "Sin Tipo", "entera");
        } else if (!this.tabla.getTipo(llave).equals("entero")) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), "logico", "entera");
        }
        return "entero";
    }

    @Override
    public Object visitLblIncDecPos(smheParser.LblIncDecPosContext ctx) {
        LlaveTabla llave = new LlaveTabla(ctx.ID().getText(), ambito);
        if (!this.tabla.existe(llave)) {
            this.errores.agregarErrorSemantico("ESM1", ctx.start.getLine(), llave.id);
            return ctx.op != null ? "entero" : "Sin Tipo";
        }
        if (!this.tabla.getValor(llave)) {
            this.errores.agregarErrorSemantico("ESM2", ctx.start.getLine(), llave.id);
        }

        if (this.tabla.getTipo(llave).equals("Sin Tipo")) {
            this.errores.agregarErrorSemantico("ESM5", ctx.start.getLine(), llave.id);
            if (ctx.op != null) {
                this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), "Sin Tipo", "entera");
            }
        } else if (!this.tabla.getTipo(llave).equals("entero") && ctx.op != null) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), "logico", "entera");
        }

        return ctx.op != null ? "entero" : this.tabla.getTipo(llave);
    }

    @Override
    public Object visitLblNumero(smheParser.LblNumeroContext ctx) {
        int numero = Integer.parseInt(ctx.NUMERO().getText());
        if (numero > 128 && numero <= -127) {
            this.errores.agregarErrorSemantico("ESM5", ctx.start.getLine(), numero + "");
        }

        return "entero";
    }

    @Override
    public Object visitLblObtener(smheParser.LblObtenerContext ctx) {
        if (ctx.OBTENER() == null) {
            errores.agregarErrorSintactico("ES7", ctx.start.getLine(), "obtener");
        }
        return "entero";
    }

    @Override
    public Object visitLblObtener1(smheParser.LblObtener1Context ctx) {
        if (ctx.obtener() == null) {
            errores.agregarErrorSintactico("ES7", ctx.start.getLine(), "[\"temperatura\", \"personas\"]");
        }
        return "entero";
    }

    @Override
    public Object visitLblBooleano(smheParser.LblBooleanoContext ctx) {
        return "logico";
    }

    @Override
    public Object visitLblEstado1(smheParser.LblEstado1Context ctx) {
        if (ctx.ESTADO() == null) {
            errores.agregarErrorSintactico("ES7", ctx.start.getLine(), "estado");
        }
        return "logico";
    }

    @Override
    public Object visitLblEstado(smheParser.LblEstadoContext ctx) {
        if (ctx.estado() == null) {
            errores.agregarErrorSintactico("ES7", ctx.start.getLine(), "[\"puertas\", \"ventanas\", \"luces\", \"ventilacion\"]");
        }
        return "logico";
    }

    @Override
    public Object visitLblParentesis(smheParser.LblParentesisContext ctx) {
        return ctx.expresion() != null ? ((String) visit(ctx.expresion())) : "Sin Tipo";
    }
    // </editor-fold>

    @Override
    public Object visitLblTiempoCada(smheParser.LblTiempoCadaContext ctx) {
        if (ctx.CADA() == null) {
            errores.agregarErrorSintactico("ES7", ctx.start.getLine(), "cada");
        }
        if (ctx.expresion() == null) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), "Sin Valor", "entera");
            return null;
        }
        String tipoExpr = (String) visit(ctx.expresion());
        if (tipoExpr == null) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), "Sin Valor", "entera");
        } else if (!tipoExpr.equals("entero")) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), tipoExpr, "entera");
        }
        return null;
    }

    @Override
    public Object visitLblTiempoPor(smheParser.LblTiempoPorContext ctx) {
        if (ctx.POR() == null) {
            errores.agregarErrorSintactico("ES7", ctx.start.getLine(), "por");
        }
        if (ctx.expresion() == null) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), "Sin Valor", "entera");
            return null;
        }
        String tipoExpr = (String) visit(ctx.expresion());
        if (tipoExpr == null) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), "Sin Valor", "entera");
        } else if (!tipoExpr.equals("entero")) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), tipoExpr, "entera");
        }
        return null;
    }

    @Override
    public Object visitLblComienzo(smheParser.LblComienzoContext ctx) {
        ambito = "comienzo";
        visit(ctx.tc());
        if (ctx.gramas() != null) {
            visit(ctx.gramas());
        }
        if (ctx.decFuncion() != null) {
            visit(ctx.decFuncion());
        }
        ambito = "programa";
        return null;
    }

    @Override
    public Object visitLblGramas(smheParser.LblGramasContext ctx) {
        String salida = (String) visit(ctx.stmt());
        if (ctx.PUNTOYCOMA() == null) {
            errores.agregarErrorSintactico("ES4", ctx.start.getLine());
        }
        String salidaSig = ctx.gramas() != null ? (String) visit(ctx.gramas()) : null;
        return salidaSig == null ? salida : salidaSig;
    }

    @Override
    public Object visitLblCondicionalesGramas(smheParser.LblCondicionalesGramasContext ctx) {
        visit(ctx.condicionales());
        return ctx.gramas() != null ? (String) visit(ctx.gramas()) : null;
    }

    @Override
    public Object visitLblCondicion(smheParser.LblCondicionContext ctx) {
        int inicio = ctx.start.getLine();
        int fin = ctx.gramas() != null
                ? ctx.gramas().start.getLine()
                : ctx.sino() != null
                ? ctx.sino().start.getLine()
                : ctx.start.getLine();
        if (ctx.PARENTESISIZQUIERDO() == null) {
            errores.agregarErrorSintactico("ES7", inicio, "(");
        }
        if (ctx.PARENTESISDERECHO() == null) {
            errores.agregarErrorSintactico("ES7", inicio, ")");
        }
        if (ctx.LLAVEIZQUIERDA() == null) {

            errores.agregarErrorSintactico("ES7", inicio, "{");
        }
        if (ctx.LLAVEDERECHA() == null) {
            errores.agregarErrorSintactico("ES7", fin, "}");
        }
        String tipoExpr = (String) visit(ctx.expresion());
        if (tipoExpr == null) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), "Sin Valor", "logica");
        } else if (!tipoExpr.equals("logico")) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), tipoExpr, "logica");
        }

        if (ctx.gramas() != null) {
            ambito += ":" + agregarAnidamiento();
            visit(ctx.gramas());
            quitarAnidamiento();
        }

        if (ctx.sino() != null) {
            visit(ctx.sino());
        }
        return null;
    }

    @Override
    public Object visitLblSino(smheParser.LblSinoContext ctx) {

        int inicio = ctx.start.getLine();
        int fin = ctx.stop.getLine();
        if (ctx.LLAVEIZQUIERDA() == null) {

            errores.agregarErrorSintactico("ES7", inicio, "{");
        }
        if (ctx.LLAVEDERECHA() == null) {
            errores.agregarErrorSintactico("ES7", fin, "}");
        }
        if (ctx.gramas() != null) {
            ambito += ":" + agregarAnidamiento();
            visit(ctx.gramas());
            quitarAnidamiento();
        }

        return null;
    }

    @Override
    public Object visitLblSinoCondicionales(smheParser.LblSinoCondicionalesContext ctx) {
        return visit(ctx.condicionales());
    }

    @Override
    public Object visitLblMientras(smheParser.LblMientrasContext ctx) {
        int inicio = ctx.start.getLine();
        int fin = ctx.stop.getLine();
        if (ctx.PARENTESISIZQUIERDO() == null) {
            errores.agregarErrorSintactico("ES7", inicio, "(");
        }
        if (ctx.PARENTESISDERECHO() == null) {
            errores.agregarErrorSintactico("ES7", inicio, ")");
        }
        if (ctx.LLAVEIZQUIERDA() == null) {
            errores.agregarErrorSintactico("ES7", inicio, "{");
        }
        if (ctx.LLAVEDERECHA() == null) {
            errores.agregarErrorSintactico("ES7", fin, "}");
        }
        String tipoExpr = (String) visit(ctx.expresion());
        if (tipoExpr == null) {
            this.errores.agregarErrorSemantico("ESM9", inicio, "Sin Valor", "logica");
        } else if (!tipoExpr.equals("logico")) {
            this.errores.agregarErrorSemantico("ESM9", inicio, tipoExpr, "logica");
        }
        if (ctx.gramas() != null) {
            ambito += ":" + agregarAnidamiento();
            visit(ctx.gramas());
            quitarAnidamiento();
        }
        return null;
    }

    @Override
    public Object visitLblIncDecPosGramas(smheParser.LblIncDecPosGramasContext ctx) {
        LlaveTabla llave = new LlaveTabla(ctx.ID().getText(), ambito);
        if (!this.tabla.existe(llave)) {
            this.errores.agregarErrorSemantico("ESM1", ctx.start.getLine(), llave.id);
            return null;
        }
        if (!this.tabla.getValor(llave)) {
            this.errores.agregarErrorSemantico("ESM2", ctx.start.getLine(), llave.id);
        }

        if (this.tabla.getTipo(llave).equals("Sin Tipo")) {
            this.errores.agregarErrorSemantico("ESM5", ctx.start.getLine(), llave.id);
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), "Sin Tipo", "entera");
        } else if (!this.tabla.getTipo(llave).equals("entero")) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), "logico", "entera");
        }

        return null;
    }

    @Override
    public Object visitLblIncDecPreGramas(smheParser.LblIncDecPreGramasContext ctx) {
        LlaveTabla llave = new LlaveTabla(ctx.ID().getText(), ambito);
        if (!this.tabla.existe(llave)) {
            this.errores.agregarErrorSemantico("ESM1", ctx.start.getLine(), llave.id);
            return null;
        }
        if (!this.tabla.getValor(llave)) {
            this.errores.agregarErrorSemantico("ESM2", ctx.start.getLine(), llave.id);
        }

        if (this.tabla.getTipo(llave).equals("Sin Tipo")) {
            this.errores.agregarErrorSemantico("ESM5", ctx.start.getLine(), llave.id);
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), "Sin Tipo", "entera");
        } else if (!this.tabla.getTipo(llave).equals("entero")) {
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), "logico", "entera");
        }

        return null;
    }

    @Override
    public Object visitLblAsignacionGramas(smheParser.LblAsignacionGramasContext ctx) {
        int inicio = ctx.start.getLine();
        if (ctx.ID() == null) {
            errores.agregarErrorSintactico("ES7", inicio, "ID");
            return null;
        }
        LlaveTabla llave = new LlaveTabla(ctx.ID().getText(), ambito);
        if (!tabla.existe(llave)) {
            errores.agregarErrorSemantico("ESM1", inicio, llave.id);
            return null;
        }
        String tipo = this.tabla.getTipo(llave);
        if (tipo.equals("Sin Tipo")) {
            errores.agregarErrorSemantico("ESM5", inicio, llave.id);
        }
        String tipoRes = (String) visit(ctx.expresion());
        if (ctx.ASIGNACION() == null) {
            errores.agregarErrorSintactico("ES7", ctx.start.getLine(), "=");
        }

        if (tipoRes == null) {
            String esperado = tipo.equals("Sin Tipo")
                    ? tipo
                    : (tipo.equals("entero") ? "entera" : "logica");
            this.errores.agregarErrorSemantico("ESM9", ctx.start.getLine(), "Sin Valor", esperado);
        } else if (!tipoRes.equals(tipo)) {
            errores.agregarErrorSemantico("ESM4", inicio, tipoRes, llave.id, tipo);
        }

        this.tabla.agregarValor(llave, true);
        return null;
    }

    @Override
    public Object visitLblUsarFuncion(smheParser.LblUsarFuncionContext ctx) {
        int inicio = ctx.start.getLine();
        if (ctx.USAR() == null) {
            errores.agregarErrorSintactico("ES7", inicio, "usar");
        }
        if (ctx.PARENTESISIZQUIERDO() == null) {
            errores.agregarErrorSintactico("ES7", inicio, "(");
        }
        if (ctx.PARENTESISDERECHO() == null) {
            errores.agregarErrorSintactico("ES7", inicio, ")");
        }

        String id = ctx.ID().getText().length() > 16
                ? ctx.ID().getText().substring(0, 16)
                : ctx.ID().getText();
        if (!funciones.existe(id)) {
            errores.agregarErrorSemantico("ESM6", inicio, id);
            return null;
        }

        this.funcionActual = new Funcion(id, inicio);
        if (ctx.parametro() != null) {
            visit(ctx.parametro());
        }
        this.funcionActual.comprobarParametros(funciones, errores);
        this.funcionActual = null;
        return null;
    }

    @Override
    public Object visitLblUsarFuncion1(smheParser.LblUsarFuncion1Context ctx) {
        int inicio = ctx.start.getLine();
        if (ctx.ID() == null) {
            errores.agregarErrorSintactico("ES6", inicio, "No se ha encontrado el ID de la función");
            return null;
        }
        if (ctx.PARENTESISIZQUIERDO() == null) {
            errores.agregarErrorSintactico("ES7", inicio, "(");
        }
        if (ctx.PARENTESISDERECHO() == null) {
            errores.agregarErrorSintactico("ES7", inicio, ")");
        }

        String id = ctx.ID().getText().length() > 16
                ? ctx.ID().getText().substring(0, 16)
                : ctx.ID().getText();
        if (!funciones.existe(id)) {
            errores.agregarErrorSemantico("ESM6", inicio, id);
            return null;
        }

        this.funcionActual = new Funcion(id, inicio);
        if (ctx.parametro() != null) {
            visit(ctx.parametro());
        }
        this.funcionActual.comprobarParametros(funciones, errores);
        this.funcionActual = null;
        return null;
    }

    @Override
    public Object visitLblParametrosFuncion(smheParser.LblParametrosFuncionContext ctx) {
        if (ctx.COMA() == null && ctx.parametro() != null) {
            errores.agregarErrorSintactico("ES7", ctx.start.getLine(), ",");
        }
        String tipoExpr = (String) visit(ctx.expresion());
        if (tipoExpr == null) {
            funcionActual.agregarParametro("Sin Valor");
            return null;
        }

        funcionActual.agregarParametro(tipoExpr);
        if (ctx.parametro() != null) {
            visit(ctx.parametro());
        }
        return null;
    }

    @Override
    public Object visitLblUsarAdmitir(smheParser.LblUsarAdmitirContext ctx) {
        int linea = ctx.start.getLine();
        if (ctx.USAR() == null) {
            errores.agregarErrorSintactico("ES7", linea, "usar");
        }
        if (ctx.PARENTESISIZQUIERDO() == null) {
            errores.agregarErrorSintactico("ES7", linea, "(");
        }

        if (ctx.expresion() == null) {
            errores.agregarErrorSemantico("ESM8", linea, 1 + "", "logico");
        } else {
            String tipo = (String) visit(ctx.expresion(0));
            if (tipo == null || !tipo.equals("logico")) {
                errores.agregarErrorSemantico("ESM8", linea, 1 + "", "logico");
            }
        }

        if (ctx.COMA(0) == null) {
            errores.agregarErrorSintactico("ES7", linea, ",");
        }

        if (ctx.expresion() == null) {
            errores.agregarErrorSemantico("ESM8", linea, 2 + "", "entero");
        } else {
            String tipo = (String) visit(ctx.expresion(1));
            if (tipo == null || !tipo.equals("entero")) {
                errores.agregarErrorSemantico("ESM8", linea, 2 + "", "entero");
            }
        }

        if (ctx.COMA(1) == null) {
            errores.agregarErrorSintactico("ES7", linea, ",");
        }

        if (ctx.tp() != null) {
            visit(ctx.tp());
        } else {
            errores.agregarErrorSemantico("ESM8", linea, 3 + "", "tiempo por");
        }

        if (ctx.PARENTESISDERECHO() == null) {
            errores.agregarErrorSintactico("ES7", linea, ")");
        }
        return null;
    }

    @Override
    public Object visitLblUsarVentilar(smheParser.LblUsarVentilarContext ctx) {
        int linea = ctx.start.getLine();
        if (ctx.USAR() == null) {
            errores.agregarErrorSintactico("ES7", linea, "usar");
        }
        if (ctx.PARENTESISIZQUIERDO() == null) {
            errores.agregarErrorSintactico("ES7", linea, "(");
        }
        if (ctx.tp() != null) {
            visit(ctx.tp());
        } else {
            errores.agregarErrorSemantico("ESM8", linea, 1 + "", "tiempo por");
        }

        if (ctx.COMA(0) == null) {
            errores.agregarErrorSintactico("ES7", linea, ",");
        }

        if (ctx.expresion(0) == null) {
            errores.agregarErrorSemantico("ESM8", linea, 2 + "", "logico");
            errores.agregarErrorSemantico("ESM9", linea, "Sin Valor", "logica");
        } else {
            String tipo = (String) visit(ctx.expresion(0));
            if (tipo == null || !tipo.equals("logico")) {
                errores.agregarErrorSemantico("ESM8", linea, 2 + "", "logico");
                errores.agregarErrorSemantico("ESM9", linea, tipo, "logica");
            }
        }

        if (ctx.COMA(1) == null) {
            errores.agregarErrorSintactico("ES7", linea, ",");
        }

        if (ctx.expresion(1) == null) {
            errores.agregarErrorSemantico("ESM8", linea, 3 + "", "logico");
            errores.agregarErrorSemantico("ESM9", linea, "Sin Valor", "logica");
        } else {
            String tipo = (String) visit(ctx.expresion(1));
            if (tipo == null || !tipo.equals("logico")) {
                errores.agregarErrorSemantico("ESM8", linea, 2 + "", "logico");
                errores.agregarErrorSemantico("ESM9", linea, tipo, "logica");
            }
        }

        if (ctx.PARENTESISDERECHO() == null) {
            errores.agregarErrorSintactico("ES7", linea, ")");
        }
        return null;
    }

    @Override
    public Object visitLblSanitizarDispensarGramas(smheParser.LblSanitizarDispensarGramasContext ctx) {
        if (ctx.accion == null) {
            errores.agregarErrorSintactico("ES7", ctx.start.getLine(), "\"sanitizar\", \"dispensar\"");
        }

        visit(ctx.tp());
        return null;
    }

    @Override
    public Object visitLblSanitizarDispensarGramas1(smheParser.LblSanitizarDispensarGramas1Context ctx) {
        if (ctx.tp() == null) {
            errores.agregarErrorSintactico("ES6", ctx.start.getLine(), "No se ha encontrado la estructura \"tiempo por\" de esta expresión");
        }
        return null;
    }

    @Override
    public Object visitLblSalirGramas(smheParser.LblSalirGramasContext ctx) {
        return "Saliendo";
    }

    @Override
    public Object visitLblDecFuncion(smheParser.LblDecFuncionContext ctx) {
        ambito = ctx.ID().getText().length() > 16
                ? ctx.ID().getText().substring(0, 16)
                : ctx.ID().getText();
        int ultima = ctx.decFuncion() == null
                ? ctx.stop.getLine()
                : (ctx.LLAVEDERECHA() != null
                ? ctx.LLAVEDERECHA().getSymbol().getLine()
                : ctx.decFuncion().start.getLine());
        if (ctx.gramas() != null) {
            String salida = (String) visit(ctx.gramas());
            if (salida == null) {
                errores.agregarErrorSintactico("ES5", ultima);
            }
        } else {
            errores.agregarErrorSintactico("ES5", ultima);
        }
        ambito = "programa";
        if (ctx.decFuncion() != null) {
            visit(ctx.decFuncion());
        }
        return null;
    }

    @Override
    public Object visitLblLucesGramas(smheParser.LblLucesGramasContext ctx) {
        if (ctx.accion == null) {
            errores.agregarErrorSintactico("ES6", ctx.start.getLine(), "Se esperaba \"apagar\" ó \"encender\"");
        }

        return null;
    }

    @Override
    public Object visitLblLucesGramas1(smheParser.LblLucesGramas1Context ctx) {
        if (ctx.actor == null) {
            errores.agregarErrorSintactico("ES6", ctx.start.getLine(), "Se esperaba \"luces\" ó \"ventilacion\"");
        }
        return null;
    }

    @Override
    public Object visitLblVentanasPuertasGramas(smheParser.LblVentanasPuertasGramasContext ctx) {

        if (ctx.accion == null) {
            errores.agregarErrorSintactico("ES6", ctx.start.getLine(), "Se esperaba \"abrir\" ó \"cerrar\"");
        }

        if (ctx.MANTENER() == null && ctx.tp() == null) {
            errores.agregarErrorSintactico("ES6", ctx.start.getLine(), "Se esperaba \"mantener\" ó una estructura \"tiempo por\"");
        }

        if (ctx.tp() != null) {
            visit(ctx.tp());
        }

        return null;

    }
}
