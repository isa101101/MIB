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
public class NyregistreraAliens extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form AlienMenu
     */

    /**
     * Creates new form NyregistreraAliens
     */
    public NyregistreraAliens(InfDB idb) {
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

        RubrikNyAlien = new javax.swing.JLabel();
        lblFyllRutor = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblRas = new javax.swing.JLabel();
        lblAnsvarigAgent = new javax.swing.JLabel();
        lblAktuellPlats = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblLösenord = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        cmbRas = new javax.swing.JComboBox<>();
        txtTelefon = new javax.swing.JTextField();
        txtAnsvarigagent = new javax.swing.JTextField();
        txtPlats = new javax.swing.JTextField();
        txtlösenord = new javax.swing.JTextField();
        btnRegistrera = new javax.swing.JButton();
        lblAlienID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtRegistreringsdatum = new javax.swing.JTextField();
        btnTillbaka = new javax.swing.JButton();
        btnHämtaId = new javax.swing.JButton();
        txtAntaBoogies = new javax.swing.JTextField();
        txtAntalArmar = new javax.swing.JTextField();
        lblAngeArmar = new javax.swing.JLabel();
        lblAntaBoogies = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        cmbOmråde = new javax.swing.JComboBox<>();
        lblPlatsIOmråde = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikNyAlien.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        RubrikNyAlien.setText("Lägg till en ny alien");

        lblFyllRutor.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        lblFyllRutor.setText("Fyll i samtliga rutor nedan:");

        lblNamn.setText("Namn:");

        lblRas.setText("Ras:");

        lblAnsvarigAgent.setText("Ansvarig agent:");

        lblAktuellPlats.setText("Aktuell plats:");

        lblTelefon.setText("Telefon:");

        lblLösenord.setText("Lösenord:");

        txtNamn.setColumns(8);

        cmbRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Välj-", "Squid", "Boglodite", "Worm" }));
        cmbRas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRasItemStateChanged(evt);
            }
        });

        txtTelefon.setColumns(8);

        txtAnsvarigagent.setColumns(8);

        txtPlats.setColumns(8);
        txtPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlatsActionPerformed(evt);
            }
        });

        txtlösenord.setColumns(8);
        txtlösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlösenordActionPerformed(evt);
            }
        });

        btnRegistrera.setText("Registrera");
        btnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraActionPerformed(evt);
            }
        });

        lblAlienID.setText("Alien ID");

        jLabel1.setText("Registreringsdatum");

        txtRegistreringsdatum.setColumns(8);

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnHämtaId.setText("Hämta ID");
        btnHämtaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaIdActionPerformed(evt);
            }
        });

        txtAntaBoogies.setColumns(8);

        txtAntalArmar.setColumns(8);

        lblAngeArmar.setText("Ange antal armar");

        lblAntaBoogies.setText("Ange Antal boogies");

        lblID.setText("          ");

        cmbOmråde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Välj-", "Norrland", "Svealand", "Götaland" }));

        lblPlatsIOmråde.setText("Platsen finns i område:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRas)
                                .addGap(18, 18, 18)
                                .addComponent(cmbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblAlienID)
                                    .addGap(121, 121, 121)
                                    .addComponent(lblID))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFyllRutor)
                                    .addComponent(RubrikNyAlien))))
                        .addContainerGap())
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
                                        .addComponent(lblTelefon)
                                        .addComponent(lblAnsvarigAgent))
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtlösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAnsvarigagent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblAktuellPlats))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHämtaId)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lblPlatsIOmråde)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrera)
                .addGap(145, 145, 145)
                .addComponent(btnTillbaka)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(RubrikNyAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFyllRutor)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAlienID)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHämtaId)
                        .addComponent(lblID)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlatsIOmråde))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLösenord)
                            .addComponent(txtlösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNamn)
                        .addGap(22, 22, 22)
                        .addComponent(lblTelefon)
                        .addGap(18, 18, 18)
                        .addComponent(lblAktuellPlats)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAnsvarigagent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnsvarigAgent))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRas)
                    .addComponent(cmbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAngeArmar)
                    .addComponent(txtAntalArmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAntaBoogies)
                    .addComponent(txtAntaBoogies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrera)
                    .addComponent(btnTillbaka))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlatsActionPerformed

    private void txtlösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlösenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlösenordActionPerformed

    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed
        // TODO add your handling code here:

        if (Validering.textFaltVarde(txtRegistreringsdatum) && Validering.textFaltVarde(txtlösenord)
                && Validering.textFaltVarde(txtNamn) && Validering.textFaltVarde(txtTelefon) && Validering.textFaltVarde(txtPlats) && Validering.textFaltVarde(txtAnsvarigagent)) {

            try {
                String ID = lblID.getText();
                String Datum = txtRegistreringsdatum.getText();
                String lösenord = txtlösenord.getText();
                String Namn = txtNamn.getText();
                String Telefon = txtTelefon.getText();
                String Plats = txtPlats.getText();
                String AnsvarigAgent = txtAnsvarigagent.getText();
                String antalArmar = txtAntalArmar.getText();
                String antalBoogies = txtAntaBoogies.getText();
                String worm2 = cmbRas.getSelectedItem().toString();
                String Område = cmbOmråde.getSelectedItem().toString();

                String FrågaFinnsPlats = "SELECT mibdb.Plats.Benamning FROM mibdb.Plats WHERE mibdb.Plats.Benamning = '" + Plats + "'";
                
                String SvarFinnsPlats = idb.fetchSingle(FrågaFinnsPlats);

                if (SvarFinnsPlats != null) {
                    

                    String FrågaPlats = "SELECT mibdb.Plats.Plats_ID FROM mibdb.Plats WHERE mibdb.Plats.Benamning = '" + Plats + "'";
                    
                    String SvarPlats = idb.fetchSingle(FrågaPlats);

                    int Plats_ID = Integer.parseInt(SvarPlats);

                    String FrågaAnsvarigAgent = "SELECT mibdb.Agent.Agent_ID FROM mibdb.Agent WHERE mibdb.Agent.Namn = '" + AnsvarigAgent + "'";

                    String SvarAgent = idb.fetchSingle(FrågaAnsvarigAgent);
                    
                    if(SvarAgent != null) {
                    int Agent_ID = Integer.parseInt(SvarAgent);

                    String Nyalien = "INSERT INTO mibdb.Alien (Alien_ID, Registreringsdatum, Losenord, Namn, Telefon, Plats, Ansvarig_Agent) VALUES "
                            + "('" + ID + "','" + Datum + "','" + lösenord + "','" + Namn + "', '" + Telefon + "','" + Plats_ID + "','" + Agent_ID + "')";

                    idb.insert(Nyalien);

                    JOptionPane.showMessageDialog(null, "Alien har registreras");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Ange annan Agent, den angivna agenten finns ej!");
                    }

                } else {
                    
                    //Om inte platsen finns ska den läggas till, vilket koden nedan gör
                    String FrågaNyPlats_ID = "SELECT max(Plats_ID) FROM mibdb.Plats";

                    
                    String SvarNyPlats_ID = idb.fetchSingle(FrågaNyPlats_ID);
            

                    int SvaretNyPlats_ID = Integer.parseInt(SvarNyPlats_ID);

                    int ResultatNyPlats_ID = SvaretNyPlats_ID + 1;


                    String FrågaOmråde_ID = "SELECT mibdb.Omrade.Omrades_ID FROM mibdb.Omrade WHERE mibdb.Omrade.Benamning = '" + Område + "'";

                    
                    String SvarOmråde_ID = idb.fetchSingle(FrågaOmråde_ID);

                    int SvaretOmråde_ID = Integer.parseInt(SvarOmråde_ID);

                    String nyPlats = "INSERT INTO mibdb.Plats (Plats_ID, Finns_I, Benamning) VALUES ('" + ResultatNyPlats_ID + "', '" + SvaretOmråde_ID + "', '" + Plats + "')";

                    idb.insert(nyPlats);

                    JOptionPane.showMessageDialog(null, "Platsen du angav fanns inte sen tidigare och har nu registreras, tryck registrera igen för att lägga till alien!");
                }

                String worm = "Worm";
                String squid = "Squid";
                String boglodite = "Boglodite";

                if (cmbRas.getSelectedItem().equals(worm)) {
                    String ras1 = "INSERT INTO mibdb.Worm (Alien_ID) VALUES ('" + ID + "')";
                    idb.insert(ras1);
                }

                if (cmbRas.getSelectedItem().equals(squid)) {
                    String ras2 = "INSERT INTO mibdb.Squid (Alien_ID, Antal_Armar) VALUES ('" + ID + "', '" + antalArmar + "')";
                    idb.insert(ras2);
                }

                if (cmbRas.getSelectedItem().equals(boglodite)) {
                    String ras3 = "INSERT INTO mibdb.Boglodite (Alien_ID, Antal_Boogies) VALUES ('" + ID + "', '" + antalBoogies + "')";
                    idb.insert(ras3);
                }

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }

    }//GEN-LAST:event_btnRegistreraActionPerformed
    }

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // TODO add your handling code here:
        new Inloggtvå(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnHämtaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaIdActionPerformed
        // TODO add your handling code here:
        try {
            String fråga = "SELECT max(Alien_ID) FROM mibdb.Alien";

            String svar1 = idb.fetchSingle(fråga);

            int svaret = Integer.parseInt(svar1);
            int resultat = svaret + 1;
            String slutResultat = Integer.toString(resultat);

            lblID.setText(slutResultat);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnHämtaIdActionPerformed

    private void cmbRasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRasItemStateChanged
        // TODO add your handling code here:
        String vald = cmbRas.getSelectedItem().toString();

        txtAntalArmar.setVisible(false);
        txtAntaBoogies.setVisible(false);
        lblAntaBoogies.setVisible(false);
        lblAngeArmar.setVisible(false);

        if (vald.equals("Squid")) {

            try {
                txtAntalArmar.setVisible(true);
                lblAngeArmar.setVisible(true);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        if (vald.equals("Boglodite")) {

            try {
                txtAntaBoogies.setVisible(true);
                lblAntaBoogies.setVisible(true);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_cmbRasItemStateChanged

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
            java.util.logging.Logger.getLogger(NyregistreraAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NyregistreraAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NyregistreraAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NyregistreraAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnHämtaId;
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cmbOmråde;
    private javax.swing.JComboBox<String> cmbRas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAktuellPlats;
    private javax.swing.JLabel lblAlienID;
    private javax.swing.JLabel lblAngeArmar;
    private javax.swing.JLabel lblAnsvarigAgent;
    private javax.swing.JLabel lblAntaBoogies;
    private javax.swing.JLabel lblFyllRutor;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLösenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblPlatsIOmråde;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JTextField txtAnsvarigagent;
    private javax.swing.JTextField txtAntaBoogies;
    private javax.swing.JTextField txtAntalArmar;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtPlats;
    private javax.swing.JTextField txtRegistreringsdatum;
    private javax.swing.JTextField txtTelefon;
    private javax.swing.JTextField txtlösenord;
    // End of variables declaration//GEN-END:variables
}
