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
public class TripletaMultiplicacion extends TripletaExpresion {

    public TripletaMultiplicacion(Object op1, Object op2) {
        super("*", op1, op2);
    }

    @Override
    public String codigoObjeto() {
        String codigo = (super.etiqueta == null ? "" : super.etiqueta + " ") + (super.siguiente == 1 ? "BSF FF\n" : "BCF FF\n");
        if (super.ref2 == null) {
            Object valor = super.operando2;
            if (valor instanceof Integer) {
                valor = "0x" + Integer.toHexString((int) valor);
                codigo += "MOVLW " + valor + "\n";
                codigo += "MOVWF MB\n";
            } /*else if (valor instanceof String) {
                codigo += "CLRW\n";
                codigo += valor.toString().equals("verdadero") ? "IORLW 0X01\n" : "";
            }*/ else if (valor instanceof LlaveTabla) {
                LlaveTabla id = (LlaveTabla) valor;
                String dir = CIVisitor.simbolos.getDireccion(id);
                codigo += "MOVFW " + dir + "\n";
                codigo += "MOVWF MB\n";
            }
        } else {
            codigo += "MOVWF MB\n";
        }

        if (super.ref1 == null) {
            Object valor = super.operando1;
            if (valor instanceof Integer) {
                valor = "0x" + Integer.toHexString((int) valor);
                codigo += "MOVLW " + valor + "\n";
                codigo += "MOVWF MA\n";
            } else if (valor instanceof LlaveTabla) {
                LlaveTabla id = (LlaveTabla) valor;
                String dir = CIVisitor.simbolos.getDireccion(id);
                codigo += "MOVFW " + dir + "\n";
                codigo += "MOVWF MA";
            }
        } else {
            codigo += """
                      DECF FSR,F
                      MOVFW INDF
                      MOVWF MA
                      """;
        }
        return codigo + "CALL MUL\n";
    }

}
