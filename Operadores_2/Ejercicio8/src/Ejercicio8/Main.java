/*
Ejercicio 8: Construir un programa que
calcule y muestre por pantalla las raíces de
la ecuación de segundo grado de
coeficientes reales.
x = -b +- vb2 - 4ac

2a
*/

package Ejercicio8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("--- SOLUCIONADOR DE ECUACIONES CUADRATICAS ---");
            double a = valores(sc,"a: ");
            double b = valores(sc, "b: ");
            double c = valores(sc, "c: ");
            double divisor = 2*a;
            
            
            double discriminante = Math.pow(b, 2) - ((4 * a)* c); 
            
            
            
            try {
                System.out.print("\nCalculando discriminante...");
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(500);
                    System.out.print(".");
                }
                System.out.print("\n");
            } catch (Exception e) {
                System.out.println("Error critico en " + e.getMessage());
            }
            
            System.out.println("Resultados encontrados:\n");
            
            if(a==0){
                int auxA = (int)a;
                System.out.println("El valor de a es: " + auxA);
                System.out.println("No es una ecuacion cuadratica");
                System.out.println("----------------------------------------------");
                return;
            }
            if(discriminante <0){ 
                System.out.println("El valor del discriminante es " + discriminante + " y es menor a 0");
                System.out.println("La ecuacion no tiene soluciones reales");
                return;
            }
            double raiz = Math.sqrt(discriminante);
            double x1= (-b + raiz)/divisor;
            double x2= (-b - raiz)/divisor;
            System.out.printf("x1= %15.2f\n", x1);
            System.out.printf("x2= %15.2f\n", x2);
            System.out.println("----------------------------------------------");

        } 
        catch (Exception e) {
            System.out.println("Error critico en " + e.getMessage());
        }
    }
    
    private static double valores(Scanner sc, String letra){
        double valor;
        while (true) {            
            try {
                System.out.print("Ingrese coeficiente " + letra);
                valor = sc.nextDouble();
                return valor;

            } 
            catch(InputMismatchException e){
                System.out.println("ERROR. Digite un valor numerico");
                sc.nextLine();
            }
        }
    }
    
}
