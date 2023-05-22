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
public class TripletaUnidadTiempo extends Tripleta {

    private LlaveTabla id;

    public TripletaUnidadTiempo(String unidad, Object expresion) {
        super(unidad);
        if (expresion instanceof Tripleta) {
            super.ref1 = (Tripleta) expresion;
            return;
        } else if (expresion instanceof analisis.LlaveTabla) {
            this.id = (analisis.LlaveTabla) expresion;
            super.operando1 = this.id.id;
            return;
        }

        super.operando1 = expresion;
    }

    @Override
    public String codigoObjeto() {
        String codigo;
        String unidad = "SEGUNDOS";
        switch (super.operador) {
            case "min" ->
                unidad = "MINUTOS";
            case "hr" ->
                unidad = "HORAS";
        }
        unidad += ",F";
        if (super.ref1 != null) {
            return "ADDWF " + unidad + "\n";
        } else {
            if (this.id != null) {
                String dir = CIVisitor.simbolos.getDireccion(this.id);
                codigo = "MOVFW " + dir + "\n";
                return codigo + "ADDWF " + unidad + "\n";
            }

            codigo = "MOVLW 0X" + Integer.toHexString(Integer.parseInt(super.operando1 + "")) + "\n";
            return codigo + "ADDWF " + unidad + "\n";
        }
    }

    @Override
    public void optimizar(BloqueTripletas padre) {
        super.resolverReferencias(padre);
    }

}
