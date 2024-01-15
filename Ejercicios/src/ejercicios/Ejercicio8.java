/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author juanm
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejercicio 8
            -----------
            Crea un programa que calcule el sueldo de un
            trabajador, el programa va a solicitar el numero
            de horas que has trabajado en un mes, las horas
            se pagan a 15€.
        */
        
        //Declaracion de variables
        int hora = 15;
        int horaT;
        int sueldo;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Introduzca el numero de horas trabajadas: ");
        
        horaT = lector.nextInt();
        
        sueldo = horaT * hora;
        
        System.out.println("El sueldo mensual es: "+sueldo);
        
        //Mismo ejercicio pero con JOptionPane
        
        //Declaramos otras variables para este ejemplo
        String horaT2;
        int sueldo2;
        
        horaT2 = JOptionPane.showInputDialog("Introduzca el numero de horas trabajadas: ");
        //Realizamos la conversion de String a int
        int numero = Integer.parseInt(horaT2);
        //Mostramos por pantalla el valor
        sueldo2 = numero * hora;
        System.out.println("Su sueldo es: "+sueldo2);
    }
    
}
