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

    private TablaSimbolos tabla;
    private TablaFunciones funciones;
    private TablaErrores errores;

    public MainParser() {
    }

    public void parse(String codigo) {
        this.tabla = new TablaSimbolos();
        this.funciones = new TablaFunciones(this.tabla);
        this.errores = new TablaErrores();
        smheLexer lexer = new smheLexer(CharStreams.fromString(codigo));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        smheParser parser = new smheParser(tokens);
        ParseTree tree = parser.inicio();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new smheFunctionsRegister(this.tabla, this.funciones, this.errores), tree);
        smheSintaxVisitor visitor = new smheSintaxVisitor(tabla, funciones, errores);
        visitor.visit(tree);
    }

}
