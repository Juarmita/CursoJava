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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejercicio 7
            -----------
            Lee un número por teclado y muestra por
            consola, el caracter al que pertenece en
            la tabla ASCII. Por ejemplo: si introduzco
            un 51, que se muestre la letra "q".
        */
        
        //Declaracion de variables
        String numeroTexto = "";
        int numero = 0;
        char caracter;
        //Pedimos el numero por teclado
        numeroTexto = JOptionPane.showInputDialog("Introduce un numero: ");
        
        //Casting string a int
        numero = Integer.parseInt(numeroTexto);
        
        //Pasamos el codigo ASCII a char
        caracter = (char)numero;//hacemos la conversion explicita
        
        System.out.println("Caracter: "+caracter);
    }
    
}
