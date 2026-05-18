/*
Ejercicio 1: Leer 5 números, guardarlos en un arreglo y
mostrarlos en el mismo orden introducido.
*/

package Ejercico1;

import javax.swing.JOptionPane;

public class Main {
    private static final int TAMANO_ARREGLO = 5;
    public static void main(String[] args) {
        
        try {
            int [] numeros = new int[TAMANO_ARREGLO];
            JOptionPane.showMessageDialog(null, "Este programa le pedira " + TAMANO_ARREGLO + " numeros y se los mostrara en el orden ingresado", "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
            for (int i = 0; i < numeros.length; i++) {
                numeros [i] = obtenerNumero("Ingrese el #" + (i+1) + " numero: ");
            }
            mensajeDelPrograma(numeros);
        } catch (OperacionCanceladaException e) {
            mensajeDeSalida();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private static int obtenerNumero(String texto) throws OperacionCanceladaException{
        while(true){
            String input = JOptionPane.showInputDialog(null, texto, "SISTEMA", JOptionPane.QUESTION_MESSAGE);
            if (input == null) {
                throw new OperacionCanceladaException(); // Lanzamos el error
            }
            if(input.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ha ingresado nada", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            try {
                return Integer.parseInt(input);
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se admiten numeros enteros", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private static void mensajeDeSalida(){
        JOptionPane.showMessageDialog(null,"Usted esta saliendo del Programa...", "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }
    private static void mensajeDelPrograma(int [] numeros){
        StringBuilder resultado = new StringBuilder("Los numeros ingresados son: " + "\n");
            for(int n : numeros){
                resultado.append("- ").append(n).append("\n");
            }
            JOptionPane.showMessageDialog(null, resultado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}

