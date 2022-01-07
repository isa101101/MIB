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
public class ÄndraAliensPlats extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form ÄndraAliensPlats
     */
    public ÄndraAliensPlats(InfDB idb) {
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

        btnÄndra = new javax.swing.JButton();
        txtNyPlats = new javax.swing.JTextField();
        txtBefintligPlats = new javax.swing.JTextField();
        lblNyPlats = new javax.swing.JLabel();
        lblBefintligtPlats = new javax.swing.JLabel();
        lblRubrikÄndraAliensPlats = new javax.swing.JLabel();
        lblAliensNamn = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        btnHämtaPlats = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnÄndra.setText("Ändra");
        btnÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraActionPerformed(evt);
            }
        });

        txtNyPlats.setColumns(8);

        txtBefintligPlats.setColumns(8);

        lblNyPlats.setText("Ny plats:");

        lblBefintligtPlats.setText("Befintligt plats:");

        lblRubrikÄndraAliensPlats.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblRubrikÄndraAliensPlats.setText("Ändra aliens plats");

        lblAliensNamn.setText("Aliens namn:");

        txtNamn.setColumns(8);

        btnHämtaPlats.setText("Hämta plats");
        btnHämtaPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaPlatsActionPerformed(evt);
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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnÄndra)
                    .addComponent(lblRubrikÄndraAliensPlats)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNyPlats)
                            .addComponent(lblBefintligtPlats)
                            .addComponent(lblAliensNamn))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNyPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBefintligPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTillbaka)
                                    .addComponent(btnHämtaPlats))))))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblRubrikÄndraAliensPlats)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAliensNamn)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBefintligPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBefintligtPlats)
                    .addComponent(btnHämtaPlats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyPlats)
                    .addComponent(txtNyPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnÄndra)
                    .addComponent(btnTillbaka))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHämtaPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaPlatsActionPerformed
        // TODO add your handling code here:
        if(Validering.textFaltVarde(txtNamn)){
        String namn = txtNamn.getText();
        
        try{
            
            
            String fråga = "SELECT mibdb.Plats.Benamning FROM mibdb.Plats "
                    + "JOIN mibdb.Alien ON mibdb.Plats.Plats_ID = mibdb.Alien.Plats "
                    + "WHERE mibdb.Alien.Namn = '"+namn+"'";
            
            String svar = idb.fetchSingle(fråga);
            
            if(svar != null){
            
                txtBefintligPlats.setText(svar);
            
            }
            else{
                JOptionPane.showMessageDialog(null, "Det finns ingen alien med det angivna namnet");
            }
            
        }catch (Exception e) {
           System.out.println(e.getMessage());
        }
        }
        
    }//GEN-LAST:event_btnHämtaPlatsActionPerformed

    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed
        // TODO add your handling code here:
        
        if(Validering.textFaltVarde(txtNamn) && Validering.textFaltVarde(txtNyPlats) && Validering.textFaltVarde(txtBefintligPlats)){
        String namn = txtNamn.getText();
        String nyPlats = txtNyPlats.getText();
        
        try{
            
            String frågaAlienID = "SELECT mibdb.Alien.Alien_ID FROM mibdb.Alien WHERE mibdb.Alien.namn = '"+namn+"'";
            
            String svarAlienID = idb.fetchSingle(frågaAlienID);
            
            String frågaPlatsID = "SELECT mibdb.Plats.Plats_ID FROM mibdb.Plats WHERE mibdb.Plats.Benamning = '"+nyPlats+"'";
            
            String svarPlatsID = idb.fetchSingle(frågaPlatsID);
            
            
            if(svarPlatsID != null){
                
                int ResultatPlatsID = Integer.parseInt(svarPlatsID); 
                
                String ändra = "UPDATE mibdb.Alien SET Plats = '"+ResultatPlatsID+"' WHERE mibdb.Alien.Alien_ID = '"+svarAlienID+"'";
            
                idb.update(ändra);
            
                JOptionPane.showMessageDialog(null, "Aliens plats är ändrat!");
                
    
            }
            else{
                JOptionPane.showMessageDialog(null, "Angiven plats finns inte, vänligen ange en annan plats!");
                
            }
            
            
        }catch (Exception e) {
           System.out.println(e.getMessage());
        }
        }
    }//GEN-LAST:event_btnÄndraActionPerformed

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
            java.util.logging.Logger.getLogger(ÄndraAliensPlats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraAliensPlats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraAliensPlats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraAliensPlats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHämtaPlats;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnÄndra;
    private javax.swing.JLabel lblAliensNamn;
    private javax.swing.JLabel lblBefintligtPlats;
    private javax.swing.JLabel lblNyPlats;
    private javax.swing.JLabel lblRubrikÄndraAliensPlats;
    private javax.swing.JTextField txtBefintligPlats;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtNyPlats;
    // End of variables declaration//GEN-END:variables
}
