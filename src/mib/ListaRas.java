/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.HashMap;
import java.util.ArrayList;


/**
 *
 * @author isabellefredriksson
 */
public class ListaRas extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form ListaRas
     */
    public ListaRas(InfDB idb) {
        this.idb = idb;
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

        lblRubrikListaRas = new javax.swing.JLabel();
        lblAngeRas = new javax.swing.JLabel();
        cmbValdRas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        taVisaResultat = new javax.swing.JTextArea();
        jScrollBar1 = new javax.swing.JScrollBar();
        lblResultat = new javax.swing.JLabel();
        btnSök = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrikListaRas.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblRubrikListaRas.setText("Lista på aliens av en viss ras");

        lblAngeRas.setText("Ange ras:");

        cmbValdRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Squid", "Boglodite", "Worm" }));
        cmbValdRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbValdRasActionPerformed(evt);
            }
        });

        taVisaResultat.setColumns(20);
        taVisaResultat.setRows(5);
        jScrollPane1.setViewportView(taVisaResultat);

        lblResultat.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblResultat.setText("Resultat:");

        btnSök.setText("Sök");
        btnSök.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSökActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAngeRas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbValdRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSök))
                            .addComponent(lblResultat)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblRubrikListaRas))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblRubrikListaRas)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAngeRas)
                            .addComponent(cmbValdRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSök))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(lblResultat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbValdRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbValdRasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbValdRasActionPerformed

    private void btnSökActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSökActionPerformed
        // TODO add your handling code here:
        
        taVisaResultat.setText("");
        String Ras = cmbValdRas.getSelectedItem().toString();
        
        if(Ras.equals("Worm"))
        {
            
        try{
            
        String fråga1 = "SELECT mibdb.Alien.Namn FROM Mibdb.Alien "
                + "JOIN mibdb.Worm ON mibdb.Worm.Alien_ID = mibdb.Alien.Alien_ID";
        
        ArrayList <HashMap<String,String>> svar1 = idb.fetchRows(fråga1);
        
        
        for (HashMap <String,String> Namn : svar1){
            
            taVisaResultat.append(Namn.get("Namn") + "\n");
        }
          
        }catch (Exception e) {
           System.out.println(e.getMessage());
        }
        }
        
        if(Ras.equals("Squid")) {
            
            try {
                String fråga2 = "SELECT mibdb.Alien.Namn FROM Mibdb.Alien "
                + "JOIN mibdb.Squid ON mibdb.Squid.Alien_ID = mibdb.Alien.Alien_ID";
                
                ArrayList <HashMap<String,String>> svar2 = idb.fetchRows(fråga2);
                
                for (HashMap <String,String> Namn : svar2){
                    
                    taVisaResultat.append(Namn.get("Namn") + "\n");
                }
            }catch (Exception e) {
           System.out.println(e.getMessage());
        }
            
       if (Ras.equals("Boglodite")){
           
           try{
               
           String fråga3 = "SELECT mibdb.Alien.Namn FROM Mibdb.Alien "
                + "JOIN mibdb.Boglodite ON mibdb.Boglodite.Alien_ID = mibdb.Alien.Alien_ID";
               
           ArrayList <HashMap<String,String>> svar3 = idb.fetchRows(fråga3);
           
           for (HashMap <String,String> Namn : svar3){
               
               taVisaResultat.append(Namn.get("Namn") + "\n");
           }
        
           }catch (Exception e) {
           System.out.println(e.getMessage());
           }
        }
        }
    }//GEN-LAST:event_btnSökActionPerformed

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
            java.util.logging.Logger.getLogger(ListaRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox<String> cmbValdRas;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAngeRas;
    private javax.swing.JLabel lblResultat;
    private javax.swing.JLabel lblRubrikListaRas;
    private javax.swing.JTextArea taVisaResultat;
    // End of variables declaration//GEN-END:variables
}
