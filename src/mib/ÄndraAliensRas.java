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
public class ÄndraAliensRas extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form ÄndraAliensRas
     */
    public ÄndraAliensRas(InfDB idb) {
        this.idb = idb;
        initComponents();
 
        txtAntalArmar.setVisible(false);
        txtAntaBoogies.setVisible(false);
        lblAntaBoogies.setVisible(false);
        lblAngeArmar.setVisible(false);
        
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

        jLabel1 = new javax.swing.JLabel();
        lblAliensNamn = new javax.swing.JLabel();
        lblNyRas = new javax.swing.JLabel();
        cmbRas = new javax.swing.JComboBox<>();
        btnÄndra = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        lblAntaBoogies = new javax.swing.JLabel();
        lblAngeArmar = new javax.swing.JLabel();
        txtAntaBoogies = new javax.swing.JTextField();
        txtAntalArmar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNamn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRas = new javax.swing.JTextField();
        btnHämta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Ändra aliens ras");

        lblAliensNamn.setText("Alien namn");

        lblNyRas.setText("Ny ras:");

        cmbRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Välj-", "Squid", "Boglodite", "Worm" }));
        cmbRas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRasItemStateChanged(evt);
            }
        });

        btnÄndra.setText("Ändra");
        btnÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        lblAntaBoogies.setText("Ange Antal boogies");

        lblAngeArmar.setText("Ange antal armar");

        txtAntaBoogies.setColumns(10);

        txtAntalArmar.setColumns(10);

        jLabel2.setText("Alien ID");

        txtID.setColumns(10);

        txtNamn.setColumns(10);

        jLabel3.setText("Nuvarande ras");

        txtRas.setColumns(10);

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
                .addGap(344, 344, 344)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnÄndra)
                                .addGap(109, 109, 109)
                                .addComponent(btnTillbaka))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(39, 39, 39))
                                    .addComponent(txtAntalArmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAntaBoogies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnHämta)))
                        .addContainerGap(248, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAliensNamn)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNyRas)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblAntaBoogies)
                                    .addComponent(lblAngeArmar))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAliensNamn)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHämta))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyRas)
                    .addComponent(cmbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAngeArmar)
                    .addComponent(txtAntalArmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAntaBoogies)
                    .addComponent(txtAntaBoogies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnÄndra)
                    .addComponent(btnTillbaka))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // TODO add your handling code here:
        new ÄndraAlien(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void cmbRasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRasItemStateChanged
        // TODO add your handling code here:
        String vald = cmbRas.getSelectedItem().toString();

        txtAntalArmar.setVisible(false);
        txtAntaBoogies.setVisible(false);
        lblAntaBoogies.setVisible(false);
        lblAngeArmar.setVisible(false);

        if(vald.equals("Squid")) {
            
            try {
                txtAntalArmar.setVisible(true);
                lblAngeArmar.setVisible(true);
     
                
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
     
        if(vald.equals("Boglodite")) {
            
            try {
                txtAntaBoogies.setVisible(true);
                lblAntaBoogies.setVisible(true);
     
                
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
    }//GEN-LAST:event_cmbRasItemStateChanged

    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed
        // TODO add your handling code here:
        
        String ID = txtID.getText();
        String Ras = cmbRas.getSelectedItem().toString();
        
        try{
        
        String frågaAlienID = "SELECT mibdb.Alien.Alien_ID FROM mibdb.Alien WHERE mibdb.Alien.Alien_ID = '"+ID+"'"; 
        String svarAlienID = idb.fetchSingle(frågaAlienID);
        
        if(svarAlienID != null){
            
            int resultatAlienID = Integer.parseInt(svarAlienID);
            
            String raderaRas1 = "DELETE FROM mibdb.Worm where Alien_ID = '"+ resultatAlienID +"'";
            String raderaRas2 = "DELETE FROM mibdb.Squid where Alien_ID = '"+resultatAlienID +"'";
            String raderaRas3 = "DELETE FROM mibdb.Boglodite where Alien_ID = '"+ resultatAlienID +"'";
            
            idb.delete(raderaRas1);
            idb.delete(raderaRas2);
            idb.delete(raderaRas3);
            
                String worm = "Worm";
                String squid = "Squid";
                String boglodite = "Boglodite";
                String välj = "-Välj-";
                String antalArmar = txtAntalArmar.getText();
                String antalBoogies = txtAntaBoogies.getText();
                

                if (cmbRas.getSelectedItem().equals(worm)) {
                    String ras1 = "INSERT INTO mibdb.Worm (Alien_ID) VALUES ('" + resultatAlienID + "')";
                    idb.insert(ras1);
                }

                if (cmbRas.getSelectedItem().equals(squid)) {
                    int antalArmarSquid = Integer.parseInt(antalArmar);
                    String ras2 = "INSERT INTO mibdb.Squid (Alien_ID, Antal_Armar) VALUES ('" + resultatAlienID + "', '" + antalArmarSquid + "')";
                    idb.insert(ras2);
                }

                if (cmbRas.getSelectedItem().equals(boglodite)) {
                    int antalBoogiesBoglodite = Integer.parseInt(antalBoogies);
                    String ras3 = "INSERT INTO mibdb.Boglodite (Alien_ID, Antal_Boogies) VALUES ('" + resultatAlienID + "', '" + antalBoogiesBoglodite + "')";
                    idb.insert(ras3);
                }
                
                if (cmbRas.getSelectedItem().equals(välj))
                {
                    JOptionPane.showMessageDialog(null, "Du måste välja en ras! Välj en ras och tryck ändra igen!");
                }
                
            JOptionPane.showMessageDialog(null, "Aliens ras har ändrats!");
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Det finns ingen alien med det angivna namnet");
        }
        
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnÄndraActionPerformed

    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed
        // TODO add your handling code here:
        
        String ID = txtID.getText();
        
        try {
        
        String fråga8 = "SELECT mibdb.Worm.Alien_ID from mibdb.Worm WHERE Alien_ID = '"+ID+"'";
                    
                    String svar8 = idb.fetchSingle(fråga8);
                    
                    if(svar8 == null)
                    {
                        String fråga9 = "SELECT mibdb.Squid.Alien_ID from mibdb.Squid WHERE Alien_ID = '"+ID+"'";
                        
                        String svar9 = idb.fetchSingle(fråga9);
                        
                        if (svar9 == null)
                        {
                            String fråga10 = "SELECT mibdb.Boglodite.Alien_ID from mibdb.Boglodite WHERE Alien_ID = '"+ID+"'";
                            
                            String svar10 = idb.fetchSingle(fråga10);
                            
                            if (svar10 == null)
                            {
                                txtRas.setText("Ingen ras");
                            }
                            
                            else {
                                txtRas.setText("Boglodite");
                            }
                        }
                        else {
                            txtRas.setText("Squid");
                        }
                    }
                    else{
                        txtRas.setText("Worm");
                    }
                    
                    }catch (Exception e) {
            System.out.println(e.getMessage());
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
            java.util.logging.Logger.getLogger(ÄndraAliensRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraAliensRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraAliensRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraAliensRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox<String> cmbRas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAliensNamn;
    private javax.swing.JLabel lblAngeArmar;
    private javax.swing.JLabel lblAntaBoogies;
    private javax.swing.JLabel lblNyRas;
    private javax.swing.JTextField txtAntaBoogies;
    private javax.swing.JTextField txtAntalArmar;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtRas;
    // End of variables declaration//GEN-END:variables
}
