/*
Ejercicio 4: Una compañía de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales, mas una comisión de
$150 por cada carro vendido, más el 5% del valor de la venta por carro. Cada mes el capturista de la empresa ingresa en la
computadora los datos pertinentes. Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
*/
package Ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PAGO_POR_COMISION_DE_VENTA = 150;
        final double PAGO_POR_COMISION_DE_VENTA_DEL_5_PORCIENTO = 0.05; //5%
        final double SALARIO_BASE = 1000;
        
        try(Scanner sc = new Scanner(System.in)){
            String nombre =nombre(sc);
            int ventas = ventaDeCarro(sc);
            double sumaDePrecios=0;
            for (int i = 0; i < ventas; i++) {
                System.out.print("Ingrese el valor del carro " + (i+1) + ":   $");
                double precios = sc.nextDouble();
                sumaDePrecios += precios;
            }
            double comisionPorVenta = ventas * PAGO_POR_COMISION_DE_VENTA;
            double comisionDel5Porciento = sumaDePrecios * PAGO_POR_COMISION_DE_VENTA_DEL_5_PORCIENTO;
            
            double totalARecibir = SALARIO_BASE + comisionPorVenta + comisionDel5Porciento;
            //Formato de salida 
            try {
                System.out.print("\nProcesando datos financieros");
                for(int i = 0; i<6;i++){
                    Thread.sleep(600);
                    System.out.print(".");
                }
                System.out.println("\n");
            } 
            catch (Exception e) {
                System.out.println("Error critico en " + e.getMessage());
            }
            
            System.out.println("---LIQUIDACION MENSUAL: " + nombre  + "---");
            System.out.printf("Salario Base: $%.2f\n", SALARIO_BASE);
            System.out.printf("Comision por unidad: $%.2f\n", comisionPorVenta);
            System.out.printf("Plus del 5%% ventas: $%.2f\n", comisionDel5Porciento);
            System.out.println("----------------------------------");
            System.out.printf("Total a recibir: $%.2f\n", totalARecibir);
            System.out.println("----------------------------------");        
            
        } 
        catch (Exception e) {
            System.out.println("Error critico en la ejecucion " + e.getMessage() );
        }
       
    }
    
    private static String nombre(Scanner sc){
        String nombre;
        while(true){
            System.out.print("Ingrese el nombre del empleado: " );
             nombre = sc.nextLine().trim();
             if(!nombre.isEmpty()){
                 return nombre;
             }
             System.out.println("ERROR. El nombre no puede estar vacio");
        }
    }
    
    private static int ventaDeCarro(Scanner sc){
        double auxVenta;
        while(true){
            try {
                System.out.print("Cuantos carros vendio al mes: ");
                auxVenta = sc.nextDouble();
                int venta = (int) auxVenta;
                if(venta<0){
                    System.out.println("Error. No puede haber numeros negativos");
                    continue;
                }
                return venta;
            } catch (InputMismatchException e) {
                System.out.println("Error. Por favor ingrese un numero");
                sc.nextLine();
            }
        }
    }
    
    
    
}
