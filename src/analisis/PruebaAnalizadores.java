/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisis;

import java.io.StringReader;
import java_cup.runtime.Symbol;

/**
 *
 * @author jujemataso
 */
public class PruebaAnalizadores {

    public static void main(String[] args) throws Exception {
        Lexer lex = new Lexer(new StringReader("AA1"));
        Symbol s = lex.next_token();
        System.out.println(sym.terminalNames[s.sym]);
    }
}
