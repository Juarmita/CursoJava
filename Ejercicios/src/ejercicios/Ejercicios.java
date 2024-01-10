/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author juanm
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Ejercicio 1
            Declara dos variables numéricas (con el
            valor que quieras), muestra por consola
            la suma, resta, multiplicación, división
            y módulo(resto de la división)
        */
        
        //Declaracion de variables
        float num1 = 5f;
        float num2 = 13f;
        float suma = num1 + num2;
        float resta = num1 - num2;
        float multiplicacion = num1 * num2;
        float division = num1 / num2;
        float modulo = num1 % num2;
        
        
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
        System.out.println("El resultado de la division es: "+division);
        System.out.println("El resultado de el modulo es: "+modulo);
        
        //Otra forma de realizar el ejercicio es:
        
        System.out.println("El resultado de la suma es: "+(num1 + num2));
        System.out.println("El resultado de la resta es: "+(num1 - num2));
        System.out.println("El resultado de la multiplicacion es: "+(num1 * num2));
        System.out.println("El resultado de la division es: "+(num1 / num2));
        System.out.println("El resultado de el modulo es: "+(num1 % num2));
        
    }
    
}
