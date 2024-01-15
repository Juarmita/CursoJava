/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author juanm
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejercicio 11
            ------------
            Muestra los números del 1 al 100(ambos
            incluidos) divisibles entre 2 y 3. Utiliza
            el bucle que quieras
        */
        //Usando for
        for (int contador = 1; contador <= 100; contador++) {
            if((contador % 2 == 0) && (contador % 3 == 0)){
                System.out.println(contador);
            }
        }
    }
    
}
