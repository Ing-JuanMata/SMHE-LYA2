/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaEstado extends Tripleta {

    public TripletaEstado(String objeto) {
        super("estado");
        this.operando1 = objeto;
    }

    @Override
    public String codigoObjeto() {
        String opcion = (String) super.operando1;
        String codigo = (super.etiqueta == null ? "" : super.etiqueta + " ") + "BTFSS ";
        switch (opcion) {
            case "ventilacion" ->
                codigo += "VENTILACION\n";
            case "ventanas" ->
                codigo += "EVENTANAS\n";
            case "puertas" ->
                codigo += "EPUERTAS\n";
            case "luces" ->
                codigo += "ELUCES\n";
        }

        codigo += """
                  GOTO $+3
                  MOVLW 0X01
                  GOTO $+2
                  CLRW
                  """;
        if (super.siguiente == 1) {
            return codigo + "MOVWF INDF\nINCF FSR,F\n";
        }
        return codigo;
    }

    @Override
    public void optimizar(BloqueTripletas padre) {

    }

}
