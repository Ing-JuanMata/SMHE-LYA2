/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaGoto extends Tripleta {

    public TripletaGoto() {
        super("goto");
    }

    public TripletaGoto(Tripleta ref) {
        super("goto");
        super.ref1 = ref;
    }

    @Override
    public String codigoObjeto() {
        return "";
    }

    @Override
    public void optimizar(BloqueTripletas padre) {

    }

}
