/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

import analisis.LlaveTabla;
import sintactico.CIVisitor;

/**
 *
 * @author jujemataso
 */
public class TripletaMenor extends TripletaExpresion {

    public TripletaMenor(Object op1, Object op2) {
        super("<", op1, op2);
    }

    @Override
    public String codigoObjeto() {
        String codigo = super.etiqueta == null ? "" : super.etiqueta + " ";
        if (super.ref2 == null) {
            Object valor = super.operando2;
            if (valor instanceof Integer) {
                valor = "0x" + Integer.toHexString((int) valor);
                codigo += "MOVLW " + valor + "\n";
            } /*else if (valor instanceof String) {
                codigo += "CLRW\n";
                codigo += valor.toString().equals("verdadero") ? "IORLW 0X01\n" : "";
            }*/ else if (valor instanceof LlaveTabla) {
                LlaveTabla id = (LlaveTabla) valor;
                String dir = CIVisitor.simbolos.getDireccion(id);
                codigo += "MOVFW " + dir + "\n";
            }
        }

        if (super.ref1 == null) {
            Object valor = super.operando1;
            if (valor instanceof Integer) {
                valor = "0x" + Integer.toHexString((int) valor);
                codigo += "SUBLW " + valor + "\n";
            } else if (valor instanceof LlaveTabla) {
                LlaveTabla id = (LlaveTabla) valor;
                String dir = CIVisitor.simbolos.getDireccion(id);
                codigo += "SUBWF " + dir + ",W\n";
            }
        } else {
            codigo += "DECF FSR,F\nSUBWF INDF,W\n";
        }
        codigo += """
                  MOVLW 0X0
                  BTFSC STATUS,C
                  GOTO $+4
                  BTFSC STATUS,Z
                  GOTO $+3
                  MOVLW 0X01
                  GOTO $+2
                  CLRW
                  """;
        if (super.siguiente == 1) {
            return codigo + """
                      MOVWF INDF
                      INCF FSR,F
                      """;
        }
        return codigo;
    }

}
