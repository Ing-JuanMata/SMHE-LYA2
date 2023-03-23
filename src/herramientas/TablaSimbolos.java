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
        if (tabla.containsKey(id)) {
            return;
        }
        tabla.put(id, new ContenidoTabla(linea));
    }

    public boolean tieneDatos() {
        return !tabla.isEmpty();
    }

    public void agregarTipo(LlaveTabla id, String tipo) {
        if (tabla.get(id).tipo != null) {
            return;
        }
        tabla.get(id).tipo = tipo;
    }

    public void agregarAmbito(LlaveTabla id, String ambito) {
        id.ambito = ambito;
    }

    public void agregarValor(LlaveTabla id, Object valor) {
        tabla.get(id).valor = valor;
    }

    public String getTipo(LlaveTabla id) {
        if (tabla.get(id) == null) {
            return "";
        }
        if (tabla.get(id).tipo == null) {
            return "";
        }
        return tabla.get(id).tipo;
    }

    public Object getValor(LlaveTabla identificador) {
        return tabla.get(identificador).valor;
    }

    public void verTabla(javax.swing.table.DefaultTableModel modelo) {
        modelo.setRowCount(0);
        modelo.addColumn("ID");
        modelo.addColumn("AMBITO");
        modelo.addColumn("TIPO");
        modelo.addColumn("VALOR");
        modelo.addColumn("LINEA");

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

    public boolean existe(LlaveTabla llave) {
        ContenidoTabla val = tabla.get(llave);
        return val == null ? false : val.linea >= 0;
    }

    @Override
    public String toString() {
        return tabla.toString();
    }

}
