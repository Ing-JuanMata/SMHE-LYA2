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
public class BloquePrograma extends BloqueTripletas {

    private TripletaInicio inicio;
    private TripletaFin fin;
    private ArrayList<BloqueTripletas> bloques;

    public BloquePrograma() {
        super();
        this.inicio = new TripletaInicio();
        this.fin = new TripletaFin();
        this.bloques = new ArrayList<>();
    }

    public void addBloque(BloqueTripletas bloque) {
        this.bloques.add(bloque);
    }

    @Override
    public int enumerarTripletas(int inicio) {
        inicio = this.inicio.enumerarTripleta(inicio);
        for (BloqueTripletas bt : bloques) {
            inicio = bt.enumerarTripletas(inicio);
        }
        return fin.enumerarTripleta(inicio);
    }

    @Override
    public String toString() {
        enumerarTripletas(0);
        String cadena = inicio.toString() + "\n";
        for (BloqueTripletas bt : bloques) {
            cadena += bt.toString() + "\n";
        }
        return cadena + fin.toString();
    }

}
