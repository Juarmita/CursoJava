/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author juanm
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejercicio 15
            ------------
            Crea una aplicacion que nos pida un dia de la simana y que nos diga
            si es un dia laboral o no. Usa un switch para ello.
        */
        //Declaracion de variables
        String dia = ""; //Aqui vamos a guardar el dia(string) introducido por teclado.

        //Lógica del programa
        //Pedimos por pantalla el dia a introducir
        dia = JOptionPane.showInputDialog("Introduzca el dia de la semana: ");
        //Comprobamos con switch si es festivo o no.
        switch (dia) {
            case "Lunes":
                System.out.println("El lunes es laborable.");
                break;
            case "Martes":
                System.out.println("El martes es laborable.");
                break;
            case "Miercoles":
                System.out.println("El miercoles es laborable.");
                break;
            case "Jueves":
                System.out.println("El jueves es laborable.");
                break;
            case "Viernes":
                System.out.println("El viernes es laborable.");
                break;
            case "Sabado":
                System.out.println("El sabado no es laborable.");
                break;
            case "Domingo":
                System.out.println("El domingo no es laborable.");
                break;
        }
    }

}
