/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class BloqueCondicion extends BloqueCondicional {

    private BloqueSiNo sino;

    public BloqueCondicion(BloqueTripletas bloquePadre, int numero) {
        super(bloquePadre, numero);
    }

    public void setSiNo(BloqueSiNo sino) {
        this.sino = sino;
        super.addTripleta(new TripletaGoto());
    }

    public void refenciarSiguiente(Tripleta t) {
        t.setEtiqueta("FBC" + super.numero);
        if (this.sino != null && super.condicion.ref2 == null) {
            ((TripletaGoto) this.contenido.get(this.contenido.size() - 1)).ref1 = t.getInicio();
            if (this.sino.condicion != null) {
                this.sino.condicion.refenciarSiguiente(t);
            }
            super.condicion.ref2 = this.sino.getInicio();
        } else if (super.condicion.ref2 == null) {
            super.condicion.ref2 = t;
        }

        siguienteInterno();
    }

    private void siguienteInterno() {
        Object ultimo = super.contenido.get(super.contenido.size() - 1);
        if (ultimo instanceof TripletaGoto) {
            if (super.contenido.size() == 1) {
                return;
            }
            Object previo = super.contenido.get(super.contenido.size() - 2);
            if (previo instanceof BloqueCondicion) {
                ((BloqueCondicion) previo).refenciarSiguiente((Tripleta) ultimo);
            } else if (previo instanceof BloqueMientras) {
                ((BloqueMientras) previo).referenciarSiguiente((Tripleta) ultimo);
            }
        } else if (ultimo instanceof BloqueCondicion) {
            BloqueCondicion bc = (BloqueCondicion) ultimo;
            bc.refenciarSiguiente(super.condicion.ref2);
        } else if (ultimo instanceof BloqueMientras) {
            BloqueMientras bm = (BloqueMientras) ultimo;
            bm.referenciarSiguiente(super.condicion.ref2);
        }
    }

    @Override
    public int enumerarTripletas(int inicio) {
        inicio = super.condicion.enumerarTripleta(inicio);
        inicio = super.enumerarTripletas(inicio);
        //Comenzar con las tripletas de la condición y seguir con las del cuerpo
        //En caso de existir el bloque si no, enumerarlo despues del cuerpo
        return sino == null ? inicio : sino.enumerarTripletas(inicio);
    }

    @Override
    protected void optimizar() {
        super.optimizar();
        if (this.sino != null) {
            this.sino.optimizar();  
        }
    }

    public void etiquetar() {
        super.condicion.setEtiqueta("BC" + super.numero);
    }

    @Override
    public String generarCO() {
        etiquetar();
        if (this.sino != null) {
            this.sino.etiquetar();
        }
        String codigo = super.condicion.codigoObjeto();
        codigo += super.generarCO();
        return codigo + (this.sino == null ? "" : this.sino.generarCO());
    }

    @Override
    public String toString() {
        return super.toString() + (sino != null ? "\n" + sino.toString() : "");
    }

}
