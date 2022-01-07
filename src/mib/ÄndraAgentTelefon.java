/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 *
 * @author jackmacbook
 */
public class ÄndraAgentTelefon extends javax.swing.JFrame {
    private InfDB idb;

    /**
     * Creates new form ÄndraAgentTelefon
     */
    public ÄndraAgentTelefon(InfDB idb) {
        this.idb=idb;
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
        txtNamn = new javax.swing.JTextField();
        btnHämta = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        txtNummer = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNyttnummer = new javax.swing.JTextField();
        btnÄndra = new javax.swing.JButton();
        tbnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Agent namn");

        txtNamn.setColumns(10);

        btnHämta.setText("Hämta");
        btnHämta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaActionPerformed(evt);
            }
        });

        txtNummer.setColumns(10);

        jLabel3.setText("Nuvarande telfonnummer");

        jLabel4.setText("Nytt telefonnummer");

        txtNyttnummer.setColumns(10);

        btnÄndra.setText("Ändra");
        btnÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraActionPerformed(evt);
            }
        });

        tbnTillbaka.setText("Tillbaka");
        tbnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lblID))
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHämta))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnÄndra)
                        .addComponent(txtNyttnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(tbnTillbaka)))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHämta))
                .addGap(2, 2, 2)
                .addComponent(lblID)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtNyttnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnÄndra)
                .addGap(34, 34, 34)
                .addComponent(tbnTillbaka)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnTillbakaActionPerformed
        // TODO add your handling code here:
        new ÄndraAgent(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_tbnTillbakaActionPerformed

    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed
        // TODO add your handling code here:
        
        if (Validering.textFaltVarde(txtNamn)) {
        try {
        String namn = txtNamn.getText();
        String NyttNummer = txtNyttnummer.getText();
        
        String frågaNamn = "SELECT mibdb.Agent.Namn from mibdb.Agent WHERE mibdb.Agent.Namn = '"+namn+"'";
        String frågaTelefon = "SELECT mibdb.Agent.Telefon from mibdb.Agent WHERE mibdb.Agent.Namn = '"+namn+"'";
        String frågaID = "SELECT mibdb.Agent.Agent_ID FROM mibdb.Agent WHERE mibdb.Agent.Namn = '"+namn+"'";   
        
        
        String svarNamn = idb.fetchSingle(frågaNamn);
        String svarTelefon = idb.fetchSingle(frågaTelefon);
        String svarID = idb.fetchSingle(frågaID);
        
        if (namn.equals(svarNamn)) {
            txtNummer.setText(svarTelefon);
            
        } else {
              JOptionPane.showMessageDialog(null, "Det finns ingen agent med namnet '"+namn+"'");
            
        }
        
        
        
        }catch (Exception e) {
                System.out.println(e.getMessage());
            
        }
        }
    }//GEN-LAST:event_btnHämtaActionPerformed

    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed
        // TODO add your handling code here:
        
        String namn = txtNamn.getText();
        String NyttNummer = txtNyttnummer.getText();
        String ändra = "UPDATE mibdb.Agent SET mibdb.Agent.Telefon = '"+NyttNummer+"' where mibdb.Agent.Namn = '"+namn+"'";
        
         if (Validering.textFaltVarde(txtNyttnummer)) {
             try {
                 idb.update(ändra);
                 JOptionPane.showMessageDialog(null, "Numret har ändrats");
                 
             }catch (Exception e) {
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
            java.util.logging.Logger.getLogger(ÄndraAgentTelefon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraAgentTelefon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraAgentTelefon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraAgentTelefon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnÄndra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblID;
    private javax.swing.JButton tbnTillbaka;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtNummer;
    private javax.swing.JTextField txtNyttnummer;
    // End of variables declaration//GEN-END:variables
}
