/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaNegacion extends TripletaExpresion{

    public TripletaNegacion(Object op1) {
        super("!",op1);
    }

    @Override
    public String codigoObjeto() {
        return "";
    }
}
