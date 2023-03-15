/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

import analisis.LlaveTabla;

/**
 *
 * @author jujemataso
 */
public class TablaSimbolos {

    private java.util.HashMap<LlaveTabla, ContenidoTabla> tabla;

    public TablaSimbolos() {
        tabla = new java.util.HashMap<>();
    }

    public void agregarSimbolo(LlaveTabla id, int linea) {
        tabla.put(id, new ContenidoTabla(linea));
    }

    public void agregarContenido(LlaveTabla id, String tipo, String ambito, Object valor) {
        id.ambito = ambito;
        ContenidoTabla contenido = tabla.get(id);
        contenido.tipo = tipo;
        contenido.valor = valor;
    }

    public void agregarTipo(LlaveTabla id, String tipo) {
        tabla.get(id).tipo = tipo;
    }

    public void agregarAmbito(LlaveTabla id, String ambito) {
        id.ambito = ambito;
    }

    public void agregarValor(LlaveTabla id, Object valor) {
        tabla.get(id).valor = valor;
    }

    public void quitarDeTabla(LlaveTabla id) {
        tabla.remove(id);
    }
    
    public Object getValor(LlaveTabla identificador){
        return tabla.get(identificador).valor;
    }

    public void verTabla(javax.swing.table.DefaultTableModel modelo) {
        modelo.setRowCount(0);
        tabla.forEach((llave, contenido) -> {
            Object[] fila = new Object[5];
            fila[0] = llave.id;
            fila[1] = llave.ambito;
            fila[2] = contenido.tipo;
            fila[3] = contenido.valor;
            fila[4] = contenido.linea;
            modelo.addRow(fila);
        });
    }

    @Override
    public String toString() {
        return tabla.toString();
    }

}
