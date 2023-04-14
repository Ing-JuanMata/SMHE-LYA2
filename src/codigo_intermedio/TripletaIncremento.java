/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaIncremento extends Tripleta {

    public TripletaIncremento(String id) {
        super("++");
        super.operando1 = id;
    }

    @Override
    public String codigoObjeto() {
        return "";
    }

    @Override
    public int enumerarTripleta(int inicio) {
        return -1;
    }

}
