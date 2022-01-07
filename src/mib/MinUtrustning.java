/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import java.util.ArrayList;
import oru.inf.InfDB;
/**
 *
 * @author isabellefredriksson
 */
public class MinUtrustning extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form MinUtrustning
     */
    public MinUtrustning(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrikUtrustning = new javax.swing.JLabel();
        lblAngeNamn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taVisaResultat = new javax.swing.JTextArea();
        lblResultat = new javax.swing.JLabel();
        btnSök = new javax.swing.JButton();
        txtAgent = new javax.swing.JTextField();
        txtTilbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrikUtrustning.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblRubrikUtrustning.setText("Utrustning");

        lblAngeNamn.setText("Ange ditt namn");

        taVisaResultat.setColumns(20);
        taVisaResultat.setRows(5);
        jScrollPane1.setViewportView(taVisaResultat);

        lblResultat.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblResultat.setText("Resultat:");

        btnSök.setText("Sök");
        btnSök.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSökActionPerformed(evt);
            }
        });

        txtAgent.setColumns(7);

        txtTilbaka.setText("Tillbaka");
        txtTilbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTilbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRubrikUtrustning)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAngeNamn)
                        .addGap(71, 71, 71)
                        .addComponent(txtAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTilbaka)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblResultat)
                                .addComponent(btnSök)))))
                .addGap(247, 247, 247))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblRubrikUtrustning)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAngeNamn)
                    .addComponent(txtAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSök)
                .addGap(52, 52, 52)
                .addComponent(lblResultat, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(txtTilbaka)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSökActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSökActionPerformed
        // TODO add your handling code here:

        try{
            String Namn = txtAgent.getText();
            
        String fraga ="SELECT mibdb.Utrustning.Benamning FROM mibdb.Utrustning "
                + "JOIN mibdb.Innehar_Utrustning ON mibdb.Utrustning.Utrustnings_ID = mibdb.Innehar_Utrustning.Utrustnings_ID "
                + "JOIN mibdb.Agent ON mibdb.Agent.Agent_ID = mibdb.Innehar_Utrustning.Agent_ID WHERE mibdb.Agent.Namn = '"+Namn+"'";
        
        
            ArrayList<String> svar = idb.fetchColumn(fraga);
            
        String svar2 = svar.toString();
     
        taVisaResultat.setText(svar2);
        
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }

        
    }//GEN-LAST:event_btnSökActionPerformed

    private void txtTilbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTilbakaActionPerformed
        // TODO add your handling code here:
        new AgentMenu(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_txtTilbakaActionPerformed

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
            java.util.logging.Logger.getLogger(MinUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel lblAngeNamn;
    private javax.swing.JLabel lblResultat;
    private javax.swing.JLabel lblRubrikUtrustning;
    private javax.swing.JTextArea taVisaResultat;
    private javax.swing.JTextField txtAgent;
    private javax.swing.JButton txtTilbaka;
    // End of variables declaration//GEN-END:variables
}
