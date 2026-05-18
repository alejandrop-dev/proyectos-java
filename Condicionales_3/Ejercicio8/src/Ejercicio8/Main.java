/*
Ejercicio 8: Pedir un número entre 0 y 99 999 y decir cuántas cifras tiene.
*/

package Ejercicio8;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"Digite un número entre 0 y 99 999 y decir cuántas cifras tiene.", "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
        
        Integer numero = obtenerNumeroValido("Digite un numero: ");
        
        if(numero == null){ mensajeDeSalida(); return; }
        
        int respuesta = verificarCifras(numero);
        
        mensajeDelPrograma(numero, respuesta);
 
    }
    
    private static Integer obtenerNumeroValido(String texto){
        while(true){
            String input = JOptionPane.showInputDialog(null, texto, "SISTEMA", JOptionPane.QUESTION_MESSAGE);
            if(input == null) return null;
            if(input.isEmpty()){
                JOptionPane.showMessageDialog(null,"No  se ha ingresado nada", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            
            try {
                Integer valor = Integer.parseInt(input);
                if(valor < 0 || valor >999){
                    JOptionPane.showMessageDialog(null,"Número fuera de rango (0 - 999)", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    continue;
                }
                return valor;
            } 
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Solo se admiten numeros enteros", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
    }
    
    private static void mensajeDeSalida(){
        JOptionPane.showMessageDialog(null,"Usted esta saliendo del Programa...", "Informacion", JOptionPane.INFORMATION_MESSAGE);
               
    }
    
    private static int verificarCifras(int numero){
        if(numero < 10){
       return 1;
        }
        if(numero < 100){
       return 2;
        }
        else{
            return 3;
        }
    }
    
    private static void mensajeDelPrograma(int numero, int respuesta){
        JOptionPane.showMessageDialog(null, "---RESULTADOS---" + "\n" + 
                                            "El numero "+ numero + " tiene " + respuesta + " cifras",
                                            "SISTEMA",
                                            JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
