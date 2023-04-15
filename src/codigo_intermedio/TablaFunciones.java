/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

import analisis.LlaveTabla;

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
        herramientas.TablaFunciones tablaAnalisis = codigo.FrmPrincipal.funciones;
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

    public void mostrarTabla(javax.swing.table.DefaultTableModel modelo) {
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        modelo.addColumn("ID");
        tabla.forEach((id, parametros) -> {
            Object[] fila = new Object[5];
            int i = 0;
            fila[i++] = id;
            while (modelo.getColumnCount() <= parametros.size()) {
                modelo.addColumn("Parametro: " + (modelo.getColumnCount()));
            }
            for (LlaveTabla llave : parametros) {
                fila[i++] = llave.id + ": " + codigo.FrmPrincipal.tablaSimbolos.getTipo(llave);
            }
            modelo.addRow(fila);
        });
    }

    @Override
    public String toString() {
        return tabla.toString();
    }
}
