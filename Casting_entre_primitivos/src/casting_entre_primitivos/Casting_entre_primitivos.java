/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casting_entre_primitivos;

/**
 *
 * @author juanm
 */
public class Casting_entre_primitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        byte num1 = 100;
        int num2 = 130;
        
        float num3 = 4000.123f;
        double num4 = 5000.123456789123123;
        /*
        //Conversion de ampliacion primitiva (implicita/automatica)
        num2 = num1;
        System.out.println(num1);
        System.out.println(num2);
        
        num4 = num3;
        System.out.println(num3);
        System.out.println(num4);
        */
        //conversiones de estrechamiento primitivo (explicita/manual)
        num1 = (byte) num2;
        System.out.println(num1);
        System.out.println(num2);
        
        num3 = (float) num4;
        System.out.println(num3);
        System.out.println(num4);
    }
    
}
