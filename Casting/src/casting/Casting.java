/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casting;

/**
 *
 * @author juanm
 */
public class Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Conversiones de Strings a Primitivos(char, byte...)
        //Declaracion de variables

        String texto = "Hola";
        char caracter = texto.charAt(0);
        System.out.println(caracter);
        
        //-------------------------------
        String numero = "10";
        
        //String a byte
        byte num1 = Byte.parseByte(numero);
        System.out.println("String a byte:" +num1);//Concatenacion +num1
        byte num2 =Byte.valueOf(numero);
        System.out.println("String a byte otra forma:"+num2);
        
        //------------------------------
        //String a short(dato de 16bits con signo)
        short num3 = Short.parseShort(numero);
        System.out.println(num3);
        short num4 = Short.valueOf(numero);
        System.out.println(num4);
        
        //------------------------------
        //String a int
        int num5 = Integer.parseInt(numero);
        System.out.println(num5);
        int num6 = Integer.valueOf(numero);
        System.out.println(num6);
        
        //------------------------------
        //String a long
        long num7 = Long.parseLong(numero);
        System.out.println(num7);
        long num8 = Long.valueOf(numero);
        System.out.println(num8);
        
        //--------------------------------
        //String a float
        float num9 = Float.parseFloat(numero);
        System.out.println(num9);
        float num10 = Float.valueOf(numero);
        System.out.println(num10);
        
        //--------------------------------
        //String a double
        double num11 = Double.parseDouble(numero);
        System.out.println(num11);
        double num12 = Double.valueOf(numero);
        System.out.println(num12);
        
    }
    
}