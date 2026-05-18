/*
Ejercicio 15: Dadas las edades y
alturas de 5 alumnos, mostrar la edad y
la estatura media, la cantidad de
alumnos mayores de 18 anos, y la
cantidad de alumnos que miden mas de
1.75
*/

package Ejercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAYOR_DE_EDAD = 18;
        final double ESTATURA_MAYOR = 1.75;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Se le pedira la informacion de 5 alumnos y se le dara ciertos resultados");
            int edadDeEstudiantes ;
            double estatura;
            int mediaDeEdad = 0;
            double mediaDeEstatura = 0;
            int cantidadDeMayoriaDeEdad = 0;
            int cantidadDeMayorDeEstaturaDe1_75 = 0;
            int sumaDeEdades = 0;
            double sumaDeEstaturas = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.print("\n");
                System.out.println("-----Ingrese la informacion del #" + i + " estudiante-----");
                edadDeEstudiantes = obtenerEdad(sc, i);
                estatura = obtenerAltura(sc, i);
                if(edadDeEstudiantes > MAYOR_DE_EDAD){
                    cantidadDeMayoriaDeEdad++;
                }
                if(estatura > ESTATURA_MAYOR){
                    cantidadDeMayorDeEstaturaDe1_75++;
                }
                sumaDeEdades+=edadDeEstudiantes;
                sumaDeEstaturas+=estatura;
            }
            mediaDeEdad = obtenerMediaDeEdad(sumaDeEdades);
            mediaDeEstatura = obtenerMediaDeEstatura(sumaDeEstaturas);
            
            mensajeDelPrograma(mediaDeEdad, mediaDeEstatura, cantidadDeMayoriaDeEdad, cantidadDeMayorDeEstaturaDe1_75);
        } catch (Exception e) {
            System.out.println("Error critico en " + e.getMessage());
        }
        
    }
    
    private static Integer obtenerEdad(Scanner sc, int i){
        while(true){
            System.out.print("Ingrese la edad del #" + i + " estudiante: ");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada" + "\n");
                continue;
            }
            try {
                int aux = Integer.parseInt(input);
                if(aux <=0 ){
                    System.out.println("La edad no puede ser mmenor o igual a 0" + "\n");
                    continue;
                }
                return aux;
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Solo se admiten numeros enteros" + "\n");
            }
        }
    }
    private static Double obtenerAltura(Scanner sc, int i){
        while(true){
            System.out.print("Ingrese la estatura del #" + i + " estudiante: ");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada" + "\n");
                continue;
            }
            try {
                double aux = Double.parseDouble(input);
                if(aux <=0 ){
                    System.out.println("La estatura no puede ser mmenor o igual a 0" + "\n");
                    continue;
                }
                return aux;
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Solo se admiten numeros" + "\n");
            }
        }
    }
    
    private static Integer obtenerMediaDeEdad(int sumaDeEdades){
        return sumaDeEdades / 5;
    }
    private static Double obtenerMediaDeEstatura(double sumaDeEstaturas){
        return sumaDeEstaturas / 5;
    }
    
    private static void mensajeDelPrograma(int mediaDeEdad, double mediaDeEstatura, int cantidadDeMayoresDeEdad, int cantidadDeMayoresDeEstatura){
        System.out.print("\n");
        System.out.println("-------RESULTADOS DE LOS ESTUDIANTES-------");
        System.out.println("Media de edad:                          " + mediaDeEdad);
        System.out.println("Media de estatura:                      " + String.format("%.2f", mediaDeEstatura));
        System.out.println("Estudiantes mayores a 18 años:          " + cantidadDeMayoresDeEdad);
        System.out.println("Estudiantes mayores a 1.75 de estatura: " + cantidadDeMayoresDeEstatura);
    }
    
}
