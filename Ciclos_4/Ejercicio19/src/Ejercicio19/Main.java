/*
Ejercicio 19: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
*/

package Ejercicio19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.");
            int notas;
            int cantAprobados = 0;
            int cantCondicionados = 0;
            int cantReprobados = 0;
            for (int i = 1; i <=6; i++) {
                notas = obtenernotas(sc, i);
                if(notas >= 5)cantAprobados++;
                else if(notas == 4) cantCondicionados++;
                else cantReprobados++;
            }
            mensajeDelPrograma(cantAprobados, cantCondicionados, cantReprobados);
            
        } catch (Exception e) {
            System.out.println("Error critico en " + e.getMessage());
        }
        
    }
    private static Integer obtenernotas(Scanner sc, int i){
        while(true){
            System.out.print("Ingrese la nota del #" + i + " estudiante: ");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada" + "\n");
                continue;
            }
            try {
                int aux = Integer.parseInt(input);
                if(aux < 0 || aux > 10){
                    System.out.println("Nota ingresada no valida" + "\n");
                    continue;
                }
                return aux;
            } catch (NumberFormatException e) {
                System.out.println("Solo se admiten numeros enteros" + "\n");
            }
        }
    }
    
    private static void mensajeDelPrograma(int aprobados, int condicionados, int reprobados){
        System.out.print("\n");
        System.out.println("------RESULTADOS DE  LOS ESTUDIANTES------");
        System.out.println("Cantidad de Aprobados:     " + aprobados);
        System.out.println("Cantidad de Condicionados: " + condicionados);
        System.out.println("Cantidad de Reprobados:    " + reprobados);
    }
    
}
