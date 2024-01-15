/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author juanm
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejercicio 13
            ------------
            Lee un número por teclado y comprueba que 
            este numero es mayor o igual que cero, si
            no lo es vuelve a pedir el numero(usar do-while),
            despues mostrar el numero por consola
        */
        //Declaracion de variables
        int num;
        Scanner lector = new Scanner(System.in);
        //Pedimos el numero por teclado
     
        //Hacemos la comprobación con el bucle
        do {     
            System.out.println("Introduzca un numero mayor que 0: ");
            num =  lector.nextInt();
        } while (num <= 0);
        
        System.out.println("El numero es: "+num);
    }
    
}
