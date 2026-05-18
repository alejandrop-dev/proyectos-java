/*
Ejercicio 14: Pedir 10 sueldos.
Mostrar su suma y cuantos hay
mayores de $1000.
*/

package Ejercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Este programa le pedira 10 sueldos y de dira cuantos son mayores a $1000" + "\n");
            int sueldo;
            int sumaDeSsueldos = 0;
            int contadorDeSueldosMayoresA1000 = 0;
            for (int i = 1; i <= 10; i++) {
                sueldo = obtenerSueldo(sc, i);
                if(sueldo > 1000){
                    contadorDeSueldosMayoresA1000++;
                }
                sumaDeSsueldos+=sueldo;
            }
            mensajeDelPrograma(sumaDeSsueldos, contadorDeSueldosMayoresA1000);
        } catch (Exception e) {
            System.out.println("Error critico en " + e.getMessage());
        }
    }
    
    private static Integer obtenerSueldo(Scanner sc, int i){
        while(true){
            System.out.print("Ingrese el #" + i + " sueldo: $");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada" + "\n");
                continue;
            }
            try {
                int aux = Integer.parseInt(input);
                if(aux <= 0){
                    System.out.println("El sueldo ingresado no puede ser menor o igual a 0" + "\n");
                    continue;
                }
                return aux;
            } catch (NumberFormatException e) {
                System.out.println("Solo se admiten numeros enteros");
            }
        }
    }
    
    private static void mensajeDelPrograma(int sumaDeLosSueldos, int contadorDeSueldosMayoresA1000){
        System.out.print("\n");
        System.out.println("------RESULTADOS------");
        System.out.println("Suma de los sueldos:     $" + sumaDeLosSueldos);
        System.out.println("Sueldos mayores a $1000 : " + contadorDeSueldosMayoresA1000);
    }
    
}
