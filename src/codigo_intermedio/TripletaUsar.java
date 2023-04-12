/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaUsar extends Tripleta {

    java.util.ArrayList<TripletaAsignacion> parametros;

    public TripletaUsar(String id) {
        super("usar");
        super.operando1 = id;
    }

    public void addParametro(TripletaAsignacion parametro) {
        this.parametros.add(parametro);
    }

    @Override
    public String codigoObjeto() {
        return "";
    }
}
