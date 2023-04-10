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
        int val = 0;
        java.util.ArrayList<Integer> vals = new java.util.ArrayList<>();
        String cad = "val:1:1";
        System.out.println(cad.substring(0, cad.lastIndexOf(":")));
    }
}
