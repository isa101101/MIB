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

    /**
     * Creates new form AgentMenu
     */
    public AgentMenu() {
        initComponents();
    }

    AgentMenu(InfDB idb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        lblTopplista = new javax.swing.JLabel();
        LblUtrustning = new javax.swing.JLabel();
        btnKlickaHärÄndraLösenord = new javax.swing.JButton();
        btnKlickaHärNyregAlien = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnKlickaHärÄndraInfoAlien = new javax.swing.JButton();
        btnKlickaHärListaRas = new javax.swing.JButton();
        btnKlickaHärAlienRegDatum = new javax.swing.JButton();
        btnKlickaHärAlienPlatser = new javax.swing.JButton();
        btnKlickaHärUtrustning = new javax.swing.JButton();
        btnNyregUtrustning = new javax.swing.JButton();
        btnKlickaHärOmrådeschefer = new javax.swing.JButton();
        btnTopplista = new javax.swing.JButton();

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
        lblVälkommenRubrik.setText("Välkommen Angentensnamn!");

        lblÄndraLösenordLänk.setText("Ändra lösenord");

        lblNyregAlienLänk.setText("Nyregistrera aliens");

        lblÄndraInfoAlienLänk.setText("Ändra information om alien");

        lblAlienOlikaPlatser.setText("Alien på olika platser");

        lblListaRasAlien.setText("Lista av ras på alien");

        lblAlienRegTvåDatum.setText("Alien registrerade mellan två datum");

        lblNyregUtrustning.setText("Registrera ny utrustning");

        jLabel10.setText("Sök information om alien");

        lblOmrådeschefer.setText("Områdeschefer");

        lblTopplista.setText("Topplista (topp 3) agenter med flest aliens");

        LblUtrustning.setText("Min utrustning");

        btnKlickaHärÄndraLösenord.setText("Klicka här");

        btnKlickaHärNyregAlien.setText("Klicka här");

        jButton3.setText("Klicka här");

        btnKlickaHärÄndraInfoAlien.setText("Klicka här");

        btnKlickaHärListaRas.setText("Klicka här");

        btnKlickaHärAlienRegDatum.setText("Klicka här");

        btnKlickaHärAlienPlatser.setText("Klicka här");

        btnKlickaHärUtrustning.setText("Klicka här");

        btnNyregUtrustning.setText("Klicka här");
        btnNyregUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyregUtrustningActionPerformed(evt);
            }
        });

        btnKlickaHärOmrådeschefer.setText("Klicka här");

        btnTopplista.setText("Klicka här");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblUtrustning)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKlickaHärUtrustning))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTopplista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTopplista))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblÄndraInfoAlienLänk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKlickaHärÄndraInfoAlien))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNyregAlienLänk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKlickaHärNyregAlien))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblÄndraLösenordLänk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKlickaHärÄndraLösenord))
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblListaRasAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKlickaHärListaRas))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblAlienRegTvåDatum)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnKlickaHärAlienRegDatum))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblVälkommenRubrik)
                            .addGap(166, 166, 166)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNyregUtrustning)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnNyregUtrustning))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblAlienOlikaPlatser)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnKlickaHärAlienPlatser))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblOmrådeschefer)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnKlickaHärOmrådeschefer))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblVälkommenRubrik)
                .addGap(18, 18, 18)
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
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblÄndraInfoAlienLänk)
                    .addComponent(btnKlickaHärÄndraInfoAlien))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblListaRasAlien)
                    .addComponent(btnKlickaHärListaRas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlienRegTvåDatum)
                    .addComponent(btnKlickaHärAlienRegDatum))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTopplista)
                    .addComponent(btnTopplista))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNyregUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyregUtrustningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNyregUtrustningActionPerformed

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
    private javax.swing.JButton btnKlickaHärAlienPlatser;
    private javax.swing.JButton btnKlickaHärAlienRegDatum;
    private javax.swing.JButton btnKlickaHärListaRas;
    private javax.swing.JButton btnKlickaHärNyregAlien;
    private javax.swing.JButton btnKlickaHärOmrådeschefer;
    private javax.swing.JButton btnKlickaHärUtrustning;
    private javax.swing.JButton btnKlickaHärÄndraInfoAlien;
    private javax.swing.JButton btnKlickaHärÄndraLösenord;
    private javax.swing.JButton btnNyregUtrustning;
    private javax.swing.JButton btnTopplista;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel lblTopplista;
    private javax.swing.JLabel lblVälkommenRubrik;
    private javax.swing.JLabel lblÄndraInfoAlienLänk;
    private javax.swing.JLabel lblÄndraLösenordLänk;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    // End of variables declaration//GEN-END:variables
}
