/*
Ejercicio 3: Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que poseen Luis y Guillermo
juntos. Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.

*/

package Ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)){
            double guillermo = DineroGuillermo(sc);
            try {
        System.out.print("\nProcesando datos financieros");
        for(int i = 0; i < 5; i++) { // Un pequeño bucle para puntos suspensivos
            Thread.sleep(500); // Medio segundo por punto
            System.out.print(".");
        }
        System.out.println("\n");
        }  
        catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
            
            double luis = guillermo / 2;
            double juan = (guillermo + luis)/2;
            double total = guillermo + luis + juan;
            System.out.println("\n--- RESULTADOS ---");
            System.out.printf("Guillermo tiene: $%.2f\n", guillermo);
            System.out.printf("Luis tiene:      $%.2f\n", luis);
            System.out.printf("Juan tiene:      $%.2f\n", juan);
            System.out.println("------------------");
            System.out.printf("TOTAL:           $%.2f\n", total);
            
            
        } catch (Exception e) {
            System.out.println("ERROR INESPERADO " + e.getMessage());
        }
    }
    
    private static double DineroGuillermo(Scanner sc){
        while(true){
            try {
                System.out.print("Ingrese la cantidad de dinero de Guillermo: " );
                double dinero = sc.nextDouble();
                if(dinero <= 0 ){
                    System.out.println("No puede ingresar cantidades negativas de Dinero");
                    continue;
                }
                return dinero;
            } catch (InputMismatchException e) {
                System.out.println("ERROR. Ingrese datos numericos");
                sc.nextLine();
            }
            
        }
        
    }
    
    
}
