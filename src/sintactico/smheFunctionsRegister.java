/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintactico;

import analisis.LlaveTabla;
import herramientas.TablaErrores;
import herramientas.TablaFunciones;
import herramientas.TablaSimbolos;
import java.util.ArrayList;

/**
 *
 * @author jujemataso
 */
public class smheFunctionsRegister extends smheBaseListener {

    private String ambito = "";
    private TablaSimbolos tabla;
    private TablaFunciones funciones;
    private TablaErrores errores;
    private ArrayList<String> ambitos;
    private boolean parametro = false, varGlobal = false;

    public smheFunctionsRegister(TablaSimbolos tabla, TablaFunciones funciones, TablaErrores errores) {
        super();
        this.tabla = tabla;
        this.funciones = funciones;
        this.errores = errores;
        this.ambitos = new ArrayList<>();
    }

    @Override
    public void enterLblInicio(smheParser.LblInicioContext ctx) {
        int inicio = ctx.start.getLine();
        int fin = ctx.comienzo().stop.getLine();
        if (ctx.LLAVEIZQUIERDA() == null) {
            errores.agregarErrorSintactico("ES7", inicio, "{");
        }
        if (ctx.LLAVEDERECHA() == null) {
            errores.agregarErrorSintactico("ES7", fin, "}");
        }
        if (ctx.FIN() == null) {
            errores.agregarErrorSintactico("ES7", fin, "fin");
        }
        this.ambito = "programa";
        this.ambitos.add(ambito);
    }

    @Override
    public void exitLblInicio(smheParser.LblInicioContext ctx) {

    }

    @Override
    public void enterLblComienzo(smheParser.LblComienzoContext ctx) {
        int inicio = ctx.start.getLine();
        int fin = ctx.gramas() != null ? ctx.gramas().stop.getLine() : ctx.start.getLine();
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
        this.funciones.agregarFuncion(ctx.COMIENZO().getText());
    }

    @Override
    public void enterLblDeclaracionesGlobales(smheParser.LblDeclaracionesGlobalesContext ctx) {
        varGlobal = true;
    }

    @Override
    public void exitLblDeclaracionesGlobales(smheParser.LblDeclaracionesGlobalesContext ctx) {
        varGlobal = false;
    }

    @Override
    public void enterLblDecFuncion(smheParser.LblDecFuncionContext ctx) {
        int inicio = ctx.start.getLine();
        int fin = ctx.gramas() != null ? ctx.gramas().stop.getLine() : ctx.start.getLine();
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
        String id = ctx.ID().getText().length() > 16
                ? ctx.ID().getText().substring(0, 16)
                : ctx.ID().getText();
        int linea = ctx.FUNCION().getSymbol().getLine();
        if (this.funciones.existe(id)) {
            errores.agregarErrorSemantico("ESM3", linea, id);
            this.ambito = "";
            if (!this.ambitos.contains(ambito)) {
                this.ambitos.add(ambito);
            }
            if (!this.funciones.existe(ambito)) {
                this.funciones.agregarFuncion(ambito);
            }
            return;
        }
        for (String ambito : ambitos) {
            if (this.tabla.existe(new LlaveTabla(id, ambito))) {
                errores.agregarErrorSemantico("ESM3", linea, id);
                break;
            }
        }

        this.ambito = id;
        this.ambitos.add(id);
        this.funciones.agregarFuncion(id);
    }

    @Override
    public void exitLblDecFuncion(smheParser.LblDecFuncionContext ctx) {
        this.ambito = "programa";
    }

    @Override
    public void enterLblParametros(smheParser.LblParametrosContext ctx) {
        if (ctx.COMA() == null && ctx.dp() != null) {
            errores.agregarErrorSintactico("ES7", ctx.start.getLine(), ",");
        }
        parametro = true;
    }

    @Override
    public void exitLblParametros(smheParser.LblParametrosContext ctx) {
        parametro = false;
    }

    @Override
    public void enterLblDeclaraciones(smheParser.LblDeclaracionesContext ctx) {
        if (!parametro && !varGlobal) {
            return;
        }
        if (ctx.ID() == null) {
            errores.agregarErrorSintactico("ES6", ctx.start.getLine(), "No se ha encontrado el ID de la declaración");
            return;
        }
        String id = ctx.ID().getText().length() > 16
                ? ctx.ID().getText().substring(0, 16)
                : ctx.ID().getText();
        int linea = ctx.start.getLine();
        boolean bTipo = ctx.tipo() == null;
        if (bTipo) {
            this.errores.agregarErrorSintactico("ES3", linea);
        }
        String tipo = !bTipo ? ctx.tipo().getText() : "Sin Tipo";
        if (this.tabla.existe(new LlaveTabla(id, ambito))) {
            errores.agregarErrorSemantico("ESM4", linea, id);
            return;
        }
        LlaveTabla parametro = new LlaveTabla(id, ambito);
        this.tabla.agregarSimbolo(parametro, linea);
        this.tabla.agregarTipo(parametro, tipo);
        if (this.parametro) {
            this.funciones.agregarParametro(ambito, parametro);
        }
    }

    @Override
    public void enterLblDeclaraciones1(smheParser.LblDeclaraciones1Context ctx) {
        if (!parametro) {
            return;
        }
        if (ctx.ID() == null) {
            errores.agregarErrorSintactico("ES6", ctx.start.getLine(), "No se ha encontrado el ID de la declaración");
            return;
        }
        String id = ctx.ID().getText().length() > 16
                ? ctx.ID().getText().substring(0, 16)
                : ctx.ID().getText();
        int linea = ctx.start.getLine();
        boolean bTipo = ctx.tipo() == null;
        if (bTipo) {
            this.errores.agregarErrorSintactico("ES3", linea);
        }
        String tipo = !bTipo ? ctx.tipo().getText() : "Sin Tipo";
        if (this.tabla.existe(new LlaveTabla(id, ambito))) {
            errores.agregarErrorSemantico("ESM4", linea, id);
            return;
        }
        LlaveTabla parametro = new LlaveTabla(id, ambito);
        this.tabla.agregarSimbolo(parametro, linea);
        this.tabla.agregarTipo(parametro, tipo);
        if (this.parametro) {
            this.funciones.agregarParametro(ambito, parametro);
        }
    }

}
