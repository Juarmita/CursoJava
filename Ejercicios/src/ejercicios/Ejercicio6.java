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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejercicio 6
            -----------
            Realizar la suma del 1 al numero que indiquemos,
            este debe ser mayor que 1
         */

        //Declaracion de variables
        Scanner lector = new Scanner(System.in);
        int numero = 0;
        int suma = 0;

        //Pedimos el número
        System.out.println("Introduce un numero mayor que 1: ");
        do {
            //Asignamos el valor que introducimos por teclado
            numero = lector.nextInt();

            if (numero <= 1) {
                System.out.println("El numero introducido debe ser mayor que 1");
            }
        } while (numero <= 1);//condicion de salida

        //Realizamos la suma
        for (int i = 1; i <= numero; i++) {
            suma = suma + i; //suma += i; es lo mismo
        }
        System.out.println("La suma total es: "+suma);
    }
    
}
