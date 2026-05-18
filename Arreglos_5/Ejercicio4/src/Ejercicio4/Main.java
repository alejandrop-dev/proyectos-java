/*
Ejercicio 4: Leer 10 numeros enteros, guardarlos en un arreglo. Debemos mostrarlos en el siguiente
orden: el primero, el último, el segundo, el penúltimo, el tercero, etc.
*/

package Ejercicio4;

import javax.swing.JOptionPane;

public class Main {
    private static final int TAMANO_ARREGLO = 10 ;
    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null, "Este programa va a pedirle 10 numeros enetros y se los mostrara en el siguiente orden:" + "\n" +
                                                "El primero, el ultimo, el segundo, el penultimo, el tercero, etc", 
                                                "SISTEMA", 
                                                JOptionPane.INFORMATION_MESSAGE);
            int [] numeros = new int[TAMANO_ARREGLO];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = obtenerNumero("Ingrese el #" + (i+1) + " numero: ");
            }
            mensajeDelPrograma(numeros);
        } catch(OperacionCanceladaException e){
            mensajeDeSalida();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error critico en " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private static void mensajeDeSalida(){
        JOptionPane.showMessageDialog(null,"Usted esta saliendo del Programa...", "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static int obtenerNumero(String texto) throws OperacionCanceladaException{
        while(true){
            String input = JOptionPane.showInputDialog(null, texto, "SISTEMA", JOptionPane.QUESTION_MESSAGE);
            if(input == null){
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
    private static void mensajeDelPrograma(int [] numeros){ //Me costo pensar en esta soluccion para que sea muy flexible por si hay numeros impares 
        int aux = numeros.length;
        int inicio = (numeros.length%2 == 0)?(int)numeros.length /2 : (int) (numeros.length / 2)+1; 
        StringBuilder resultado = new StringBuilder("El resultado es: " + "\n");
        for (int i = 0; i < inicio; i++) {
            resultado.append("- ").append(numeros[i]).append("\n");
            
            if(aux != inicio){
                aux--;
                resultado.append("- ").append(numeros[aux]).append("\n");
            }
            
        }
        JOptionPane.showMessageDialog(null, resultado, "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
