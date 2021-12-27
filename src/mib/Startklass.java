/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


/**
 *
 * @author jackmacbook
 */
public class Startklass {

    private static InfDB idb;

    public static void main(String[] args) {
        try {
            idb = new InfDB("mibdb", "3306", "root", "McCarthy2018");
            System.out.println("funka");
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());

        }
        
        new Inloggning(idb).setVisible(true);

    }

}
