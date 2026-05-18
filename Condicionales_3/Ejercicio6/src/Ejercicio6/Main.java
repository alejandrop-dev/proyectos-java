/*
Ejercicio 6: Hacer un programa que tome dos numeros y diga si ambos son pares o impares.
*/
package Ejercicio6;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String respuesta1 = "";
        String respuesta2 = "";
        String respuesta1Y2 = "";
        
        JOptionPane.showMessageDialog(null,"Este programa le dira si sus numeros son pares o impares","SISTEMA", JOptionPane.INFORMATION_MESSAGE);
        Integer Numero1 = obtenerNumeroValido("Ingrese el primer numero: ");
        if(Numero1 == null){
            mensajeDeSalida();
            return;
        }     
        Integer Numero2 = obtenerNumeroValido("Ingrese el Segundo numero: ");
        if(Numero2 == null){
            mensajeDeSalida();
            return;
        }
        if(Numero1%2 == 0 && Numero2%2 !=0){
            respuesta1 = "Par";
            respuesta2 = "Impar";
            respuesta1Y2 = "Los números tienen paridad diferente";
        }
        if(Numero2%2 ==0 && Numero1%2 !=0){
            respuesta2 = "Par";
            respuesta1 = "Impar";
            respuesta1Y2 = "Los números tienen paridad diferente";
        }
        if(Numero1%2 == 0 && Numero2%2 ==0){
            respuesta1 = "Par";
            respuesta2 = "Par";
            respuesta1Y2 = "Ambos numeros son pares";
        }
        if(Numero1%2 != 0 && Numero2%2 !=0){
            respuesta1 = "Impar";
            respuesta2 = "Impar";
            respuesta1Y2 = "Ambos numeros son impares";
        }
        
        
        mensajeDelPrograma(Numero1, Numero2, respuesta1, respuesta2, respuesta1Y2);
        
    }
    
    private static Integer obtenerNumeroValido(String texto){
        while(true){
            String input = JOptionPane.showInputDialog(null, texto, "SISTEMA", JOptionPane.QUESTION_MESSAGE);
            if(input == null) return  null;
            if(input.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ha ingresado nada", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            try {
                return Integer.parseInt(input);
            } 
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Introduce un numero ", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
    }
    
    private static void mensajeDeSalida(){
        JOptionPane.showMessageDialog(null,"Usted esta saliendo del Programa...", "Informacion", JOptionPane.INFORMATION_MESSAGE);  
    }
    
    private static void mensajeDelPrograma(int n1, int n2, String respuesta1, String respuesta2, String respuesta1y2){
        JOptionPane.showMessageDialog(null, "---NUMEROS PARES O IMPARES---"+
                                            "\nPrimer numero (" + n1 + "): "+ respuesta1 + 
                                            "\nSegundo numero (" + n2 + "): " + respuesta2 +
                                            "\n"+ respuesta1y2,
                                            "SISTEMA",
                                            JOptionPane.INFORMATION_MESSAGE);
    } 
    
}
