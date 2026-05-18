/*
Ejercicio 11:  Construir un programa que simule el funcionamiento de una calculadora que puede realizar las  
cuatro operaciones aritméticas básicas (suma, resta, producto y división) con valores numéricos enteros. 
El usuario debe especificar la operación con el primer carácter del primer parámetro de la línea de comandos:
S o s para la suma, R o r para la resta, P, p, M o m para el producto y D o d para la división.
*/

package Ejercicio11;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Este programa simulara una calculadora." + "\n" + 
                                            "S o s:   SUMAR" + "\n" + 
                                            "R o r:   RESTAR" + "\n" + 
                                            "M o m: MULTIPLICAR" + "\n" + 
                                            "D o d:   DIVIDIR" + "\n" + 
                                            "Dato: se tomara la primera letra de lo que escriba como referencia",
                                            "SISTEMA",
                                            JOptionPane.INFORMATION_MESSAGE);
        Integer n1 = obtenerNumeroValido("Digite el primer numero: ");
        if( n1 == null ){ mensajeDeSalida(); return; }
        
        Integer n2 = obtenerNumeroValido("Digite el segundo numero: ");
        if( n2 == null ){ mensajeDeSalida(); return; }
        
        String opcion = obtenerOpcion("Digite la opcion ( S - R - M - D)");
        if( opcion == null ){ mensajeDeSalida(); return; }
        
        String titulo = titulo(opcion);
        String signo = signo(opcion);
        
        double respuesta =resolucionDeOperacion(titulo, n1, n2);
        
        mensajeDelPrograma(titulo, signo, n1, n2, respuesta);
        
        
    }
    
    private static Integer obtenerNumeroValido(String texto){
        while(true){
            String input = JOptionPane.showInputDialog(null, texto, "SISTEMA", JOptionPane.QUESTION_MESSAGE);
            if(input == null) return null;
            if(input.isEmpty()){
                JOptionPane.showMessageDialog(null,"No se ha ingresado nada", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Solo se admiten numeros enteros", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private static void mensajeDeSalida(){
        JOptionPane.showMessageDialog(null,"Usted esta saliendo del Programa...", "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static String obtenerOpcion(String texto){
        while(true){
            String input = JOptionPane.showInputDialog(null, texto, "SISTEMA", JOptionPane.QUESTION_MESSAGE);
            if(input == null) return null;
            if(input.isEmpty()){
                JOptionPane.showMessageDialog(null,"No se ha ingresado nada", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            
            try {
                char letra = input.charAt(0);
                if((letra == 'S' || letra == 's') || (letra == 'R' || letra == 'r') || (letra == 'M' || letra == 'm') || (letra == 'D' || letra == 'd')){
                    String respuesta = String.valueOf(letra);
                    return respuesta;
                }
                JOptionPane.showMessageDialog(null,"No se ha encontrado esta opcion", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                continue;
                
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Dato erroneo", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }  
    }
    
    private static String titulo(String opcion){
        if(opcion.equalsIgnoreCase("S") || opcion.equalsIgnoreCase("s")){ return "SUMA"; }
        if(opcion.equalsIgnoreCase("R") || opcion.equalsIgnoreCase("r")){ return "RESTA"; }
        if(opcion.equalsIgnoreCase("M") || opcion.equalsIgnoreCase("m")){ return "MULTIPLICACION"; }
        return "DIVISION";
    }
    private static String signo(String opcion){
        if(opcion.equalsIgnoreCase("S") || opcion.equalsIgnoreCase("s")){ return "+"; }
        if(opcion.equalsIgnoreCase("R") || opcion.equalsIgnoreCase("r")){ return "-"; }
        if(opcion.equalsIgnoreCase("M") || opcion.equalsIgnoreCase("m")){ return "x"; }
        return "/";
    }
    
    private static double resolucionDeOperacion(String titulo, int n1, int n2){
        double respuesta;
        
        if(titulo.equalsIgnoreCase("SUMA")){ 
            respuesta = n1 + n2;
            return respuesta;
        }
        if(titulo.equalsIgnoreCase("RESTA")){ 
            respuesta = n1 - n2;
            return respuesta;
        }
        if(titulo.equalsIgnoreCase("DIVISION")){ 
            if(n2 ==0){
                JOptionPane.showMessageDialog(null,"No existe division para 0", "ERROR", JOptionPane.ERROR_MESSAGE);
                return 0;
            }
                return (double) n1 / n2;
            
        }
        
            respuesta = n1*n2;
            return respuesta;
        
        
    }
    
    private static void mensajeDelPrograma(String titulo, String signo, int n1, int n2, double respuesta){
        JOptionPane.showMessageDialog(null,"---" + titulo + "---" + "\n" + 
                                            n1 + " " + signo + " " + n2 + " : " + respuesta, 
                                            "SISTEMA", 
                                            JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    
}
