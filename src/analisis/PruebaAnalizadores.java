/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisis;

import codigo.FrmPrincipal;
import herramientas.ArbolSintactico;
import herramientas.ContenidoTabla;
import herramientas.Funcion;
import herramientas.NodoSintactico;
import herramientas.TablaErrores;
import java_cup.runtime.Symbol;

/**
 *
 * @author jujemataso
 */
public class PruebaAnalizadores {

    public static void main(String[] args) throws Exception {
        java.util.ArrayList<herramientas.Funcion> funciones = new java.util.ArrayList<>();
        herramientas.Funcion f = new herramientas.Funcion("f", 0);
        f.agregarParametro(10);
        f.agregarParametro(false);
        funciones.add(f);
        f = new herramientas.Funcion("g", 0);
        f.agregarParametro(20);
        f.agregarParametro(true);
        funciones.add(f);
        System.out.println(funciones);
        
    }
}
