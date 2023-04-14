/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public abstract class TripletaExpresion extends Tripleta {

    public TripletaExpresion(String operador, Object operando1) {
        super(operador);
        if (operando1 instanceof Tripleta) {
            super.ref1 = (Tripleta) operando1;
            return;
        }
        super.operando1 = operando1;
    }

    public TripletaExpresion(String operador, Object operando1, Object operando2) {
        this(operador, operando1);
        if (operando2 instanceof Tripleta) {
            super.ref2 = (Tripleta) operando2;
            return;
        }
        super.operando2 = operando2;
    }
}
