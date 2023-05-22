/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class BloqueSiNo extends BloqueCondicional {

    BloqueCondicion condicion;

    public BloqueSiNo(BloqueTripletas bloquePadre, int numero) {
        super(bloquePadre, numero);
    }

    public void setCondicion(BloqueCondicion condicion) {
        super.setCondicion(condicion.condicion);
        this.condicion = condicion;

    }

    @Override
    public Tripleta getInicio() {
        return this.condicion == null ? super.getInicio() : condicion.getInicio();
    }

    @Override
    public int enumerarTripletas(int inicio) {
        if (condicion != null) {
            inicio = condicion.enumerarTripletas(inicio);
        }
        return super.enumerarTripletas(inicio);
        //si no tiene condicion realizar solo el cuerpo del sino
        //Si tiene condicion enumerar la condicion.
    }

    @Override
    protected void optimizar() {
        super.optimizar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String generarCO() {
        if (this.condicion == null) {
            return super.generarCO();
        } else {
            return this.condicion.generarCO();
        }
    }

    @Override
    public String toString() {
        return this.condicion != null ? this.condicion.toString() : super.toString();
    }

}
