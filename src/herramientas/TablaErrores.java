/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jujemataso
 */
public class TablaErrores {

    private HashMap<String, String> tabla;
    private HashMap<Integer, ArrayList<String>> errores;

    public TablaErrores() {
        tabla = new HashMap<>();
        errores = new HashMap<>();
        llenarTabla();
    }

    private void llenarTabla() {
        tabla.put("EL1", "Error léxico 1: en la línea %d el carácter \"%s\" no es valido");
        tabla.put("EL2", "Error léxico 2: en la línea %d la cadena \"%s\" no es valida");
        tabla.put("ES1", "Error sintáctico 1: en la línea %d la expresión escrita tiene un error en su estructura en la cadena %s se esperaba %s");
        tabla.put("ES2", "Error sintáctico 2: en la línea %d la unidad de tiempo \"%s\" no es la correcta, debe ser [\"seg\", \"min\", \"hr\"]");
        tabla.put("ES3", "Error sintáctico 3: en la línea %d no se ha recibido un tipo de dato valido");
        tabla.put("ES4", "Error sintáctico 4: en la línea %d no se ha encontrado el punto y coma para la instrucción ingresada");
        tabla.put("ES5", "Error sintáctico 5: antes de la línea %d se esperaba \"salir;\"");
        tabla.put("ES6", "Error sintáctico 6: En la línea %d %s");
        tabla.put("ES7", "Error sintáctico 7: En la línea %d no se ha encontrado \"%s\"");
        tabla.put("ESM1", "Error semántico 1: en la línea %d el identificador \"%s\" no ha sido declarado");
        tabla.put("ESM2", "Error semántico 2: en la línea %d el identificador \"%s\" no tiene ningún valor");
        tabla.put("ESM3", "Error semántico 3: en la línea %d el identificador \"%s\" ya ha sido declarado");
        tabla.put("ESM4", "Error semántico 4: En la línea %d el valor \"%s\" de la expresión no se puede guardar en el identificador \"%s\" de tipo \"%s\"");
        tabla.put("ESM5", "Error semántico 5: En la línea %d el identificador \"%s\" no tiene ningún tipo asociado");
        tabla.put("ESM6", "Error semántico 6: En la línea %d se ha llamado a la función \"%s\", dicha función no ha sido declarada");
        tabla.put("ESM7", "Error semántico 7: En la línea %d se han colocado \"%s\" parámetros para la función \"%s\" y se esperaban \"%s\" parámetros");
        tabla.put("ESM8", "Error semántico 8: En la línea %d se ha colocado un tipo erroneo en el parametro numero \"%s\", en dicho lugar se esperaba un valor \"%s\"");
        tabla.put("ESM9", "Error semántico 9: En la línea %d se ha tratado de usar un valor \"%s\" en una operación \"%s\"");
        tabla.put("ESM10", "Error semántico 10: En la línea %d el valor \"%s\" esta fuera de rango");
    }

    public HashMap<Integer, ArrayList<String>> getErrores() {
        return errores;
    }

    public String infoErrores() {
        String info = "";
        for (String codigo : tabla.keySet()) {
            info += codigo + ": " + tabla.get(codigo) + "\n\n";
        }
        return info;
    }

    public void agregarErrorLexico(String error, int línea, String cuerpo) {
        ArrayList<String> errores = this.errores.get(línea);
        if (errores == null) {
            errores = new ArrayList<>();
            this.errores.put(línea, errores);
        }
        errores.add(String.format(tabla.get(error), línea, cuerpo));
    }

    public void agregarErrorSintactico(String error, int línea, String... valores) {
        ArrayList<String> errores = this.errores.get(línea);
        if (errores == null) {
            errores = new ArrayList<>();
            this.errores.put(línea, errores);
        }
        switch (error) {
            case "ES3", "ES4", "ES5" ->
                errores.add(String.format(tabla.get(error), línea));
            case "ES2", "ES6", "ES7" ->
                errores.add(String.format(tabla.get(error), línea, valores[0]));
            case "ES1" ->
                errores.add(String.format(tabla.get(error), línea, valores[0], valores[1]));
            default ->
                System.out.println("Error no encontrado: " + error);
        }
    }

    public void agregarErrorSemantico(String error, int línea, String... valores) {
        ArrayList<String> errores = this.errores.get(línea);
        if (errores == null) {
            errores = new ArrayList<>();
            this.errores.put(línea, errores);
        }
        switch (error) {
            case "ESM1", "ESM2", "ESM3", "ESM5", "ESM6", "ESM10" ->
                errores.add(String.format(tabla.get(error), línea, valores[0]));
            case "ESM8", "ESM9" ->
                errores.add(String.format(tabla.get(error), línea, valores[0], valores[1]));
            case "ESM4", "ESM7" ->
                errores.add(String.format(tabla.get(error), línea, valores[0], valores[1], valores[2]));
            default ->
                System.out.println("No se ha encontrado el error semántico introducido: " + error);
        }
    }
}
