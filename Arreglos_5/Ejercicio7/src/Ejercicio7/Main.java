/*
Ejercicio 7: Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos 
si los números están ordenados de forma creciente, decreciente, o si están desordenados.
*/

package Ejercicio7;

import javax.swing.JOptionPane;

public class Main {
    private static final int MAX_ELEMENTS = 10;
    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null, "Este programa leera por teclado una serie de 10 números enteros positiivos. Y se le indicara: " + "\n" + 
                                                "Si los números están ordenados de forma creciente, decreciente, o si están desordenados.",
                                                "SISTEMA", 
                                                JOptionPane.INFORMATION_MESSAGE);
            int [] numbers = new int[MAX_ELEMENTS];
            boolean isAscending = true;
            boolean isDescending = true;
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = obtenerNumero("Ingrese el #" + (i+1) + " numero: ");
            }
            isAscending = obtenerResultadoAcendente(numbers);
            isDescending = obtenerResultadoDecendente(numbers);
            mensajeDelPrograma(isAscending, isDescending);
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
            String input = JOptionPane.showInputDialog(null, texto, "ENTRADA DE NUMEROS", JOptionPane.QUESTION_MESSAGE);
            if(input == null){
                throw new OperacionCanceladaException();
            }
            if(input.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ha ingresado nada", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            try {
                int aux = Integer.parseInt(input);
                if(aux <=0){
                    JOptionPane.showMessageDialog(null,"Solo se admiten numeros mayores a 0", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    continue;
                }
                return aux;
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se admiten numeros enteros", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private static boolean obtenerResultadoAcendente(int [] numeros){
        boolean aux = false;
        for (int i = 0; i < (numeros.length-1); i++) {
                if(numeros[i] < numeros[i+1]){
                    aux = true;
                }
            }
        return aux;
    }
    private static boolean obtenerResultadoDecendente(int [] numeros){
        boolean aux = false;
        for (int i = 0; i < (numeros.length-1); i++) {
                if(numeros[i] > numeros[i+1]){
                    aux = true;
                }
            }
        return aux;
    }
    
    private static void mensajeDelPrograma(boolean numerosAcendentes, boolean numerosDecendentes){
        if(numerosAcendentes == true && numerosDecendentes == false){
            JOptionPane.showMessageDialog(null, "El arreglo esta en forma creciente" , "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(numerosAcendentes == false && numerosDecendentes == true){
            JOptionPane.showMessageDialog(null, "El arreglo esta en forma decreciente" , "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(numerosAcendentes == true && numerosDecendentes == true){
            JOptionPane.showMessageDialog(null, "El arreglo esta en  desorden" , "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(numerosAcendentes == false && numerosDecendentes == false){
            JOptionPane.showMessageDialog(null, "Todos los numeros del arreglo son iguales" , "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
}
