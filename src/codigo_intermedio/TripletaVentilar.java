/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaVentilar extends Tripleta {

    BloqueTripletas puertas, ventanas;
    private TripletaTiempoPor tiempo;
    private TripletaUsar usar;

    public TripletaVentilar(TripletaUsar usar, TripletaTiempoPor tiempo, Object puertas, Object ventanas, TablaSimbolos tabla) {
        super("ventilar");
        this.ref1 = tiempo;
        this.usar = usar;
        this.tiempo = tiempo;
        String dirPuertas = tabla.getDireccion("0puertas_ventilacion0", "programa");
        String dirVentanas = tabla.getDireccion("0ventanas_ventilacion0", "programa");
        if (puertas instanceof BloqueTripletas) {
            this.puertas = (BloqueTripletas) puertas;
            this.puertas.addTripleta(new TripletaAsignacion(dirPuertas, this.puertas.contenido.get(this.puertas.contenido.size() - 1)));
        } else {
            this.puertas = new BloqueTripletas();
            this.puertas.addTripleta(new TripletaAsignacion(dirPuertas, puertas));
        }

        if (ventanas instanceof BloqueTripletas) {
            this.ventanas = (BloqueTripletas) ventanas;
            this.ventanas.addTripleta(new TripletaAsignacion(dirVentanas, this.ventanas.contenido.get(this.ventanas.contenido.size() - 1)));
        } else {
            this.ventanas = new BloqueTripletas();
            this.ventanas.addTripleta(new TripletaAsignacion(dirVentanas, ventanas));
        }
    }

    @Override
    public String codigoObjeto() {
        //Numerar tripletas de puertas y luego asignar a la variable 0var_ventilar
        //Numerar tripletas de ventanas y luego asignar a la variable 1var_ventilar
        //Enumerar tripleta de tiempo
        return "";
    }
    
    @Override
    public Tripleta getInicio() {
        return puertas.getInicio();
    }

    @Override
    public int enumerarTripleta(int inicio) {
        this.usar.ref1 = this;
        inicio = puertas.enumerarTripletas(inicio);
        inicio = ventanas.enumerarTripletas(inicio);
        inicio = tiempo.enumerarTripleta(inicio);
        inicio = super.enumerarTripleta(inicio);
        return usar.enumerarTripleta(inicio);
    }

    @Override
    public String toString() {
        return puertas.toString() + "\n" + ventanas.toString() + "\n" + tiempo.toString() + "\n" + super.toString() + "\n" + usar.toString();
    }

}
