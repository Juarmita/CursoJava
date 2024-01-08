/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresrelacionales;

/**
 *
 * @author juanm
 */
public class OperadoresRelacionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        int num1 = 4;
        int num2 = 5;
        
        boolean resultado;
        
        //Operador de igualdad o igual que ==
        resultado = num1 == num2;
        System.out.println(resultado);
        
        //Operador de desigualdad o distinto que !=
        resultado = num1 != num2;
        System.out.println(resultado);
        //Otra forma de declaracion
        System.out.println(num1 != num2);
        
        //Operador menor que <
        
        resultado = num1 < num2;
        System.out.println(resultado);
        
        //Operador mayor que >
        resultado = num1 > num2;
        System.out.println(resultado);
        
        //Operador menor o igual que <=
        resultado = num1 <= num2;
        System.out.println(resultado);
        
        //Operador de mayor o igual que >=
        resultado = num1 >= num2;
        System.out.println(resultado);
             
    }
    
}
