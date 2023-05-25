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
public class TripletaAsignacion extends Tripleta {

    private LlaveTabla id;
    private boolean bit = false;

    public TripletaAsignacion(Object valor) {
        super("=");
        if (valor instanceof Tripleta) {
            Tripleta t = (Tripleta) valor;
            t.siguiente = 2;
            super.ref2 = t;
            return;
        }
        super.operando2 = valor;
    }

    public TripletaAsignacion(LlaveTabla id, Object valor) {
        this(valor);
        this.id = id;
        this.operando1 = this.id.id;
    }

    public void setId(LlaveTabla id) {
        this.id = id;
    }

    public void setBit() {
        this.bit = true;
    }

    @Override
    public String codigoObjeto() {
        String dir = CIVisitor.simbolos.getDireccion(id);
        if (super.ref2 != null) {
            String block = """
                         %s XORLW 0X01
                         BTFSS STATUS,Z
                         GOTO $+3
                         BSF %s
                         GOTO $+2
                         BCF %s
                         """;
            return bit ? String.format(block, super.etiqueta == null ? "" : super.etiqueta, dir, dir) : "MOVWF " + dir + "\n";
        } else {
            if (super.operando2 instanceof Integer) {
                String n = Integer.toHexString(Integer.parseInt(super.operando2 + ""));
                String codigo = (super.etiqueta == null ? "" : super.etiqueta + " ") + " MOVLW 0X" + n + "\n";
                return codigo + "MOVWF " + dir + "\n";
            } else if (super.operando2 instanceof String) {
                String codigo = super.etiqueta == null ? "" : super.etiqueta + " ";
                if (((String) super.operando2).equals("verdadero")) {
                    if (bit) {
                        return codigo + "BSF " + dir + "\n";
                    }
                    codigo += "MOVLW 0x01\n";
                } else {
                    if (bit) {
                        return codigo + "BCF " + dir + "\n";
                    }
                    codigo += "CLRW\n";
                }
                return codigo + "MOVWF " + dir + "\n";
            } else if (super.operando2 instanceof LlaveTabla) {
                String dir2 = CIVisitor.simbolos.getDireccion((LlaveTabla) super.operando2);
                return String.format(
                        """
                        %s MOVFW %s
                        MOVWF %s
                       """, super.etiqueta == null ? "" : super.etiqueta, dir2, dir);
            } else {
                boolean valor = (boolean) super.operando2;
                if (bit) {
                    return (super.etiqueta == null ? "" : super.etiqueta + " ") + (valor ? "BSF " : "BCF ") + dir + "\n";
                }
                String codigo = (super.etiqueta == null ? "" : super.etiqueta + " ") + (valor ? "MOVLW 0X01\n" : "CLRW\n");
                return codigo + "MOVWF " + dir + "\n";
            }
        }
    }

    @Override
    public void optimizar(BloqueTripletas padre) {
        super.resolverReferencias(padre);
    }

}
