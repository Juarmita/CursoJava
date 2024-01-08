/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticoscombinados;

/**
 *
 * @author juanm
 */
public class OperadoresAritmeticosCombinados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        int num1 = 10;
        int num2 = 5;
        
        //Forma normal + (Suma)
        num1 = num1 + num2;
        System.out.println(num1);
        //Forma combinada +=
        num1 = 10;//Reseteamos el valor
        num1 += num2;
        System.out.println(num1);
        //Forma nomal - (Resta)
        num1=10;//reseteamos el valor
        num1 = num1 - num2;
        System.out.println(num1);
        //Forma combinada -=
        num1 = 10;
        num1 -= num2;
        System.out.println(num1);
        
        //Forma normal *(multiplicacion)
        num1 = 10;//Reseteamos el valor
        num1 = num1 * num2;
        System.out.println(num1);
        //Forma combinada *=
        num1 = 10;//Reseteo
        num1 *= num2;
        System.out.println(num1);
        
        //Forma normal / (Division)
        num1 = 10;//Reseteo
        num1 = num1 / num2;
        System.out.println(num1);
        //Forma combinada /=
        num1 = 10; //Reseteo
        num1 /= num2;
        System.out.println(num1);
        
        //Forma normal % (Modulo)
        num1 = 10; //Reseteo
        num1 = num1 % num2;
        System.out.println(num1);
        //Forma combinada %=
        num1 %= num2;
        System.out.println(num1);
        
    }
    
}
