/*
Ejercicio 2: Hacer un programa que calcule e imprima el salario semanal  de un empleado a partir de sus horas semanales trabajadas
y de sus salario por hora
*/

package Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        final double PAGO_POR_HORA = 15.50;
        
        try (Scanner sc = new Scanner(System.in)){
            String nombre = leerNombre(sc);
            int horastrabajadas = horasTrabajadas(sc);
            double totalAPagar = 0;
            
            if(horastrabajadas>40){
                double extra = (horastrabajadas - 40) * (PAGO_POR_HORA * 2);
                double sueldo = 40 * PAGO_POR_HORA;
                totalAPagar = sueldo + extra;
            }
            else{
                totalAPagar = horastrabajadas * PAGO_POR_HORA;
            }
            System.out.println("\n---Recibo del pago semanal---");
            System.out.println("Nombre del Empleado: " + nombre);
            System.out.printf("Horas trabajadas: %d hrs\n" , horastrabajadas);
            System.out.printf("Pago por hora: $%.2f\n", PAGO_POR_HORA);
            System.out.println("------------------------------");
            System.out.printf("TOTAL A PAGAR: $%.2f\n", totalAPagar);
            
  
        }
        catch (Exception e) {
                System.out.println("Error critico en la ejecucion " + e.getMessage());
        }
       
    }
    
    private static int horasTrabajadas(Scanner sc){
        while(true){
            try {
                System.out.print("Ingrese las horas trabajadas: ");
                double  entradas = sc.nextDouble();
                int horas = (int)entradas;
                return horas;
                
            } catch (InputMismatchException e) {
                System.out.println("Error. Debe ingresar un dato numerico");
                sc.nextLine();
            }
            
        }
    }
    
    private static String leerNombre(Scanner sc){
        String nombre;
        while(true){
            
                System.out.print("Ingrese el nombre del empleado: ");
                nombre = sc.nextLine().trim();
                if(!nombre.isEmpty()){
                    return nombre;
                }
                System.out.println("Error. el nombre no puede estar vacio");
                
                
            
        }
        
    }
     
}
