/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionales_if_else_anidados;

/**
 *
 * @author juanm
 */
public class Condicionales_if_else_anidados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejecucion bloque 1");
        
        int numero = 3;//Declaramos una variable para el ejemplo
        
        if(numero < 1){
            System.out.println("Ejecucion bloque 2");
        }else if(numero < 2){
            System.out.println("Ejecucion bloque 3");
        }else if(numero <= 3){
            System.out.println("Ejecucion bloque 4");
        }
        System.out.println("Ejecucion bloque 5");
    }
    
}
