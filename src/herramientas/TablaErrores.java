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
        tabla.put("EL1", "Error léxico 1: en la línea %d el carácter \"%s\" no es valido");
        tabla.put("EL2", "Error léxico 2: en la línea %d la cadena \"%s\" no es valida");
        tabla.put("ES1", "Error sintáctico 1: en la línea %d se ha encontrado que las cadenas de la estructura principal no concuerdan con el formato solicitado, favor de revisar en la ayuda");
        tabla.put("ES2", "Error sintáctico 2: en la línea %d la expresión escrita tiene un error en su estructura en la cadena %s");
        tabla.put("ES3", "Error sintáctico 3: en la línea %d la unidad de tiempo no es la correcta, recuerda que debe ser [\"seg\", \"min\", \"hr\"]");
        tabla.put("ES4", "Error sintáctico 4: en la línea %d no se ha seleccionado un tipo de dato valido");
        tabla.put("ES5", "Error sintáctico 5: en la línea %d el formato de su expresión lógica no es correcto");
        tabla.put("ES6", "Error sintáctico 6: en la línea %d el formato de su expresión aritmética no es correcto");
        tabla.put("ES7", "Error sintáctico 7: en la línea %d no se ha encontrado el punto y coma para la instrucción ingresada");
        tabla.put("ES8", "Error sintáctico 8: en la línea %d mediante la cadena definida como \"%s\" se ha producido un error irrecuperable por el analizador, favor de revisar dicha línea");
        tabla.put("ES9", "Error sintáctico 9: en la línea %d no se ha encontrado el carácter que define el tipo de expresión de asignación");
        tabla.put("ES10", "Error sintáctico 10: antes de la línea %d se esperaba \"salir;\"");
        tabla.put("ES11", "Error sintáctico 11: En la línea %d %s");
        tabla.put("ESM1", "Error semántico 1: en la línea %d el identificador %s no ha sido declarado");
        tabla.put("ESM2", "Error semántico 2: en la línea %d el tipo de dato del identificador %s no debería ser %s");
        tabla.put("ESM3", "Error semántico 3: en la línea %d el identificador %s no tiene ningún valor");
        tabla.put("ESM4", "Error semántico 4: en la línea %d el identificador %s ya ha sido declarado");
        tabla.put("ESM5", "Error semántico 5: En la línea %d el valor %s de la expresión no se puede guardar en el identificador \"%s\" de tipo %s");
        tabla.put("ESM6", "Error semántico 6: En la línea %d el identificador %s no tiene ningún tipo asociado");
        tabla.put("ESM7", "Error semántico 7: En la línea %d se ha llamado a la función %s, dicha función no ha sido declarada");
        tabla.put("ESM8", "Error semántico 8: En la línea %d se han colocado %s parámetros para la función %s y se esperaban %s parámetros");
        tabla.put("ESM9", "Error semántico 9: En la línea %d se ha colocado un tipo erroneo en el parametro numero %s, en dicho lugar se esperaba un valor %s");
        tabla.put("ESM10", "Error semántico 10: En la línea %d el tipo definido de la expresión %s y el valor ingresado son incompatibles");
        tabla.put("ESM11", "Error semántico 11: En la línea %d se ha tratado de usar un valor %s en una operación %s");
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

    public void agregarErrorLexico(String error, int línea, String cuerpo) {
        errores.add(String.format(tabla.get(error), línea, cuerpo));
    }

    public void agregarErrorSintactico(String error, int línea, String... valores) {
        switch (error) {
            case "ES1", "ES3", "ES4", "ES5", "ES6", "ES9", "ES10" ->
                errores.add(String.format(tabla.get(error), línea));
            case "ES7" ->
                errores.add(String.format(tabla.get(error), línea - 1));
            case "ES2", "ES8" ->
                errores.add(String.format(tabla.get(error), línea, valores[0]));
            case "ES11" ->
                errores.add(String.format(tabla.get(error), línea, valores[1]));
            default ->
                System.out.println("Error no encontrado: " + error);
        }
    }

    public void agregarErrorSemantico(String error, int línea, String... valores) {
        switch (error) {
            case "ESM1", "ESM3", "ESM4", "ESM6", "ESM7", "ESM10" ->
                errores.add(String.format(tabla.get(error), línea, valores[0]));
            case "ESM2", "ESM9", "ESM11" ->
                errores.add(String.format(tabla.get(error), línea, valores[0], valores[1]));
            case "ESM5", "ESM8" ->
                errores.add(String.format(tabla.get(error), línea, valores[0], valores[1], valores[2]));
            default ->
                System.out.println("No se ha encontrado el error semántico introducido: " + error);
        }
    }
}
