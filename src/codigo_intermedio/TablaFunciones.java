/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

import analisis.LlaveTabla;
import java.util.ArrayList;

/**
 *
 * @author jujemataso
 */
public class TablaFunciones {

    TablaSimbolos simbolos;
    java.util.HashMap<String, java.util.ArrayList<LlaveTabla>> tabla;
    java.util.HashMap<String, Tripleta> tripletasInicio;

    public TablaFunciones(TablaSimbolos simbolos) {
        this.simbolos = simbolos;
        tabla = new java.util.HashMap<>();
        tripletasInicio = new java.util.HashMap<>();
        iniciarTabla();
    }

    private void iniciarTabla() {
        herramientas.TablaFunciones tablaAnalisis = sintactico.MainParser.funciones;
        for (String funcion : tablaAnalisis.getTabla().keySet()) {
            tabla.put(funcion, tablaAnalisis.getParametros(funcion));
        }
    }

    public void setInicio(String funcion, Tripleta inicio) {
        tripletasInicio.put(funcion, inicio);
    }

    public Tripleta getInicio(String funcion) {
        return tripletasInicio.get(funcion);
    }

    public String getDireccionParametro(String id, int pos) {
        LlaveTabla llave = this.tabla.get(id).get(pos);
        return simbolos.getDireccion(llave.id, llave.ambito);
    }
    
    public LlaveTabla getParametro(String id, int pos){
        return tabla.get(id).get(pos);
    }

    public void mostrarTabla(javax.swing.table.DefaultTableModel modelo) {
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        modelo.addColumn("ID");
        modelo.addColumn("Tripleta Inicial");
        tabla.forEach((id, parametros) -> {
            ArrayList<Object> fila = new ArrayList();
            fila.add(id);
            fila.add(tripletasInicio.get(id));
            while (modelo.getColumnCount() - 1 <= parametros.size()) {
                modelo.addColumn("Parametro: " + (modelo.getColumnCount() - 1));
            }
            for (LlaveTabla llave : parametros) {
                fila.add(llave.id + ": " + sintactico.MainParser.tabla.getTipo(llave));
            }
            modelo.addRow(fila.toArray());
        });
    }

    @Override
    public String toString() {
        return tabla.toString();
    }
}
