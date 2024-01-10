/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle_brean_and_continue;

/**
 *
 * @author juanm
 */
public class Bucle_Brean_and_Continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejemplo Break
        for (int dia = 1; dia <= 7; dia++) {
            System.out.println("Dia de la semana: "+dia);
            
            if (dia == 5) {
                break;//Con este break salimos del bucle cuando la condicion del if se cumple
            }
        }
        System.out.println("Bucle finalizado");
        
        //Ejemplo Continue
        for (int i = 0; i < 10; i++) {
            System.out.println("Ejemplo continue: "+i);
            
            if(i == 4){
                continue;//Este continue nos indica que se salta la condicion pero continua
            }
            System.out.println("Hola---->> "+i);
        }
        
    }
    
}
