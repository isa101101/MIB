/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import java.awt.event.KeyEvent;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
/**
 *
 * @author jackmacbook
 */
public class Inloggtvå extends javax.swing.JFrame {
    
    private InfDB idb;
    

    /**
     * Creates new form Inloggtvå
     */
    public Inloggtvå(InfDB idb) {
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

        txtAnvändarnamn = new javax.swing.JTextField();
        txtLösenord = new javax.swing.JPasswordField();
        lblRubrik = new javax.swing.JLabel();
        btnLoggain = new javax.swing.JButton();
        cmbBefattning = new javax.swing.JComboBox<>();
        lblBefattning = new javax.swing.JLabel();
        lblAnvändarnamn = new javax.swing.JLabel();
        lblLösenord = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAnvändarnamn.setColumns(7);

        txtLösenord.setColumns(7);
        txtLösenord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLösenordKeyPressed(evt);
            }
        });

        lblRubrik.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblRubrik.setText("Logga in");

        btnLoggain.setText("Logga in");
        btnLoggain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggainActionPerformed(evt);
            }
        });

        cmbBefattning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agent", "Alien", "Admin" }));

        lblBefattning.setText("Välj befattning");

        lblAnvändarnamn.setText("Användarnamn");

        lblLösenord.setText("Lösenord");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAnvändarnamn)
                                    .addComponent(txtAnvändarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(lblLösenord)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(btnLoggain))
                    .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBefattning)
                    .addComponent(cmbBefattning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBefattning)
                .addGap(18, 18, 18)
                .addComponent(cmbBefattning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnvändarnamn)
                    .addComponent(lblLösenord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnvändarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoggain))
                .addContainerGap(256, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public String getAnvändare() {
        
    String Användare = txtAnvändarnamn.getText();
    Användare.toString();
    
    return Användare;
    
    }
    
    private void btnLoggainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggainActionPerformed
        // TODO add your handling code here:
        
         if(Validering.textFaltVarde(txtAnvändarnamn) && Validering.textFaltVarde(txtLösenord) ) {
             try {
        String användarnamn = txtAnvändarnamn.getText();
        String lösenord = txtLösenord.getText();
        
        String fråga1 = "SELECT Namn FROM mibdb.Agent WHERE Namn = '" +användarnamn+ "'";
        String fråga2 = "SELECT Losenord FROM mibdb.Agent WHERE Losenord = '" +lösenord+ "'";
        String fråga3 = "SELECT Namn FROM mibdb.Alien WHERE Namn = '" +användarnamn+ "'";
        String fråga4 = "SELECT Losenord FROM mibdb.Alien WHERE Losenord = '" +lösenord+ "'";
        String fråga5 = "SELECT Namn FROM mibdb.Agent WHERE administrator = 'j' ";
               
        String svar1 = idb.fetchSingle(fråga1);
        String svar2 = idb.fetchSingle(fråga2);
        String svar3 = idb.fetchSingle(fråga3);
        String svar4 = idb.fetchSingle(fråga4);
        String svar5 = idb.fetchSingle(fråga5);
        
        String Resultat1 = svar1;
        String Resultat2 = svar2;
        String Resultat3 = svar3;
        String Resultat4 = svar4;
        String Resultat5 = svar5;
        
        String Agent = "Agent";
        String Alien = "Alien";
        String Admin = "Admin";
        
       
        
       
        if(cmbBefattning.getSelectedItem().equals(Agent) && txtAnvändarnamn.getText().equalsIgnoreCase(Resultat1) && txtLösenord.getText().equals(Resultat2)){
            new AgentMenu(idb).setVisible(true);
            dispose();
        }    
        else if (cmbBefattning.getSelectedItem().equals(Alien) && txtAnvändarnamn.getText().equalsIgnoreCase(Resultat3) && txtLösenord.getText().equals(Resultat4)) {
            new AlienMenu(idb).setVisible(true);
            dispose();   
         }
        else if (cmbBefattning.getSelectedItem().equals(Admin) && txtAnvändarnamn.getText().equalsIgnoreCase(Resultat1) && txtLösenord.getText().equals(Resultat2) && txtAnvändarnamn.getText().equalsIgnoreCase(Resultat5)) {
            new AdminMenu(idb).setVisible(true);
            dispose(); 
        } 
        
        else if (cmbBefattning.getSelectedItem().equals(Admin) && txtAnvändarnamn.getText() != (Resultat5)) {
            JOptionPane.showMessageDialog(null, "Agenten är ej behörig ");
            
        }
         else {
            
        JOptionPane.showMessageDialog(null, "Fel Användarnamn eller Lösenord");
            
        }
    
     
            //if (txtMedlem.equals(svar)){
        }catch (InfException e) {
           System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnLoggainActionPerformed
    }     
    private void txtLösenordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLösenordKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
        if (Validering.textFaltVarde(txtAnvändarnamn) && Validering.textFaltVarde(txtLösenord)) {   
            
        }
            try {
        String användarnamn = txtAnvändarnamn.getText();
        String lösenord = txtLösenord.getText();
        
        String fråga1 = "SELECT Namn FROM mibdb.Agent WHERE Namn = '" +användarnamn+ "'";
        String fråga2 = "SELECT Losenord FROM mibdb.Agent WHERE Losenord = '" +lösenord+ "'";
        String fråga3 = "SELECT Namn FROM mibdb.Alien WHERE Namn = '" +användarnamn+ "'";
        String fråga4 = "SELECT Losenord FROM mibdb.Alien WHERE Losenord = '" +lösenord+ "'";
        String fråga5 = "SELECT Namn FROM mibdb.Agent WHERE administrator = 'j' ";
        
        String svar1 = idb.fetchSingle(fråga1);
        String svar2 = idb.fetchSingle(fråga2);
        String svar3 = idb.fetchSingle(fråga3);
        String svar4 = idb.fetchSingle(fråga4);
        String svar5 = idb.fetchSingle(fråga5);
        
        String Resultat1 = svar1;
        String Resultat2 = svar2;
        String Resultat3 = svar3;
        String Resultat4 = svar4;
        String Resultat5 = svar5;
         
        String Agent = "Agent";
        String Alien = "Alien";
        String Admin = "Admin";
        
        if(cmbBefattning.getSelectedItem().equals(Agent) && txtAnvändarnamn.getText().equalsIgnoreCase(Resultat1) && txtLösenord.getText().equals(Resultat2)){
            new AgentMenu(idb).setVisible(true);
            dispose();
        }    
        else if (cmbBefattning.getSelectedItem().equals(Alien) && txtAnvändarnamn.getText().equalsIgnoreCase(Resultat3) && txtLösenord.getText().equals(Resultat4)) {
            new AlienMenu(idb).setVisible(true);
            dispose();   
         }
        else if (cmbBefattning.getSelectedItem().equals(Admin) && txtAnvändarnamn.getText().equalsIgnoreCase(Resultat1) && txtLösenord.getText().equals(Resultat2) && txtAnvändarnamn.getText().equalsIgnoreCase(Resultat5)) {
            new AdminMenu(idb).setVisible(true);
            dispose(); 
        } 
        
        else if (cmbBefattning.getSelectedItem().equals(Admin) && txtAnvändarnamn.getText() != (Resultat5)) {
            JOptionPane.showMessageDialog(null, "Agenten är ej behörig ");
            
        }
        

        else {
            
        JOptionPane.showMessageDialog(null, "Fel Användarnamn eller Lösenordet ");
            
        }
    
     
            //if (txtMedlem.equals(svar)){
        }catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_txtLösenordKeyPressed
    }
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
            java.util.logging.Logger.getLogger(Inloggtvå.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inloggtvå.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inloggtvå.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inloggtvå.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggain;
    private javax.swing.JComboBox<String> cmbBefattning;
    private javax.swing.JLabel lblAnvändarnamn;
    private javax.swing.JLabel lblBefattning;
    private javax.swing.JLabel lblLösenord;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JTextField txtAnvändarnamn;
    private javax.swing.JPasswordField txtLösenord;
    // End of variables declaration//GEN-END:variables
}
