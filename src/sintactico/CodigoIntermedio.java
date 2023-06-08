/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintactico;

import codigo_intermedio.TablaSimbolos;
import codigo_intermedio.TablaFunciones;

/**
 *
 * @author jujemataso
 */
public class CodigoIntermedio {

    public TablaSimbolos simbolos;
    public TablaFunciones funciones;

    public CodigoIntermedio(herramientas.TablaSimbolos simbolos, herramientas.TablaFunciones funciones) {
        this.simbolos = new TablaSimbolos(simbolos);
        this.funciones = new TablaFunciones(this.simbolos, funciones, simbolos);
    }

    public void generarCI(boolean optimizar, MainParser parser) {
        CIVisitor ci = new CIVisitor(simbolos, funciones);
        ci.visit(parser.tree);
        CIVisitor.programa.optimizar = optimizar;
        CIVisitor.programa.enumerarTripletas(0);
    }

    public String generarCO() {
        return CIVisitor.programa.generarCO();
    }
}
