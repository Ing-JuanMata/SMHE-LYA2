/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaAsignacion extends Tripleta {

    public TripletaAsignacion(Object valor) {
        super("=");
        if (valor instanceof Tripleta) {
            this.ref2 = (Tripleta) valor;
            return;
        }
        this.operando2 = valor;
    }

    public TripletaAsignacion(String id, Object valor) {
        super("=");
        this.operando1 = id;
        if (valor instanceof Tripleta) {
            this.ref2 = (Tripleta) valor;
            return;
        }
        this.operando2 = valor;
    }

    @Override
    public String codigoObjeto() {
        return "";
    }
}
