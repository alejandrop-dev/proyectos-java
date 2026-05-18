/*
Ejercicio 2: Pedir dos números y decir cual es el mayor o si son iguales.
*/
package Ejercicio2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        Integer n1= ObtenerNumeroValido("Ingrese el primer numero: ");
        if(n1 == null){
            JOptionPane.showMessageDialog(null,"Usted esta saliendo del Programa...", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Integer n2= ObtenerNumeroValido("Ingrese el segundo numero: ");
        if(n2 == null){
            JOptionPane.showMessageDialog(null,"Usted esta saliendo del Programa...", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        
        if(n1>n2){
            JOptionPane.showMessageDialog(null,"El numero mayor es el " + n1, "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(n2>n1){
            JOptionPane.showMessageDialog(null,"El numero mayor es el " + n2, "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Ambos numeros son iguales ("+ n1 + ") ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
        
    }
    private static Integer ObtenerNumeroValido(String texto){
        while (true) {            
            String input = JOptionPane.showInputDialog(null,texto,"Sistema", JOptionPane.QUESTION_MESSAGE);
            if(input == null) return null;
            
            try {
                return Integer.parseInt(input);
            } 
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Introduce un numero entero", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
    
}
