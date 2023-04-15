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

    public BloqueCondicional(BloqueTripletas bloquePadre) {
        super();
        this.bloquePadre = bloquePadre;
    }

    public void setCondicion(TripletaCondicion condicion) {
        this.condicion = condicion;
    }

    @Override
    public Tripleta getInicio() {
        return (Tripleta) (condicion != null
                ? (condicion.condicion != null
                        ? condicion.condicion.contenido.get(0) : condicion)
                : super.getInicio());
    }

    @Override
    public String toString() {
        return (condicion != null ? condicion.toString() + "\n" : "") + (!super.contenido.isEmpty() ? super.toString() : "");
    }

}
