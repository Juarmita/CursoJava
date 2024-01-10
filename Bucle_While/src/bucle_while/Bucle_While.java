/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle_while;

/**
 *
 * @author juanm
 */
public class Bucle_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definimos una variable
        
        int contador = 0;//Inicializamos la variable en 0
        
        while(contador <= 10) { //Mientras contador sea menor o igual que 10
            System.out.println("Contador = "+contador);
            contador++;//Incrementamos en una unidad
            System.out.println("Contador despues de el incremento: "+contador);
        }
    }
    
}
