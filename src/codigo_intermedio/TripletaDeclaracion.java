/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

import analisis.LlaveTabla;

/**
 *
 * @author jujemataso
 */
public class TripletaDeclaracion extends Tripleta {

    private TripletaAsignacion inicializacion;
    private LlaveTabla id;

    public TripletaDeclaracion(String tipo, LlaveTabla id) {
        super(tipo);
        this.id = id;
        super.operando1 = this.id.id;
    }

    public void setInicializacion(TripletaAsignacion inicializacion) {
        this.inicializacion = inicializacion;
        this.inicializacion.ref1 = this;
        this.inicializacion.setId(id);
    }

    @Override
    public String codigoObjeto() {
        return this.inicializacion != null ? this.inicializacion.codigoObjeto() : "";
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
