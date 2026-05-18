/*
Ejercicio 6: Pedir numeros hasta
que se teclee un 0, mostrar la
suma de todos los números
introducidos.
*/

package Ejercicio6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){  //Porque gems ya no me ama :c
            System.out.println("Este programa sumara todos los numeros ingresados hasta detectar un 0");
            int numero;
            int suma = 0;
            int contador = 0;
            do {
                numero = obtenerNumero(sc);
                if(numero !=0){
                    suma += numero;
                    contador++;
                }
            } while (numero !=0);
            mensajeDelPrograma(contador, suma);
            
        } catch (Exception e) {
            System.out.println("Error critico en " + e.getMessage());
        }
    }
    
    private static Integer obtenerNumero(Scanner sc){
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
                System.out.println("ERROR. Solo se admiten numeros enteros" + "\n");
            }
        }
    }
    
    private static void mensajeDelPrograma(int cantidad, int suma ){
        System.out.print("\n");
        System.out.println("------RESULTADOS------");
        System.out.println("Cantidad de numeros ingresados:       " + cantidad);
        System.out.println("Suma total de los numeros ingresados: " + suma);
    }
    
}
