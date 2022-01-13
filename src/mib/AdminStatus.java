/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 *
 * @author jackmacbook
 */
public class AdminStatus extends javax.swing.JFrame {
    private InfDB idb;

    /**
     * Creates new form AdminStatus
     */
    public AdminStatus(InfDB idb) {
        this.idb=idb;
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

        lblRubrik = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        cmbJa = new javax.swing.JComboBox<>();
        btnÄndra = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrik.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblRubrik.setText("Ändra administratörsstatus på en agent");

        lblNamn.setText("Ange namn");

        txtNamn.setColumns(10);

        lblStatus.setText("Ange status");

        lblAdmin.setText("Admin");

        cmbJa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nej", "Ja" }));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblRubrik)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblStatus)
                            .addGap(117, 117, 117)
                            .addComponent(lblAdmin))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNamn)
                            .addGap(60, 60, 60)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnÄndra)
                        .addGap(125, 125, 125)
                        .addComponent(btnTillbaka)
                        .addGap(48, 48, 48)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbJa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblRubrik)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamn)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(lblAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbJa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnÄndra)
                    .addComponent(btnTillbaka))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed
//Metod för att ändra vilka agenter som är admin

        if (Validering.textFaltVarde(txtNamn)) {
            try {
                //Lokala variabler som hämtar fältens värden
                String Namn = txtNamn.getText();
                String fråga = "SELECT mibdb.Agent.Namn from mibdb.Agent where Namn = '" + Namn + "'";
                String Status = cmbJa.getSelectedItem().toString();

                //Lokala variabler för att använda nedan i metoden equals
                String Ja = "Ja";
                String Nej = "Nej";

                //SQL-frågorna som ställs för att uppdatera rätt tabell
                String förändringJa = "UPDATE mibdb.Agent SET mibdb.Agent.Administrator  = 'J' WHERE mibdb.Agent.Namn= '" + Namn + "'";
                String förändringNej = "UPDATE mibdb.Agent SET mibdb.Agent.Administrator  = 'N' WHERE mibdb.Agent.Namn= '" + Namn + "'";

                String svar = idb.fetchSingle(fråga);

                //Kontroll att agenten finns
                if (Namn.equalsIgnoreCase(svar)) {
                    
                    if (Status.equals(Ja)) {
                        idb.update(förändringJa); //Uppdatera status till Ja
                        JOptionPane.showMessageDialog(null, "" + Namn + " är nu administratör");
                    }
                    if (Status.equals(Nej)) {
                        idb.update(förändringNej); //Uppdatera status till nej
                        JOptionPane.showMessageDialog(null, "" + Namn + " är inte längre administratör");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Agent '" + Namn + "' finns inte");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }


    }//GEN-LAST:event_btnÄndraActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new AdminMenu(idb).setVisible(true);
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
            java.util.logging.Logger.getLogger(AdminStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnÄndra;
    private javax.swing.JComboBox<String> cmbJa;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtNamn;
    // End of variables declaration//GEN-END:variables
}
