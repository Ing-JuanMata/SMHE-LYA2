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
public class TripletaNegacion extends TripletaExpresion {

    public TripletaNegacion(Object op1) {
        super("!", op1);
    }

    @Override
    public String codigoObjeto() {
        String codigo = super.etiqueta == null ? "" : super.etiqueta + " ";
        if (super.ref1 == null) {
            Object valor = super.operando1;
            if (valor instanceof Boolean) {
                codigo += ((boolean) valor) ? "CLRW\n" : "MOVLW 0X01\n";
            } else if (valor instanceof String) {
                codigo += valor.toString().equals("verdadero") ? "CLRW\n" : "MOVLW 0X01\n";
            } else if (valor instanceof LlaveTabla) {
                LlaveTabla id = (LlaveTabla) valor;
                String dir = CIVisitor.simbolos.getDireccion(id);
                codigo += "XORWF " + dir + ",W\n";
            }
        } else {
            codigo += "DECF FSR,F\nXORWF INDF," + (super.siguiente == 1 ? "F" : "W") + "\n";
            return codigo + (super.siguiente == 1 ? "INCF FSR,F\n" : "");
        }

        if (super.siguiente == 1) {
            return codigo + "MOVWF INDF\nINCF FSR,F\n";
        }
        return codigo;
    }
}
