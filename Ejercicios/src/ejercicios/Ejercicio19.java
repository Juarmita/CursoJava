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
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejercicio 19
            ------------
            Calcular el factorial de un número pedido por
            teclado
        */
        //Declaracion de variables
        int numero = 0;
        double factorial = 1;
        
        //Logica del programa
        //En este caso vamos a realizarlo con JOptionPane
        String entrada = JOptionPane.showInputDialog("Introduzca el numero: ");
        numero = Integer.parseInt(entrada);
        
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
            
        System.out.println("Factorial de: "+factorial);
    }
    
}
