/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

/**
 *
 * @author jujemataso
 */
public class Funcion {

    String id;
    int linea;
    java.util.ArrayList<Object> parametros;

    public Funcion(String id, int linea) {
        this.id = id;
        this.linea = linea;
        parametros = new java.util.ArrayList<>();
    }

    public void agregarParametro(Object parametro) {
        parametros.add(parametro);
    }

    public void comprobarParametros() {
        if (!codigo.FrmPrincipal.funciones.existe(id)) {
            codigo.FrmPrincipal.errores.agregarErrorSemantico("ESM7", linea, id);
            return;
        }
        java.util.ArrayList<String> parametrosOriginales = codigo.FrmPrincipal.funciones.getTipos(id);
        if (parametrosOriginales.size() != parametros.size()) {
            codigo.FrmPrincipal.errores.agregarErrorSemantico("ESM8", linea, String.valueOf(parametros.size()), id, String.valueOf(parametrosOriginales.size()));
            return;
        }
        int pos = 1;
        for (Object parametro : parametros) {
            String tipo = parametrosOriginales.get(pos - 1);
            pos++;
            if (tipo.equals("entero") && !(parametro instanceof Integer)) {
                codigo.FrmPrincipal.errores.agregarErrorSemantico("ESM9", linea, String.valueOf(pos), "entero");
                return;
            }

            if (tipo.equals("logico") && !(parametro instanceof Boolean)) {
                codigo.FrmPrincipal.errores.agregarErrorSemantico("ESM9", linea, String.valueOf(pos), "logico");
                return;
            }
        }
    }

    @Override
    public String toString() {
        return id + ": " + parametros.toString();
    }
}
