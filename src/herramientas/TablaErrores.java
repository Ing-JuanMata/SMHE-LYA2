/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

import java.util.ArrayList;

/**
 *
 * @author jujemataso
 */
public class TablaErrores {

    private java.util.HashMap<String, String> tabla;
    private java.util.ArrayList<String> errores;

    public TablaErrores() {
        tabla = new java.util.HashMap<>();
        errores = new java.util.ArrayList<>();
        llenarTabla();
    }

    private void llenarTabla() {
        tabla.put("EL1", "Error lexico: en la linea %d la cadena \"%s\" no es considerada una cadena valida");
        tabla.put("ES1", "Error lexico: en la linea %d se ha encontrado que las cadenas "
                + "de la estructura principal no concuerdan con el formato solicitado,"
                + " favor de revisar en la ayuda");
        tabla.put("ES2", "Error lexico: en la linea %d la expresion escrita tiene un error"
                + " en su estructura en la cadena %s");
        tabla.put("ES3", "Error lexico: en la linea %d la unidad de tiempo no es la correcta, recuerda que debe ser [\"seg\", \"min\", \"hr\"]");
        tabla.put("ES4", "Error lexico: en la linea %d no se ha seleccionado un tipo de dato valido");
    }

    public ArrayList<String> getErrores() {
        return errores;
    }

    public void agregarErrorLexico(String error, int linea, String cuerpo) {
        errores.add(String.format(tabla.get(error), linea, cuerpo));
    }

    public void agregarErrorSintactico(String error, int linea, String... valores) {
        switch (error) {
            case "ES1", "ES3", "ES4" ->
                errores.add(String.format(tabla.get(error), linea));
            case "ES2" ->
                errores.add(String.format(tabla.get(error), linea, valores[0]));
            default ->
                System.out.println("Error no encontrado");
        }
    }

    public void agregarErrorSemantico(String error, String cuerpo) {
    }
}
