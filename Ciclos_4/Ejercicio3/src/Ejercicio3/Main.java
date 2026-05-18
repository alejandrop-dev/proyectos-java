/*
Ejercicio 3: Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
*/

package Ejercicio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Este programa le dira si el numero que ingreso es par o impar");
            System.out.println("0: Salir del programa" + "\n");
            int numero;
            do {                
                numero = obtenerNumero(sc);
                if(numero !=0){
                    if(numero%2 == 0){
                        String par = "Par";
                        mensajeDeInicio();
                        mensajeDeResultado(numero,par );
                    }
                    else{
                        String impar = "Impar";
                        mensajeDeInicio();
                        mensajeDeResultado(numero, impar);
                    }
                }
            } while (numero !=0);
            
            
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
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Solo se admiten numeros enteros");
            }
            
        }
    }
    private static void mensajeDeInicio(){
        System.out.println("------RESULTADOS------");
    }
    
    private static void mensajeDeResultado(int numero, String resultado){
        System.out.println("Numero ingresado: " + numero);
        System.out.println("Respuesta: El numero es " + resultado + "\n");
    }
    
}
