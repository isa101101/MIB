/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jackmacbook
 */
public class Validering {
    
public static boolean textFaltVarde(JTextField ruta) {
    
    boolean resultat = true;
    
    if (ruta.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Rutan är tom");
        resultat = false;
    }
    
       
    return resultat;        
}
}