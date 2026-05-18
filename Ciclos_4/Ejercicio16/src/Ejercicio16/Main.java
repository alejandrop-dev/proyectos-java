/*Ejercicio 16: Pide un número
(que debe estar entre 0 y 10) y
mostrar la tabla de multiplicar de
dicho número*/

package Ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un numero del 0-10 para mostrar su tabla de multiplicar");
            int numero = obtenerNumero(sc);
            System.out.println("Tabla de multiplicar del " + numero);
            for (int i = 0; i <= 12; i++) {
                int resultado = i * numero;
                System.out.println(i + " x " + numero + " = " + resultado);
                
            }
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
                if(aux < 0 || aux > 10){
                    System.out.println("El numero debe estar en el rango de 0-10" + "\n");
                    continue;
                }
                return aux;
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Solo se admiten numeros enteros" + "\n");
            }
        }
    }
    
}
