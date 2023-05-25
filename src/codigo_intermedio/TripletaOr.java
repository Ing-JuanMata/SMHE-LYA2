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
public class TripletaOr extends TripletaExpresion {

    public TripletaOr(Object op1, Object op2) {
        super("||", op1, op2);
    }

    @Override
    public String codigoObjeto() {
        String codigo = super.etiqueta == null ? "" : super.etiqueta + " ";
        if (super.ref2 == null) {
            Object valor = super.operando2;
            if (valor instanceof Boolean) {
                codigo += ((boolean) valor) ? "MOVLW 0X01\n" : "CLRW\n";
            } else if (valor instanceof String) {
                codigo += valor.toString().equals("verdadero") ? "MOVLW 0X01\n" : "CLRW\n";
            } else if (valor instanceof LlaveTabla) {
                LlaveTabla id = (LlaveTabla) valor;
                String dir = CIVisitor.simbolos.getDireccion(id);
                codigo += "MOVFW " + dir + "\n";
            }
        }

        if (super.ref1 == null) {
            Object valor = super.operando1;
            if (valor instanceof Boolean) {
                codigo += ((boolean) valor) ? "IORLW 0X01\n" : "";
            } else if (valor instanceof String) {
                codigo += valor.toString().equals("verdadero") ? "IORLW 0X01\n" : "";
            } else if (valor instanceof LlaveTabla) {
                LlaveTabla id = (LlaveTabla) valor;
                String dir = CIVisitor.simbolos.getDireccion(id);
                codigo += "IORWF " + dir + ",W\n";
            }
        } else {
            codigo += "DECF FSR,F\nIORWF INDF," + (super.siguiente == 1 ? "F" : "W") + "\n";
            return codigo + (super.siguiente == 1 ? "INCF FSR,F\n" : "");
        }

        if (super.siguiente == 1) {
            return codigo + "MOVWF INDF\nINCF FSR,F\n";
        }
        return codigo;
    }

}
