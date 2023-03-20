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
public class TablaFunciones {

    java.util.HashMap<String, java.util.ArrayList<LlaveTabla>> tabla;

    public TablaFunciones() {
        tabla = new java.util.HashMap<>();
    }

    public void agregarFuncion(String id) {
        tabla.put(id, new java.util.ArrayList<>());
    }

    public void agregarParametro(String id, LlaveTabla parametro) {
        tabla.get(id).add(parametro);
        switch (codigo.FrmPrincipal.tablaSimbolos.getTipo(parametro)) {
            case "entero" ->
                codigo.FrmPrincipal.tablaSimbolos.agregarValor(parametro, 0);
            case "logico" ->
                codigo.FrmPrincipal.tablaSimbolos.agregarValor(parametro, false);
        }
    }

    public void mostrarTabla(javax.swing.table.DefaultTableModel modelo) {
        modelo.setRowCount(0);
        modelo.setColumnCount(1);
        tabla.forEach((id, parametros) -> {
            Object[] fila = new Object[5];
            int i = 0;
            fila[i++] = id;
            while (modelo.getColumnCount() < parametros.size()) {
                modelo.addColumn("Parametro: " + (modelo.getColumnCount() + 1));
            }
            for (LlaveTabla llave : parametros) {
                fila[i++] = llave.toString();
            }
            modelo.addRow(fila);
        });
    }

    public boolean existe(String id) {
        return tabla.containsKey(id);
    }

    public java.util.ArrayList<String> getTipos(String id) {
        java.util.ArrayList<String> tipos = new java.util.ArrayList<>();

        tabla.get(id).forEach(llave -> tipos.add(codigo.FrmPrincipal.tablaSimbolos.getTipo(llave)));
        return tipos;
    }

    @Override
    public String toString() {
        return tabla.toString();
    }
}
