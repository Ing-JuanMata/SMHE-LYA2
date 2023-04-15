/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaDeclaracion extends Tripleta {

    private TripletaAsignacion inicializacion;

    public TripletaDeclaracion(String tipo, String id) {
        super(tipo);
        super.operando1 = id;
    }

    public void setInicializacion(TripletaAsignacion inicializacion) {
        this.inicializacion = inicializacion;
        this.inicializacion.ref1 = this;
    }

    @Override
    public String codigoObjeto() {
        return "";
    }
    
    @Override
    public Tripleta getInicio() {
        return inicializacion == null ? super.getInicio() : inicializacion.getInicio();
    }

    @Override
    public int enumerarTripleta(int inicio) {
        if (inicializacion == null) {
            return super.enumerarTripleta(inicio);
        }
        inicio = super.enumerarTripleta(inicio);
        return inicializacion.enumerarTripleta(inicio);
    }

    @Override
    public String toString() {
        return super.toString() + (inicializacion != null ? "\n" + inicializacion.toString() : "");
    }

}
