/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaDecremento extends Tripleta {

    public boolean pre;

    public TripletaDecremento(analisis.LlaveTabla id, boolean pre) {
        super("--");
        super.operando1 = id;
        this.pre = pre;
    }

    @Override
    public String codigoObjeto() {
        return "";
    }

    @Override
    public void optimizar(BloqueTripletas padre) {

    }

}
