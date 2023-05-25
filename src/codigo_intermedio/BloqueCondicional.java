/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public abstract class BloqueCondicional extends BloqueTripletas {

    public BloqueTripletas bloquePadre;
    protected TripletaCondicion condicion;
    protected int numero;

    public BloqueCondicional(BloqueTripletas bloquePadre, int numero) {
        super();
        this.bloquePadre = bloquePadre;
        this.numero = numero;
    }

    public void setCondicion(TripletaCondicion condicion) {
        this.condicion = condicion;
    }

    public BloqueTripletas bloquePadreM() {
        return this.bloquePadre instanceof BloqueCondicional ? ((BloqueCondicional) bloquePadre).bloquePadreM() : this.bloquePadre;
    }

    @Override
    public Tripleta getInicio() {
        return condicion != null ? condicion.getInicio() : super.getInicio();
    }

    @Override
    public String toString() {
        return (condicion != null ? condicion.toString() + "\n" : "") + (!super.contenido.isEmpty() ? super.toString() : "");
    }

}
