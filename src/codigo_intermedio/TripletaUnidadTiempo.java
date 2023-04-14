/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaUnidadTiempo extends Tripleta {

    public TripletaUnidadTiempo(String unidad, Object expresion) {
        super(unidad);
        if (expresion instanceof Tripleta) {
            super.ref1 = (Tripleta) expresion;
            return;
        }

        super.operando1 = expresion;
    }

    @Override
    public String codigoObjeto() {
        return "";
    }

}
