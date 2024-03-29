/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaUsar extends Tripleta {

    private java.util.ArrayList<Object> parametros;
    private TablaFunciones tabla;
    private String nombre;

    public TripletaUsar(String id) {
        this();
        this.nombre = id;
    }

    public TripletaUsar(String id, TablaFunciones tabla) {
        this(id);
        this.tabla = tabla;
    }

    public TripletaUsar() {
        super("usar");
        parametros = new java.util.ArrayList<>();
    }

    public void addParametro(Object parametro) {
        this.parametros.add(parametro);
    }

    @Override
    public String codigoObjeto() {
        Tripleta inicio = this.tabla.getInicio(nombre);
        String codigo = super.etiqueta == null ? "" : super.etiqueta + " ";
        for (Object parametro : parametros) {
            if (parametro instanceof BloqueTripletas) {
                codigo += ((BloqueTripletas) parametro).generarCO();
                continue;
            }

            if (parametro instanceof Tripleta) {
                codigo += ((Tripleta) parametro).codigoObjeto();
            }
        }
        return codigo + "CALL " + (inicio == null ? this.nombre.toUpperCase() : inicio.etiqueta) + "\n";
    }

    @Override
    public void optimizar(BloqueTripletas padre) {
        for (Object o : parametros) {
            if (o instanceof BloqueTripletas) {
                ((BloqueTripletas) o).optimizar();
            }
        }
    }

    @Override
    public Tripleta getInicio() {
        return parametros.isEmpty()
                ? super.getInicio()
                : (parametros.get(0) instanceof BloqueTripletas
                ? ((BloqueTripletas) parametros.get(0)).getInicio()
                : ((Tripleta) parametros.get(0)).getInicio());
    }

    @Override
    public int enumerarTripleta(int inicio) {
        int i = 0;
        for (Object o : parametros) {
            if (o instanceof BloqueTripletas) {
                BloqueTripletas bt = (BloqueTripletas) o;
                if (bt.contenido.get(bt.contenido.size() - 1) instanceof TripletaAsignacion) {
                    inicio = bt.enumerarTripletas(inicio);
                } else {
                    analisis.LlaveTabla id = tabla.getParametro(nombre, i++);
                    Object valor = bt.contenido.get(bt.contenido.size() - 1);
                    bt.addTripleta(new TripletaAsignacion(id, valor));
                    inicio = bt.enumerarTripletas(inicio);
                }
            } else if (o instanceof Tripleta) {
                inicio = ((Tripleta) o).enumerarTripleta(inicio);
            } else {
                analisis.LlaveTabla id = tabla.getParametro(nombre, i++);
                TripletaAsignacion t = new TripletaAsignacion(id, o);
                inicio = t.enumerarTripleta(inicio);
                parametros.set(i - 1, t);
            }
        }
        return super.enumerarTripleta(inicio);
    }

    private String mostrarParametros() {
        String cadena = "";
        for (Object o : parametros) {
            cadena += o.toString() + "\n";
        }
        return cadena;
    }

    @Override
    public String toString() {
        this.ref1 = this.ref1 == null ? tabla.getInicio(nombre) : this.ref1;
        return parametros.isEmpty() ? super.toString() : mostrarParametros() + super.toString();
    }

}
