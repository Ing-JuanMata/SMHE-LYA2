/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author jujemataso
 */
public class BloqueTripletas {

    protected CopyOnWriteArrayList<Object> contenido;

    public BloqueTripletas() {
        contenido = new CopyOnWriteArrayList<>();
    }

    public void addTripleta(Tripleta tripleta) {
        if (this.contenido == null) {
            this.contenido = new CopyOnWriteArrayList<>();
        }
        this.contenido.add(tripleta);
    }

    public void addBloqueInterno(BloqueCondicional bloqueInterno) {
        if (this.contenido == null) {
            this.contenido = new CopyOnWriteArrayList<>();
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
        BloqueMientras aux2 = null;
        for (Object o : contenido) {
            if (o instanceof Tripleta) {
                if (aux != null) {
                    aux.refenciarSiguiente((Tripleta) o);
                    aux = null;
                } else if (aux2 != null) {
                    aux2.referenciarSiguiente((Tripleta) o);
                    aux2 = null;
                }
                inicio = ((Tripleta) o).enumerarTripleta(inicio);
            } else if (o instanceof BloqueCondicion) {
                BloqueCondicion bc = (BloqueCondicion) o;
                if (aux != null) {
                    aux.refenciarSiguiente(bc.getInicio());
                } else if (aux2 != null) {
                    aux2.referenciarSiguiente(bc.getInicio());
                    aux2 = null;
                }

                inicio = bc.enumerarTripletas(inicio);
                aux = bc;
            } else if (o instanceof BloqueMientras) {
                BloqueMientras bm = (BloqueMientras) o;
                if (aux != null) {
                    aux.refenciarSiguiente(bm.getInicio());
                    aux = null;
                } else if (aux2 != null) {
                    aux2.referenciarSiguiente(bm.getInicio());
                }

                inicio = bm.enumerarTripletas(inicio);
                aux2 = bm;
            } else if (o instanceof BloqueTripletas) {
                BloqueTripletas bt = (BloqueTripletas) o;
                if (aux != null && !bt.contenido.isEmpty()) {
                    aux.refenciarSiguiente(bt.getInicio());
                    aux = null;
                } else if (aux2 != null) {
                    aux2.referenciarSiguiente(bt.getInicio());
                    aux2 = null;
                }
                inicio = bt.enumerarTripletas(inicio);
            }
        }
        return inicio;
    }

    protected void optimizar() {
        for (Object o : contenido) {
            if (o instanceof BloqueTripletas) {
                ((BloqueTripletas) o).optimizar();
                continue;
            }

            //si llego hasta aqui es porque es una tripleta cualquiera
            if (o instanceof Tripleta) {
                ((Tripleta) o).optimizar(this);
            }

        }
    }

    public String generarCO() {
        String codigo = "";
        for (Object o : contenido) {
            if (o instanceof BloqueTripletas) {
                BloqueTripletas bt = (BloqueTripletas) o;
                codigo += bt.generarCO();
                continue;
            }

            if (o instanceof Tripleta) {
                Tripleta t = (Tripleta) o;
                codigo += t.codigoObjeto();
            }
        }
        return codigo;
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
