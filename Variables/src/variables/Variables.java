/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables;

/**
 *
 * @author juanm
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de tipo short, entero de 16 bits
        short edad = 22; //Declaracion es tipo + nombre_variable = valor;
        System.out.println(edad);
        //Declaracion de tipo int, su valor por defecto es 0, y su uso es para los numeros naturales
        int edad_int = 34;
        System.out.println(edad_int);
        //Declaracion de tipo long, ocupa 64 bits. Los tipo long, estan obligados a llevar la L al final
        long dinero = 100l;
        System.out.println(dinero);
        //Declaracion de tipo char. Se necesitan comillas simples ('')
        char letra = 'A';
        System.out.println(letra);
        //Declaracion de tipo booleano. El valor por defecto es false.
        boolean isTrue = true;
        System.out.println(isTrue);
        //Declaracion de tipo float. Numeros decimales. Hay que indicar f en la declaracion
        float precio = 128.54f;
        System.out.println(precio);
        float precio2 = 140f;
        System.out.println(precio2);
        //Declaraciion de tipo double. Tiene doble precisión, hasta 15 digitos.
        double precio3 = 115.53;
        System.out.println(precio3);
        //Declaracion de tipo string, Cadenas de caracteres. Los String en Java son objetos
        String frase = "Bienvenidos al curso";
        System.out.println(frase);
    }
}
