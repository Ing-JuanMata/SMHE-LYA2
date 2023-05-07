/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintactico;

import java.util.ListIterator;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;

/**
 *
 * @author jujemataso
 */
public class smheCustomParserErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Parser p = (Parser) recognizer;
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
    }

}
