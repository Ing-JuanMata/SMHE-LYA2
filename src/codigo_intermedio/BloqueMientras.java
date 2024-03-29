/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class BloqueMientras extends BloqueCondicional {

    public BloqueMientras(BloqueTripletas bloquePadre, int numero) {
        super(bloquePadre, numero);
    }

    public void referenciarSiguiente(Tripleta t) {
        t.setEtiqueta("FBM" + super.numero);
        super.condicion.ref2 = t.getInicio();
    }

    @Override
    public int enumerarTripletas(int inicio) {
        //Enumerar primero la condicion, luego el cuerpo, terminar con un lazo
        inicio = super.condicion.enumerarTripleta(inicio);
        if (!(super.contenido.get(super.contenido.size() - 1) instanceof TripletaGoto)) {
            super.addTripleta(new TripletaGoto(this.getInicio()));
        }
        return super.enumerarTripletas(inicio);
    }

    @Override
    protected void optimizar() {
        super.condicion.optimizar(this);
        if (super.condicion.operando1 != null
                && !super.condicion.operando1.equals("verdadero")) {
            super.bloquePadre.contenido.remove(this);
            return;
        }
        super.optimizar();
    }

    @Override
    public String generarCO() {
        super.condicion.setEtiqueta("BM" + super.numero);
        String codigo = super.condicion.codigoObjeto();
        return codigo + super.generarCO();
    }

}
