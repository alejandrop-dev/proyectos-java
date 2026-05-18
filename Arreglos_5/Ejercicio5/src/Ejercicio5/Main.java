/*
Ejercicio 5: Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: 
el 1º de A, el 1ºde B, el 2º de A, el 2º de B, etc.
*/

package Ejercicio5;

import javax.swing.JOptionPane;

public class Main {
    private static final int TAMANO_ARREGLO1 = 10 ;
    private static final int TAMANO_ARREGLO2 = 10 ;
    private static final int TAMANO_ARREGLO_DE_1_Y_2 = (TAMANO_ARREGLO1 + TAMANO_ARREGLO2) ;
    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null, "Este programa unira dos arreglos de 10 numeros enteros en un tercer arreglo de la siguiente forma: " + "\n" + 
                                                "El 1º de A, el 1ºde B, el 2º de A, el 2º de B, etc.",
                                                "SISTEMA", 
                                                JOptionPane.INFORMATION_MESSAGE);
            int [] a = new int[TAMANO_ARREGLO1];
            int [] b = new int[TAMANO_ARREGLO2];
            int [] c = new int[TAMANO_ARREGLO_DE_1_Y_2];
            
            JOptionPane.showMessageDialog(null, "Ingrese datos para el primer arreglo:", "SISTEMMA", JOptionPane.INFORMATION_MESSAGE);
            for (int i = 0; i < a.length; i++) {
                a[i] = obtenerNumero("Ingrese el #" + (i+1) + " numero: ", "PRIMER ARREGLO");
            }
            
            JOptionPane.showMessageDialog(null, "Ingrese datos para el segundo arreglo:", "SISTEMMA", JOptionPane.INFORMATION_MESSAGE);
            for (int i = 0; i < b.length; i++) {
                b[i] = obtenerNumero("Ingrese el #" + (i+1) + " numero: ", "SEGUNDO ARREGLO");
            }
            
            // Lógica para intercalar dinámicamente
            int j = 0;
            for (int i = 0; i < TAMANO_ARREGLO1 || i < TAMANO_ARREGLO2; i++) {
                if (i < a.length) {
                    c[j++] = a[i];
                }
                if (i < b.length) {
                    c[j++] = b[i];
                }
            }
            mostrarMensajeDelPrograma(c);
            
            
        } catch(OperacionCanceladaException e){
            mensajeDeSalida();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error critico en " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private static void mensajeDeSalida(){
        JOptionPane.showMessageDialog(null,"Usted esta saliendo del Programa...", "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static int obtenerNumero(String texto, String orden) throws OperacionCanceladaException{
        while(true){
            String input = JOptionPane.showInputDialog(null, texto, orden, JOptionPane.QUESTION_MESSAGE);
            if(input == null){
                throw new OperacionCanceladaException();
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
    
    private static void mostrarMensajeDelPrograma(int [] c){
        StringBuilder resultado = new StringBuilder("------RESULTADOS------" + "\n" +
                                                    "La contatenacion de los numeros ingresados es: " + "\n");
        for(int n : c){
            resultado.append(n).append(", ");
        }
        JOptionPane.showMessageDialog(null, resultado, "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
    }
}
