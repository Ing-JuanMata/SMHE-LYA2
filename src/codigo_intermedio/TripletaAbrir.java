/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaAbrir extends Tripleta {

    private TripletaTiempoPor tiempo;

    public TripletaAbrir(String objeto) {
        super("abrir");
        super.operando1 = objeto;
    }

    public void setTiempo(TripletaTiempoPor tiempo) {
        this.tiempo = tiempo;
        this.ref2 = tiempo;
    }

    public void setTiempo() {
        this.operando2 = "mantener";
    }

    @Override
    public String codigoObjeto() {
        return "";
    }
}
