/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpane_optiondialog;

import javax.swing.JOptionPane;

/**
 *
 * @author juanm
 */
public class JOptionPane_OptionDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = JOptionPane.showOptionDialog(null, "Elige una opcion", 
                "Opciones personalizadas", 
                0, 
                1, 
                null, 
                new Object[]{"Opcion 1", "Opcion 2", "Opcion 3", "Opcion 4"}, //Definimos una matriz de objetos 
                "Opcion 1");
        
        System.out.println("La opcion elegida es: " +opcion);
    }
    
}
