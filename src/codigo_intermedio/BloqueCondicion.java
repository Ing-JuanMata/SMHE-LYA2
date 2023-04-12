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

    public BloqueCondicion() {
        super();
        super.condicion = new java.util.ArrayList<>();
    }

    @Override
    protected int enumerarTripletas(int inicio) {
        //Comenzar con las tripletas de la condición y seguir con las del cuerpo
        //En caso de existir el bloque si no, enumerarlo despues del cuerpo
        return -1;
    }

}
