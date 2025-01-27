/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FRONTEND;

import BACKEND.clsLista;
import BACKEND.clsNodo;
import BACKEND.clsPersona;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ctCUI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ctNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ctDireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ctDesplegar = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnVisualizarDesdeUltimo = new javax.swing.JButton();
        btnVisualizarE = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ctNumeroP = new javax.swing.JTextField();
        btnEliminarCola = new javax.swing.JButton();
        btnEliminarPila = new javax.swing.JButton();
        btnEliminarE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Menu de Registro de Enpadronamiento");

        ctCUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctCUIActionPerformed(evt);
            }
        });
        ctCUI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ctCUIKeyTyped(evt);
            }
        });

        jLabel2.setText("CUI:");

        ctNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre completo:");

        jLabel4.setText("Direccion:");

        ctDesplegar.setColumns(20);
        ctDesplegar.setRows(5);
        jScrollPane1.setViewportView(ctDesplegar);

        btnGuardar.setText("Guardar registro");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVisualizar.setText("Visualizar registros");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        btnVisualizarDesdeUltimo.setText("Visualizar desde ultimo registro");

        btnVisualizarE.setText("Visualizar registro especifico");

        jLabel5.setText("Numero de Padron:");

        ctNumeroP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ctNumeroPKeyTyped(evt);
            }
        });

        btnEliminarCola.setText("Eliminar tipo cola");
        btnEliminarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarColaActionPerformed(evt);
            }
        });

        btnEliminarPila.setText("Eliminar tipo pila");

        btnEliminarE.setText("Eliminar registro especifico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctNumeroP))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctCUI))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctDireccion))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVisualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVisualizarDesdeUltimo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVisualizarE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminarCola)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarPila)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ctNumeroP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ctCUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ctNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ctDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnVisualizar)
                    .addComponent(btnVisualizarDesdeUltimo)
                    .addComponent(btnVisualizarE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarCola)
                    .addComponent(btnEliminarPila)
                    .addComponent(btnEliminarE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctCUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctCUIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctCUIActionPerformed

    private void ctNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctNombreActionPerformed

    private void btnEliminarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarColaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarColaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        clsNodo objNodo = new clsNodo();
        clsLista objLista = new clsLista();
        clsPersona objPersona = new clsPersona();
        
        
        objPersona.setNumeroPadron(Integer.parseInt( ctNumeroP.getText() ) );
        objPersona.setCUI(Double.parseDouble(ctCUI.getText()  )  );
        objPersona.setNombre(ctNombre.getText()  );
        objPersona.setDireccion(ctDireccion.getText()  );
        
        objNodo.setValor(objPersona.getNumeroPadron());
        objNodo.setNombre(objPersona.getNombre());
        
       // if(objLista.RegistroRepetido() != true){
            switch( objLista.fncRegistro() ){
                case 0:
                    JOptionPane.showMessageDialog(null, "Error.");
                break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Primer registro realizado con exito.");
                    ctDesplegar.setText("Numero de padrono: " + objNodo.getValor() + "\n" + "Nombre: " + objNodo.getNombre());
                break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Segundo registro realizado con exito.");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Registro realizado con exito.");
                break;
            }
         // JOptionPane.showMessageDialog(null, "bien");
       /* }else{
            JOptionPane.showMessageDialog(null, "Error registro repetido");
        }*/
         
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void ctNumeroPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ctNumeroPKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        
        boolean numero = key >= 48 && key <= 57;
        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_ctNumeroPKeyTyped

    private void ctCUIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ctCUIKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        
        boolean numero = key >= 48 && key <= 57;
        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_ctCUIKeyTyped

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        // TODO add your handling code here:
        clsLista objLista = new clsLista();

        
        if(objLista.ListaVacia() != true){
            ctDesplegar.setText(objLista.fncMostrarPU());
        }else{
            JOptionPane.showMessageDialog(null, "Lista vacia.");
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarCola;
    private javax.swing.JButton btnEliminarE;
    private javax.swing.JButton btnEliminarPila;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JButton btnVisualizarDesdeUltimo;
    private javax.swing.JButton btnVisualizarE;
    private javax.swing.JTextField ctCUI;
    private javax.swing.JTextArea ctDesplegar;
    private javax.swing.JTextField ctDireccion;
    private javax.swing.JTextField ctNombre;
    private javax.swing.JTextField ctNumeroP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
