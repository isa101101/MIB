/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;


/**
 *
 * @author jackmacbook
 */
public class Validering extends javax.swing.JFrame {

    private InfDB idb;

    public Validering(InfDB idb) {
     
        this.idb = idb;
    }
    
    
    // Validering för att fälten inte ska vara tomma
    public static boolean textFaltVarde(JTextField ruta) {

        boolean resultat = true;

        if (ruta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ett eller flera fält är tomt");
            resultat = false;
        }

        return resultat;
    }
    

    //Validering för att telefonnummer ska anges med enbart siffror
    public static boolean textFaltNummer (JTextField ruta) {
        
        boolean resultat = true;
        
        try{
            Integer.parseInt(ruta.getText());
        }
        catch(NumberFormatException e )
        {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Det får endast vara siffror i textrutan för telefonnummer");
        }
 
        return resultat;
    }
    
    
    //Validering för att lösenord inte får vara längre än 6 tecken
    public static boolean LösenordLängd (JTextField ruta) {

        boolean resultat = true;

        if(ruta.getText().length() > 7) {
         JOptionPane.showMessageDialog(null, "Det nya lösenordet måste vara kortare än eller lika med 6 tecken!");
         

        }

        return resultat;
    }
    
}
  


   
    



