/*
do {
    instrucciones;
}while(condicion);
*/
//Se realizara un programa que imprima numeros hasta n
package pkgdo.pkgwhile;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);){
            int i = 1;
            int contador = obtenerNumero(sc);
            mensajeDeApertura(i, contador);
            do{
                System.out.println(i);
                i++;
            }while(i<=contador);
        } catch (Exception e) {
            System.out.println("Error critico en" + e.getMessage());
        } 
    }
    
    
    private static Integer obtenerNumero(Scanner sc){
        while(true){
            System.out.print("Digite la cantidad de terminos: ");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada");
                continue;
            }
            try {
                Integer aux = Integer.parseInt(input);
                if(aux <= 0){
                    System.out.println("Ingrese un numero mayos a 0");
                    continue;
                }
                return aux;
            } catch (NumberFormatException e) {
                System.out.println("ERRORR, solo se admiten datos enteros");
            }
        }
    }
    
    private static void mensajeDeApertura(int inicio, int fin){
        System.out.println("Imprimiendo numeros del " + inicio + "-" + fin + ": ");
    }
    
}
