/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Carlos
 */
public class FRM_Instrucciones extends javax.swing.JFrame {
    
    String instrucciones;

    public FRM_Instrucciones() {
        super("Game Instructions");
        initComponents();
        setLocationRelativeTo(this);
        instrucciones="Instructions: ";
        this.jta_Instrucciones.setText(instrucciones);
        this.jta_Instrucciones.setEditable(false);
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
        jta_Instrucciones = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(300, 200));

        jta_Instrucciones.setColumns(20);
        jta_Instrucciones.setForeground(new java.awt.Color(0, 0, 0));
        jta_Instrucciones.setRows(5);
        jta_Instrucciones.setPreferredSize(new java.awt.Dimension(300, 200));
        jScrollPane1.setViewportView(jta_Instrucciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jta_Instrucciones;
    // End of variables declaration//GEN-END:variables
}