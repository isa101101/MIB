/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;



/**
 *
 * @author isabellefredriksson
 */
public class SökPåAlien extends javax.swing.JFrame {
    
    private InfDB idb;

    /**
     * Creates new form SökPåAlien
     */
    public SökPåAlien(InfDB idb) {
        this.idb = idb;
        initComponents();
        
        txtID.setVisible(false);
        btnSök2.setVisible(false);
        taResultat.setVisible(false);
        lbl1.setVisible(false);
        lbl2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        lblSökEfterAlien = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        lblAngeAliensNamn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAliensID = new javax.swing.JLabel();
        lblResultat = new javax.swing.JLabel();
        lblRegDatum = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblPlats = new javax.swing.JLabel();
        lblAnsvarigAgent = new javax.swing.JLabel();
        txtAID = new javax.swing.JTextField();
        txtRegdatum = new javax.swing.JTextField();
        txtalienNamn = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtPlats = new javax.swing.JTextField();
        txtAnsvarig = new javax.swing.JTextField();
        btnSök = new javax.swing.JButton();
        txtTillbaka = new javax.swing.JButton();
        lblLösenord = new javax.swing.JLabel();
        txtLösenord = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtRas = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        taResultat = new javax.swing.JTextArea();
        lbl1 = new javax.swing.JLabel();
        btnSök2 = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSökEfterAlien.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblSökEfterAlien.setText("Sök efter aliens");

        txtNamn.setColumns(10);

        lblAngeAliensNamn.setText("Ange aliens namn:");

        lblAliensID.setText("Alien-ID:");

        lblResultat.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblResultat.setText("Resultat:");

        lblRegDatum.setText("Registreringsdatum:");

        lblNamn.setText("Namn:");

        lblTelefon.setText("Telefon:");

        lblPlats.setText("Plats:");

        lblAnsvarigAgent.setText("Ansvarig agent:");

        txtAID.setColumns(10);

        txtRegdatum.setColumns(10);

        txtalienNamn.setColumns(10);

        txtTelefon.setColumns(10);

        txtPlats.setColumns(10);

        txtAnsvarig.setColumns(10);

        btnSök.setText("Sök");
        btnSök.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSökActionPerformed(evt);
            }
        });

        txtTillbaka.setText("Tillbaka");
        txtTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTillbakaActionPerformed(evt);
            }
        });

        lblLösenord.setText("Lösenord");

        txtLösenord.setColumns(10);

        jLabel1.setText("Ras");

        txtRas.setColumns(10);

        taResultat.setColumns(20);
        taResultat.setRows(5);
        jScrollPane2.setViewportView(taResultat);

        lbl1.setText("Det finnns fler Aliens med namnet ");

        btnSök2.setText("Sök");
        btnSök2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSök2ActionPerformed(evt);
            }
        });

        txtID.setColumns(10);

        lbl2.setText("Välj ID för Alien med namnet ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(694, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(302, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTillbaka)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblRegDatum)
                                            .addComponent(lblNamn)
                                            .addComponent(lblTelefon)
                                            .addComponent(lblPlats)
                                            .addComponent(lblAnsvarigAgent)
                                            .addComponent(jLabel1))
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblLösenord)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtalienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAnsvarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRegdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLösenord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSökEfterAlien)
                                    .addComponent(lblAngeAliensNamn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(btnSök))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl1))
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAliensID)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSök2)
                                    .addComponent(txtAID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(lblResultat)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblSökEfterAlien)
                .addGap(18, 18, 18)
                .addComponent(lblAngeAliensNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSök))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSök2))
                .addGap(18, 18, 18)
                .addComponent(lblResultat)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAliensID, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblLösenord)
                                .addGap(6, 6, 6))
                            .addComponent(txtLösenord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRegDatum)
                            .addComponent(txtRegdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNamn)
                            .addComponent(txtalienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefon)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlats)
                            .addComponent(txtPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAnsvarigAgent)
                            .addComponent(txtAnsvarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addComponent(txtRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addComponent(txtTillbaka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSökActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSökActionPerformed
        // TODO add your handling code here:

        String Namn = txtNamn.getText();

        try {
       

            String frågaA = "SELECT Alien_ID FROM mibdb.Alien where Namn = '" + Namn + "'";
            
            String svaret = idb.fetchSingle(frågaA);
            
            if (svaret == null){
                JOptionPane.showMessageDialog(null, "Det finns ingen alien med namnet '" + Namn + "'");
            }
            

            ArrayList<String> svarA = idb.fetchColumn(frågaA);

            for (String ID : svarA) {
                

                if (svarA.size() > 1) {
                   
                    taResultat.setText("");
                    txtID.setVisible(true);
                    btnSök2.setVisible(true);
                    taResultat.setVisible(true);
                    lbl1.setVisible(true);
                    lbl2.setVisible(true);
                    
                     taResultat.append(ID + "\n");
                    
     
                } else if (svarA.size() == 1) {

                    String fråga1 = "SELECT Alien_ID FROM mibdb.Alien where Namn = '" + Namn + "'";
                    String fråga2 = "SELECT Registreringsdatum FROM mibdb.Alien where Namn = '" + Namn + "'";
                    String fråga3 = "SELECT Namn FROM mibdb.Alien where Namn = '" + Namn + "'";
                    String fråga4 = "SELECT Telefon FROM mibdb.Alien where Namn = '" + Namn + "'";
                    String fråga5 = "SELECT mibdb.Plats.Benamning FROM mibdb.Plats "
                            + "JOIN mibdb.Alien ON mibdb.Plats.Plats_ID = mibdb.Alien.Plats "
                            + "WHERE mibdb.Alien.Namn = '" + Namn + "'";
                    String fråga6 = "SELECT mibdb.Agent.namn FROM mibdb.Agent "
                            + "JOIN mibdb.Alien ON mibdb.Agent.Agent_ID = mibdb.Alien.Ansvarig_Agent "
                            + "WHERE mibdb.Alien.Namn = '" + Namn + "'";
                    String fråga7 = "SELECT mibdb.Alien.Losenord FROM mibdb.Alien where Alien_ID = '" + ID + "'";

                    String svar1 = idb.fetchSingle(fråga1);
                    String svar2 = idb.fetchSingle(fråga2);
                    String svar3 = idb.fetchSingle(fråga3);
                    String svar4 = idb.fetchSingle(fråga4);
                    String svar5 = idb.fetchSingle(fråga5);
                    String svar6 = idb.fetchSingle(fråga6);
                     String svar7 = idb.fetchSingle(fråga7);

                    txtAID.setText(svar1);
                    txtRegdatum.setText(svar2);
                    txtalienNamn.setText(svar3);
                    txtTelefon.setText(svar4);
                    txtPlats.setText(svar5);
                    txtAnsvarig.setText(svar6);
                    txtLösenord.setText(svar7);
                    
                    /** Pågrund av att aliens ras lagras i tre olika tabell och inte refereras i alien tabell
                    * ställs tre frågor nedan med hjälp av villkor för att hitta vilken ras alien har
                    * Om alien inte har någon angiven ras så kommer det generera null på alla frågor och där med 
                    * göra det som står i sista else-satsen, alltså skriva ut att alien inte har någon ras.
                    */
                    
                    String fråga8 = "SELECT mibdb.Worm.Alien_ID from mibdb.Worm WHERE Alien_ID = '"+svar1+"'";
                    
                    String svar8 = idb.fetchSingle(fråga8);
                    
                    if(svar8 == null)
                    {
                        String fråga9 = "SELECT mibdb.Squid.Alien_ID from mibdb.Squid WHERE Alien_ID = '"+svar1+"'";
                        
                        String svar9 = idb.fetchSingle(fråga9);
                        
                        if (svar9 == null)
                        {
                            String fråga10 = "SELECT mibdb.Boglodite.Alien_ID from mibdb.Boglodite WHERE Alien_ID = '"+svar1+"'";
                            
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
                        

                     txtLösenord.setText(svar7);


                } 

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

     
    }//GEN-LAST:event_btnSökActionPerformed

    private void txtTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTillbakaActionPerformed
        // TODO add your handling code here:
        
        new AgentMenu(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_txtTillbakaActionPerformed

    private void btnSök2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSök2ActionPerformed
        // TODO add your handling code here:
    
        String ID = txtID.getText();
        
        try {

        String fråga1 = "SELECT Alien_ID FROM mibdb.Alien where Alien_ID = '" + ID + "'";
        String fråga2 = "SELECT Registreringsdatum FROM mibdb.Alien where Alien_ID = '" + ID + "'";
        String fråga3 = "SELECT Namn FROM mibdb.Alien where Alien_ID = '" + ID + "'";
        String fråga4 = "SELECT Telefon FROM mibdb.Alien where Alien_ID = '" + ID + "'";
        String fråga5 = "SELECT mibdb.Plats.Benamning FROM mibdb.Plats "
                + "JOIN mibdb.Alien ON mibdb.Plats.Plats_ID = mibdb.Alien.Plats "
                + "WHERE mibdb.Alien.Alien_ID = '" + ID + "'";
        String fråga6 = "SELECT mibdb.Agent.namn FROM mibdb.Agent "
                + "JOIN mibdb.Alien ON mibdb.Agent.Agent_ID = mibdb.Alien.Ansvarig_Agent "
                + "WHERE mibdb.Alien.Alien_ID = '" + ID + "'";
        String fråga7 = "SELECT mibdb.Alien.Losenord FROM mibdb.Alien where Alien_ID = '" + ID + "'";

        String svar1 = idb.fetchSingle(fråga1);
        String svar2 = idb.fetchSingle(fråga2);
        String svar3 = idb.fetchSingle(fråga3);
        String svar4 = idb.fetchSingle(fråga4);
        String svar5 = idb.fetchSingle(fråga5);
        String svar6 = idb.fetchSingle(fråga6);
        String svar7 = idb.fetchSingle(fråga7);

        txtAID.setText(svar1);
        txtRegdatum.setText(svar2);
        txtalienNamn.setText(svar3);
        txtTelefon.setText(svar4);
        txtPlats.setText(svar5);
        txtAnsvarig.setText(svar6);
        txtLösenord.setText(svar7);
        
        String fråga8 = "SELECT mibdb.Worm.Alien_ID from mibdb.Worm WHERE Alien_ID = '"+svar1+"'";
                    
                    String svar8 = idb.fetchSingle(fråga8);
                    
                    if(svar8 == null)
                    {
                        String fråga9 = "SELECT mibdb.Squid.Alien_ID from mibdb.Squid WHERE Alien_ID = '"+svar1+"'";
                        
                        String svar9 = idb.fetchSingle(fråga9);
                        
                        if (svar9 == null)
                        {
                            String fråga10 = "SELECT mibdb.Boglodite.Alien_ID from mibdb.Boglodite WHERE Alien_ID = '"+svar1+"'";
                            
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

                    

    }//GEN-LAST:event_btnSök2ActionPerformed

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
            java.util.logging.Logger.getLogger(SökPåAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SökPåAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SökPåAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SökPåAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSök;
    private javax.swing.JButton btnSök2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblAliensID;
    private javax.swing.JLabel lblAngeAliensNamn;
    private javax.swing.JLabel lblAnsvarigAgent;
    private javax.swing.JLabel lblLösenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblPlats;
    private javax.swing.JLabel lblRegDatum;
    private javax.swing.JLabel lblResultat;
    private javax.swing.JLabel lblSökEfterAlien;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JTextArea taResultat;
    private javax.swing.JTextField txtAID;
    private javax.swing.JTextField txtAnsvarig;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLösenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtPlats;
    private javax.swing.JTextField txtRas;
    private javax.swing.JTextField txtRegdatum;
    private javax.swing.JTextField txtTelefon;
    private javax.swing.JButton txtTillbaka;
    private javax.swing.JTextField txtalienNamn;
    // End of variables declaration//GEN-END:variables
}
