/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public abstract class BloqueCondicional extends BloqueTripletas {

    protected java.util.ArrayList<Tripleta> condicion;

    public BloqueCondicional() {
        super();
    }

    public void addExpresionCondicion(Tripleta tripleta) {
        if (this.condicion == null) {
            this.condicion = new java.util.ArrayList<>();
        }
        this.condicion.add(tripleta);
    }
}
