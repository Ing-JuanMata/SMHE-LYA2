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

    public TripletaAbrir(String objeto, Object tiempo) {
        super("abrir");
        super.operando1 = objeto;
        if (tiempo instanceof TripletaTiempoPor) {
            TripletaTiempoPor t = (TripletaTiempoPor) tiempo;
            this.ref2 = this.tiempo = t;
        }

        this.operando2 = tiempo;
    }

    @Override
    public String codigoObjeto() {
        return "";
    }

    @Override
    public int enumerarTripleta(int inicio) {
        inicio = tiempo.enumerarTripleta(inicio);
        return super.enumerarTripleta(inicio);
    }

    @Override
    public String toString() {
        return tiempo.toString() + "\n" + super.toString();
    }

}
