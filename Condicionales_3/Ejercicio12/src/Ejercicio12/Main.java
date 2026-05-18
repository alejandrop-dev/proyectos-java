/*
Ejercicio 12: Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien, Notable y Sobresaliente.
*/

package Ejercicio12;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Digite una nota de 0 a 10 y mostrarla de la forma: " + "\n" + 
                                            "0 a 4: Insuficiente." + "\n" +
                                            "5: Suficiente." + "\n" +
                                            "6: Bien." + "\n" +
                                            "7 a 8: Notable." + "\n" +
                                            "9 a 10: Sobresaliente." ,
                                            "SISTEMA",
                                            JOptionPane.INFORMATION_MESSAGE);
        
        Integer numero = obtenerNumeroValido("Ingrese un numero:"); 
        if(numero == null){ mensajeDeSalida(); return; }
        String resultado = resultado(numero);
        mensajeDelSistema(numero,resultado);
        
    }
    
    private static Integer obtenerNumeroValido(String texto){
        while(true){
            String input = JOptionPane.showInputDialog(null, texto, "RANGO (0-10)", JOptionPane.QUESTION_MESSAGE);
            if(input == null){ return null;}
            if(input.isEmpty()){ 
                JOptionPane.showMessageDialog(null, "No se ha ingresado nada", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE); 
                continue;
            }
            try {
                Integer aux = Integer.parseInt(input);
                if(aux <0 || aux >10){
                    JOptionPane.showMessageDialog(null, "El numero ingresado no esta en el rango", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    continue;
                }
                return aux;
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se admiten numeros enteros", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private static void mensajeDeSalida(){
        JOptionPane.showMessageDialog(null, "Usted esta saliendo del Programa...", "CLOSE", JOptionPane.WARNING_MESSAGE);
    }
    
    private static String resultado(int nota){
        String resultado = "";
        switch(nota){
            case 0 : 
            case 1 : 
            case 2 : 
            case 3 : 
            case 4 :  resultado = "Insuficiente"; break;
            case 5 :  resultado = "Suficiente"; break;
            case 6 :  resultado = "Bien"; break;
            case 7 : 
            case 8 :  resultado = "Notable"; break;
            case 9 : 
            case 10 : resultado = "Sobresaliente"; break;
        }
        return resultado;
        
    }
    
    private static void mensajeDelSistema(int numero, String mensaje){
        JOptionPane.showMessageDialog(null, "---RESULTADOS---" + "\n" + 
                                            "Numero ingresado: " + numero + "\n" + 
                                            "Estado de la nota: " + mensaje,
                                            "SISTEMA",
                                            JOptionPane.INFORMATION_MESSAGE);
    }
    
}
