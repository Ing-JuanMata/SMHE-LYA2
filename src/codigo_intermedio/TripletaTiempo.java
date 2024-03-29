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

    protected BloqueTripletas expresion;
    protected TripletaUnidadTiempo unidad;

    public TripletaTiempo(String operador, Object expresion, String unidad) {
        super(operador);
        if (expresion instanceof BloqueTripletas) {
            BloqueTripletas b = (BloqueTripletas) expresion;
            Tripleta t = (Tripleta) b.contenido.get(b.contenido.size() - 1);
            super.ref1 = this.unidad = new TripletaUnidadTiempo(unidad, t);
            this.expresion = b;
            this.expresion.addTripleta(this.unidad);
            return;
        }
        super.ref1 = this.unidad = new TripletaUnidadTiempo(unidad, expresion);
    }

    @Override
    public Tripleta getInicio() {
        if (expresion != null) {
            return expresion.getInicio();
        }
        return unidad;
    }

    @Override
    public void setEtiqueta(String etiqueta) {
        if (expresion != null) {
            expresion.getInicio().setEtiqueta(etiqueta);
        } else {
            unidad.setEtiqueta(etiqueta);
        }
    }

    @Override
    public String getEtiqueta() {
        return expresion == null ? unidad.getEtiqueta() : expresion.getInicio().getEtiqueta();
    }

    @Override
    public String codigoObjeto() {
        String codigo = this.expresion == null ? this.unidad.codigoObjeto() : this.expresion.generarCO();
        codigo += "CALL TIMER\n";
        return codigo;
    }

    @Override
    public void optimizar(BloqueTripletas padre) {
        if (this.expresion != null) {
            this.expresion.optimizar();
        }
    }

    @Override
    public int enumerarTripleta(int inicio) {
        if (expresion != null) {
            inicio = expresion.enumerarTripletas(inicio);
        } else {
            inicio = unidad.enumerarTripleta(inicio);
        }

        return super.enumerarTripleta(inicio);

    }

    @Override
    public String toString() {
        return ((expresion != null) ? expresion.toString() + "\n" : unidad.toString() + "\n") + super.toString();
    }
}
