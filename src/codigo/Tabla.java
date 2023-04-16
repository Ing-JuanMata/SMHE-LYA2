/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codigo;

/**
 *
 * @author jujemataso
 */
public class Tabla extends javax.swing.JFrame {

    /**
     * Creates new form Tabla
     * @param titulo
     */
    public Tabla(String titulo) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle(titulo);
        
    }

    public javax.swing.table.TableModel getModel() {
        return this.tblDatos.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(968, 500));
        setPreferredSize(new java.awt.Dimension(968, 500));

        tblDatos.setFont(new java.awt.Font("Source Code Pro Semibold", 0, 16)); // NOI18N
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDatos.setRowHeight(25);
        tblDatos.setRowSelectionAllowed(false);
        tblDatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDatos);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
}
