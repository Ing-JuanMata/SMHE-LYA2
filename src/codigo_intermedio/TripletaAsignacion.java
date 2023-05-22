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

    @Override
    public String codigoObjeto() {
        String dir = CIVisitor.simbolos.getDireccion(id);
        if (super.ref2 != null) {
            return "MOVWF " + dir + "\n";
        } else {
            if (super.operando2 instanceof Integer) {
                String n = Integer.toHexString(Integer.parseInt(super.operando2 + ""));
                String codigo = "MOVLW 0X" + n + "\n";
                return codigo + "MOVWF " + dir + "\n";
            } else {
                String codigo = "CLRW\n";
                if (((String) super.operando2).equals("verdadero")) {
                    codigo += "IORLW 0x01\n";
                }
                return codigo + "MOVWF " + dir + "\n";
            }
        }
    }

    @Override
    public void optimizar(BloqueTripletas padre) {
        super.resolverReferencias(padre);
    }

}
