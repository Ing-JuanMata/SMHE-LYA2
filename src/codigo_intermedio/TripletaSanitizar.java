/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaSanitizar extends Tripleta {

    TripletaTiempoPor tiempo;

    public TripletaSanitizar(TripletaTiempoPor tiempo) {
        super("sanitizar");
        this.tiempo = tiempo;
        super.ref1 = tiempo;
    }

    @Override
    public String codigoObjeto() {
        //Configurar el tiempo y luego realizar la accion
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
