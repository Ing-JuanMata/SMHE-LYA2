/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintactico;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;

/**
 *
 * @author jujemataso
 */
public class smheCustomLexerErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        if (e != null) {
            LexerNoViableAltException lnvae = (LexerNoViableAltException) e;
            if (lnvae.getInputStream() != null) {
                String error = "El caracter '" + lnvae.getInputStream().getText(new Interval(charPositionInLine, charPositionInLine)) + "' no se reconoce";
                System.out.println(error);
                
            }
        }
    }

}
