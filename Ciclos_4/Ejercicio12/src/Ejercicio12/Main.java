/*
Ejercicio 12: Pedir un numero y
calcular su factorial.

N! = 1*2*3 *...* N
*/

package Ejercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Se le pedira un numero positivo mayor a 0 y se calculara su factorial");
            int numero = obtenerNumero(sc);
            long resultado =1;
            System.out.print( numero + "!: ");
            for (int i = 1; i <=numero; i++) {
                resultado*=i;
                System.out.print(i);
                if(i<numero){ System.out.print(" * "); }
            }
            mensajeDeRespuesta(numero, resultado);
            
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
                int aux = Integer.parseInt(input);
                if(aux<=0){
                    System.out.println("solo se admiten numeros mmayores a 0" + "\n");
                    continue;
                }
                return aux;
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Solo se admiten numeros enteros" + "\n");
            }
        }
    }
    
    private static void mensajeDeRespuesta(int numero, long resultado){
        System.out.print("\n");
        System.out.println("El resultado de " + numero + "! es:" + resultado);
    }
    
}
