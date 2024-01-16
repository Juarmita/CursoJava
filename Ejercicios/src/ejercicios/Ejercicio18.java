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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejercicio 18
            ------------
            Crear un programa para pedir números al usuario
            y cuando el usuario meta un -1 se terminará el
            programa. Al terminar, mostrará lo siguiente:
            
            - mayor numero introducido
            - menor numero introducido
            - suma de todos los numeros
            - suma de los numeros positivos
            - suma de los numeros negativos
            - media de la suma
            El numero -1 no contara como numero
         */
        //Declaracion de variables
        Scanner lector = new Scanner(System.in);
        int numeroIntroducido = 0;
        int numeroMayor = 0;
        int numeroMenor = 0;
        int sumaTotal = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        double media = 0;
        int contador = 0;

        //Logica del programa
        do {
            //Comprobacion numero introducido es menor que el numeroMenor
            if (numeroMenor > numeroIntroducido) {

                numeroMenor = numeroIntroducido;
            }

            //Comprobamos que el numero introducido sea mayor que numeroMayor
            if (numeroMayor < numeroIntroducido) {

                numeroMayor = numeroIntroducido;
            }

            sumaTotal = sumaTotal + numeroIntroducido;//Hacemos la suma de los numeros totales introducidos

            //Suma de los numeros positivos
            if (numeroIntroducido > 0) {
                sumaPositivos = sumaPositivos + numeroIntroducido;
            } else {
                sumaNegativos = sumaNegativos + numeroIntroducido;
            }

            contador++;

            System.out.println("Introduce un numero: ");
            numeroIntroducido = lector.nextInt();

        } while (numeroIntroducido != -1);
        //Obtencion de la media
        media = (double) sumaTotal / (contador - 1);
        //Mostramos los valores
        System.out.println("El numero menor es: " + numeroMenor);
        System.out.println("El numero mayor es: " + numeroMayor);
        System.out.println("La suma total es: " + sumaTotal);
        System.out.println("LA suma de los positivos es: " + sumaPositivos);
        System.out.println("La suma de los negativos es: " + sumaNegativos);
        System.out.println("La media es: " + media);
    }

}
