/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class BloqueComienzo extends BloqueTripletas {

    private TripletaTiempoCada tiempo;

    public BloqueComienzo(TripletaTiempoCada tiempo) {
        super();
        this.tiempo = tiempo;
    }

    @Override
    public int enumerarTripletas(int inicio) {
        inicio = super.enumerarTripletas(inicio);
        Object ultimo = super.contenido.get(super.contenido.size() - 1);
        if (ultimo instanceof BloqueCondicion) {
            BloqueCondicion bc = (BloqueCondicion) ultimo;
            bc.refenciarSiguiente(tiempo);
        } else if (ultimo instanceof BloqueMientras) {
            BloqueMientras bm = (BloqueMientras) ultimo;
            bm.referenciarSiguiente(tiempo);
        }
        inicio = tiempo.enumerarTripleta(inicio);
        return inicio;
    }

    @Override
    public Tripleta getInicio() {
        Tripleta inicio = super.getInicio();
        return inicio == null ? this.tiempo : inicio;
    }

    @Override
    public String toString() {
        Object inicio = super.contenido.get(0);
        while ((inicio instanceof BloqueTripletas)) {
            inicio = ((BloqueTripletas) inicio).contenido.get(0);
        }
        tiempo.ref2 = inicio == null ? tiempo : (Tripleta) inicio;
        return super.toString() + "\n" + tiempo.toString();
    }

}
