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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejercicio 17
            ------------
            Crear una aplicación que nos permite insertar
            números hasta que insertemos un -1. Calcular el numero 
            de número introducidos
         */
        //Declaracion de variables
        Scanner lector = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        //Bucle que se repetira mientras sea distinto de -1
        while (numero != -1) {
            System.out.println("Introduce un numero");
            numero = lector.nextInt();
            contador++;//El contador se incrementa cada vez que se repite el bucle

        }
        System.out.println("El total de numeros introducidos es: "+(contador - 1));
    }

}
