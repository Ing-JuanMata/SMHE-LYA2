/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaResta extends TripletaExpresion {

    public TripletaResta(Object op1) {
        super("-", op1);
    }

    public TripletaResta(Object op1, Object op2) {
        super("-", op1, op2);
    }

    @Override
    public String codigoObjeto() {
        return "";
    }

}
