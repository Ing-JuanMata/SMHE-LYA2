/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

import java.util.ArrayList;

/**
 *
 * @author jujemataso
 */
public class TripletaAdmitir extends Tripleta {

    private TripletaTiempoPor tiempo;
    private Object expresion;

    public TripletaAdmitir(Object expresion, TripletaTiempoPor tiempo) {
        super("usar");
        super.operando1 = "admitir";
        this.expresion = expresion;
        this.tiempo = tiempo;
    }

    public void setTiempo(TripletaTiempoPor tiempo) {
        this.tiempo = tiempo;
    }

    public void setExpresion(ArrayList<Tripleta> expresion) {
        this.expresion = expresion;
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
