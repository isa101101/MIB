/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author jackmacbook
 */
public class ÄndraAlien extends javax.swing.JFrame {
    
    private InfDB idb;

    /**
     * Creates new form ÄndraAlien
     */
    public ÄndraAlien(InfDB idb) {
         this.idb = idb;
        initComponents();
        
         txtAntalArmar.setVisible(false);
        txtAntaBoogies.setVisible(false);
        lblAntaBoogies.setVisible(false);
        lblAngeArmar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTelefon = new javax.swing.JLabel();
        lblLösenord = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbRas = new javax.swing.JComboBox<>();
        RubrikNyAlien = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblRas = new javax.swing.JLabel();
        btnUppdatera = new javax.swing.JButton();
        lblAnsvarigAgent = new javax.swing.JLabel();
        lblAktuellPlats = new javax.swing.JLabel();
        lblAlienID = new javax.swing.JLabel();
        lblTillbaka = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        txtAntalArmar = new javax.swing.JTextField();
        txtAntaBoogies = new javax.swing.JTextField();
        lblAngeArmar = new javax.swing.JLabel();
        lblAntaBoogies = new javax.swing.JLabel();
        btnÄndraID = new javax.swing.JButton();
        btnÄndraNamn = new javax.swing.JButton();
        btnÄndraRegDatum = new javax.swing.JButton();
        btnÄndraLösenord = new javax.swing.JButton();
        btnÄndraTelefon = new javax.swing.JButton();
        btnÄndraPlats = new javax.swing.JButton();
        btnÄndraAgent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTelefon.setText("Telefon:");

        lblLösenord.setText("Lösenord:");

        jLabel1.setText("Registreringsdatum");

        cmbRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Välj-", "Squid", "Boglodite", "Worm" }));
        cmbRas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRasItemStateChanged(evt);
            }
        });

        RubrikNyAlien.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        RubrikNyAlien.setText("Ändra alien information");

        lblNamn.setText("Namn:");

        lblRas.setText("Ras:");

        btnUppdatera.setText("Uppdatera");
        btnUppdatera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraActionPerformed(evt);
            }
        });

        lblAnsvarigAgent.setText("Ansvarig agent:");

        lblAktuellPlats.setText("Aktuell plats:");

        lblAlienID.setText("Alien ID");

        lblTillbaka.setText("Tillbaka till menyn");

        btnTillbaka.setText("Tryck här");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        txtAntalArmar.setColumns(8);

        txtAntaBoogies.setColumns(8);

        lblAngeArmar.setText("Ange antal armar");

        lblAntaBoogies.setText("Ange Antal boogies");

        btnÄndraID.setText("Ändra ID");
        btnÄndraID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraIDActionPerformed(evt);
            }
        });

        btnÄndraNamn.setText("Ändra namn");
        btnÄndraNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraNamnActionPerformed(evt);
            }
        });

        btnÄndraRegDatum.setText("Ändra Reg.Datum");
        btnÄndraRegDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraRegDatumActionPerformed(evt);
            }
        });

        btnÄndraLösenord.setText("Ändra lösenord");

        btnÄndraTelefon.setText("Ändra telefon");
        btnÄndraTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraTelefonActionPerformed(evt);
            }
        });

        btnÄndraPlats.setText("Ändra plats");
        btnÄndraPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraPlatsActionPerformed(evt);
            }
        });

        btnÄndraAgent.setText("Ändra agent");
        btnÄndraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraAgentActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblAntaBoogies)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtAntaBoogies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblAngeArmar)
                                    .addGap(22, 22, 22)
                                    .addComponent(txtAntalArmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(lblLösenord)
                                        .addComponent(lblNamn)
                                        .addComponent(lblTelefon))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnÄndraRegDatum)
                                        .addComponent(btnÄndraID)
                                        .addComponent(btnÄndraLösenord)
                                        .addComponent(btnÄndraNamn)
                                        .addComponent(btnÄndraTelefon)
                                        .addComponent(btnÄndraPlats)
                                        .addComponent(btnÄndraAgent))))
                            .addComponent(lblAnsvarigAgent))
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAktuellPlats)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblAlienID, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RubrikNyAlien))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRas)
                                .addGap(18, 18, 18)
                                .addComponent(cmbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUppdatera)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTillbaka)
                        .addGap(28, 28, 28)
                        .addComponent(btnTillbaka)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(RubrikNyAlien)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlienID)
                    .addComponent(btnÄndraID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnÄndraRegDatum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLösenord)
                    .addComponent(btnÄndraLösenord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamn)
                    .addComponent(btnÄndraNamn))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefon)
                    .addComponent(btnÄndraTelefon))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAktuellPlats)
                    .addComponent(btnÄndraPlats))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnsvarigAgent)
                    .addComponent(btnÄndraAgent))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRas)
                    .addComponent(cmbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAngeArmar)
                    .addComponent(txtAntalArmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAntaBoogies)
                    .addComponent(txtAntaBoogies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUppdatera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTillbaka)
                    .addComponent(btnTillbaka))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void btnUppdateraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraActionPerformed
        // TODO add your handling code here:

 
        try {
      
            String antalArmar = txtAntalArmar.getText();
            String antalBoogies = txtAntaBoogies.getText();
            String worm = cmbRas.getSelectedItem().toString();
            
          
            if(cmbRas.equals("Worm")) {
            //String ras1 = "INSERT INTO mibdb.Worm (Alien_ID) VALUES ('"+ID+"')";
            //idb.insert(ras1);
            }
            
            if(cmbRas.equals("Squid")) {
            //String ras2 = "INSERT INTO mibdb.Squid (Alien_ID, Antal_Armar) VALUES ('"+ID+"', '"+antalArmar+"')";
           // idb.insert(ras2);
            }
            
            if(cmbRas.equals("Boglodite")) {
           // String ras3 = "INSERT INTO mibdb.Boglodite (Alien_ID, Antal_Boogies) VALUES ('"+ID+"', '"+antalBoogies+"')"; 
            //idb.insert(ras3);
            }
            
            
            //idb.update(ändra);
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_btnUppdateraActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // TODO add your handling code here:
        new AgentMenu(idb).setVisible(true);
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

    private void btnÄndraIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraIDActionPerformed
        // TODO add your handling code here:
        new ÄndraAliensID(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnÄndraIDActionPerformed

    private void btnÄndraNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraNamnActionPerformed
        // TODO add your handling code here:
        new ÄndraAliensNamn(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnÄndraNamnActionPerformed

    private void btnÄndraRegDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraRegDatumActionPerformed
        // TODO add your handling code here:
        new ÄndraAliensRegDatum(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnÄndraRegDatumActionPerformed

    private void btnÄndraTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraTelefonActionPerformed
        // TODO add your handling code here:
        new ÄndraAliensTelefon(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnÄndraTelefonActionPerformed

    private void btnÄndraPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraPlatsActionPerformed
        // TODO add your handling code here:
        new ÄndraAliensPlats(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnÄndraPlatsActionPerformed

    private void btnÄndraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraAgentActionPerformed
        // TODO add your handling code here:
        new ÄndraAliensAsvarigaAgent(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnÄndraAgentActionPerformed
    
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
            java.util.logging.Logger.getLogger(ÄndraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RubrikNyAlien;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnUppdatera;
    private javax.swing.JButton btnÄndraAgent;
    private javax.swing.JButton btnÄndraID;
    private javax.swing.JButton btnÄndraLösenord;
    private javax.swing.JButton btnÄndraNamn;
    private javax.swing.JButton btnÄndraPlats;
    private javax.swing.JButton btnÄndraRegDatum;
    private javax.swing.JButton btnÄndraTelefon;
    private javax.swing.JComboBox<String> cmbRas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAktuellPlats;
    private javax.swing.JLabel lblAlienID;
    private javax.swing.JLabel lblAngeArmar;
    private javax.swing.JLabel lblAnsvarigAgent;
    private javax.swing.JLabel lblAntaBoogies;
    private javax.swing.JLabel lblLösenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblTillbaka;
    private javax.swing.JTextField txtAntaBoogies;
    private javax.swing.JTextField txtAntalArmar;
    // End of variables declaration//GEN-END:variables
}
