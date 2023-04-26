/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaTiempo extends Tripleta {

    protected Object expresion;
    protected TripletaUnidadTiempo unidad;

    public TripletaTiempo(String operador, Object expresion, String unidad) {
        super(operador);
        if (expresion instanceof BloqueTripletas) {
            BloqueTripletas b = (BloqueTripletas) expresion;
            Tripleta t = (Tripleta) b.contenido.get(b.contenido.size() - 1);
            super.ref1 = this.unidad = new TripletaUnidadTiempo(unidad, t);
            this.expresion = expresion;
            return;
        }
        super.ref1 = this.unidad = new TripletaUnidadTiempo(unidad, expresion);
    }

    @Override
    public Tripleta getInicio() {
        if (expresion != null) {
            return ((BloqueTripletas) expresion).getInicio();
        }
        return unidad;
    }

    @Override
    public String codigoObjeto() {
        //Colocar valores de temporizacion
        return "";
    }

    @Override
    public void optimizar(BloqueTripletas padre) {
        if (this.expresion != null) {
            ((BloqueTripletas) this.expresion).optimizar();
            this.unidad.optimizar((BloqueTripletas) this.expresion);
        }
    }

    @Override
    public int enumerarTripleta(int inicio) {
        if (expresion != null) {
            inicio = ((BloqueTripletas) expresion).enumerarTripletas(inicio);
        }
        inicio = unidad.enumerarTripleta(inicio);
        return super.enumerarTripleta(inicio);

    }

    @Override
    public String toString() {
        return ((expresion != null) ? expresion.toString() + "\n" : "") + unidad.toString() + "\n" + super.toString();
    }
}
