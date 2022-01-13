/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import oru.inf.InfDB;

/**
 *
 * @author isabellefredriksson
 */
public class AgentMenu extends javax.swing.JFrame {
    
    private InfDB idb;

    /**
     * Creates new form AgentMenu
     */
    public AgentMenu(InfDB idb) {
        initComponents();
        this.idb = idb;
        
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup3 = new javax.swing.ButtonGroup();
        lblVälkommenRubrik = new javax.swing.JLabel();
        lblÄndraLösenordLänk = new javax.swing.JLabel();
        lblNyregAlienLänk = new javax.swing.JLabel();
        lblÄndraInfoAlienLänk = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblAlienOlikaPlatser = new javax.swing.JLabel();
        lblListaRasAlien = new javax.swing.JLabel();
        lblAlienRegTvåDatum = new javax.swing.JLabel();
        lblNyregUtrustning = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblOmrådeschefer = new javax.swing.JLabel();
        LblUtrustning = new javax.swing.JLabel();
        btnKlickaHärÄndraLösenord = new javax.swing.JButton();
        btnKlickaHärNyregAlien = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnKlickaHärÄndraInfoAlien = new javax.swing.JButton();
        btnKlickaHärListaRas = new javax.swing.JButton();
        btnKlickaHärAlienRegDatum = new javax.swing.JButton();
        btnKlickaHärAlienPlatser = new javax.swing.JButton();
        btnKlickaHärUtrustning = new javax.swing.JButton();
        btnNyregUtrustning = new javax.swing.JButton();
        btnKlickaHärOmrådeschefer = new javax.swing.JButton();
        btnLoggaUT = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblVälkommenRubrik.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblVälkommenRubrik.setText("Välkommen!");

        lblÄndraLösenordLänk.setText("Ändra lösenord");

        lblNyregAlienLänk.setText("Nyregistrera aliens");

        lblÄndraInfoAlienLänk.setText("Ändra information om alien");

        lblAlienOlikaPlatser.setText("Visa Aliens på viss plats");

        lblListaRasAlien.setText("Lista av ras på alien");

        lblAlienRegTvåDatum.setText("Alien registrerade mellan två datum");

        lblNyregUtrustning.setText("Registrera ny utrustning");

        jLabel10.setText("Sök information om alien");

        lblOmrådeschefer.setText("Områdeschefer");

        LblUtrustning.setText("Min utrustning");

        btnKlickaHärÄndraLösenord.setText("Klicka här");
        btnKlickaHärÄndraLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKlickaHärÄndraLösenordActionPerformed(evt);
            }
        });

        btnKlickaHärNyregAlien.setText("Klicka här");
        btnKlickaHärNyregAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKlickaHärNyregAlienActionPerformed(evt);
            }
        });

        btnInfo.setText("Klicka här");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnKlickaHärÄndraInfoAlien.setText("Klicka här");
        btnKlickaHärÄndraInfoAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKlickaHärÄndraInfoAlienActionPerformed(evt);
            }
        });

        btnKlickaHärListaRas.setText("Klicka här");
        btnKlickaHärListaRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKlickaHärListaRasActionPerformed(evt);
            }
        });

        btnKlickaHärAlienRegDatum.setText("Klicka här");
        btnKlickaHärAlienRegDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKlickaHärAlienRegDatumActionPerformed(evt);
            }
        });

        btnKlickaHärAlienPlatser.setText("Klicka här");
        btnKlickaHärAlienPlatser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKlickaHärAlienPlatserActionPerformed(evt);
            }
        });

        btnKlickaHärUtrustning.setText("Klicka här");
        btnKlickaHärUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKlickaHärUtrustningActionPerformed(evt);
            }
        });

        btnNyregUtrustning.setText("Klicka här");
        btnNyregUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyregUtrustningActionPerformed(evt);
            }
        });

        btnKlickaHärOmrådeschefer.setText("Klicka här");
        btnKlickaHärOmrådeschefer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKlickaHärOmrådescheferActionPerformed(evt);
            }
        });

        btnLoggaUT.setText("Logga ut");
        btnLoggaUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblÄndraLösenordLänk)
                                        .addGap(134, 134, 134)
                                        .addComponent(btnKlickaHärÄndraLösenord))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNyregAlienLänk)
                                        .addGap(112, 112, 112)
                                        .addComponent(btnKlickaHärNyregAlien))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(71, 71, 71)
                                        .addComponent(btnInfo)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblÄndraInfoAlienLänk)
                                        .addComponent(lblListaRasAlien))
                                    .addGap(57, 57, 57)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnKlickaHärListaRas)
                                        .addComponent(btnKlickaHärÄndraInfoAlien))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblVälkommenRubrik)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNyregUtrustning)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(lblOmrådeschefer)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnKlickaHärOmrådeschefer))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnNyregUtrustning)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(LblUtrustning)
                                                    .addGap(143, 143, 143)
                                                    .addComponent(btnKlickaHärUtrustning)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lblAlienRegTvåDatum)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblAlienOlikaPlatser)
                                                .addGap(84, 84, 84)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnKlickaHärAlienPlatser)
                                            .addComponent(btnKlickaHärAlienRegDatum))))))))
                .addContainerGap(229, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLoggaUT)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblVälkommenRubrik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblÄndraLösenordLänk)
                            .addComponent(btnKlickaHärÄndraLösenord))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNyregAlienLänk)
                            .addComponent(btnKlickaHärNyregAlien))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(btnInfo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblÄndraInfoAlienLänk)
                            .addComponent(btnKlickaHärÄndraInfoAlien))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblListaRasAlien)
                            .addComponent(btnKlickaHärListaRas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKlickaHärAlienRegDatum)
                    .addComponent(lblAlienRegTvåDatum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlienOlikaPlatser)
                    .addComponent(btnKlickaHärAlienPlatser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblUtrustning)
                    .addComponent(btnKlickaHärUtrustning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyregUtrustning)
                    .addComponent(btnNyregUtrustning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOmrådeschefer)
                    .addComponent(btnKlickaHärOmrådeschefer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btnLoggaUT)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Metoderna nedan motsvarar knapptrycken som instansierar nya objektet från den klassen som står efter nyckelordet new
    //Genom att ange metoden dispose stängs det nuvarande fönstret
    
    private void btnNyregUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyregUtrustningActionPerformed
        new NyregistreraUtrustning(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNyregUtrustningActionPerformed

    private void btnKlickaHärÄndraLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKlickaHärÄndraLösenordActionPerformed
        new BytAgentlösen(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKlickaHärÄndraLösenordActionPerformed

    private void btnKlickaHärNyregAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKlickaHärNyregAlienActionPerformed
        new NyregistreraAliens(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKlickaHärNyregAlienActionPerformed

    private void btnKlickaHärÄndraInfoAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKlickaHärÄndraInfoAlienActionPerformed
        new ÄndraAlien(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKlickaHärÄndraInfoAlienActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        new SökPåAlien(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnKlickaHärAlienPlatserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKlickaHärAlienPlatserActionPerformed
        new SökAlienPlats(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKlickaHärAlienPlatserActionPerformed

    private void btnKlickaHärAlienRegDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKlickaHärAlienRegDatumActionPerformed
        new AlienRegMellanDatum(idb).setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnKlickaHärAlienRegDatumActionPerformed

    private void btnKlickaHärUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKlickaHärUtrustningActionPerformed
        new MinUtrustning(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKlickaHärUtrustningActionPerformed

    private void btnKlickaHärOmrådescheferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKlickaHärOmrådescheferActionPerformed
        new OmrådeschefAgent(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKlickaHärOmrådescheferActionPerformed

    private void btnKlickaHärListaRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKlickaHärListaRasActionPerformed
        new ListaRas(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKlickaHärListaRasActionPerformed

    private void btnLoggaUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUTActionPerformed
        new Inloggtvå(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLoggaUTActionPerformed

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
            java.util.logging.Logger.getLogger(AgentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblUtrustning;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnKlickaHärAlienPlatser;
    private javax.swing.JButton btnKlickaHärAlienRegDatum;
    private javax.swing.JButton btnKlickaHärListaRas;
    private javax.swing.JButton btnKlickaHärNyregAlien;
    private javax.swing.JButton btnKlickaHärOmrådeschefer;
    private javax.swing.JButton btnKlickaHärUtrustning;
    private javax.swing.JButton btnKlickaHärÄndraInfoAlien;
    private javax.swing.JButton btnKlickaHärÄndraLösenord;
    private javax.swing.JButton btnLoggaUT;
    private javax.swing.JButton btnNyregUtrustning;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAlienOlikaPlatser;
    private javax.swing.JLabel lblAlienRegTvåDatum;
    private javax.swing.JLabel lblListaRasAlien;
    private javax.swing.JLabel lblNyregAlienLänk;
    private javax.swing.JLabel lblNyregUtrustning;
    private javax.swing.JLabel lblOmrådeschefer;
    private javax.swing.JLabel lblVälkommenRubrik;
    private javax.swing.JLabel lblÄndraInfoAlienLänk;
    private javax.swing.JLabel lblÄndraLösenordLänk;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    // End of variables declaration//GEN-END:variables
}
