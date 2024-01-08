/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresunarios;

/**
 *
 * @author juanm
 */
public class OperadoresUnarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        int resultado = 1;
        System.out.println(resultado);
        
        int resultado2 = +1;
        System.out.println(resultado2);
        
        int resultado3 = -1;
        System.out.println(resultado3);
        
        //Operadores de incremento ++
        
        resultado ++;
        System.out.println(resultado);
        
        //Operador de decremento --
        
        resultado --;
        System.out.println(resultado);
        
        //Operador de negacion !
        
        boolean isTrue = false;
        System.out.println(!isTrue);//Al poner el operador de negación estamos invirtiendo el valor asignado anteriormente
    }
    
}
