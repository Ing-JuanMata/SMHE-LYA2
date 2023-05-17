/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintactico;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.misc.Interval;

/**
 *
 * @author jujemataso
 */
public class smheCustomParserErrorListener extends BaseErrorListener {

    private herramientas.TablaErrores errores;

    public smheCustomParserErrorListener(herramientas.TablaErrores errores) {
        this.errores = errores;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        /*Parser p = (Parser) recognizer;
        String error = "En lugar de la cadena \"" + (((Token) offendingSymbol).getText()) + "\" se esperaba: ";
        ListIterator<Interval> itr = p.getExpectedTokens().getIntervals().listIterator();
        while (itr.hasNext()) {
            Interval in = itr.next();
            for (int i = in.a; i <= in.b; i++) {
                String lexema = p.getVocabulary().getLiteralName(i);
                error += (lexema != null ? lexema : p.getVocabulary().getSymbolicName(i)) + ", ";
            }
            error = error.substring(0, error.length() - 2) + " ";
        }
        System.out.println(error);
        System.out.println(p.getRuleNames()[p.getContext().getRuleIndex()]);
        //System.out.println(p.getRuleNames()[p.getContext().getParent().getRuleIndex()]);
        //System.out.println(p.getRuleNames()[p.getContext().getRuleIndex()]);
         */
        Token sym = null;
        if (e != null) {
            errores.agregarErrorSintactico("ES7", line, "[\"ID\", \"admitir\", \"ventilar\"]");
            return;
        }
        if (offendingSymbol != null) {
            sym = (Token) offendingSymbol;
        }

        Parser p = (Parser) recognizer;
        Vocabulary v = p.getVocabulary();
        if (p.getContext() instanceof smheParser.InicioContext) {
            errores.agregarErrorSintactico("ES7", 1, getEsperados(p, v));
            return;
        }
        if (p.getContext() instanceof smheParser.UtContext) {
            errores.agregarErrorSintactico("ES2", line);
            return;
        }
        if (p.getContext() instanceof smheParser.DeclaracionContext) {
            errores.agregarErrorSintactico("ES7", line, "declarar");
            System.out.println(sym.getText());
            return;
        }
        if (p.getContext() instanceof smheParser.EstadoContext) {
            errores.agregarErrorSintactico("ES7", line, "[\"puertas\", \"ventanas\", \"luces\"]");
            return;
        }
        if (p.getContext() instanceof smheParser.ObtenerContext) {
            errores.agregarErrorSintactico("ES7", line, "[\"temperatura\", \"personas\"]");
            return;
        }
        if (p.getContext() instanceof smheParser.Op1Context) {
            String operadores = "[\"+\", \"-\", \"*\", \"/\", \"||\", \"&&\", \"<\", \"<=\", \">\", \">=\", \"==\", \"!=\"]";
            errores.agregarErrorSintactico("ES1", line, (String) (sym != null ? sym.getText() : ""), operadores);
            return;
        }
        if (p.getContext() instanceof smheParser.LblLucesGramasContext) {
            errores.agregarErrorSintactico("ES1", line, (String) (sym != null ? sym.getText() : ""), "\"luces\"");
            return;
        }
        if (p.getContext() instanceof smheParser.LblVentanasPuertasGramasContext) {
            errores.agregarErrorSintactico("ES1", line, (String) (sym != null ? sym.getText() : ""), "[\"ventanas\", \"puertas\"]");
            return;
        }
        if (p.getContext() instanceof smheParser.LblTiempoPorContext || p.getContext() instanceof smheParser.LblTiempoCadaContext) {
            errores.agregarErrorSintactico("ES7", line, getEsperados(p, v));
        }
        System.out.println(getEsperados(p, v));
        System.out.println("Contexto: " + p.getRuleNames()[p.getContext().getRuleIndex()] + " id contexto: " + p.getContext().getRuleIndex());
    }

    private String getEsperados(Parser p, Vocabulary v) {
        String esperados = "[";
        for (Interval in : p.getExpectedTokens().getIntervals()) {
            for (int j = in.a; j <= in.b; j++) {
                String nombre = v.getLiteralName(j);
                esperados += (nombre == null ? v.getSymbolicName(j) : nombre) + ", ";
            }
        }
        return esperados.substring(0, esperados.length() - 2) + "]";
    }

}
