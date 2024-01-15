/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author juanm
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejercicio 10
            ------------
        Muestra los números del 1 al 100(ambos inclusidos).
        Usa un bucle while. Luego haz lo mismo utilizando 
        un bucle for.
        */
        //Declaracióon de variables
        int numero = 1;
        
        while (numero <= 100) {            
            System.out.println(numero);
            numero++;
          }
        
        //Usando for
        for (int contador = 1; contador <= 100; contador++) {
              System.out.println(contador);
        }
        
    }
    
}
