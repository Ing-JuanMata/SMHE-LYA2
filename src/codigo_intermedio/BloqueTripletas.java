/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

import java.util.ArrayList;

/**
 *
 * @author jujemataso
 */
public class BloqueTripletas {

    protected ArrayList<Object> contenido;

    public BloqueTripletas() {
        contenido = new ArrayList<>();
    }

    public void addTripleta(Tripleta tripleta) {
        if (this.contenido == null) {
            this.contenido = new java.util.ArrayList<>();
        }
        this.contenido.add(tripleta);
    }

    public void addBloqueInterno(BloqueCondicional bloqueInterno) {
        if (this.contenido == null) {
            this.contenido = new java.util.ArrayList<>();
        }
        this.contenido.add(bloqueInterno);
    }

    public Tripleta getInicio() {
        Object inicio = this.contenido.isEmpty() ? null : this.contenido.get(0);
        return inicio == null
                ? null : inicio instanceof BloqueTripletas
                        ? ((BloqueTripletas) inicio).getInicio() : (Tripleta) inicio;
    }

    public int enumerarTripletas(int inicio) {
        BloqueCondicion aux = null;
        for (Object o : contenido) {
            if (o instanceof Tripleta) {
                if (aux != null) {
                    aux.refenciarSiguiente((Tripleta) o);
                    aux = null;
                }
                inicio = ((Tripleta) o).enumerarTripleta(inicio);
            } else if (o instanceof BloqueCondicion) {
                BloqueCondicion bc = (BloqueCondicion) o;
                if (aux != null) {
                    aux.refenciarSiguiente(bc.getInicio());
                    aux = null;
                }

                inicio = bc.enumerarTripletas(inicio);
                aux = bc;
            } else if (o instanceof BloqueTripletas) {
                BloqueTripletas bt = (BloqueTripletas) o;
                if (aux != null && !bt.contenido.isEmpty()) {
                    aux.refenciarSiguiente(bt.getInicio());
                    aux = null;
                }
                inicio = bt.enumerarTripletas(inicio);
            }
        }
        return inicio;
    }

    @Override
    public String toString() {
        if (contenido.isEmpty()) {
            return "";
        }
        String cadena = "";
        for (Object t : contenido) {
            cadena += t.toString() + "\n";
        }
        return cadena.contains("\n") ? cadena.substring(0, cadena.lastIndexOf("\n")) : cadena;

    }
}
