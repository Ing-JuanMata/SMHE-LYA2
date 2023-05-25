/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

import analisis.LlaveTabla;
import sintactico.CIVisitor;

/**
 *
 * @author jujemataso
 */
public class TripletaIncremento extends Tripleta {

    public boolean pre;
    private LlaveTabla id;

    public TripletaIncremento(analisis.LlaveTabla id, boolean pre) {
        super("++");
        this.id = id;
        super.operando1 = this.id;
        this.pre = pre;
    }

    @Override
    public String codigoObjeto() {
        String dir = CIVisitor.simbolos.getDireccion(id);
        String codigo = (super.etiqueta == null ? "" : super.etiqueta + " ")
                + (this.pre ? """
                            INCF %s,F
                            MOVFW %s
                            """ : """
                                  MOVFW %s
                                  INCF, %s,F
                                  """);
        codigo = String.format(codigo, dir, dir);
        if (super.siguiente == 1) {
            return codigo + "MOVWF INDF\nINCF FSR,F\n";
        }
        return codigo;
    }

    @Override
    public void optimizar(BloqueTripletas padre) {

    }

}
