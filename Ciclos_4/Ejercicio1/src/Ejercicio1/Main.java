/*
Ejercicio 1: Leer un número y
mostrar su cuadrado, repetir el
proceso hasta que se introduzca
un número negativo.
*/
package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Este programa calculara el cuadrado de el numero que ingrese");
            int numero;
            do {
                numero = obtenerNumero(sc);
                if(numero >0){
                    int resultado = resultadoDePotencia(numero);
                    mensajeDeResultado(numero, resultado);
                }
                
            } while (numero > 0);
        } catch (Exception e) {
            System.out.println("Error critico en" + e.getMessage());
        }
        
    }
    
    private static Integer obtenerNumero(Scanner sc){
        while(true){
            System.out.print("Ingrese el numero a elevar: ");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada");
                continue;
            }
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Solo se admiten numeros enteros");
            }
        }
    }
    
    private static Integer resultadoDePotencia(int numero){
        return numero * numero;
    }
    
    private static void mensajeDeResultado(int numero, int potencia){
        System.out.println("------RESULTADO------");
        System.out.println("Numero ingresado:      " + numero);
        System.out.println("Resultado de potencia: " + potencia + "\n");
    }
    
    
}
