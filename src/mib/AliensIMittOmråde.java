/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;
import oru.inf.InfDB;
import java.util.ArrayList;
/**
 *
 * @author isabellefredriksson
 */
public class AliensIMittOmråde extends javax.swing.JFrame {
    
    private InfDB idb;

    /**
     * Creates new form AliensIMittOmråde
     */
    public AliensIMittOmråde() {
        this.idb = idb;
        initComponents();
    }

    AliensIMittOmråde(InfDB idb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrikAliensIOmråde = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taListaAliensOmråde = new javax.swing.JTextArea();
        txtOmråde = new javax.swing.JTextField();
        lblOmråde = new javax.swing.JLabel();
        btnSök = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrikAliensIOmråde.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblRubrikAliensIOmråde.setText("Aliens i mitt område");

        taListaAliensOmråde.setColumns(20);
        taListaAliensOmråde.setRows(5);
        jScrollPane1.setViewportView(taListaAliensOmråde);

        txtOmråde.setColumns(10);

        lblOmråde.setText("Välj område");

        btnSök.setText("Sök");
        btnSök.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSökActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRubrikAliensIOmråde)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOmråde)
                        .addGap(18, 18, 18)
                        .addComponent(txtOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSök)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblRubrikAliensIOmråde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOmråde)
                    .addComponent(btnSök))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSökActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSökActionPerformed
        // TODO add your handling code here:
        if (Validering.textFaltVarde(txtOmråde)) {

            String område = txtOmråde.getText();

            try {
            String fråga = "SELECT benamning FROM mibdb.omrade WHERE benamning like'"+område+"'";

            ArrayList<String> svar = idb.fetchColumn(fråga);
      
            String svar2 = svar.toString();
             
            taListaAliensOmråde.setText(svar2);
             
             
            }catch (Exception e) {
            System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_btnSökActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(AliensIMittOmråde.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AliensIMittOmråde.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AliensIMittOmråde.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AliensIMittOmråde.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSök;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOmråde;
    private javax.swing.JLabel lblRubrikAliensIOmråde;
    private javax.swing.JTextArea taListaAliensOmråde;
    private javax.swing.JTextField txtOmråde;
    // End of variables declaration//GEN-END:variables
}
