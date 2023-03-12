/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

/**
 *
 * @author jujemataso
 */
public class ContenidoTabla {

    public String tipo;
    public Object valor;
    public int linea;

    public ContenidoTabla(int linea) {
        this.linea = linea;
    }

    @Override
    public String toString() {
        return "tipo: " + tipo + " valor: " + valor + " linea: " + linea;
    }

}
