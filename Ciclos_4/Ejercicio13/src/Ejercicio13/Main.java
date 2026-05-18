/*
Ejercicio 13: Pedir 10 números.
Mostrar la media de los números positivos 
la media de los numeros negativos y la cantidad
de ceros.

*/

package Ejercicio13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int contador =10;   //limite establecido por el programa
            int numeros0Ingresados =0;
            int cantidadDePositivos = 0;
            int sumaPositivos = 0;
            int cantidadDeNegativos = 0;
            int sumaNegativos = 0;
            int numero;
            double mediaDePositivos;
            double mediaDeNegativos;
            System.out.println("Este programa le pedira 10 numeros y le dara la media de los negativos y positivos y la cantidad de los 0 ingresados");
            for (int i = 1; i <= contador; i++) {
                numero = obtenerNumero(sc,i);
                if(numero > 0){
                    cantidadDePositivos++;
                    sumaPositivos+=numero;
                }
                else if(numero < 0){
                    cantidadDeNegativos++;
                    sumaNegativos+=numero;
                }
                else{
                    numeros0Ingresados++;
                }
            }
            mediaDePositivos = resultadoDeLosPositivos(sumaPositivos, cantidadDePositivos);
            mediaDeNegativos = resultadoDeLosNegativos(sumaNegativos, cantidadDeNegativos);
            mensajeDelPrograma(cantidadDePositivos, cantidadDeNegativos, sumaPositivos, sumaNegativos, numeros0Ingresados, mediaDePositivos, mediaDeNegativos);
            
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
    
    private static double resultadoDeLosPositivos(int sumaPositivos, int cantidadDePositivos){
        if(cantidadDePositivos == 0) return 0;
        return (double)sumaPositivos / cantidadDePositivos;
    }
    private static double resultadoDeLosNegativos(int sumaNegativos, int cantidadDeNegativos){
        if(cantidadDeNegativos == 0) return 0;
        return (double)sumaNegativos / cantidadDeNegativos;
    }
    
    private static void mensajeDelPrograma(int cantidadDePositivos, int cantidadDeNegativos, int sumaPositivos, int sumaNegativos, int numeros0Ingresados, double mediaDePositivos, double mediaDeNegativos){
        System.out.print("\n");
        System.out.println("------Resultados------");
        System.out.println("Numeros positivos ingresados: " + cantidadDePositivos);
        System.out.println("Suma de los positivos:        " + sumaPositivos);
        System.out.println("Media de los positivos:       " + String.format("%.2f", mediaDePositivos));
        System.out.println("-----------------------------");
        System.out.println("Numeros negativos ingresados: " + cantidadDeNegativos);
        System.out.println("Suma de los negativos:        " + sumaNegativos);
        System.out.println("Media de los negativos:       " + String.format("%.2f", mediaDeNegativos));
        System.out.println("-----------------------------");
        System.out.println("Numero de 0 ingresados:       " + numeros0Ingresados);
    }
    
}
