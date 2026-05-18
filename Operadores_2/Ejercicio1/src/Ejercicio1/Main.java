/*
Ejercicio 1: Hacer un programa que calcule e imprima la suma de tres calificaciones
*/
package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        try (Scanner sc = new Scanner(System.in)){
            double n1 = leerNota(sc, "primera");
            double n2 = leerNota(sc, "segunda");
            double n3 = leerNota(sc, "tercera");
           
            double suma = n1 + n2 + n3;
            
            System.out.printf("%nLa suma total de las calificaciones es: %.2f%n" , suma);
        }
        catch (Exception e) {
            System.out.println("Error critico en la ejecucion " + e.getMessage());
        }
        
        
                
        
    }
        private static double leerNota(Scanner sc , String orden){
            while(true){
                try {
                    System.out.print("Ingrese la " + orden + " nota: ");
                    double nota = sc.nextDouble();
                    
                    if(nota<0 || nota>10){
                        System.out.println("Error, la nota debe estar en el rango de 0-10");
                        continue;
                    }
                    return nota;
                    
                } catch (InputMismatchException e) {
                    System.out.println("Error, debe ingresar un valor numerico valido");
                    sc.nextLine();
                }
            }
        }
}