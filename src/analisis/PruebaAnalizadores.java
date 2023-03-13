/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisis;

import codigo.FrmPrincipal;
import herramientas.ArbolSintactico;
import herramientas.NodoSintactico;
import herramientas.TablaErrores;
import java_cup.runtime.Symbol;

/**
 *
 * @author jujemataso
 */
public class PruebaAnalizadores {

    public static void main(String[] args) throws Exception {
        ArbolSintactico arbol = new ArbolSintactico();
        arbol.setValorRaiz("inicio");
        arbol.agregarHijo(new NodoSintactico("INICIO"));
        arbol.agregarHijo(new NodoSintactico("IDENTIFICADOR"));
        arbol.getRaiz().getHijos().forEach(hijo -> System.out.println(hijo.valor));
    }
}
