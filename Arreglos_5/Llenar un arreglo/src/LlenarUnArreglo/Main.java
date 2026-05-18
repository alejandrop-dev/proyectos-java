/*
Llenar un arreglo
*/

package LlenarUnArreglo;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Programa que llenara un arreglo de caracteres", "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
        Integer nElementos = obtenerNElementos("Ingrese la cantidad N de elemntos");
        if(nElementos == null) { mensajeDeSalida(); return; }
        char [] arreglo = new char[nElementos];
        JOptionPane.showMessageDialog(null, "Digite los caracteres en el arreglo" , "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
        for (int i = 0; i < arreglo.length; i++) {
            String input =  obtenerCaracter("Ingrese el #" + (i+1) + " caracter: ");
            if(input == null) { mensajeDeSalida(); return; }
            arreglo[i] = input.charAt(0);
        }
        StringBuilder resultado = new StringBuilder( "Los caracteres ingresados son:\n");
        for( char c :arreglo){
            resultado.append(c).append("  ");
        }
        JOptionPane.showMessageDialog(null, resultado.toString(), "RESULATDO", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static Integer obtenerNElementos(String texto){
        while(true){
            String input = JOptionPane.showInputDialog(null, texto, "INGRESO DE ELEMTOS", JOptionPane.QUESTION_MESSAGE);
            if(input == null) return null;
            if(input.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ha ingresado nada" , "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            try {
                int aux = Integer.parseInt(input);
                if(aux <=0){
                    JOptionPane.showMessageDialog(null, "La cantidad de elemtos no puede ser menor o igual a 0", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    continue;
                }
                return aux;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR SOLO SE ADMITEN NUMEROS ENTEROS Y POSITIVOS", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    
    private static void mensajeDeSalida(){
        JOptionPane.showMessageDialog(null,"Usted esta saliendo del Programa...", "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static String obtenerCaracter(String texto){
        while(true){
            String input = JOptionPane.showInputDialog(null, texto, "INGRESO DE CARACTER", JOptionPane.QUESTION_MESSAGE);
            if(input == null) return null;
            if(input.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ha ingresado nada" , "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            if(input.length() >1){
                JOptionPane.showMessageDialog(null, "Se ha ingresado mas de un caracter", "ERROR", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            try {
                return input;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
