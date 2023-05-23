/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaAdmitir extends Tripleta {

    private BloqueTripletas eAdmitir, eCapacidad;
    private TripletaTiempoPor tiempo;
    private TripletaUsar usar;

    public TripletaAdmitir(TripletaUsar usar, TripletaTiempoPor tiempo, Object expresion, Object expresion1, TablaSimbolos tabla) {
        super("admitir");
        this.tiempo = tiempo;
        this.usar = usar;
        this.ref1 = this.tiempo;
        analisis.LlaveTabla dirAdmision = new analisis.LlaveTabla("0admision_admitir0", "programa");
        analisis.LlaveTabla dirCapacidad = new analisis.LlaveTabla("0capacidad_admitir0", "programa");
        if (expresion instanceof BloqueTripletas) {
            this.eAdmitir = (BloqueTripletas) expresion;
            TripletaAsignacion ta = new TripletaAsignacion(dirAdmision, this.eAdmitir.contenido.get(this.eAdmitir.contenido.size() - 1));
            ta.setBit();
            this.eAdmitir.addTripleta(ta);
        } else {
            this.eAdmitir = new BloqueTripletas();
            TripletaAsignacion ta = new TripletaAsignacion(dirAdmision, expresion);
            ta.setBit();
            this.eAdmitir.addTripleta(ta);
        }

        if (expresion1 instanceof BloqueTripletas) {
            this.eCapacidad = (BloqueTripletas) expresion1;
            TripletaAsignacion ta = new TripletaAsignacion(dirCapacidad, this.eCapacidad.contenido.get(this.eCapacidad.contenido.size() - 1));
            ta.setBit();
            this.eCapacidad.addTripleta(ta);
        } else {
            this.eCapacidad = new BloqueTripletas();
            TripletaAsignacion ta = new TripletaAsignacion(dirCapacidad, expresion1);
            ta.setBit();
            this.eCapacidad.addTripleta(ta);
        }
    }

    @Override
    public String codigoObjeto() {
        String codigo = this.eAdmitir.generarCO() + this.eCapacidad.generarCO();
        String t = this.tiempo.codigoObjeto();
        codigo += t.substring(0, t.lastIndexOf("CALL"));
        return codigo + this.usar.codigoObjeto();
    }

    @Override
    public Tripleta getInicio() {
        return eAdmitir.getInicio();
    }

    @Override
    public int enumerarTripleta(int inicio) {
        this.usar.ref1 = this;
        inicio = eAdmitir.enumerarTripletas(inicio);
        inicio = eCapacidad.enumerarTripletas(inicio);
        inicio = tiempo.enumerarTripleta(inicio);
        inicio = super.enumerarTripleta(inicio);
        return usar.enumerarTripleta(inicio);
    }

    @Override
    public void optimizar(BloqueTripletas padre) {
        this.eAdmitir.optimizar();
        this.eCapacidad.optimizar();
        this.tiempo.optimizar(padre);
        this.usar.optimizar(padre);
    }

    @Override
    public String toString() {
        return eAdmitir.toString() + "\n" + eCapacidad.toString() + "\n" + tiempo.toString() + "\n" + super.toString() + "\n" + usar.toString();
    }

}
