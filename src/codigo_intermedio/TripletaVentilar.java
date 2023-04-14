/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

import java.util.ArrayList;

/**
 *
 * @author jujemataso
 */
public class TripletaVentilar extends Tripleta {

    private Object puertasAbiertas, VentanasAbiertas;
    private TripletaTiempoPor tiempo;

    public TripletaVentilar(TripletaTiempoPor tiempo, Object puertas, Object ventanas) {
        super("usar");
        super.operando1 = "ventilar";
        this.tiempo = tiempo;
        this.puertasAbiertas = puertas;
        this.VentanasAbiertas = ventanas;
    }

    public void setTiempo(TripletaTiempoPor tiempo) {
        this.tiempo = tiempo;
    }

    public void setPuertasAbiertas(ArrayList<Tripleta> puertasAbiertas) {
        this.puertasAbiertas = puertasAbiertas;
    }

    public void setVentanasAbiertas(ArrayList<Tripleta> VentanasAbiertas) {
        this.VentanasAbiertas = VentanasAbiertas;
    }

    @Override
    public String codigoObjeto() {
        //Numerar tripletas de puertas y luego asignar a la variable 0var_ventilar
        //Numerar tripletas de ventanas y luego asignar a la variable 1var_ventilar
        //Enumerar tripleta de tiempo
        return "";
    }
    
    @Override
    public int enumerarTripleta(int inicio) {
        return -1;
    }
}
