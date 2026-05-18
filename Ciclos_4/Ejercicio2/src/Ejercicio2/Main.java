/*
Ejercicio 2: Leer un numero e indicar si es positivo o negativo.
El proceso se repetirá hasta que se introduzca un 0.
*/

package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    //Te puedo nalgear Gems?
        try (Scanner sc = new Scanner(System.in)){
            int numero;
            System.out.println("Numero ingresado es positivo o negativo.?");
            System.out.println("0: Salir del programa" + "\n");
            do {                
                numero = obtenerNumeroValido(sc);
                if(numero < 0){
                    String negativo = "Negativo";
                    mensajeDelPrograma(numero,negativo);
                }
                if(numero > 0){
                    String positivo = "Positivo";
                    mensajeDelPrograma(numero, positivo);
                }
            } while (numero !=0);
        } catch (Exception e) {
        }
        
    }
    private static Integer obtenerNumeroValido(Scanner sc){
        while (true) {            
            System.out.print("Ingrese un numero: ");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada");
                continue;
            }
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Error solo se admiten numeros enteros");
            }
        }
    }
    private static void mensajeDelPrograma(int numero, String resultado){
        System.out.println("-------RESULTADOS-------");
        System.out.println("El numero ingresado: " + numero);
        System.out.println("El numero es " + resultado + "\n");
    }
    
}
