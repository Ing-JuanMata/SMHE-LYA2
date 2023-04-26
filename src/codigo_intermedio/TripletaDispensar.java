/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaDispensar extends Tripleta {

    TripletaTiempoPor tiempo;

    public TripletaDispensar(TripletaTiempoPor tiempo) {
        super("dispensar");
        super.ref1 = this.tiempo = tiempo;
    }

    @Override
    public String codigoObjeto() {
        //Configurar el tiempo y luego realizar la accion
        return "";
    }

    @Override
    public Tripleta getInicio() {
        return tiempo.getInicio();
    }

    @Override
    public int enumerarTripleta(int inicio) {
        inicio = tiempo.enumerarTripleta(inicio);
        return super.enumerarTripleta(inicio);
    }

    @Override
    public void optimizar(BloqueTripletas padre) {
        if (this.tiempo != null) {
            this.tiempo.optimizar(padre);
        }
    }

    @Override
    public String toString() {
        return tiempo.toString() + "\n" + super.toString();
    }
}
