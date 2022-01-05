/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;
import oru.inf.InfDB;

/**
 *
 * @author jackmacbook
 */
public class AdminMenu extends javax.swing.JFrame {
    private InfDB idb;

    /**
     * Creates new form AdminMenu
     */
    public AdminMenu(InfDB idb) {
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

        lblNyalien = new javax.swing.JLabel();
        btnNyalien = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnÄndraalien = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnTabortalien = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnTabortutrustning = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnNyagent = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnSökagent = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnÄndrabefattning = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnÄndraagent = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnTabortagent = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnÄndraochef = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnÄndrakchef = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNyalien.setText("Nyregistrera alien");

        btnNyalien.setText("Tryck här");
        btnNyalien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyalienActionPerformed(evt);
            }
        });

        jLabel1.setText("Ändra alien information");

        btnÄndraalien.setText("Tryck här");
        btnÄndraalien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraalienActionPerformed(evt);
            }
        });

        jLabel2.setText("Ta bort alien");

        btnTabortalien.setText("Tryck här");
        btnTabortalien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabortalienActionPerformed(evt);
            }
        });

        jLabel3.setText("Ta bort utrustning");

        btnTabortutrustning.setText("Tryck här");
        btnTabortutrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabortutrustningActionPerformed(evt);
            }
        });

        jLabel4.setText("Nyregistrera agent");

        btnNyagent.setText("Tryck här");
        btnNyagent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyagentActionPerformed(evt);
            }
        });

        jLabel5.setText("Sök agent information");

        btnSökagent.setText("Tryck här");
        btnSökagent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSökagentActionPerformed(evt);
            }
        });

        jLabel6.setText("Ändra agent befattning");

        btnÄndrabefattning.setText("Tryck här");
        btnÄndrabefattning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndrabefattningActionPerformed(evt);
            }
        });

        jLabel7.setText("Ändra agent information");

        btnÄndraagent.setText("Tryck här");

        jLabel8.setText("Ta bort agent");

        btnTabortagent.setText("Tryck här");

        jLabel9.setText("Ändra områdeschef");

        btnÄndraochef.setText("Tryck här");

        jLabel10.setText("Ändra kontorschef");

        btnÄndrakchef.setText("Tryck här");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNyalien)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnÄndrakchef)
                    .addComponent(btnÄndraochef)
                    .addComponent(btnÄndraagent)
                    .addComponent(btnÄndrabefattning)
                    .addComponent(btnSökagent)
                    .addComponent(btnNyagent)
                    .addComponent(btnTabortutrustning)
                    .addComponent(btnTabortalien)
                    .addComponent(btnÄndraalien)
                    .addComponent(btnNyalien)
                    .addComponent(btnTabortagent))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyalien)
                    .addComponent(btnNyalien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnÄndraalien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnTabortalien))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnTabortutrustning))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnNyagent))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnSökagent))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnÄndrabefattning))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnÄndraagent))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnTabortagent))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnÄndraochef)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btnÄndrakchef))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNyalienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyalienActionPerformed
        // TODO add your handling code here:
        new NyregistreraAliens(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNyalienActionPerformed

    private void btnÄndraalienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraalienActionPerformed
        // TODO add your handling code here:
        new ÄndraAlien(idb).setVisible(true);
         dispose();
    }//GEN-LAST:event_btnÄndraalienActionPerformed

    private void btnNyagentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyagentActionPerformed
        // TODO add your handling code here:
        new NyregistreraAgent(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNyagentActionPerformed

    private void btnTabortalienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabortalienActionPerformed
        // TODO add your handling code here:
         new RaderaAlien(idb).setVisible(true);
         dispose();
    }//GEN-LAST:event_btnTabortalienActionPerformed

    private void btnTabortutrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabortutrustningActionPerformed
        // TODO add your handling code here:
        new RaderaUtrustning(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTabortutrustningActionPerformed

    private void btnSökagentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSökagentActionPerformed
        // TODO add your handling code here:
        new SökPåAgent(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSökagentActionPerformed

    private void btnÄndrabefattningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndrabefattningActionPerformed
        // TODO add your handling code here:
        new ÄndraAgentBefattning(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnÄndrabefattningActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNyagent;
    private javax.swing.JButton btnNyalien;
    private javax.swing.JButton btnSökagent;
    private javax.swing.JButton btnTabortagent;
    private javax.swing.JButton btnTabortalien;
    private javax.swing.JButton btnTabortutrustning;
    private javax.swing.JButton btnÄndraagent;
    private javax.swing.JButton btnÄndraalien;
    private javax.swing.JButton btnÄndrabefattning;
    private javax.swing.JButton btnÄndrakchef;
    private javax.swing.JButton btnÄndraochef;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblNyalien;
    // End of variables declaration//GEN-END:variables
}
