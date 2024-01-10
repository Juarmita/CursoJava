/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author juanm
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejercicio 4
            -----------
            Crea una aplicación que nos pida el nombre
            que queremos introducir(usar JOptionPane) y
            que lo muestre por pantalla, también con JOptionPane
        */
        
        //Declaramos una variable string y le asignamos el valor que el usuario introduzca
        String nombre = JOptionPane.showInputDialog("Introduzca su nombre: ");
        //Mostamos por pantalla la variable nombre que el usuario ha introducido
        JOptionPane.showMessageDialog(null,"Bienvenido: "+nombre);
        
        
    }
    
}
