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
        String codigo = this.tiempo.codigoObjeto();
        codigo = codigo.substring(0, codigo.lastIndexOf("CALL TIMER\n"));
        return codigo + "CALL AC_SANIT\n";
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
