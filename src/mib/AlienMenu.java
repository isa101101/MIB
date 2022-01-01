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
 * @author jackmacbook
 */
public class AlienMenu extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form AlienMenu
     */
    public AlienMenu(InfDB idb) {
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

        lblVälkommen = new javax.swing.JLabel();
        lblÄndraLösenord = new javax.swing.JLabel();
        lblområdeschef = new javax.swing.JLabel();
        btnOmrådeschef = new javax.swing.JButton();
        btnÄndraLösenord = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAliensOmråde = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblVälkommen.setText("Välkommen!");

        lblÄndraLösenord.setText("Ändra lösenord");

        lblområdeschef.setText("Visa min områdeschef");

        btnOmrådeschef.setText("Tryck här");

        btnÄndraLösenord.setText("Tryck här");
        btnÄndraLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraLösenordActionPerformed(evt);
            }
        });

        jLabel1.setText("Andra aliens i mitt område");

        btnAliensOmråde.setText("Tryck här");
        btnAliensOmråde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAliensOmrådeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblområdeschef)
                            .addComponent(lblÄndraLösenord)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnOmrådeschef)
                            .addComponent(btnÄndraLösenord)
                            .addComponent(btnAliensOmråde, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lblVälkommen)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVälkommen)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblÄndraLösenord)
                    .addComponent(btnÄndraLösenord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnAliensOmråde))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblområdeschef)
                    .addComponent(btnOmrådeschef))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnÄndraLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraLösenordActionPerformed
        // TODO add your handling code here:
        new BytAlienLösenord(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnÄndraLösenordActionPerformed

    private void btnAliensOmrådeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAliensOmrådeActionPerformed
        // TODO add your handling code here:
        new AliensIMittOmråde(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAliensOmrådeActionPerformed

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
            java.util.logging.Logger.getLogger(AlienMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlienMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlienMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlienMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAliensOmråde;
    private javax.swing.JButton btnOmrådeschef;
    private javax.swing.JButton btnÄndraLösenord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblVälkommen;
    private javax.swing.JLabel lblområdeschef;
    private javax.swing.JLabel lblÄndraLösenord;
    // End of variables declaration//GEN-END:variables
}
