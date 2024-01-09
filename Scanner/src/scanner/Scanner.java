/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner;

import java.util.Scanner;

/**
 *
 * @author juanm
 */
public class Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Con el metodo Scanner usamos la entrada de datos por teclado
        //Declaración de variables
        Scanner lector = new Scanner(System.in);
        
        //Leemos por teclado un String
        System.out.println("Introduce un color: ");
        String color = lector.nextLine();
        System.out.println("El color es: " +color);
        //---------------------------------------
        //Leemos un numero por teclado
        /*
        System.out.println("Introduce un numero: ");
        int numero = lector.nextInt();
        System.out.println("El numero introducido es: " +numero);
        */
        //------------------------------------------
        //Leemos un numero por teclado, pero hacemos casting
        System.out.println("Introduce un numero para Cast: ");
        String numeroTexto = lector.nextLine();
        int numero = Integer.parseInt(numeroTexto);
        System.out.println("El texto convertido es: " +numero);
    }

    
}
