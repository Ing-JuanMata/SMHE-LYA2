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
public class TripletaCondicion extends Tripleta {

    BloqueTripletas condicion;

    public TripletaCondicion(Object condicion) {
        super("sino");
        if (condicion instanceof BloqueTripletas) {
            BloqueTripletas b = (BloqueTripletas) condicion;
            Tripleta t = (Tripleta) b.contenido.get(b.contenido.size() - 1);
            t.setSiguiente(1);
            super.ref1 = t;
            this.condicion = (BloqueTripletas) condicion;
            return;
        }
        super.operando1 = condicion;
    }

    @Override
    public void setEtiqueta(String etiqueta) {
        if (this.condicion != null) {
            this.condicion.getInicio().setEtiqueta(etiqueta);
        } else {
            super.setEtiqueta(etiqueta);
        }
    }

    @Override
    public String getEtiqueta() {
        return this.condicion == null ? super.getEtiqueta() : this.condicion.getInicio().getEtiqueta(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String codigoObjeto() {
        if (super.ref1 != null) {
            String codigo = this.condicion.generarCO();
            codigo += """
                      DECF FSR,F
                      BTFSS INDF,0
                      GOTO %s
                      """;
            return String.format(codigo, super.ref2.getEtiqueta());

        }
        Object valor = super.operando1;
        if (valor instanceof LlaveTabla) {
            LlaveTabla id = (LlaveTabla) valor;
            String dir = CIVisitor.simbolos.getDireccion(id);
            String codigo = """
                            %s BTFSS %s
                            GOTO %s
                            """;
            return String.format(codigo, super.etiqueta, dir, super.ref2.getEtiqueta());
        }

        if (valor instanceof String) {
            String val = (String) valor;
            System.out.println(super.ref2.getEtiqueta());
            return String.format("%s %s", super.etiqueta, val.equals("verdadero") ? "" : "GOTO " + super.ref2.getEtiqueta() + "\n");
        }

        if (valor instanceof Boolean) {
            boolean val = (Boolean) valor;
            return String.format("%s %s", super.etiqueta, !val ? "GOTO " + super.ref2.getEtiqueta() + "\n" : "");
        }
        return "";
    }

    @Override
    public Tripleta getInicio() {
        return condicion == null ? super.getInicio() : condicion.getInicio();
    }

    @Override
    public int enumerarTripleta(int inicio) {
        if (condicion != null) {
            inicio = condicion.enumerarTripletas(inicio);
        }
        return super.enumerarTripleta(inicio);
    }

    @Override
    public void optimizar(BloqueTripletas padre) {
        if (this.condicion != null) {
            this.condicion.optimizar();
            super.resolverReferencias(this.condicion);
        }
    }

    @Override
    public String toString() {
        return (condicion != null ? condicion.toString() + "\n" : "") + super.toString();
    }

}
