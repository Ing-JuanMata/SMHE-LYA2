/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisis;

/**
 *
 * @author jujemataso
 */
public class Pila {
    private java.util.ArrayList<Object> pila;
    
    public Pila(){
        pila = new java.util.ArrayList<>();
    }
    
    public void agregarPila(Object valor){
        pila.add(0, valor);
    }
    
    
}
