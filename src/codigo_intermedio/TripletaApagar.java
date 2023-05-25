/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaApagar extends Tripleta {

    public TripletaApagar(String actor) {
        super("apagar");
        super.operando1 = actor;
    }

    @Override
    public String codigoObjeto() {
        return (super.etiqueta == null ? "" : super.etiqueta + " ") + (super.operando1.equals("luces") ? "CALL OFF_LUCES\n" : "CALL OFF_VENT\n");
    }

    @Override
    public void optimizar(BloqueTripletas padre) {

    }

}
