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
 * @author isabellefredriksson
 */
public class ÄndraAliensAsvarigaAgent extends javax.swing.JFrame {
    
    private InfDB idb;

    /**
     * Creates new form ÄndraAliensAsvarigaAgent
     */
    public ÄndraAliensAsvarigaAgent(InfDB idb) {
        this.idb = idb;
        initComponents();
        
        String HämtaNamn = ÄndraAlien.txtVald.getText();
        String HämtaID = ÄndraAlien.txtValdID.getText();
        
        txtNamn.setText(HämtaNamn);
        txtID.setText(HämtaID);
               
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrikÄndraAnsvarigAgent = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNyAnsvarigAgent = new javax.swing.JLabel();
        btnÄndra = new javax.swing.JButton();
        txtNuvarandeAgent = new javax.swing.JTextField();
        txtNyAgent = new javax.swing.JTextField();
        lblAliensNamn = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        btnHämtaAgent = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrikÄndraAnsvarigAgent.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblRubrikÄndraAnsvarigAgent.setText("Ändra aliens ansvariga agent");

        jLabel2.setText("Nuvarande ansvarig agent:");

        lblNyAnsvarigAgent.setText("Ny ansvarig agent:");

        btnÄndra.setText("Ändra");
        btnÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraActionPerformed(evt);
            }
        });

        txtNuvarandeAgent.setColumns(10);

        txtNyAgent.setColumns(10);

        lblAliensNamn.setText("Aliens namn:");

        txtNamn.setColumns(10);

        btnHämtaAgent.setText("Hämta agent");
        btnHämtaAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaAgentActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        jLabel1.setText("Alien ID");

        txtID.setColumns(10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnÄndra)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblNyAnsvarigAgent))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNyAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNuvarandeAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTillbaka)
                                    .addComponent(btnHämtaAgent)))))
                    .addComponent(lblRubrikÄndraAnsvarigAgent)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAliensNamn)
                            .addComponent(jLabel1))
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblRubrikÄndraAnsvarigAgent)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAliensNamn)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNuvarandeAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHämtaAgent))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyAnsvarigAgent)
                    .addComponent(txtNyAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnÄndra)
                    .addComponent(btnTillbaka))
                .addContainerGap(244, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // TODO add your handling code here:
        new ÄndraAlien(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnHämtaAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaAgentActionPerformed
        // Metoden hämtar ansvarig agent för en angiven alien.
        if (Validering.textFaltVarde(txtNamn)) {

            String ID = txtID.getText();

            try {
                // Hämtar ansvarig agent från databasen.
                String fråga = "SELECT mibdb.Agent.Namn FROM mibdb.Agent "
                        + "JOIN mibdb.Alien ON mibdb.Agent.Agent_ID = mibdb.Alien.Ansvarig_Agent "
                        + "WHERE mibdb.Alien.Alien_ID = '" + ID + "'";
                String svar = idb.fetchSingle(fråga);

                //Om ansvarig agent hittas  skrivs namnet ut i textrutan.
                if (svar != null) {
                    txtNuvarandeAgent.setText(svar);

                } else {
                    JOptionPane.showMessageDialog(null, "Det finns ingen alien med det angivna namnet");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnHämtaAgentActionPerformed

    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed
        // Metoden ändrar en agiven aliens ansvariga agent.
        String ID = txtID.getText();
        String nyAgent = txtNyAgent.getText();

        if (Validering.textFaltVarde(txtID) && Validering.textFaltVarde(txtNyAgent)) {
            try {
                //Kontrollerar att den önskade nya ansvariga ageenten finns.
                String frågaAgentID = "SELECT mibdb.Agent.Agent_ID FROM mibdb.Agent WHERE mibdb.Agent.Namn = '" + nyAgent + "'";
                String svarAgentID = idb.fetchSingle(frågaAgentID);

                if (svarAgentID != null) {

                    //Databasen tar bara emot datatypen int för alienID och Agent ID, därför görs en omtypning från String till int.
                    int resultatAlienID = Integer.parseInt(ID);
                    int resultatAgentID = Integer.parseInt(svarAgentID);

                    String ändra = "UPDATE mibdb.Alien SET Ansvarig_Agent = '" + resultatAgentID + "' WHERE mibdb.Alien.Alien_ID = '" + resultatAlienID + "'";
                    idb.update(ändra); //Databasen uppdateras.

                    JOptionPane.showMessageDialog(null, "Aliens ansvariga agent har ändrat");

                } else {
                    JOptionPane.showMessageDialog(null, "Det finns ingen Agent med det angivna namnet!");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnÄndraActionPerformed

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
            java.util.logging.Logger.getLogger(ÄndraAliensAsvarigaAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraAliensAsvarigaAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraAliensAsvarigaAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraAliensAsvarigaAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHämtaAgent;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnÄndra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAliensNamn;
    private javax.swing.JLabel lblNyAnsvarigAgent;
    private javax.swing.JLabel lblRubrikÄndraAnsvarigAgent;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtNuvarandeAgent;
    private javax.swing.JTextField txtNyAgent;
    // End of variables declaration//GEN-END:variables
}
