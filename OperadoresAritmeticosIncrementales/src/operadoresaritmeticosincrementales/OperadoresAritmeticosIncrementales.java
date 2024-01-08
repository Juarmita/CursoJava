/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticosincrementales;

/**
 *
 * @author juanm
 */
public class OperadoresAritmeticosIncrementales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        
        int num1 = 1;
        int num2 = 1;
        
        num2 = num1;//Reasignacion de valor
        System.out.println(num2);
        
        //Postincremento
        num2 = num1++;//En este caso el valor primero se asigna y despues se realiza el incremento
        System.out.println(num2);
        //Preincremento
        num2 = ++num1;
        System.out.println(num2);
        //Postdecremento
        num2 = num1--;
        System.out.println(num2);
        //Predecremento 
        num2 = --num1;
        System.out.println(num2);
        
        
    }
    
}
