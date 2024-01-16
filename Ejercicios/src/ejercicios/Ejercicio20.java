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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejercicio 20
            ------------
            Suma los pares y los impares hasta un
            número pedido por teclado.
         */
        //Declaración de variables
        int par = 0;
        int impar = 0;
        int numeroIntroducido = 0;
        Scanner lector = new Scanner(System.in);
        //Logica del programa
        //Pedimos el número por pantalla
        System.out.println("Introduzca el numero: ");
        numeroIntroducido = lector.nextInt();
        //Reallizamos las sumas una vez introducido el numero
        for (int i = 0; i <= numeroIntroducido; i++) {
            if (i % 2 == 0) {
                par = par + i;
            } else {

                impar = impar + i;
            }

        }
        System.out.println("La suma de pares es: " + par);
        System.out.println("La suma de impares es: " + impar);
    }

}
