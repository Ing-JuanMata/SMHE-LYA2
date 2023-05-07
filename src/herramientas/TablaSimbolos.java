/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

import analisis.LlaveTabla;
import java.util.HashMap;

/**
 *
 * @author jujemataso
 */
public class TablaSimbolos {

    private HashMap<LlaveTabla, ContenidoTabla> tabla;

    public TablaSimbolos() {
        tabla = new HashMap<>();
    }

    public void agregarSimbolo(LlaveTabla id, int linea) {
        LlaveTabla prueba = new LlaveTabla(id.id, getAmbito(id));
        if (tabla.containsKey(prueba)) {
            return;
        }
        tabla.put(id, new ContenidoTabla(linea));
    }

    public boolean tieneDatos() {
        return !tabla.isEmpty();
    }

    public void agregarTipo(LlaveTabla id, String tipo) {
        System.out.println(id);
        id.ambito = getAmbito(id);
        if (tabla.get(id).tipo != null) {
            return;
        }
        tabla.get(id).tipo = tipo;
    }

    public void agregarAmbito(LlaveTabla id, String ambito) {
        id.ambito = ambito;
    }

    public void agregarValor(LlaveTabla id, boolean valor) {
        id.ambito = getAmbito(id);
        tabla.get(id).valor = valor;
    }

    public String getTipo(LlaveTabla id) {
        id.ambito = getAmbito(id);
        return tabla.get(id).tipo;
    }

    public boolean getValor(LlaveTabla identificador) {
        identificador.ambito = getAmbito(identificador);
        return tabla.get(identificador).valor;
    }

    public int getLinea(LlaveTabla id) {
        id.ambito = getAmbito(id);
        return tabla.get(id).linea;
    }

    public HashMap<LlaveTabla, ContenidoTabla> getTabla() {
        return tabla;
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
        ContenidoTabla val = tabla.get(new LlaveTabla(llave.id, getAmbito(llave)));
        val = val == null && !llave.ambito.equals("programa") ? tabla.get(new LlaveTabla(llave.id, "programa")) : val;
        return val == null ? false : val.linea >= 0;
    }

    private String getAmbito(LlaveTabla llave) {
        String ambito = llave.ambito;
        //System.out.println("Llamado al ambito");
        while (ambito.split(":").length > 1) {
            ContenidoTabla v = tabla.get(new LlaveTabla(llave.id, ambito));

            if (v != null) {
                return ambito;
            } else {
                ambito = ambito.substring(0, ambito.lastIndexOf(":"));
            }
        }
        return llave.ambito.split(":")[0];
    }

    @Override
    public String toString() {
        return tabla.toString();
    }

}
