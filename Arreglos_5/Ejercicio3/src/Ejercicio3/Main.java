/*
Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar
la media de los números positivos, la media de los negativos y conteo el número de ceros.
*/

package Ejercicio3;

import javax.swing.JOptionPane;

public class Main {
    private static final int TAMANO_ARREGLO = 5;
    public static void main(String[] args) {
        try {
            double []numeros = new double[TAMANO_ARREGLO];
            double sumaDePositivos = 0, sumaDeNegativos = 0, mediaDePositivos, mediaDeNegativos;
            int conteoDePositivos = 0, conteoDeNegativos = 0, conteoDe0 = 0;
            JOptionPane.showMessageDialog(null, "Este programa le pedira 5 numeros y calculara la amedia de " + "\n" +
                                                "los positivos, negativos y la cantidad de 0 ingresados");
            for (int i = 0; i < numeros.length; i++) {
                numeros [i] = obtenerNumero("Ingrese el #" + (i+1) + " numero: ");
                if(numeros[i] > 0) { sumaDePositivos += numeros[i]; conteoDePositivos++;}
                else if(numeros[i] < 0) { sumaDeNegativos+= numeros[i]; conteoDeNegativos++; }
                else{ conteoDe0++;}
            }
            mediaDePositivos = obtenerMedia(sumaDePositivos, conteoDePositivos);
            mediaDeNegativos = obtenerMedia(sumaDeNegativos, conteoDeNegativos);
            mensajeDelPrograma(mediaDePositivos, mediaDeNegativos, conteoDe0);
            
        } catch(OperacionCanceladaException e){
            mensajeDeSalida();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error critico en " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    private static void mensajeDeSalida(){
        JOptionPane.showMessageDialog(null,"Usted esta saliendo del Programa...", "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static double obtenerNumero(String texto) throws OperacionCanceladaException{
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
                return Double.parseDouble(input);
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se admiten numeros ", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private static double obtenerMedia(double suma, int conteo){
        return (conteo == 0) ? 0 : (suma / conteo);
    }
    
    private static void mensajeDelPrograma(double mediaPositivos, double mediaNegativos, int conteoDe0){
        JOptionPane.showMessageDialog(null, "-----RESULTADOS-----" + "\n" + 
                                            ((mediaPositivos == 0)? "No se ha ingresado ningun numero positivo" + "\n":"Media de positivos:  " + String.format("%.2f", mediaPositivos) + "\n") +
                                            ((mediaNegativos == 0)? "No se ha ingresado ningun numero negativo" + "\n":"Media de negativos:  " + String.format("%.2f", mediaNegativos) + "\n") +
                                            ((conteoDe0 ==0)? "No se ha ingresado ningun 0" : "Cantidad de 0 ingresados: " + conteoDe0) ,
                                            "MENSAJE",
                                            JOptionPane.INFORMATION_MESSAGE);
    }

    
}
