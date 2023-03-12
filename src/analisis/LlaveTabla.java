/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisis;

/**
 *
 * @author jujemataso
 */
public class LlaveTabla {

    public String id, ambito;

    public LlaveTabla(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("[id=%s,ambito=%s]", id, ambito);
    }
}
