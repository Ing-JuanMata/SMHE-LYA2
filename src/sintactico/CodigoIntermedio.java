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

    public CodigoIntermedio() {
        this.simbolos = new TablaSimbolos();
        this.funciones = new TablaFunciones(simbolos);
    }

    public void generarCI() {
        CIVisitor ci = new CIVisitor(simbolos, funciones);
        ci.visit(MainParser.tree);
        CIVisitor.programa.enumerarTripletas(0);
        System.out.println(CIVisitor.programa);
    }
}
