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
        String codigo = (super.etiqueta == null ? "" : super.etiqueta + " ") + "MOVFW PERSONAS\n";

        if (super.siguiente == 1) {
            return codigo + "MOVWF INDF\nINCF FSR,F\n";
        }
        return codigo;
    }

    @Override
    public void optimizar(BloqueTripletas padre) {

    }

}
