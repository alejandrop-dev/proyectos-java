/*
Ejercicio 7: Pedir tres números y mostrarlos ordenados de mayor a menor.
*/
package Ejercicio7;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int mayor = 0;
        int medio = 0;
        int menor = 0;
        
        
        JOptionPane.showMessageDialog(null, "Se mostrara el mayor de 3 numeros", "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
        Integer n1 = obtenerNumeroValido("Ingrese el primer numero: ");
        if(n1 == null){ mensajeDeSalida(); return; }
        
        Integer n2 = obtenerNumeroValido("Ingrese el segundo numero: ");
        if(n2 == null){ mensajeDeSalida(); return; }
        
        Integer n3 = obtenerNumeroValido("Ingrese el tercer numero: ");
        if(n3 == null){ mensajeDeSalida(); return; }
        
        // LÓGICA DE INTERCAMBIO (SWAP)
        int a = n1, b = n2, c = n3;
        int temp;

        if (a < b) { temp = a; a = b; b = temp; }
        if (a < c) { temp = a; a = c; c = temp; }
        if (b < c) { temp = b; b = c; c = temp; }

        // Identificar si hay repetidos para el "Dato"
        String dato = (n1.equals(n2) || n1.equals(n3) || n2.equals(n3)) 
                      ? "Hay números repetidos" 
                      : "Todos los números son diferentes";
        
        mensajeDelPrograma(a, b, c, dato);
        
    }
    
    private static Integer obtenerNumeroValido(String mensaje){
        while(true){
            String input= JOptionPane.showInputDialog(null,mensaje, "SISTEMA", JOptionPane.QUESTION_MESSAGE);
            if(input == null) return null;
            if(input.isEmpty()){
                JOptionPane.showMessageDialog(null,"No se ha ingresado nada", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            try {
                return Integer.parseInt(input);
            } 
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se admiten datos numericos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private static void mensajeDeSalida(){
        JOptionPane.showMessageDialog(null,"Usted salio del Programa", "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
    }
                                            
    private static void mensajeDelPrograma(int mayor, int medio, int menor, String dato){
        JOptionPane.showMessageDialog(null, "---RESULTADOS---" + "\n" + 
                                            "Mayor: " + mayor + "\n" +
                                            "Medio: " + medio + "\n" +
                                            "Menor: " + menor + "\n" +
                                            "Dato: " + dato, 
                                            "SISTEMA", 
                                            JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}