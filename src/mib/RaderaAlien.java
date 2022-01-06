/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author isabellefredriksson
 */
public class RaderaAlien extends javax.swing.JFrame {

    
    private InfDB idb;
    /**
     * Creates new form RaderaAlien
     */
    public RaderaAlien(InfDB idb) {
         this.idb = idb;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrikRaderaAlien = new javax.swing.JLabel();
        lblAngeAlienNamn = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        btnRadera = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtVisaResultat = new javax.swing.JTextArea();
        btnSök = new javax.swing.JButton();
        lblMiniRubrikResultat = new javax.swing.JLabel();
        lblAngeID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrikRaderaAlien.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblRubrikRaderaAlien.setText("Radera alien från systemet");

        lblAngeAlienNamn.setText("Ange aliens namn:");

        txtNamn.setColumns(8);
        txtNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamnActionPerformed(evt);
            }
        });

        btnRadera.setText("Radera");
        btnRadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaderaActionPerformed(evt);
            }
        });

        txtVisaResultat.setColumns(20);
        txtVisaResultat.setRows(5);
        jScrollPane1.setViewportView(txtVisaResultat);

        btnSök.setText("Sök");
        btnSök.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSökActionPerformed(evt);
            }
        });

        lblMiniRubrikResultat.setText("Aliens ID med det angivna namnet:");

        lblAngeID.setText("Ange det ID på den alien du vill radera:");

        txtID.setColumns(8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMiniRubrikResultat)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSök)
                    .addComponent(btnRadera)
                    .addComponent(lblRubrikRaderaAlien)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAngeAlienNamn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAngeID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblRubrikRaderaAlien)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAngeAlienNamn)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSök)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMiniRubrikResultat)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAngeID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRadera)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamnActionPerformed

    private void btnRaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaderaActionPerformed
        // TODO add your handling code here:
        
        if (Validering.textFaltVarde(txtNamn)) {
            try {
                String Namn = txtNamn.getText();
                String ID = txtID.getText();

                String fråga1 = "SELECT Alien_ID FROM mibdb.Alien WHERE Alien_ID = '" + ID + "'";

                String svar1 = idb.fetchSingle(fråga1);

                String Resultat1 = svar1;

                if (ID.equals(Resultat1)) {
                    String radera = "DELETE FROM mibdb.Alien where Alien_ID = '" + ID + "'";
                    JOptionPane.showMessageDialog(null, "Alien med ID '" + ID + "' borttagen");

                    String raderaRas1 = "DELETE FROM mibdb.Worm where Alien_ID = '"+ ID +"'";
                    String raderaRas2 = "DELETE FROM mibdb.Squid where Alien_ID = '"+ ID +"'";
                    String raderaRas3 = "DELETE FROM mibdb.Boglodite where Alien_ID = '"+ ID +"'";
                    
                    idb.delete(radera);
                    idb.delete(raderaRas1);
                    idb.delete(raderaRas2);
                    idb.delete(raderaRas3);

                } else {
                    JOptionPane.showMessageDialog(null, "En Alien med ID '" + ID + "' finns inte");
                }

            } catch (InfException e) {
                System.out.println(e.getMessage());
        
        }
        }
    }//GEN-LAST:event_btnRaderaActionPerformed

    private void btnSökActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSökActionPerformed
        // TODO add your handling code here:
        
        txtVisaResultat.setText("");

        String namn = txtNamn.getText();

        if (Validering.textFaltVarde(txtNamn)) {

            try {
                String fråga = "SELECT mibdb.Alien.Alien_ID FROM mibdb.Alien WHERE mibdb.Alien.Namn = '" + namn + "'";

                ArrayList<String> svar = idb.fetchColumn(fråga);

                //ArrayList<HashMap<String, String>> svar = idb.fetchRows(fråga);
                // int abc = Integer.toString(svar);
                for (String ID : svar) {

                    txtVisaResultat.append(ID + "\n");

                }

            } catch (InfException e) {
                System.out.println(e.getMessage());

            }
         }
    }//GEN-LAST:event_btnSökActionPerformed

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
            java.util.logging.Logger.getLogger(RaderaAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RaderaAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RaderaAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RaderaAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRadera;
    private javax.swing.JButton btnSök;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAngeAlienNamn;
    private javax.swing.JLabel lblAngeID;
    private javax.swing.JLabel lblMiniRubrikResultat;
    private javax.swing.JLabel lblRubrikRaderaAlien;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextArea txtVisaResultat;
    // End of variables declaration//GEN-END:variables
}
