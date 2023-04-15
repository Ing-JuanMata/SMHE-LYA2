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

    private BloqueTripletas expresion;
    private TripletaTiempoPor tiempo;
    private TripletaUsar usar;

    public TripletaAdmitir(TripletaUsar usar, TripletaTiempoPor tiempo, Object expresion, TablaSimbolos tabla) {
        super("admitir");
        this.tiempo = tiempo;
        this.usar = usar;
        this.ref1 = this.tiempo;
        String dirAdmision = tabla.getDireccion("0admision_admitir0", "programa");
        if (expresion instanceof BloqueTripletas) {
            this.expresion = (BloqueTripletas) expresion;
            this.expresion.addTripleta(new TripletaAsignacion(dirAdmision, this.expresion.contenido.get(this.expresion.contenido.size() - 1)));
        } else {
            this.expresion = new BloqueTripletas();
            this.expresion.addTripleta(new TripletaAsignacion(dirAdmision, expresion));
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
        inicio = tiempo.enumerarTripleta(inicio);
        inicio = super.enumerarTripleta(inicio);
        return usar.enumerarTripleta(inicio);
    }

    @Override
    public String toString() {
        return expresion.toString() + "\n" + tiempo.toString() + "\n" + super.toString() + "\n" + usar.toString();
    }

}
