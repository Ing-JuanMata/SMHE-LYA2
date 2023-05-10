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
        this.ambito = "";
    }

    public LlaveTabla(String id, String ambito) {
        this.id = id;
        this.ambito = ambito;
    }

    @Override
    public int hashCode() {
        return id == null || ambito == null ? 0 : id.hashCode() * ambito.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof LlaveTabla) {
            LlaveTabla llave = (LlaveTabla) obj;
            return llave.id.equals(id) && llave.ambito.equals(ambito);
        }
        return false;
    }

    @Override
    public String toString() {
        return id;
    }
}
