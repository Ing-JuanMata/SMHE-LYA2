/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

/**
 *
 * @author jujemataso
 */
public class NodoSintactico {

    public Object valor;
    private final java.util.ArrayList<NodoSintactico> hijos;
    NodoSintactico padre;

    public NodoSintactico() {
        hijos = new java.util.ArrayList<>();
    }

    public NodoSintactico(NodoSintactico padre) {
        this.padre = padre;
        hijos = new java.util.ArrayList<>();
    }

    public NodoSintactico(Object valor) {
        this.valor = valor;
        hijos = new java.util.ArrayList<>();
    }

    public NodoSintactico(Object valor, NodoSintactico padre) {
        this.valor = valor;
        this.padre = padre;
        this.hijos = new java.util.ArrayList<>();
    }

    public int cantidadHijos() {
        return hijos.size();
    }

    public void agregarHijo(NodoSintactico hijo) {
        hijos.add(hijo);
    }

    public void agregarHijos(NodoSintactico padre, Object... hijos) {
        for (Object hijo : hijos) {
            this.hijos.add(new NodoSintactico(hijo, padre));
        }
    }

    public java.util.ArrayList<NodoSintactico> getHijos() {
        return hijos;
    }

    @Override
    public String toString() {
        return "valor: " + valor.toString();
    }

}
