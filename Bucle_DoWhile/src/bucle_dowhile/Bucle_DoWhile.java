/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle_dowhile;

/**
 *
 * @author juanm
 */
public class Bucle_DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variable
        
        int contador = 0;//Inicializamos el contador en 0
        
        do {            
            System.out.println("Contador = "+contador);
            contador++;
        } while (contador <= 10);
    }
    
}
