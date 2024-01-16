/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author juanm
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejercicio 16
            ------------
            Crea una aplicacion tipo calculadora, nos
            pedirá 2 operandos(int) y un signo aritemtico,
            según este último se realizará la operación
            correspondiente. Al final mostrará el resultado
            en un cuadro de dialogo(JOptionPane).
            Los signos disponibes son:
            +: Suma,
            -: Resta,
            *: Multiplicación,
            /: División,
            %: Módulo.
        */
        
        //Declaración de variables
        int num1 = 0;
        int num2 = 0;
        double resultado = 0;
        String operando = "";//Aqui vamos a guardar el signo
        //Solicitamos los números por pantalla.
        String numero1 = JOptionPane.showInputDialog("Introduzca el primer operando: ");
        num1 = Integer.parseInt(numero1);//Hacemos la conversión de String a Int
        String numero2 = JOptionPane.showInputDialog("Introduzca el segundo operando: ");
        num2 = Integer.parseInt(numero2);
        //Ahora solicitamos la operación a realizar:
        operando = JOptionPane.showInputDialog("Introduzca el simbolo aritmetico: ");
        switch (operando) {
            case "+": JOptionPane.showMessageDialog(null, "El valor de la suma es: "+(num1 + num2));
            break;
            case "-": JOptionPane.showMessageDialog(null, "El valor de la resta es: "+(num1 - num2));
            break;
            case "*": JOptionPane.showMessageDialog(null, "El valor de la multiplicacion es: "+(num1 * num2));
            break;
            case "/": JOptionPane.showMessageDialog(null, "El valor de la división es: "+(num1 / num2));
            break;
            case "%": JOptionPane.showMessageDialog(null, "El valor de el resto es: "+(num1 % num2));
            break;
            default:
                JOptionPane.showMessageDialog(null, "Introduzca un signo valido");
        }
        
    }
    
}
