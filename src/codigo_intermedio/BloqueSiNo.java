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

    private BloqueSiNo sino;

    public BloqueSiNo() {
        super();
    }

    @Override
    protected int enumerarTripletas(int inicio) {
        //si no tiene condicion realizar solo el cuerpo del sino
        //Si tiene condicion enumerar la condicion y despues
        //hacer el cuerpo del sino por ultimo verificar si tiene otro sino
        return -1;
    }

}
