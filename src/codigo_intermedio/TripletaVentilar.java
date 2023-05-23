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
        analisis.LlaveTabla dirPuertas = new analisis.LlaveTabla("0puertas_ventilar0", "programa");
        analisis.LlaveTabla dirVentanas = new analisis.LlaveTabla("0ventanas_ventilar0", "programa");
        if (puertas instanceof BloqueTripletas) {
            this.puertas = (BloqueTripletas) puertas;
            TripletaAsignacion ta = new TripletaAsignacion(dirPuertas, this.puertas.contenido.get(this.puertas.contenido.size() - 1));
            ta.setBit();
            this.puertas.addTripleta(ta);
        } else {
            this.puertas = new BloqueTripletas();
            TripletaAsignacion ta = new TripletaAsignacion(dirPuertas, puertas);
            ta.setBit();
            this.puertas.addTripleta(ta);
        }

        if (ventanas instanceof BloqueTripletas) {
            this.ventanas = (BloqueTripletas) ventanas;
            TripletaAsignacion ta = new TripletaAsignacion(dirVentanas, this.ventanas.contenido.get(this.ventanas.contenido.size() - 1));
            ta.setBit();
            this.ventanas.addTripleta(ta);
        } else {
            this.ventanas = new BloqueTripletas();
            TripletaAsignacion ta = new TripletaAsignacion(dirVentanas, ventanas);
            ta.setBit();
            this.ventanas.addTripleta(ta);
        }
    }

    @Override
    public String codigoObjeto() {
        String codigo = this.puertas.generarCO() + this.ventanas.generarCO();
        String t = this.tiempo.codigoObjeto();
        codigo += t.substring(0, t.lastIndexOf("CALL"));
        return codigo + this.usar.codigoObjeto();
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
    public void optimizar(BloqueTripletas padre) {
        if (this.puertas != null) {
            this.puertas.optimizar();
        }
        if (this.ventanas != null) {
            this.ventanas.optimizar();
        }
        this.tiempo.optimizar(padre);
        this.usar.optimizar(padre);
    }

    @Override
    public String toString() {
        return puertas.toString() + "\n" + ventanas.toString() + "\n" + tiempo.toString() + "\n" + super.toString() + "\n" + usar.toString();
    }

}
