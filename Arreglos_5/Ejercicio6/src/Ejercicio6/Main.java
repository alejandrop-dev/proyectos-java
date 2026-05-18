/*
Ejercicio6: Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos
en una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
*/

package Ejercicio6;

import javax.swing.JOptionPane;

public class Main {
    
    private static final int JUMP_NUMBER = 5;   // NUMERO_DE_SALTO
    private static final int ARRAY_SIZE1 = 12 ; //TAMANO_ARREGLO1
    private static final int ARRAY_SIZE2 = 12 ; //TAMANO_ARREGLO2
    private static final int ARRAY_SIZE_OF_1_AND_2 = (ARRAY_SIZE1 + ARRAY_SIZE2);     //TAMANO_ARREGLO_DE_1_AND_2
    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null, "Este programa unira dos arreglos de 12 numeros enteros en un tercer arreglo de la siguiente forma: " + "\n" + 
                                                "3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.",
                                                "SISTEMA", 
                                                JOptionPane.INFORMATION_MESSAGE);
            int [] a = new int[ARRAY_SIZE1];
            int [] b = new int[ARRAY_SIZE2];
            int [] resultado = new int[ARRAY_SIZE_OF_1_AND_2];
            
            JOptionPane.showMessageDialog(null, "Ingrese datos para el primer arreglo:", "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
            for (int i = 0; i < a.length; i++) {
                a[i] = obtenerNumero("Ingrese el #" + (i+1) + " numero: ", "PRIMER ARREGLO");
            }
            
            JOptionPane.showMessageDialog(null, "Ingrese datos para el segundo arreglo:", "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
            for (int i = 0; i < b.length; i++) {
                b[i] = obtenerNumero("Ingrese el #" + (i+1) + " numero: ", "SEGUNDO ARREGLO");
            }
            resultado = mezclador(a, b, JUMP_NUMBER);
            mostrarMensajeDelPrograma(resultado);
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
        int contador = 0;
        for(int n : c){
            resultado.append(n);
            if(contador < (c.length -1)){
                resultado.append(", ");
            }
            contador++;
        }
        JOptionPane.showMessageDialog(null, resultado, "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static int [] mezclador( int [] a, int [] b, int jumpNumber){
        int [] c = new int[ARRAY_SIZE_OF_1_AND_2];
        int j =0;
            for (int i = 0; i <ARRAY_SIZE1 || i < ARRAY_SIZE2; i+= jumpNumber) { 
                if(i < a.length){
                    for (int k = 0; k < jumpNumber && (i + k) < a.length; k++){
                        c[j++] = a[i+k];
                        //System.out.print("5-");           Lo use para ir probando y ver el error de mi logica xD
                        
                    }
                }
                if(i < b.length){
                    for (int k = 0; k < jumpNumber && (i + k) < b.length; k++) {
                        c[j++] = b[i+k];
                        //System.out.print("7-");      |    Tambien lo use para ir probando y ver el error de mi logica xD
                        
                    }
                }
            }
            return c;
    }
}
