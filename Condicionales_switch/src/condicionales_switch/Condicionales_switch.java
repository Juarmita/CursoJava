/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionales_switch;

/**
 *
 * @author juanm
 */
public class Condicionales_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ejecucion del bloque 1");
        //Declaramos una variable para el ejemplo
        int numero = 4;
        //-------------
        switch (numero) {
            case 1: System.out.println("Ejecucion bloque valor 1");
            break;
            case 2: System.out.println("Ejecucion bloque valor 2");
            break;
            case 3: System.out.println("Ejecucion bloque valor 3");
            break;
            default: System.out.println("Ejecucion bloque 2");
                
        }
        //-------------
        System.out.println("Ejecucion bloque 3");
        
    }
    
}
