/*
Ejercicio 5: Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 horas o menos 
se le paga $16 por hora. Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra. 

*/
package Ejercicio5;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        final int HORAS_BASE = 40;
        final int PRECIO_BASE = 16;
        final int PRECIO_EXTRA = 20;
        
        JOptionPane.showMessageDialog(null,"Se calculara su salario","SISTEMA", JOptionPane.INFORMATION_MESSAGE);
        Integer horas = obtenerHoras("Ingrese sus horas trabajadas:");
        if(horas == null){
                JOptionPane.showMessageDialog(null,"Usted esta saliendo del Programa...", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                return;
        }
        
        int horasExtras = 0;
        int salarioTotal = horas * PRECIO_BASE;
        
        if(horas>HORAS_BASE){
            horasExtras = horas - HORAS_BASE;
            salarioTotal = (HORAS_BASE * PRECIO_BASE) + (horasExtras * PRECIO_EXTRA);
        }
        mensaje(horas, horasExtras, salarioTotal);
        
        
    }
    
    private static Integer obtenerHoras(String texto){
        while(true){
            String input = JOptionPane.showInputDialog(null, texto, "SISTEMA", JOptionPane.QUESTION_MESSAGE);
            if(input == null) return null;
            if(input.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ha ingresado nada", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            try {
                return Integer.parseInt(input);
            } 
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Ingrese un dato numerico", "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private static void mensaje(int horasTrabajadas, int horasExtra, double salarioTotal){
        JOptionPane.showMessageDialog(null, "Horas trabajadas: " + horasTrabajadas + 
                                            "\nHoras extra: "+ horasExtra +
                                            "\nSalario Total: $" + String.format("%.2f",salarioTotal));
    }
    
}
