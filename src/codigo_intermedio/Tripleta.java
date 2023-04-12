/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public abstract class Tripleta {

    protected int numero;
    protected String operador;
    protected Tripleta ref1, ref2;
    protected Object operando1, operando2;

    public Tripleta(String operador) {
        this.operador = operador;
    }

    public abstract String codigoObjeto();

    private String getOperando(int n) {
        switch (n) {
            case 1 -> {
                return ref1 == null ? (operando1 == null ? "" : operando1.toString()) + "" : "(" + ref1.numero + ")";
            }
            case 2 -> {
                return ref2 == null ? (operando2 == null ? "" : operando2.toString()) + "" : "(" + ref2.numero + ")";
            }
            default -> {
                return "";
            }
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public Tripleta getRef1() {
        return ref1;
    }

    public void setRef1(Tripleta ref1) {
        this.ref1 = ref1;
    }

    public Tripleta getRef2() {
        return ref2;
    }

    public void setRef2(Tripleta ref2) {
        this.ref2 = ref2;
    }

    public Object getOperando1() {
        return operando1;
    }

    public void setOperando1(Object operando1) {
        this.operando1 = operando1;
    }

    public Object getOperando2() {
        return operando2;
    }

    public void setOperando2(Object operando2) {
        this.operando2 = operando2;
    }

    @Override
    public String toString() {
        return numero + ":(" + operador + ", " + getOperando(1) + ", " + getOperando(2) + ")";
    }
}
