/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaCondicion extends Tripleta {

    BloqueTripletas condicion;

    public TripletaCondicion(Object condicion) {
        super("sino");
        if (condicion instanceof BloqueTripletas) {
            BloqueTripletas b = (BloqueTripletas) condicion;
            Tripleta t = (Tripleta) b.contenido.get(b.contenido.size() - 1);
            super.ref1 = t;
            this.condicion = (BloqueTripletas) condicion;
            return;
        }
        super.operando1 = condicion;
    }

    @Override
    public String codigoObjeto() {
        return "";
    }
    
    @Override
    public Tripleta getInicio() {
        return condicion == null ? super.getInicio() : condicion.getInicio();
    }

    @Override
    public int enumerarTripleta(int inicio) {
        if (condicion != null) {
            inicio = condicion.enumerarTripletas(inicio);
        }
        return super.enumerarTripleta(inicio);
    }

    @Override
    public String toString() {
        return (condicion != null ? condicion.toString() + "\n" : "") + super.toString();
    }

}
