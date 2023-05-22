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
public class TripletaSuma extends TripletaExpresion {

    public TripletaSuma(Object op1, Object op2) {
        super("+", op1, op2);
    }

    @Override
    public String codigoObjeto() {
        String codigo = "";
        //Si es != null el valor ya esta en w
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

        //Para la ref1 si ref1 == null se opera con literal, si no, se opera con INDF
        if (super.ref1 == null) {
            Object valor = super.operando1;
            if (valor instanceof Integer) {
                valor = "0x" + Integer.toHexString((int) valor);
                codigo += "ADDLW " + valor + "\n";
            } else if (valor instanceof LlaveTabla) {
                LlaveTabla id = (LlaveTabla) valor;
                String dir = CIVisitor.simbolos.getDireccion(id);
                codigo += "ADDWF " + dir + ",W\n";
            }
        } else {
            codigo += "DECF FSR,F\nADDWF INDF," + (super.siguiente == 1 ? "F" : "W") + "\n";
            return codigo + (super.siguiente == 1 ? "INCF FSR,F\n" : "");
        }

        if (super.siguiente == 1) {
            return codigo + "MOVWF INDF\n" + "INCF FSR,F\n";
        }
        return codigo;
    }

}
