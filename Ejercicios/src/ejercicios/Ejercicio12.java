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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejercicio 12
            ------------
            Realiza una aplicacion que nos pida un
            numero de ventas a introducir, después
            nos pedirá tantas ventas por teclado como
            numero de ventas se hayan indicado. Al final
            mostrara la suma de todas las ventas
        */
        //Declaracion de variables
        Scanner lector = new Scanner(System.in);
        int numeroVentas = 0;
        int sumaVentas = 0;
        int ventaActual = 0;
        //Pedimos que introduzca el número de ventas
        System.out.println("Introduce el numero de ventas: ");
        numeroVentas = lector.nextInt();
        //recorremos el numero de ventas mediante el bucle
        for (int i = 0; i < numeroVentas; i++) {
            //Pedimos que introduzca el precio de la venta
            System.out.println("Introduce el precio de la venta: "+(i+1));
            ventaActual = lector.nextInt();
            
            //Sumamos todo
            sumaVentas = sumaVentas + ventaActual;
        }
        System.out.println("La suma total es: "+sumaVentas);
        
    }   
    
}
