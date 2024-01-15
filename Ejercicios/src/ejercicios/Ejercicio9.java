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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejercicio 9
            -----------
            Lee un numero por teclado que pida el precio
            de un producto (puede tener decimales) y
            calcule el precio finao con IVA. IVA del 21%
        */
        
        //Declaramos las variables
        double precio = 0;
        double precioFinal = 0;
        double iva = 0;
        Scanner lector = new Scanner(System.in);
        
        //Pedimos introducir el precio por pantalla
        System.out.println("Introduzca el precio del articulo: ");
        //Realizamos la programatica
        precio = lector.nextFloat();
        iva = precio * 0.21;
        precioFinal = precio + iva;
        //Devolvemos el precio final con impuestos
        System.out.println("El precio con IVA es: "+precioFinal);
        
    }
    
}
