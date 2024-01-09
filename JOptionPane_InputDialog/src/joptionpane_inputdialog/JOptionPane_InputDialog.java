/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpane_inputdialog;

import javax.swing.JOptionPane;

/**
 *
 * @author juanm
 */
public class JOptionPane_InputDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        String variable = "";//Declaracion de variable donde vamos a guardar los datos
        //Leer un texto con JOptionPane
        variable = JOptionPane.showInputDialog(null, "Introduce un texto", "Lector", 1);
        System.out.println(variable);
        
        //Leer un numero con JOptionPane
        String numeroTexto = JOptionPane.showInputDialog("Introduce un numero");
        int numero = Integer.parseInt(numeroTexto);//Hacemos conversion a string
        System.out.println(numero);
        
        //Forma de reducir todo a una linea
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
        System.out.println(numero2);
    }
    
}
