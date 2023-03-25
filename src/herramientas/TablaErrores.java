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
        tabla.put("EL1", "Error lexico 1: en la linea %d la cadena \"%s\" no es considerada una cadena valida");
        tabla.put("ES1", "Error sintactico 1: en la linea %d se ha encontrado que las cadenas de la estructura principal no concuerdan con el formato solicitado, favor de revisar en la ayuda");
        tabla.put("ES2", "Error sintactico 2: en la linea %d la expresion escrita tiene un error"
                + " en su estructura en la cadena %s");
        tabla.put("ES3", "Error sintactico 3: en la linea %d la unidad de tiempo no es la correcta, recuerda que debe ser [\"seg\", \"min\", \"hr\"]");
        tabla.put("ES4", "Error sintactico 4: en la linea %d no se ha seleccionado un tipo de dato valido");
        tabla.put("ES5", "Error sintactico 5: en la linea %d el formato de su expresion logica no es correcto");
        tabla.put("ES6", "Error sintactico 6: en la linea %d el formato de su expresion aritmetica no es correcto");
        tabla.put("ES7", "Error sintactico 7: en la linea %d no se ha encontrado el punto y coma para la instruccion ingresada");
        tabla.put("ES8", "Error sintactico 8: en la linea %d mediante la cadena definida como \"%s\" se ha producido un error irrecuperable por el analizador, favor de revisar dicha linea");
        tabla.put("ES9", "Error sintactico 9: en la linea %d no se ha encontrado el caracter que define el tipo de expresion de asignacion");
        tabla.put("ES10", "Error sintactico 10: antes de la linea %d se esperaba \"salir;\"");
        tabla.put("ESM1", "Error semantico 1: en la linea %d el identificador %s no ha sido declarado");
        tabla.put("ESM2", "Error semantico 2: en la linea %d el tipo de dato del identificador %s no deberia ser %s");
        tabla.put("ESM3", "Error semantico 3: en la linea %d el identificador %s no tiene ningun valor");
        tabla.put("ESM4", "Error semantico 4: en la linea %d el identificador %s ya ha sido declarado");
        tabla.put("ESM5", "Error semantico 5: En la linea %d el valor %s de la expresion no se puede guardar en el identificador \"%s\" de tipo %s");
        tabla.put("ESM6", "Error semantico 6: En la linea %d el identificador %s no tiene ningun tipo asociado");
        tabla.put("ESM7", "Error semantico 7: En la linea %d se ha llamado a la funcion %s, dicha funcion no ha sido declarada");
        tabla.put("ESM8", "Error semantico 8: En la linea %d se han colocado %s parametros para la funcion %s y se esperaban %s parametros");
        tabla.put("ESM9", "Error semantico 9: En la linea %d se ha colocado un tipo erroneo en el parametro numero %s, en dicho lugar se esperaba un valor %s");
        tabla.put("ESM10", "Error semantico 10: En la linea %d el tipo definido de la expresion %s y el valor ingresado son incompatibles");
    }

    public ArrayList<String> getErrores() {
        return errores;
    }

    public String infoErrores() {
        String info = "";
        for (String codigo : tabla.keySet()) {
            info += codigo + ": " + tabla.get(codigo) + "\n\n";
        }
        return info;
    }

    public void agregarErrorLexico(String error, int linea, String cuerpo) {
        errores.add(String.format(tabla.get(error), linea, cuerpo));
    }

    public void agregarErrorSintactico(String error, int linea, String... valores) {
        switch (error) {
            case "ES1", "ES3", "ES4", "ES5", "ES6", "ES9", "ES10" ->
                errores.add(String.format(tabla.get(error), linea));
            case "ES7" ->
                errores.add(String.format(tabla.get(error), linea - 1));
            case "ES2", "ES8" ->
                errores.add(String.format(tabla.get(error), linea, valores[0]));
            default ->
                System.out.println("Error no encontrado: " + error);
        }
    }

    public void agregarErrorSemantico(String error, int linea, String... valores) {
        System.out.println(error);
        switch (error) {
            case "ESM1", "ESM3", "ESM4", "ESM7", "ESM10" ->
                errores.add(String.format(tabla.get(error), linea, valores[0]));
            case "ESM2", "ESM9" ->
                errores.add(String.format(tabla.get(error), linea, valores[0], valores[1]));
            case "ESM5", "ESM8" ->
                errores.add(String.format(tabla.get(error), linea, valores[0], valores[1], valores[2]));
            default ->
                System.out.println("No se ha encontrado el error semantico introducido: " + error);
        }
    }
}
