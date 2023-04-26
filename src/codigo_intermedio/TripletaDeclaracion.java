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

    public TripletaDeclaracion(String tipo, analisis.LlaveTabla id) {
        super(tipo);
        super.operando1 = id.id;
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
    public int enumerarTripleta(int inicio) {
        if (inicializacion == null) {
            return super.enumerarTripleta(inicio);
        }
        inicio = super.enumerarTripleta(inicio);
        return inicializacion.enumerarTripleta(inicio);
    }

    @Override
    public void optimizar(BloqueTripletas padre) {
        if (this.inicializacion != null) {
            this.inicializacion.optimizar(padre);
        }
    }

    @Override
    public String toString() {
        return super.toString() + (inicializacion != null ? "\n" + inicializacion.toString() : "");
    }

}
