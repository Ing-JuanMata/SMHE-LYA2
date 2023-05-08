/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

import analisis.LlaveTabla;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jujemataso
 */
public class TablaFunciones {

    java.util.HashMap<String, java.util.ArrayList<LlaveTabla>> tabla;
    TablaSimbolos tablaSimbolos;

    public TablaFunciones() {
        tabla = new java.util.HashMap<>();
    }

    public TablaFunciones(TablaSimbolos tablaSimbolos) {
        this();
        this.tablaSimbolos = tablaSimbolos;
    }

    public void agregarFuncion(String id) {
        System.out.println("Agregando: " + id);
        tabla.put(id, new java.util.ArrayList<>());
    }

    public void agregarParametro(String id, LlaveTabla parametro) {
        tabla.get(id).add(parametro);
        switch (this.tablaSimbolos.getTipo(parametro)) {
            case "entero" ->
                this.tablaSimbolos.agregarValor(parametro, false);
            case "logico" ->
                this.tablaSimbolos.agregarValor(parametro, false);
        }
    }

    public boolean tieneDatos() {
        return !tabla.isEmpty();
    }

    public void mostrarTabla(javax.swing.table.DefaultTableModel modelo) {
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        modelo.addColumn("ID");
        tabla.forEach((id, parametros) -> {
            ArrayList<Object> fila = new ArrayList();
            fila.add(id);
            while (modelo.getColumnCount() <= parametros.size()) {
                modelo.addColumn("Parametro: " + (modelo.getColumnCount()));
            }
            for (LlaveTabla llave : parametros) {
                fila.add(llave.id + ": " + sintactico.MainParser.tabla.getTipo(llave));
            }
            modelo.addRow(fila.toArray());
        });
    }

    public boolean existe(String id) {
        return tabla.containsKey(id);
    }

    public java.util.ArrayList<String> getTipos(String id) {
        java.util.ArrayList<String> tipos = new java.util.ArrayList<>();

        tabla.get(id).forEach(llave -> tipos.add(sintactico.MainParser.tabla.getTipo(llave)));
        return tipos;
    }

    public HashMap<String, ArrayList<LlaveTabla>> getTabla() {
        return tabla;
    }

    public java.util.ArrayList<LlaveTabla> getParametros(String id) {
        return tabla.get(id);
    }

    @Override
    public String toString() {
        return tabla.toString();
    }
}
