/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

import analisis.LlaveTabla;
import java.util.HashMap;

/**
 *
 * @author jujemataso
 */
public class TablaSimbolos {

    private herramientas.TablaSimbolos simbolos;
    private HashMap<LlaveTabla, String> tabla;

    public TablaSimbolos(herramientas.TablaSimbolos simbolos) {
        tabla = new HashMap<>();
        this.simbolos = simbolos;
        iniciarTabla();
    }

    private void iniciarTabla() {
        herramientas.TablaSimbolos tablaAnalisis = simbolos;
        tabla.put(new LlaveTabla("0puertas_ventilar0", "programa"), "VENTP");
        tabla.put(new LlaveTabla("0ventanas_ventilar0", "programa"), "VENTV");
        tabla.put(new LlaveTabla("0admision_admitir0", "programa"), "ADMIP");
        tabla.put(new LlaveTabla("0capacidad_admitir0", "programa"), "LIMITE");
        int direccion = 0x18;
        for (LlaveTabla llave : tablaAnalisis.getTabla().keySet()) {
            tabla.put(llave, Integer.toHexString(direccion++));
        }
    }

    public void verTabla(javax.swing.table.DefaultTableModel modelo) {
        modelo.setRowCount(0);
        modelo.addColumn("ID");
        modelo.addColumn("AMBITO");
        modelo.addColumn("DIRECCION");

        tabla.forEach((llave, direccion) -> {
            Object[] fila = new Object[3];
            fila[0] = llave.id;
            fila[1] = llave.ambito;
            fila[2] = (direccion.matches("[0-9]+") ? "0x" : "") + direccion;
            modelo.addRow(fila);
        });
    }

    public String getDireccion(String id, String ambito) {
        return (id.startsWith("0") ? "" : "0x") + tabla.get(new LlaveTabla(id, getAmbito(id, ambito)));
    }

    public String getDireccion(LlaveTabla id) {
        return getDireccion(id.id, id.ambito);
    }

    private String getAmbito(String id, String ambito) {
        while (ambito.split(":").length > 1) {
            String v = tabla.get(new LlaveTabla(id, ambito));

            if (v != null) {
                return ambito;
            } else {
                ambito = ambito.substring(0, ambito.lastIndexOf(":"));
            }
        }
        return ambito.split(":")[0];
    }

}
