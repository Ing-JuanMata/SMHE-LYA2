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

    public BloqueCondicion(BloqueTripletas bloquePadre) {
        super(bloquePadre);
    }

    public void setSiNo(BloqueSiNo sino) {
        this.sino = sino;
        super.addTripleta(new TripletaGoto());
    }

    public void refenciarSiguiente(Tripleta t) {
        if (this.sino != null) {
            ((TripletaGoto) this.contenido.get(this.contenido.size() - 1)).ref1 = t.getInicio();
            if (this.sino.condicion != null) {
                this.sino.condicion.refenciarSiguiente(t);
            }
            super.condicion.ref2 = this.sino.getInicio();

        } else {
            super.condicion.ref2 = t;
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
    public String toString() {
        return super.toString() + (sino != null ? "\n" + sino.toString() : "");
    }

}
