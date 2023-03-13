/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

/**
 *
 * @author jujemataso
 */
public class ArbolSintactico {

    private NodoSintactico raiz;
    private NodoSintactico actual;

    public ArbolSintactico() {
        raiz = actual = new NodoSintactico();
    }

    public ArbolSintactico(Object valor) {
        raiz = actual = new NodoSintactico(valor);
    }

    public void moverA(NodoSintactico nuevo) {
        actual = nuevo;
    }

    public void retroceder() {
        System.out.println("actual: " + actual.valor + " padre: " + (actual.padre == null ? "nulo" : actual.padre.valor));
        actual = actual.padre;
    }

    public void agregarHijo(Object valor) {
        actual.agregarHijo(new NodoSintactico(valor, actual));
    }

    public void agregarHijo(Object valor, boolean mover) {
        NodoSintactico nuevo = new NodoSintactico(valor, actual);
        actual.agregarHijo(nuevo);
        if (mover) {
            moverA(nuevo);
        }
    }

    public void agregarHijos(Object... hijos) {
        actual.agregarHijos(actual, hijos);
    }

    public NodoSintactico getRaiz() {
        return raiz;
    }

    public NodoSintactico getActual() {
        return actual;
    }

    public void setValorRaiz(Object valor) {
        raiz.valor = valor;
    }

    public void setValorActual(Object valor) {
        actual.valor = valor;
    }
}
