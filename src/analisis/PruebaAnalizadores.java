/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisis;

import codigo.FrmPrincipal;
import herramientas.ArbolSintactico;
import herramientas.ContenidoTabla;
import herramientas.NodoSintactico;
import herramientas.TablaErrores;
import java_cup.runtime.Symbol;

/**
 *
 * @author jujemataso
 */
public class PruebaAnalizadores {

    public static void main(String[] args) throws Exception {
        java.util.HashMap<LlaveTabla, ContenidoTabla> datos = new java.util.HashMap<>();
        datos.put(new LlaveTabla("id"), new ContenidoTabla(0));
        ContenidoTabla aux = datos.get(new LlaveTabla("id"));
        LlaveTabla conAmbito = new LlaveTabla("id", "ambito");
        datos.remove(new LlaveTabla("id"));
        datos.put(conAmbito, aux);
        System.out.println(datos.get(new LlaveTabla("nada")));
        
    }
}
