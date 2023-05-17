/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintactico;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.Interval;

/**
 *
 * @author jujemataso
 */
public class smheCustomLexerErrorListener extends BaseErrorListener {
    private herramientas.TablaErrores errores;
    public smheCustomLexerErrorListener(herramientas.TablaErrores errores){
        this.errores = errores;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        if (e != null) {
            LexerNoViableAltException lnvae = (LexerNoViableAltException) e;
            if (lnvae.getInputStream() != null) {
                String error = lnvae.getInputStream().getText(new Interval(lnvae.getStartIndex(), lnvae.getStartIndex()));
                errores.agregarErrorLexico("EL1", line, error);

            }
        }
    }

}
