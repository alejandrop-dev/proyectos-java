/*
Ejercicio 7: Pedir números hasta que se introduzca uno negativo, y calcular la media.
*/

package Ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Este programa calculara la media de los numeros ingresados hasta que se detecte un negativo");
            int numero;
            int elementos = 0;
            int suma = 0;
            double media;
            do {         
                numero = obbtenerNumero(sc);
                if(numero >=0){
                    elementos++;
                    suma+=numero;
                }   
            } while (numero >= 0);
            double resultado = resultadoDeOperacion(suma, elementos);
            mensajeDelPrograma(elementos, suma, resultado);
        } catch (Exception e) {
            System.out.println("Error critico en " + e.getMessage());
        }
        
    }
    private static Integer obbtenerNumero(Scanner sc){
        while(true){
            System.out.print("Ingrese un numero: ");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada" + "\n");
                continue;
            }
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Solo se admiten numeros enteros");
            }
        }
    }
    
    private static double resultadoDeOperacion(int suma, int elementos){
        if(elementos ==0) return 0;
        return (double) suma / elementos;
    }
    
    private static void mensajeDelPrograma(int elementos, int suma, double resultado){
        System.out.print("\n");
        System.out.println("------RESULTADOS------");
        System.out.println("Numeros ingresados: " + elementos);
        System.out.println("Suma total: " + suma);
        System.out.println("Resultado de la media: " + String.format("%.2f", resultado));
    }
}
