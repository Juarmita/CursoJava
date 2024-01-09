/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpane_messagedialog;

import javax.swing.JOptionPane;

/**
 *
 * @author juanm
 */
public class JOptionPane_MessageDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pedimos datos por teclado
        String texto = JOptionPane.showInputDialog("Introduce un texto: ");
        JOptionPane.showMessageDialog(null, texto);
        
        //Con conversion
        String numeroTexto = JOptionPane.showInputDialog("Introduce un Texto: ");
        int numero = Integer.parseInt(numeroTexto);
        JOptionPane.showMessageDialog(null, numero);
        
    }
    
}
