/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class BloqueComienzo extends BloqueTripletas {

    private TripletaTiempoCada tiempo;

    public BloqueComienzo(TripletaTiempoCada tiempo) {
        super();
        this.tiempo = tiempo;
    }

    @Override
    protected int enumerarTripletas(int inicio) {
        //Enumerar tripletas del cuerpo y al final agregar la tripleta del tiempo al cuerpo y enumerarla
        return -1;
    }

}
