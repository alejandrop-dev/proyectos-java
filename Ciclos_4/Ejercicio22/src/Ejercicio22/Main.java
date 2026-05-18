/*
Ejercicio 22:Pedir 5 calificaciones de alumnos y decir al final si hay un suspenso 
*/

package Ejercicio22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Se le pedira 5 calificaciones de alumnos y se le dira si hay alumnos supendidos ");
            int calificacion;
            int contadorDeSuspendidos = 0;
            boolean suspendidos = false;
            for (int i = 1; i <= 5; i++) {
                calificacion = obtenerCalificaciones(sc, i);
                if(calificacion <=6){
                    suspendidos = true;
                    contadorDeSuspendidos++;
                }
            }
            mensajeDelSistema(suspendidos, contadorDeSuspendidos);
        } catch (Exception e) {
            System.out.println("Error critico en " + e.getMessage());
        }
        
        
    }
    private static Integer obtenerCalificaciones(Scanner sc, int i){
        while(true){
            System.out.print("Ingrese la #" + i + " calificacion del estudiante: ");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada" + "\n");
                continue;
            }
            try {
                int aux = Integer.parseInt(input);
                if(aux <0){
                    System.out.println("La calificacion no ppuede ser menor a 0");
                    continue;
                }
                return aux;
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Solo se admiten numeros enteros" + "\n");
            }
        }
    }
    private static void mensajeDelSistema(boolean numeroNegativo, int contSuspendidos){
        System.out.print("\n");
        System.out.println("-----RESULTADOS-----");
        System.out.println((numeroNegativo == false)? "Todos los alumnos aprobaron" : "Si, hay " + contSuspendidos + " alumnos suspensos.");
    }
    
}
