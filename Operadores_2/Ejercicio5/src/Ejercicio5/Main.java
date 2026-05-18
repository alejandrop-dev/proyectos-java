/*
Ejercicio 5: La calificación final de un estudiante de Informática se calcula con base a las calificaciones de cuatro aspectos de su rendimiento 
académico: participación, primer examen parcial, segundo examen parcial y examen final.     Sabiendo que las calificaciones anteriores entran 
a la calificación final con ponderaciones del 10%, 25%, 25% y 40%, Hacer un programa que calcule e imprima la calificación final obtenida por
un estudiante.
*/
package Ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PARTICIPACION = 0.10;
        final double PRIMER_PARCIAL = 0.25;
        final double SEGUNDO_PARCIAL = 0.25;
        final double EXAMEN_FINAL = 0.40;
        
        try (Scanner sc = new Scanner(System.in)){
            String nombre = nombreDelEstudiante(sc);
            double notaParticipacion = nota(sc, "Participacion", " (10%): ");
            double notaPrimerParcial = nota(sc,"Primer Parcial", " (25%): ");
            double notaSegundoParcial = nota(sc,"Segundo Parcial", " (25%): ");
            double notaExamenFinal = nota(sc,"Examen Final", " (40%): ");
            
            double notaFinalParticipacion = notaParticipacion* PARTICIPACION;
            double notaFinalPrimerParcial = notaPrimerParcial *= PRIMER_PARCIAL;
            double notaFinalSegundoParcial = notaSegundoParcial *= SEGUNDO_PARCIAL;
            double notaFinalExamenFinal = notaExamenFinal *= EXAMEN_FINAL;
            double notafinal = notaFinalParticipacion + notaFinalPrimerParcial + notaFinalSegundoParcial + notaFinalExamenFinal;
            String estado = "";
            if(notafinal>=7){
                estado = "APROBADO";
            }
            else{
                estado = "REPROBADO";
            }
            
            //Formato de salida
            try {
                System.out.print("\nProcesando datos del Estudiante");
                for(int i=0;i<5;i++){
                    Thread.sleep(500);
                    System.out.print(".");
                }
                System.out.print("\n");
            } catch (Exception e) {
                System.out.println("Error critico en " + e.getMessage());
            }
            
            System.out.println("---REPORTE ACADEMICO DEL ESTUDIANTE: " + nombre);
            System.out.printf("Participacion (10%%): %10.2f\n", notaFinalParticipacion);
            System.out.printf("1er Parcial (25%%): %12.2f\n", notaFinalPrimerParcial);
            System.out.printf("2do Parcial (25%%): %12.2f\n", notaFinalSegundoParcial);
            System.out.printf("Examen Final (40%%): %11.2f\n", notaFinalExamenFinal);
            System.out.println("-------------------------------------------");
            System.out.printf("Nota final: %19.2f\n", notafinal);
            System.out.println("-------------------------------------------");
            System.out.println("ESTADO:                    " +  estado);
            
        } 
        catch (Exception e) {
            System.out.println("Error critico en " + e.getMessage());
        }

    }
    
    private static String nombreDelEstudiante(Scanner sc){
        String nombre;
        while(true){
            System.out.print("Ingrese el nombre del estudiante: ");
            nombre = sc.nextLine().trim();
            if(!nombre.isEmpty()){
                return nombre;
            }
            System.out.println("ERROR. El nombre no puede estar vacio");
        }
    }
    
    private static double nota (Scanner sc, String orden, String porcentaje){
        double nota;
        while (true) {            
            try {
                System.out.print("Ingrese la nota de " + orden + porcentaje);
                nota = sc.nextDouble();
                if(nota<0){
                    System.out.println("La nota no puede ser menor a 0");
                    continue;
                }
                else if(nota>10){
                    System.out.println("La nota no puede ser mayor a 10");
                    continue;
                }
                return nota;
            } 
            catch (InputMismatchException e) {
                System.out.println("Error. Ingrese un dato numerico");
                sc.nextLine();
            }
        }
    }
    
    
}
