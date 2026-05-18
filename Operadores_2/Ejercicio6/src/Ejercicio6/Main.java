/*
Ejercicio 6: Hacer un programa que calcule
el cuadrado de una suma.
(a+b)^2= a^2+ 2ab + b^2
*/

package Ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("--- CALCULO DE BINOMIO AL CUADRADO ---");
            double valorDeA = valor(sc, "a: ");
            double valorDeB = valor(sc, "b: ");
            double valorElevadoDeA = Math.pow(valorDeA, 2);
            double valorElevadoDeB = Math.pow(valorDeB, 2);
            double valorDeAmbosPor2 = (valorDeA * valorDeB)*2;
            double total = valorElevadoDeA + valorElevadoDeB + valorDeAmbosPor2;
            double sumaAMasB = valorDeA+ + valorDeB;
            try {
                System.out.print("\nCalculando: (" + valorDeA+ " + " + valorDeB + ")^2");
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(500);
                    System.out.print(".");
                }
            } catch (Exception e) {
                System.out.println("Error critico en " + e.getMessage());
            }
            System.out.println("\nAplicando formula: a^2 + 2ab + b^2 ");
            System.out.println("\n--- RESULTADO ---");
            System.out.printf("Valor de a^2: %10.2f\n" , valorElevadoDeA);
            System.out.printf("Valor de b^2: %10.2f\n" , valorElevadoDeB);
            System.out.printf("Valor de 2ab: %10.2f\n" , valorDeAmbosPor2);
            System.out.println("--------------------------------------");
            System.out.printf("TOTAL (a+b)^2: %10.2f\n", total);
            System.out.println("--------------------------------------");
            System.out.println("Verificacion: (" + sumaAMasB + ")^2: " + total);
            
            
        } 
        catch (Exception e) {
        }
    }
    private static double valor(Scanner sc, String letra){
        double valor;
        while(true){
            try {
                System.out.print("Ingrese el valor de " + letra);
                valor = sc.nextDouble();
                return valor;
            } 
            catch (InputMismatchException e) {
                System.out.println("ERROR. Ingrese un valor numerico");
                sc.nextLine();
            }
        }
        
    }
    
}
