/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

import java.util.ArrayList;
import sintactico.CIVisitor;

/**
 *
 * @author jujemataso
 */
public class BloquePrograma extends BloqueTripletas {

    private TripletaInicio inicio;
    private TripletaFin fin;
    private ArrayList<BloqueTripletas> bloques;
    public boolean optimizar = false;

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
        if (optimizar) {
            optimizar();
            optimizar = false;
            return this.enumerarTripletas(0);
        }
        return fin.enumerarTripleta(inicio);
    }

    @Override
    protected void optimizar() {
        bloques.forEach(bloque -> bloque.optimizar());
    }

    @Override
    public String generarCO() {
        String codigo = this.inicio.codigoObjeto();
        codigo += "MOVLW " + CIVisitor.simbolos.getFinDatos() + "\n";
        codigo += "MOVWF FSR\n";
        for (BloqueTripletas bt : bloques) {
            codigo += bt.generarCO();
        }
        codigo += this.fin.codigoObjeto();
        return codigo;
    }

    @Override
    public String toString() {
        String cadena = inicio.toString() + "\n";
        for (BloqueTripletas bt : bloques) {
            cadena += bt.toString() + "\n";
        }
        return cadena + fin.toString();
    }

}
