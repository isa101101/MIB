/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author jackmacbook
 */
public class ÄndraKontorschef extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * 
     * Creates new form ÄndraKontorschef
     */
    public ÄndraKontorschef(InfDB idb) {
        
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblKontor = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        btnÄndra = new javax.swing.JButton();
        txtNamn = new javax.swing.JTextField();
        lblchef = new javax.swing.JLabel();
        txtKontor = new javax.swing.JTextField();
        lblNuvaradeChef = new javax.swing.JLabel();
        txtNuvarandeKontorsChef = new javax.swing.JTextField();
        btnHämta = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Ändra kontorschef");

        lblKontor.setText("Ange kontor:");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnÄndra.setText("Ändra");
        btnÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraActionPerformed(evt);
            }
        });

        txtNamn.setColumns(10);

        lblchef.setText("Ange ny kontorschef:");

        txtKontor.setColumns(10);
        txtKontor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKontorActionPerformed(evt);
            }
        });

        lblNuvaradeChef.setText("Nuvarande kontorschef:");

        txtNuvarandeKontorsChef.setColumns(10);
        txtNuvarandeKontorsChef.setToolTipText("");

        btnHämta.setText("Hämta");
        btnHämta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnÄndra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbaka)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblchef, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblKontor)
                                        .addGap(60, 60, 60)))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKontor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNuvaradeChef)
                                .addGap(18, 18, 18)
                                .addComponent(txtNuvarandeKontorsChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHämta))
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKontor)
                    .addComponent(txtKontor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuvaradeChef)
                    .addComponent(txtNuvarandeKontorsChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHämta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblchef)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTillbaka)
                            .addComponent(btnÄndra))))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed
        // TODO add your handling code here:

        String AgentNamn = txtNamn.getText();
        String kontor = txtKontor.getText();

        if (Validering.textFaltVarde(txtNamn)) {

            try {

                String frågaKontor = "SELECT mibdb.Kontorschef.Kontorsbeteckning from mibdb.Kontorschef WHERE mibdb.Kontorschef.Kontorsbeteckning = '" + kontor + "'";
                String svarKontor = idb.fetchSingle(frågaKontor);

                if (svarKontor != null) {
                    // Hämtar AgentID 
                    String frågaAID = "SELECT mibdb.Agent.Agent_ID FROM mibdb.Agent WHERE mibdb.Agent.Namn = '" + AgentNamn + "' ";
                    String svarAID = idb.fetchSingle(frågaAID);

                    //Villkoret kontrollerar att agenten finns.
                    if (svarAID != null) {
                        int AID = Integer.parseInt(svarAID); //Omtypning till int.

                        //Kontrollerar att agenten inte redan är kontorschef
                        String fråga = "SELECT mibdb.Kontorschef.Agent_ID FROM mibdb.Kontorschef WHERE mibdb.Kontorschef.Agent_ID = '" + AID + "'";
                        String svar = idb.fetchSingle(fråga);

                        //Kontrollerar att den angivna agenten är kontorschef.
                        if (svar == null) {

                            String ändra = "UPDATE mibdb.Kontorschef SET Agent_ID = '" + AID + "' "
                                    + "WHERE mibdb.Kontorschef.Kontorsbeteckning = '" + kontor + "'";

                            idb.update(ändra); //uppdaterar tabellen

                            JOptionPane.showMessageDialog(null, "Det angivna kontoret har nu fått en ny kontorschef");

                        } else {
                            JOptionPane.showMessageDialog(null, "Agenten är redan kontorschef för ett annat kontor!");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Den angivna agenten finns inte!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Den angivna kontoret finns inte!");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }//GEN-LAST:event_btnÄndraActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // TODO add your handling code here:
        new AdminMenu(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void txtKontorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKontorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKontorActionPerformed

    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed
        // Metod för att hämta nuvarande kontorschef
      
        if (Validering.textFaltVarde(txtKontor)) {
            String kontor = txtKontor.getText(); //Ny variabel

            try {
                //SQL frågan hämtar kontorschefen från det angivna kontoret.
                String fråga = "SELECT mibdb.Agent.Namn FROM mibdb.Agent JOIN mibdb.Kontorschef ON mibdb.Agent.Agent_ID = mibdb.Kontorschef.Agent_ID WHERE mibdb.Kontorschef.Kontorsbeteckning = '" + kontor + "' ";
                String svar = idb.fetchSingle(fråga);

                //Kontrollerar att det finns en chef för det valda kontoret och om så är fallet skrivs namnet på kontorschefen ut i textfältet.
                if (svar != null) {

                    txtNuvarandeKontorsChef.setText(svar);
                } else {
                    JOptionPane.showMessageDialog(null, "Det angivna kontoret finns inte, försök igen!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
    }//GEN-LAST:event_btnHämtaActionPerformed

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
            java.util.logging.Logger.getLogger(ÄndraKontorschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraKontorschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraKontorschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraKontorschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHämta;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnÄndra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblKontor;
    private javax.swing.JLabel lblNuvaradeChef;
    private javax.swing.JLabel lblchef;
    private javax.swing.JTextField txtKontor;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtNuvarandeKontorsChef;
    // End of variables declaration//GEN-END:variables
}
