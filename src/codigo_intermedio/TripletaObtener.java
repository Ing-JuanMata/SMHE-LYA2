/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaObtener extends Tripleta {

    public TripletaObtener(String objeto) {
        super("obtener");
        this.operando1 = objeto;
    }

    @Override
    public String codigoObjeto() {
        return "";
    }

    @Override
    public void optimizar(BloqueTripletas padre) {

    }

}
