/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author juanm
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
            Ejercicio 2
            -----------
            Declara 2 variables numericas(con el valor que quieras),
            he indica cual es mayor de los dos. Si son iguales
            indicarlo tambien. Ve cambiando los valores para comprobar
            el funcionamiento
        */
        
        //Declaracion de variables
        int num1 = 7;
        int num2 = 6;
        
        if (num1 > num2) {//Usamos condicionales para hacer las comparaciones
            System.out.println("El mayor es: "+num1);
        } else if(num1 < num2){
            System.out.println("El mayor es: "+num2);
        } else if (num1 == num2){
            System.out.println("Ambos son iguales.");
        }
               
        
    }
    
}
