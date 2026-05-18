/*
Ejercicio 8: Diseñar una aplicación que declare una tabla de 10 elementos
enteros. Leer mediante el teclado 8 números. Después se debe pedir un
número y una posición, insertarlo en la posición indicada, desplazando los que
estén detrás.
*/

package Ejercicio8;

import javax.swing.JOptionPane;

public class Main {
    private static final int ARREGLO = 10;
    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null, "Este programa guardara 10 numeros y funcionara de la siguiente forma:  " + "\n" + 
                                                "Pedira 8 numeros, y despues 2 mas y le pedira el indice de donde lo quiere guerdar" + "\n" + 
                                                "y desplazara los otros numeros",
                                                "SISTEMA", 
                                                JOptionPane.INFORMATION_MESSAGE);
            int [] numeros = new int[ARREGLO];
            int numero;
            int indice;
            for (int i = 0; i < (numeros.length-2); i++) {
                numeros[i] = obtenerNumero("Ingrese el #" + (i+1) + " numero: ");   
            }
            numero = obtenerNumero("Ingrese el numero #9: ");
            indice = obtenerIndice("Ingrese el indice en donde lo quiere agregar");
            numeros = realizarOperacion(numeros, numero, indice);
            
            numero = obtenerNumero("Ingrese el numero #10: ");
            indice = obtenerIndice("Ingrese el indice en donde lo quiere agregar");
            numeros = realizarOperacion(numeros, numero, indice);
            
            //Tessteo de la iteracion y mov         °Para bucle final de mensaje
            for (int i = (numeros.length-1); i >= 0; i--) {
                System.out.println(numeros[i]);
            }
           
            
            
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
    private static int obtenerIndice(String texto) throws OperacionCanceladaException{
        while(true){
            String input = JOptionPane.showInputDialog(null, texto, "ENTRADA DE INDICE", JOptionPane.QUESTION_MESSAGE);
            if(input == null){
                throw new OperacionCanceladaException();
            }
            if(input.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ha ingresado nada", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            try {
                int aux = Integer.parseInt(input);
                if(aux <1 || aux > 10){
                    JOptionPane.showMessageDialog(null,"El rango del indice es [1-10]", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    continue;
                }
                return aux;
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se admiten numeros enteros", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private static int[] realizarOperacion(int [] numeros, int numero, int indice){
        if(indice == 9 && numeros[8] == 0){
                numeros[8] = numero;
                return numeros;
            }
            else if(indice == 10 && numeros[9] == 0){
                numeros[9] = numero;
                return numeros;
            }
        if(indice == 10 && numeros[9] !=0){
            
        }
            for (int i = (numeros.length-1); i < 10; i--) {     //i=9 ==10 para el uusuario;    usuario=5   ---     i ==4; indice =5 ->   
                if(indice == i+1){
                    numeros[i] = numero;
                    break;
                }
                numeros[i] = numeros[i-1];
            }
            return numeros;
    }
    
}
