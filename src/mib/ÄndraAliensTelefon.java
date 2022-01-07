/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

/**
 *
 * @author isabellefredriksson
 */
public class ÄndraAliensTelefon extends javax.swing.JFrame {
    
    private InfDB idb;

    /**
     * Creates new form ÄndraAliensTelefon
     */
    public ÄndraAliensTelefon(InfDB idb) {
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
        lblBefintligtTelefon = new javax.swing.JLabel();
        lblNyttTelefon = new javax.swing.JLabel();
        txtBefintligtTelefon = new javax.swing.JTextField();
        txtNyttTelefon = new javax.swing.JTextField();
        btnÄndra = new javax.swing.JButton();
        lblAliensNamn = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        btnHämtaTelnr = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Ändra aliens telefonnummer");

        lblBefintligtTelefon.setText("Befintligt telefonnummer:");

        lblNyttTelefon.setText("Nytt telefonnummer:");

        txtBefintligtTelefon.setColumns(8);

        txtNyttTelefon.setColumns(8);

        btnÄndra.setText("Ändra");
        btnÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraActionPerformed(evt);
            }
        });

        lblAliensNamn.setText("Aliens namn:");

        txtNamn.setColumns(8);

        btnHämtaTelnr.setText("Hämta Telnr");
        btnHämtaTelnr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaTelnrActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBefintligtTelefon)
                                    .addComponent(lblNyttTelefon)
                                    .addComponent(lblAliensNamn))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNyttTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtBefintligtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnTillbaka)
                                            .addComponent(btnHämtaTelnr)))))
                            .addComponent(btnÄndra))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAliensNamn)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBefintligtTelefon)
                    .addComponent(txtBefintligtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHämtaTelnr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyttTelefon)
                    .addComponent(txtNyttTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnÄndra)
                    .addComponent(btnTillbaka))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed
        // TODO add your handling code here:
        
        if (Validering.textFaltVarde(txtNamn) && Validering.textFaltVarde(txtNyttTelefon) && Validering.textFaltVarde(txtBefintligtTelefon))
        {
        String namn = txtNamn.getText();
        String nyTelefon = txtNyttTelefon.getText();
        
        try{
        
            String fråga1 = "SELECT mibdb.Alien.Alien_ID FROM mibdb.Alien WHERE mibdb.Alien.Namn = '"+namn+"'";
            
            
            String svar1 = idb.fetchSingle(fråga1);
        
            String ändra = "UPDATE mibdb.Alien SET Telefon = '"+nyTelefon+"' WHERE mibdb.Alien.Alien_ID = '"+svar1+"'";
            
            idb.update(ändra);
        
            JOptionPane.showMessageDialog(null, "Aliens telefonnummer har ändras!");
            
        }catch (Exception e) {
           System.out.println(e.getMessage());
        }
        }
    }//GEN-LAST:event_btnÄndraActionPerformed

    private void btnHämtaTelnrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaTelnrActionPerformed
        // TODO add your handling code here:
        String alien = txtNamn.getText();
        
        try{
            
            String fråga = "SELECT mibdb.Alien.Telefon FROM mibdb.Alien WHERE mibdb.Alien.Namn = '"+alien+"'";
            
            String svar = idb.fetchSingle(fråga);
            
            if(svar != null)
            {
              txtBefintligtTelefon.setText(svar);  
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Det finns ingen alien med det angivna namnet!");
            }
            
            
            
        }catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnHämtaTelnrActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // TODO add your handling code here:
        new ÄndraAlien(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

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
            java.util.logging.Logger.getLogger(ÄndraAliensTelefon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraAliensTelefon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraAliensTelefon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraAliensTelefon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHämtaTelnr;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnÄndra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAliensNamn;
    private javax.swing.JLabel lblBefintligtTelefon;
    private javax.swing.JLabel lblNyttTelefon;
    private javax.swing.JTextField txtBefintligtTelefon;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtNyttTelefon;
    // End of variables declaration//GEN-END:variables
}
