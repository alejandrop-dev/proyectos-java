/*
Ejercicio 21: Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.

*/

package Ejercicio21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        boolean numeroNegativo = false;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Se le pedira 10 numeros y le le indicara si hay un negativo");
            for (int i = 1; i <= 10; i++) {
                numero = obtenerNumero(sc, i);
                if(numero < 0){
                    numeroNegativo = true;
                }
            }
            mensajeDelSistema(numeroNegativo);
        } catch (Exception e) {
            System.out.println("Error critico en " + e.getMessage());
        }
    }
    private static Integer obtenerNumero(Scanner sc, int i){
        while(true){
            System.out.print("Ingrese el #" + i + " numero: ");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada" + "\n");
                continue;
            }
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Solo se admiten numeros enteros" + "\n");
            }
        }
    }
    private static void mensajeDelSistema(boolean numeroNegativo){
        System.out.print("\n");
        System.out.println("-----RESULTADOS-----");
        System.out.println((numeroNegativo == false)? "No se ha ingresado ningun negativo" : "Se ha ingresado un negativo");
    }
    
}
