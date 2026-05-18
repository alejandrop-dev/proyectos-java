/*
Ejercicio 1: Programa que lea un número entero y muestre si el número es múltiplo de 10.
*/
package Ejercicio1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        final int DIVISOR= 10;
        JOptionPane.showMessageDialog(null,"Programa que lea un número entero y muestre si el número es múltiplo de 10", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        Integer numero = obtenerNumeroValido("Ingrese un numero: ");
        if(numero != null){
            if(numero%DIVISOR ==0){
                mostrarMensaje("El numero ", numero," es multiplo de 10");
            }
            else{
                mostrarMensaje("El numero ", numero, " no es multiplo de 10");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Usted esta saliendo del Programa...", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private static Integer obtenerNumeroValido(String texto){
        while (true) {            
            String input = JOptionPane.showInputDialog(null, texto, "Entrada de dato", JOptionPane.QUESTION_MESSAGE);
            if(input  == null) return null;
            try {
                return Integer.parseInt(input);
            } 
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Introduce un numero entero", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
    
    private static void mostrarMensaje(String texto1, int numero, String texto2){
        JOptionPane.showMessageDialog(null, texto1 + numero + texto2, "Sistema", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
