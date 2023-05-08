/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

import java.util.ArrayList;
import sintactico.MainParser;

/**
 *
 * @author jujemataso
 */
public class Funcion {

    String id;
    int linea;
    ArrayList<String> parametros;

    public Funcion(String id, int linea) {
        this.id = id;
        this.linea = linea;
        parametros = new java.util.ArrayList<>();
    }

    public void agregarParametro(String parametro) {
        parametros.add(parametro);
    }

    public void comprobarParametros() {
        ArrayList<String> parametrosOriginales = MainParser.funciones.getTipos(id);
        if (parametrosOriginales.size() != parametros.size()) {
            MainParser.errores.agregarErrorSemantico("ESM7", linea, String.valueOf(parametros.size()), id, String.valueOf(parametrosOriginales.size()));
            return;
        }
        int pos = 0;
        System.out.println(parametrosOriginales);
        for (Object parametro : parametros) {
            String tipo = parametrosOriginales.get(pos);
            pos++;
            if (tipo.equals("entero") && !parametro.equals("entero")) {
                MainParser.errores.agregarErrorSemantico("ESM8", linea, String.valueOf(pos), "entero");
                continue;
            }

            if (tipo.equals("logico") && !parametro.equals("logico")) {
                MainParser.errores.agregarErrorSemantico("ESM8", linea, String.valueOf(pos), "logico");

            }
        }
    }

    @Override
    public String toString() {
        return id + ": " + parametros.toString();
    }
}
