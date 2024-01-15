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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejercicio 14
            ------------
            Escribe una aplicacion con un String que
            contenga una contraseña cualquiera. Despues
            se te pedira que introduzcas la contraseña, con 
            3 intentos. Cuando aciertes ya no pedira más la
            contraseña y mostrara un mensaje diciendo <<Enhorabuena>>
            Piensa bien en la condicion de salida.
        */
        
        //Declaracion de variables
        String clave = "teledirigido";//Variable que almacena la contraseña por defecto
        String contraseña = "";//Variable que almacena la contraseña introducida
        int numIntentos =3;
        boolean acierto = false;
        
        
        //Pedimos la contraseña por pantalla
        for (int i = 0; i < numIntentos && !acierto; i++) {
            
           contraseña = JOptionPane.showInputDialog(null, "Introduzca el password: ");
            
           //Comprobamos que la contraseña coincide
           if(clave.contains(contraseña)){
               JOptionPane.showMessageDialog(null, "Bienvenido");
               acierto = true;
           }
        }
        
        
        
        
        
    }   
    
    
}
