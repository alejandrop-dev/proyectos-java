/*
Ejercicio 7: Construir un programa que, dado
un numero total de horas, devuelve el numero
de semanas, días y horas equivalentes. Por
ejemplo, dado un total de 1000 horas debe
mostrar 5 semanas, 6 das y 16 horas.
*/

package Ejercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("---CONVERSOR DE TIEMPO---");
            int horasTotales = (int) horas(sc);
            
            int semanas = horasTotales/168;
            int dias = (horasTotales%168)/24;
            int horas = horasTotales%24;
            
            try {
                System.out.print("Realizando conversion");
                for (int i = 0; i < 6; i++) {
                    Thread.sleep(500);
                    System.out.print(".");
                }
                System.out.print("\n");
            } 
            catch (Exception e) {
                System.out.println("Error critico en " + e.getMessage());
            }
            
            System.out.println("\n---Resultados de la conversion---");
            System.out.printf("Semanas: %9d\n", semanas);
            System.out.printf("Dias: %12d\n", dias);
            System.out.printf("Horas: %12d\n", horas);
            System.out.println("-----------------------");
        } 
        catch (Exception e) {
            System.out.println("Error critico en " + e.getMessage());
        }
    }
    
    private static double horas(Scanner sc){
        double h;
        while (true) {           
            try {
                System.out.print("Digite el numero de horas: ");
                h = sc.nextDouble();
                if(h<0){
                    System.out.println("ERROR. No hay horas negativas");
                    continue;
                }
                return h;
            } 
            catch (InputMismatchException e) {
                System.out.println("ERROR. Ingrese un dato numerico");
                sc.nextLine();
            }
        }
        
    }
    
}
