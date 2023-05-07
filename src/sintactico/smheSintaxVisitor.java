/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintactico;

import analisis.LlaveTabla;
import herramientas.ContenidoTabla;
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
    private ArrayList<Funcion> funcionesLlamadas;
    private boolean parametro = false;

    public smheSintaxVisitor(TablaSimbolos tabla, TablaFunciones funciones, TablaErrores errores) {
        this.tabla = tabla;
        this.funciones = funciones;
        this.errores = errores;
    }

    @Override
    public Object visitLblInicio(smheParser.LblInicioContext ctx) {
        this.ambito = "programa";
        if (ctx.decGlobales() != null) {
            visit(ctx.decGlobales());
        }
        visit(ctx.comienzo());
        errores.getErrores().forEach((linea, error) -> System.out.println(error));
        this.tabla.getTabla().forEach((llave, contenido) -> {
            String simbolo = String.format("L%d %s:%s valor?: %s", contenido.linea, llave.id, contenido.tipo, contenido.valor);
            System.out.println(simbolo);
        });
        return null;
    }

    @Override
    public Object visitLblDeclaracionesGlobales(smheParser.LblDeclaracionesGlobalesContext ctx) {
        LlaveTabla llave = (LlaveTabla) visit(ctx.declaracion());
        int inicioDec = ctx.declaracion().start.getLine();
        String tipo = this.tabla.getTipo(llave);
        if (ctx.ASIGNACION() != null) {
            if (ctx.expresion() == null) {
                errores.agregarErrorSemantico("ESM4", inicioDec, "SIN VALOR", llave.id, tipo);
            }

            String tipoRes = (String) visit(ctx.expresion());
            if (!tipoRes.equals(this.tabla.getTipo(llave))) {
                errores.agregarErrorSemantico("ESM4", inicioDec, tipoRes, llave.id, tipo);
            }
            this.tabla.agregarValor(llave, true);
        }

        if (ctx.expresion() != null) {
            String tipoRes = (String) visit(ctx.expresion());
            if (!tipoRes.equals(this.tabla.getTipo(llave))) {
                errores.agregarErrorSemantico("ESM4", inicioDec, tipoRes, llave.id, tipo);
            }
            this.tabla.agregarValor(llave, true);
        }

        if (ctx.decGlobales() != null) {
            visit(ctx.decGlobales());
        }
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc="Visitas a declaraciones">
    @Override
    public Object visitLblDeclaraciones(smheParser.LblDeclaracionesContext ctx) {
        LlaveTabla id = new LlaveTabla(ctx.ID().getText(), ambito);
        if (!parametro) {
            this.tabla.agregarTipo(id, (String) (ctx.tipo() != null ? visit(ctx.tipo()) : "Sin Tipo"));
        }
        return id;
    }

    @Override
    public Object visitLblDeclaraciones1(smheParser.LblDeclaraciones1Context ctx) {
        LlaveTabla id = new LlaveTabla(ctx.ID().getText(), ambito);
        if (!parametro) {
            this.tabla.agregarTipo(id, (String) (ctx.tipo() != null ? visit(ctx.tipo()) : "Sin Tipo"));
        }
        return id;
    }

    @Override
    public Object visitLblTipo(smheParser.LblTipoContext ctx) {
        return ctx.getText();
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

}
