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

    private BloqueTripletas expresion, expresion1;
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
            this.expresion = (BloqueTripletas) expresion;
            this.expresion.addTripleta(new TripletaAsignacion(dirAdmision, this.expresion.contenido.get(this.expresion.contenido.size() - 1)));
        } else {
            this.expresion = new BloqueTripletas();
            this.expresion.addTripleta(new TripletaAsignacion(dirAdmision, expresion));
        }

        if (expresion1 instanceof BloqueTripletas) {
            this.expresion1 = (BloqueTripletas) expresion;
            this.expresion1.addTripleta(new TripletaAsignacion(dirCapacidad, this.expresion1.contenido.get(this.expresion1.contenido.size() - 1)));
        } else {
            this.expresion1 = new BloqueTripletas();
            this.expresion1.addTripleta(new TripletaAsignacion(dirCapacidad, expresion));
        }
    }

    @Override
    public String codigoObjeto() {
        return "";
    }

    @Override
    public Tripleta getInicio() {
        return expresion.getInicio();
    }

    @Override
    public int enumerarTripleta(int inicio) {
        this.usar.ref1 = this;
        inicio = expresion.enumerarTripletas(inicio);
        inicio = expresion1.enumerarTripletas(inicio);
        inicio = tiempo.enumerarTripleta(inicio);
        inicio = super.enumerarTripleta(inicio);
        return usar.enumerarTripleta(inicio);
    }

    @Override
    public void optimizar(BloqueTripletas padre) {
        if (expresion != null) {
            this.expresion.optimizar();
        }

        if (expresion1 != null) {
            this.expresion1.optimizar();
        }

        if (tiempo != null) {
            this.tiempo.optimizar(padre);
        }

        if (this.usar != null) {
            this.usar.optimizar(padre);
        }
    }

    @Override
    public String toString() {
        return expresion.toString() + "\n" + tiempo.toString() + "\n" + super.toString() + "\n" + usar.toString();
    }

}
