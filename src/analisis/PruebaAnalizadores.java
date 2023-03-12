/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisis;

import codigo.FrmPrincipal;
import herramientas.TablaErrores;
import java_cup.runtime.Symbol;

/**
 *
 * @author jujemataso
 */
public class PruebaAnalizadores {

    public static void main(String[] args) throws Exception {
        Lexer lex = new Lexer(new java.io.StringReader("inicio prueba{"));
        Symbol s;
        while ((s = lex.next_token()).sym != sym.EOF) {
            System.out.println(sym.terminalNames[s.sym]);
        }
    }
}
