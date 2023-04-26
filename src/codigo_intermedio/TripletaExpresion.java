/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

import java.util.Objects;

/**
 *
 * @author jujemataso
 */
public abstract class TripletaExpresion extends Tripleta {

    private boolean usaIds = false;

    public TripletaExpresion(String operador, Object operando1) {
        super(operador);
        if (operando1 instanceof Tripleta) {
            super.ref1 = (Tripleta) operando1;
            return;
        } else if (operando1 instanceof analisis.LlaveTabla) {
            super.operando1 = ((analisis.LlaveTabla) operando1).id;
            this.usaIds = true;
            return;
        }
        super.operando1 = operando1;
    }

    public TripletaExpresion(String operador, Object operando1, Object operando2) {
        this(operador, operando1);
        if (operando2 instanceof Tripleta) {
            super.ref2 = (Tripleta) operando2;
            return;
        } else if (operando2 instanceof analisis.LlaveTabla) {
            super.operando2 = ((analisis.LlaveTabla) operando2).id;
            this.usaIds = true;
        }
        super.operando2 = operando2;
    }

    @Override
    public void optimizar(BloqueTripletas padre) {
        super.resolverReferencias(padre);
        if (this.reducible()) {
            super.operando1 = this.calcularExpresion();
            super.operando2 = null;
            super.calculada = true;
        }
    }

    protected Object calcularExpresion() {
        Object temp = null;
        switch (super.operador) {
            case "&&" ->
                temp = Boolean.valueOf(super.operando1.toString()) && Boolean.valueOf(super.operando2.toString());
            case "||" ->
                temp = Boolean.valueOf(super.operando1.toString()) || Boolean.valueOf(super.operando2.toString());
            case "!=" ->
                temp = !Objects.equals(Integer.valueOf(super.operando1.toString()), Integer.valueOf(super.operando2.toString()));
            case "!" ->
                temp = !Boolean.valueOf(super.operando1.toString());
            case "==" ->
                temp = Objects.equals(super.operando1, super.operando2);
            case ">" ->
                temp = Integer.valueOf(super.operando1.toString()) > Integer.valueOf(super.operando2.toString());
            case ">=" ->
                temp = Integer.valueOf(super.operando1.toString()) >= Integer.valueOf(super.operando2.toString());
            case "<" ->
                temp = Integer.valueOf(super.operando1.toString()) < Integer.valueOf(super.operando2.toString());
            case "<=" ->
                temp = Integer.valueOf(super.operando1.toString()) <= Integer.valueOf(super.operando2.toString());
            case "/" ->
                temp = Integer.valueOf(super.operando1.toString()) / Integer.valueOf(super.operando2.toString());
            case "*" ->
                temp = Integer.valueOf(super.operando1.toString()) * Integer.valueOf(super.operando2.toString());
            case "-" ->
                temp = super.operando2 != null
                        ? Integer.valueOf(super.operando1.toString()) - Integer.valueOf(super.operando2.toString())
                        : -Integer.valueOf(super.operando1.toString());
            case "+" ->
                temp = Integer.valueOf(super.operando1.toString()) + Integer.valueOf(super.operando2.toString());
        }
        return temp;
    }

    public boolean reducible() {
        return super.ref1 == null && super.ref2 == null && !this.usaIds;
    }
}
