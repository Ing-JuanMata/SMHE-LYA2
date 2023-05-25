/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaSalir extends Tripleta {

    public TripletaSalir() {
        super("salir");
    }

    @Override
    public String codigoObjeto() {
        return (super.etiqueta == null ? "" : super.etiqueta + " ") + "RETURN\n";
    }

    @Override
    public void optimizar(BloqueTripletas padre) {

    }
}
