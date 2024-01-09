/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionales_operador_ternario;

/**
 *
 * @author juanm
 */
public class Condicionales_operador_ternario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //condicion ? operandoT : operandoF
        //Ejemplo: 3>1 ? "El 3 es mayor que 1" : "el 1 es menor que 3"
        
        int x = 1;
        int y = 2;
        
        int numeroMayor = 0;
        
        numeroMayor = x > y ? x : y; //Si la condicion SE CUMPLE (?) devolvemos x y si NO SE CUMPLE devolvemos y
        System.out.println("El numero mayor: "+numeroMayor);
    }
    
}
