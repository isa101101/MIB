/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.Date;

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
        
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        txtID.setVisible(false);
        txtResultata.setVisible(false);
        btnVälj.setVisible(false);
 
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
        RubrikNyAlien = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblRas = new javax.swing.JLabel();
        btnÄndraRas = new javax.swing.JButton();
        lblAnsvarigAgent = new javax.swing.JLabel();
        lblAktuellPlats = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        btnÄndraNamn = new javax.swing.JButton();
        btnÄndraRegDatum = new javax.swing.JButton();
        btnÄndraLösenord = new javax.swing.JButton();
        btnÄndraTelefon = new javax.swing.JButton();
        btnÄndraPlats = new javax.swing.JButton();
        btnÄndraAgent = new javax.swing.JButton();
        txtNamn = new javax.swing.JTextField();
        lbl1 = new javax.swing.JLabel();
        btnSök = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnVälj = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultata = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtVald = new javax.swing.JTextField();
        txtValdID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTelefon.setText("Telefon:");

        lblLösenord.setText("Lösenord:");

        jLabel1.setText("Registreringsdatum");

        RubrikNyAlien.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        RubrikNyAlien.setText("Ändra alien information");

        lblNamn.setText("Namn:");

        lblRas.setText("Ras:");

        btnÄndraRas.setText("Ändra Ras");
        btnÄndraRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraRasActionPerformed(evt);
            }
        });

        lblAnsvarigAgent.setText("Ansvarig agent:");

        lblAktuellPlats.setText("Aktuell plats:");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
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
        btnÄndraLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraLösenordActionPerformed(evt);
            }
        });

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

        txtNamn.setColumns(10);

        lbl1.setText("Ange namn på den Alien du vill ändra");

        btnSök.setText("Sök");
        btnSök.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSökActionPerformed(evt);
            }
        });

        lbl2.setText("Det finns fler aliens med namnet välj ID");

        txtID.setColumns(10);

        btnVälj.setText("Välj");
        btnVälj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVäljActionPerformed(evt);
            }
        });

        txtResultata.setColumns(20);
        txtResultata.setRows(5);
        jScrollPane1.setViewportView(txtResultata);

        jLabel2.setText("Du har valt ");

        txtVald.setColumns(10);

        txtValdID.setColumns(10);

        jLabel3.setText("med ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVald, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addContainerGap(273, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnVälj)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtValdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(btnTillbaka))
                            .addComponent(lblAnsvarigAgent)
                            .addComponent(lblAktuellPlats)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(lblLösenord)
                                    .addComponent(lblNamn)
                                    .addComponent(lblTelefon)
                                    .addComponent(lblRas))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnÄndraRegDatum)
                                    .addComponent(btnÄndraLösenord)
                                    .addComponent(btnÄndraNamn)
                                    .addComponent(btnÄndraPlats)
                                    .addComponent(btnÄndraAgent)
                                    .addComponent(btnÄndraRas)
                                    .addComponent(btnÄndraTelefon)))
                            .addComponent(RubrikNyAlien)
                            .addComponent(lbl1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(btnSök)))
                        .addContainerGap(158, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(RubrikNyAlien)
                .addGap(21, 21, 21)
                .addComponent(lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSök))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lbl2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVälj))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVald, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAktuellPlats)
                    .addComponent(btnÄndraPlats))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnsvarigAgent)
                    .addComponent(btnÄndraAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRas)
                    .addComponent(btnÄndraRas))
                .addGap(29, 29, 29)
                .addComponent(btnTillbaka)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnÄndraRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraRasActionPerformed
        // TODO add your handling code here:
        if (Validering.textFaltVarde(txtVald) && Validering.textFaltVarde(txtValdID)) {
        new ÄndraAliensRas(idb).setVisible(true);
        dispose();
        }else {
            JOptionPane.showMessageDialog(null, "Välj vilken alien du vill ändra");
        }
    }//GEN-LAST:event_btnÄndraRasActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // TODO add your handling code here:
        new Inloggtvå(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnÄndraNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraNamnActionPerformed
        // TODO add your handling code here:
        if (Validering.textFaltVarde(txtVald) && Validering.textFaltVarde(txtValdID)) {
        new ÄndraAliensNamn(idb).setVisible(true);
        dispose();
         }else {
            JOptionPane.showMessageDialog(null, "Välj vilken alien du vill ändra");
        }
    }//GEN-LAST:event_btnÄndraNamnActionPerformed

    private void btnÄndraRegDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraRegDatumActionPerformed
        // TODO add your handling code here:
        if (Validering.textFaltVarde(txtVald) && Validering.textFaltVarde(txtValdID)) {
        new ÄndraAliensRegDatum(idb).setVisible(true);
        dispose();
         }else {
            JOptionPane.showMessageDialog(null, "Välj vilken alien du vill ändra");
        }
    }//GEN-LAST:event_btnÄndraRegDatumActionPerformed

    private void btnÄndraTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraTelefonActionPerformed
        // TODO add your handling code here:
        if (Validering.textFaltVarde(txtVald) && Validering.textFaltVarde(txtValdID)) {
        new ÄndraAliensTelefon(idb).setVisible(true);
        dispose();
        }else {
            JOptionPane.showMessageDialog(null, "Välj vilken alien du vill ändra");
        }
    }//GEN-LAST:event_btnÄndraTelefonActionPerformed

    private void btnÄndraPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraPlatsActionPerformed
        // TODO add your handling code here:
        if (Validering.textFaltVarde(txtVald) && Validering.textFaltVarde(txtValdID)) {
        new ÄndraAliensPlats(idb).setVisible(true);
        dispose();
        }else {
            JOptionPane.showMessageDialog(null, "Välj vilken alien du vill ändra");
        }
    }//GEN-LAST:event_btnÄndraPlatsActionPerformed

    private void btnÄndraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraAgentActionPerformed
        // TODO add your handling code here:
        if (Validering.textFaltVarde(txtVald) && Validering.textFaltVarde(txtValdID)) {
        new ÄndraAliensAsvarigaAgent(idb).setVisible(true);
        dispose();
        }else {
            JOptionPane.showMessageDialog(null, "Välj vilken alien du vill ändra");
        }
    }//GEN-LAST:event_btnÄndraAgentActionPerformed

    private void btnÄndraLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraLösenordActionPerformed
        // TODO add your handling code here:
        if (Validering.textFaltVarde(txtVald) && Validering.textFaltVarde(txtValdID)) {
        new ÄndraAlienLösenord(idb).setVisible(true);
        dispose();
        }else {
            JOptionPane.showMessageDialog(null, "Välj vilken alien du vill ändra");
        }
    }//GEN-LAST:event_btnÄndraLösenordActionPerformed

    private void btnSökActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSökActionPerformed
        // Metoden söker om det finns finns fler än en alien med det angivna namnet.
        // Om det bara finns en skrivs Namn och ID ut för den angivna alien.

        String Namn = txtNamn.getText();
        String AID = txtID.getText();

        try {
            //Kontrollerar att det finns en alien med det angivna namnet.
            String frågaA = "SELECT Alien_ID FROM mibdb.Alien where Namn = '" + Namn + "'";
            String svaret = idb.fetchSingle(frågaA);

            if (svaret == null) {
                JOptionPane.showMessageDialog(null, "Det finns ingen alien med namnet '" + Namn + "'");
            }
            
            // Om det finns fler aliens med samma namn skapas en ArrayList och ID för respektive alien skrivs ut i textarean.
            ArrayList<String> svarA = idb.fetchColumn(frågaA);

            for (String ID : svarA) {
                if (svarA.size() > 1) {

                    txtID.setVisible(true);
                    txtResultata.setVisible(true);
                    lbl1.setVisible(true);
                    lbl2.setVisible(true);
                    btnVälj.setVisible(true);

                    txtResultata.append(ID + "\n");

                } else {
                    txtVald.setText(Namn);
                    txtValdID.setText(svaret);
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnSökActionPerformed

    private void btnVäljActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVäljActionPerformed
        // Metoden används om det finns fler alien med samma namn, och metoden används för att välja ID för specifik alien.
        
        String Namnet = txtNamn.getText();
        String ID = txtID.getText();
        txtVald.setText(Namnet);
        txtValdID.setText(ID);
        
        
    }//GEN-LAST:event_btnVäljActionPerformed
    
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
    private javax.swing.JButton btnSök;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnVälj;
    private javax.swing.JButton btnÄndraAgent;
    private javax.swing.JButton btnÄndraLösenord;
    private javax.swing.JButton btnÄndraNamn;
    private javax.swing.JButton btnÄndraPlats;
    private javax.swing.JButton btnÄndraRas;
    private javax.swing.JButton btnÄndraRegDatum;
    private javax.swing.JButton btnÄndraTelefon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblAktuellPlats;
    private javax.swing.JLabel lblAnsvarigAgent;
    private javax.swing.JLabel lblLösenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextArea txtResultata;
    public static javax.swing.JTextField txtVald;
    public static javax.swing.JTextField txtValdID;
    // End of variables declaration//GEN-END:variables
}
