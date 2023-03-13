/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

/**
 *
 * @author jujemataso
 */
public class NodoAST {

    private NodoAST derecho, izquierdo;
    public Object valor;

    public NodoAST(Object valor) {
        this.valor = valor;
        derecho = null;
        izquierdo = null;
    }

    public NodoAST() {
        derecho = null;
        izquierdo = null;
    }

    public void setDerecho(Object valor) {
        if (derecho == null) {
            derecho = new NodoAST(valor);
            return;
        }

        derecho.valor = valor;
    }

    public NodoAST getDerecho() {
        return derecho;
    }

    public void setIzquierdo(Object valor) {
        if (izquierdo == null) {
            izquierdo = new NodoAST(valor);
            return;
        }

        izquierdo.valor = valor;
    }

    public NodoAST getIzquierdo() {
        return izquierdo;
    }
}
