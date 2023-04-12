/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public abstract class BloqueTripletas {

    protected java.util.ArrayList<Tripleta> tripletas;
    protected java.util.ArrayList<BloqueCondicional> bloquesInternos;
    protected boolean tripletasEnumeradas = false;

    public BloqueTripletas() {
        
    }

    public void addTripleta(Tripleta tripleta) {
        if (this.tripletas == null) {
            this.tripletas = new java.util.ArrayList<>();
        }
        this.tripletas.add(tripleta);
    }

    public void addBloqueInterno(BloqueCondicional bloqueInterno) {
        if (this.bloquesInternos == null) {
            this.bloquesInternos = new java.util.ArrayList<>();
        }
        this.bloquesInternos.add(bloqueInterno);
    }

    protected abstract int enumerarTripletas(int inicio);

    @Override
    public String toString() {
        String cadena = "";
        for (Tripleta t : tripletas) {
            cadena += t.toString() + "\n";
        }
        return cadena;
    }
}
