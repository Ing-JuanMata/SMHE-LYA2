/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaCerrar extends Tripleta {

    private TripletaTiempoPor tiempo;

    public TripletaCerrar(String objeto, Object tiempo) {
        super("cerrar");
        super.operando1 = objeto;
        if (tiempo instanceof TripletaTiempoPor) {
            TripletaTiempoPor t = (TripletaTiempoPor) tiempo;
            this.ref2 = this.tiempo = t;
        }

        this.operando2 = tiempo;
    }

    @Override
    public String codigoObjeto() {
        String codigo = (super.etiqueta == null ? "" : super.etiqueta + " ") + (super.operando1.equals("puertas") ? "CALL CPUERTA\n" : "CALL CVENTANA\n");
        if (this.tiempo != null) {
            codigo += this.tiempo.codigoObjeto();
            return codigo + (super.operando1.equals("puertas") ? "CALL APUERTA\n" : "CALL AVENTANA\n");
        }
        return codigo;
    }

    @Override
    public Tripleta getInicio() {
        return tiempo == null ? super.getInicio() : tiempo.getInicio();
    }

    @Override
    public int enumerarTripleta(int inicio) {
        inicio = tiempo == null ? inicio : tiempo.enumerarTripleta(inicio);
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
        return (tiempo == null ? "" : tiempo.toString() + "\n") + super.toString();
    }
}
