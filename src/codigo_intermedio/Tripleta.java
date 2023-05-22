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

    protected int numero, siguiente = 0;
    protected String operador, temporal;
    protected Tripleta ref1, ref2;
    protected Object operando1, operando2;
    protected boolean calculada = false;

    public Tripleta(String operador) {
        this.operador = operador;
    }

    public abstract void optimizar(BloqueTripletas padre);

    public abstract String codigoObjeto();

    public int enumerarTripleta(int inicio) {
        this.numero = inicio++;
        return inicio;
    }

    public Tripleta getInicio() {
        return this;
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
    
    public void setSiguiente(int siguiente){
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return numero + ":(" + operador + ", " + getOperando(1) + ", " + getOperando(2) + ")";
    }

    private String getOperando(int n) {
        switch (n) {
            case 1 -> {
                return ref1 == null ? (operando1 == null
                        ? ""
                        : operando1.toString()) + ""
                        : "(" + ref1.numero + ")";
            }
            case 2 -> {
                return ref2 == null
                        ? (operando2 == null
                                ? ""
                                : operando2.toString()) + ""
                        : "(" + ref2.numero + ")";
            }
            default -> {
                return "";
            }
        }
    }

    protected void resolverReferencias(BloqueTripletas padre) {
        if (this.ref1 == null && this.ref2 == null) {
            return;
        }
        //Vemos si la ref1 fue calculada, de ser asi removemos la referencia
        //Y movemos el valor a la tripleta actual
        if (this.ref1 != null && this.ref1.calculada) {
            this.operando1 = this.ref1.operando1;
            padre.contenido.remove(this.ref1);
            this.ref1 = null;
        }
        //Probamos y hacemos lo mismo con la ref2
        if (this.ref2 != null && this.ref2.calculada) {
            this.operando2 = this.ref2.operando1;
            padre.contenido.remove(this.ref2);
            this.ref2 = null;
        }
    }

    protected boolean tieneReferencias() {
        return this.ref1 != null || this.ref2 != null;
    }
}
