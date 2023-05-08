/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintactico;

import herramientas.TablaErrores;
import herramientas.TablaSimbolos;
import herramientas.TablaFunciones;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author jujemataso
 */
public class MainParser {

    public static TablaSimbolos tabla;
    public static TablaFunciones funciones;
    public static TablaErrores errores;

    public MainParser() {
    }

    public void parse(String codigo) {
        MainParser.tabla = new TablaSimbolos();
        MainParser.funciones = new TablaFunciones(MainParser.tabla);
        MainParser.errores = new TablaErrores();
        smheLexer lexer = new smheLexer(CharStreams.fromString(codigo));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        smheParser parser = new smheParser(tokens);
        ParseTree tree = parser.inicio();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new smheFunctionsRegister(MainParser.tabla, MainParser.funciones, MainParser.errores), tree);
        smheSintaxVisitor visitor = new smheSintaxVisitor(tabla, funciones, errores);
        visitor.visit(tree);
    }
    
    

}
