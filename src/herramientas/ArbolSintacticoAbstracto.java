/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

/**
 *
 * @author jujemataso
 */
public class ArbolSintacticoAbstracto {

    private NodoAST raiz;

    public ArbolSintacticoAbstracto() {
        raiz = null;
    }

    public ArbolSintacticoAbstracto(Object valor) {
        raiz = new NodoAST(valor);
    }

    public String inOrden() {
        return raiz == null ? ""
                : inOrden(raiz.getIzquierdo()) + raiz.valor + inOrden(raiz.getDerecho());
    }

    private String inOrden(NodoAST nodo) {
        return nodo == null ? ""
                : inOrden(nodo.getIzquierdo()) + nodo.valor + inOrden(nodo.getDerecho());
    }

    public String preOrden() {
        return raiz == null ? ""
                : raiz.valor + preOrden(raiz.getIzquierdo()) + preOrden(raiz.getDerecho());
    }

    private String preOrden(NodoAST nodo) {
        return nodo == null ? ""
                : nodo.valor + preOrden(nodo.getIzquierdo()) + preOrden(nodo.getDerecho());
    }

    public String postOrden() {
        return raiz == null ? ""
                : postOrden(raiz.getIzquierdo()) + postOrden(raiz.getDerecho()) + raiz.valor;
    }

    private String postOrden(NodoAST nodo) {
        return nodo == null ? ""
                : postOrden(nodo.getIzquierdo()) + postOrden(nodo.getDerecho()) + nodo.valor;  
    }
}
