/*
Ejercicio 10: Pedir 10 numeros y escribir la suma total.
*/

package Ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Este programa le pedira 10 numeros y le dara la suma total");
            int numero = 0;
            int suma = 0;
            for (int i = 1; i <= 10; i++) {
                numero = obtenerNumero(sc,i);
                suma+=numero;
            }
            mensajeDelPrograma(suma);
        } catch (Exception e) {
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
    
    private static void mensajeDelPrograma(int suma){
        System.out.print("\n");
        System.out.println("Se ingresaron los 10 numeros correctamente");
        System.out.println("La suma total es: " + suma);
    }
    
}
