/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintactico;

import static codigo.FrmPrincipal.tablaSimbolos;
import codigo.Tabla;
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

    public TablaSimbolos tabla;
    public TablaFunciones funciones;
    public TablaErrores errores;
    public ParseTree tree;

    public MainParser() {
    }

    public void parse(String codigo) {
        tabla = new TablaSimbolos();
        funciones = new TablaFunciones(tabla);
        errores = new TablaErrores();
        smheLexer lexer = new smheLexer(CharStreams.fromString(codigo));
        lexer.removeErrorListeners();
        lexer.addErrorListener(new smheCustomLexerErrorListener(errores));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        smheParser parser = new smheParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new smheCustomParserErrorListener(errores));
        tree = parser.inicio();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new smheFunctionsRegister(tabla, funciones, errores), tree);
        smheSintaxVisitor visitor = new smheSintaxVisitor(tabla, funciones, errores);
        visitor.visit(tree);
    }

    public boolean mostrarFunciones() {
        if (!funciones.tieneDatos()) {
            return false;
        }
        Tabla tabla = new Tabla("tabla de funciones");
        funciones.mostrarTabla((javax.swing.table.DefaultTableModel) tabla.getModel());
        tabla.setVisible(true);
        return true;
    }

    public boolean mostrarSimbolos() {
        if (!tabla.tieneDatos()) {
            return false;
        }

        Tabla tabla = new Tabla("tabla de simbolos");
        this.tabla.verTabla((javax.swing.table.DefaultTableModel) tabla.getModel());
        tabla.setVisible(true);
        return true;
    }

}
