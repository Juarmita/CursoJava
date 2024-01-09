/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casting_2_prim_a_strings;

/**
 *
 * @author juanm
 */
public class Casting_2_Prim_a_Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Conversion de primitivos a Strings
        //La forma más mas usada es String texto = numero +""; asi convertimos cualquier numero a texto
        //---------------------------------------------
        //Declaracion de variable
        String numero = "";
        
        //byte a String
        byte num1 = 1;
        numero = Byte.toString(num1);//En el caso byte si es necesario declarar la variable
        System.out.println("byte a string:" +numero);
        numero = String.valueOf(num1);
        System.out.println("byte a string(forma 2):" +numero);
        numero = num1 +"";
        System.out.println("forma 3:"+numero);
        //---------------------------------------------
        //short a string
        short num2 = 2;
        
        numero = Short.toString(num2);
        System.out.println("Short a string, forma 1: " +numero);
        numero = String.valueOf(num2);
        System.out.println("Short a string, forma 2: " +numero);
        numero = num2 +"";
        System.out.println("Short a string, forma 3: " +numero);
        //---------------------------------------------
        //int a String
        int num3 = 3;
        
        numero = Integer.toString(num3);
        System.out.println("Int a string, forma 1: " +numero);
        numero = String.valueOf(num3);
        System.out.println("Int a string, forma 2: " +numero);
        numero = num3 +"";
        System.out.println("Int a string, forma 3: " +numero);
        //---------------------------------------------
        //long a String
        long num4 = 4l;//OJO l al final importante
        
        numero = Long.toString(num4);
        System.out.println("long a string, forma 1: " +numero);
        numero = String.valueOf(num4);
        System.out.println("long a string, forma 2: " +numero);
        numero =  num4 +"";
        System.out.println("long a string, forma 3: " +numero);
        //---------------------------------------------
        //float a string
        float num5 = 5f;
        
        numero = Float.toString(num5);
        System.out.println("float a string, forma 1:" +numero);
        numero = String.valueOf(num5);
        System.out.println("float a string, forma 2:" +numero);
        numero = num5 +"";
        System.out.println("float a string, forma 3:" +numero);
        //---------------------------------------------
        //double a String
        double num6 = 6.0;
        
        numero = Double.toString(num6);
        System.out.println("Double a string, forma 1:" +numero);
        numero = String.valueOf(num6);
        System.out.println("Double a string, forma 2:" +numero);
        numero = num6 +"";
        System.out.println("Double a string, forma 3:" +numero);
        //-------------------------------------------
        //char a string
        char caracter = 'b';
        String texto = Character.toString(caracter);
        System.out.println("char a string: " +texto);
        
    }
    
}
