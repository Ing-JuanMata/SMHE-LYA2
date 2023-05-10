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

    private HashMap<LlaveTabla, String> tabla;

    public TablaSimbolos() {
        tabla = new HashMap<>();
        iniciarTabla();
    }

    private void iniciarTabla() {
        herramientas.TablaSimbolos tablaAnalisis = sintactico.MainParser.tabla;
        int direccion = 0x0c;
        for (LlaveTabla llave : tablaAnalisis.getTabla().keySet()) {
            tabla.put(llave, Integer.toHexString(direccion++));
        }
        tabla.put(new LlaveTabla("0puertas_ventilar0", "programa"), Integer.toHexString(direccion++));
        tabla.put(new LlaveTabla("0ventanas_ventilar0", "programa"), Integer.toHexString(direccion++));
        tabla.put(new LlaveTabla("0admision_admitir0", "programa"), Integer.toHexString(direccion++));
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
            fila[2] = "0x" + direccion;
            modelo.addRow(fila);
        });
    }

    public String getDireccion(String id, String ambito) {
        return "0x" + tabla.get(new LlaveTabla(id, getAmbito(id, ambito)));
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
