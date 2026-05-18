/*
Ejercicio 20: Pedir un número N,
introducir N sueldos, y mostrar el
sueldo máximo.
*/
package Ejercicio20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Se le pedira un numero N y debera introducir N sueldos. Se le mostrara el sueldo maximo.");
            int numero = obtenerNumeroN(sc);
            int sueldoMaximo =0;
            int sueldo;
            for (int i = 1; i <= numero; i++) {
                sueldo = obtenerSueldo(sc, i);
                if(sueldo > sueldoMaximo){
                    sueldoMaximo = sueldo;
                }
            }
            mensajeDelSistema(sueldoMaximo);
        } catch (Exception e) {
        }
    }
    private static Integer obtenerNumeroN(Scanner sc){
        while(true){
            System.out.print("Digite el numero N: ");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada" + "\n");
                continue;
            }
            try {
                int aux = Integer.parseInt(input);
                if(aux <=0){
                    System.out.println("El numero N no puede ser menor o igual a 0" + "\n");
                    continue;
                }
                return aux;
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Solo se admiten numeros enteros" + "\n");
            }
        }
    }
    private static Integer obtenerSueldo(Scanner sc, int i){
        while(true){
            System.out.print("Digite el #" + i + " sueldo: $");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada" + "\n");
                continue;
            }
            try {
                int aux = Integer.parseInt(input);
                if(aux <=0){
                    System.out.println("El sueldo no puede ser menor o igual a 0" + "\n");
                    continue;
                }
                return aux;
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Solo se admiten numeros enteros" + "\n");
            }
        }
    }
    private static void mensajeDelSistema(int sueldoMaximo){
        System.out.print("\n");
        System.out.println("------RESULTADOS------");
        System.out.println("El sueldo maximo es :  $" + sueldoMaximo);
    }
    
}
