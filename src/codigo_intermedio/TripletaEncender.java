/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaEncender extends Tripleta {

    public TripletaEncender() {
        super("encender");
        this.operando1 = "luces";
    }

    @Override
    public String codigoObjeto() {
        return (super.etiqueta == null ? "" : super.etiqueta + " ") + (super.operando1.equals("luces") ? "CALL ON_LUCES\n" : "CALL ON_VENT\n");
    }

    @Override
    public void optimizar(BloqueTripletas padre) {

    }

}
