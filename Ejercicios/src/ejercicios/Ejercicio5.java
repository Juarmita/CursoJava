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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejercicio 5
            -----------
            Lee un número por teclado e indica si es
            divisible entre 2(resto = 0).Si no lo es, 
            tambien debemos indicarlo
        */
        
        //Declaramos la variables de tipo float
        String num1 = JOptionPane.showInputDialog("Introduzca el numero a dividir:  ");
        //Al introducir por teclado un tipo string y tenemos que hacer casting para convertirlos en numeros
        float numero1 = Float.parseFloat(num1);
        
        if((numero1 % 2) == 0){
            System.out.println("El numero es divisible entre 2 y el resultado es: " +(numero1/2));
        } else {
            System.out.println("El numero no es divisible entre 2");
        }
    }
    
}
