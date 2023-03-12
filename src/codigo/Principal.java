/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.IOException;

/**
 *
 * @author Ximena
 */
public class Principal {
    public static void main(String[] args) throws Exception {
        String ruta1 = System.getProperty("user.dir")+"\\src\\codigo\\Lexer.flex";
        String ruta2 = System.getProperty("user.dir")+"\\src\\codigo\\LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", System.getProperty("user.dir")+"\\src\\codigo\\Sintax.cup"};
        generar(ruta1, ruta2, rutaS);
    }
    
    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception{
        String ruta3 =  System.getProperty("user.dir")+"\\src\\codigo\\LexerColor.flex";
        jflex.Main.generate(new String[]{ruta1, ruta3});
        
        /*java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get(System.getProperty("user.dir")+"\\src\\codigo\\sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get(System.getProperty("user.dir")+"\\sym.java"), 
                Paths.get(System.getProperty("user.dir")+"\\src\\codigo\\sym.java")
        );
       
        Path rutaSin = Paths.get(System.getProperty("user.dir")+"\\src\\codigo\\Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get(System.getProperty("user.dir")+"\\Sintax.java"), 
                Paths.get(System.getProperty("user.dir")+"\\src\\codigo\\Sintax.java")
        );
*/
    }
}
