/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpane_confirmdialog;

import javax.swing.JOptionPane;

/**
 *
 * @author juanm
 */
public class JOptionPane_ConfirmDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variable
        int opcion = JOptionPane.showConfirmDialog(null, "Elige una opcion", "Opciones disponibles", 1, 0);
        
        System.out.println(opcion);
        
        if(opcion == 0){
            System.out.println("Elegiste la opcion YES");
        } else if(opcion == 1){
            System.out.println("Elegiste la opcion NO");
        } else if(opcion == 2){
            System.out.println("Elegiste la opcion CANCEL");
        }
        }
    }
    
}
