/*
Ejercicio 4: Pedir números hasta que se teclee uno negativo, y
mostrar cuantos numeros se han introducido.
*/

package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Se le mostrara cuantos numeros ingreso hasta que se detecte un numero negativo");
            int numero;
            int contador = 0;
            do {                
                numero = obtenerNumero(sc);
                if(numero>=0){
                    contador+=1;
                }
                else{
                    mensajeDelPrograma(contador);
                }
                
            } while (numero >= 0);
            
        } catch (Exception e) {
            System.out.println("Error critico en " + e.getMessage());
        }
        
    }
    private static Integer obtenerNumero(Scanner sc){
        while(true){
            System.out.print("Ingrese un numero: ");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada");
                continue;
            }
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Solo se admiten numeros enteros");
            }
        }
    }
    
    private static void mensajeDelPrograma(int contador){
        System.out.println("-----RESULTADO-----");
        System.out.println("Se ha introducido un total de " + contador + " numeros" + "\n");
    }
    
}
