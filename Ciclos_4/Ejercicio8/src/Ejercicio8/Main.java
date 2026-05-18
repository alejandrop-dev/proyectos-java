/*
Ejercicio 8: Pedir un numero N, y
mostrar todos los numeros del 1
al N.
*/

package Ejercicio8;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
   public static void main(String[] args) {
       System.out.println("Este programa va a imprimir numeros del 1 hasta N");
       try(Scanner sc = new Scanner(System.in)) {
           int numero = obtenerNumero(sc);
           mensajeDeApertura(numero);
           for (int i = 1; i <= numero; i++) {
               System.out.println("\t" + i);
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
               if(aux <=0){
                   System.out.println("Solo se admiten numeros mayores a 1" + "\n");
                   continue;
               }
               return aux;
           } catch (NumberFormatException e) {
               System.out.println("ERROR. Solo se admiten numeros enteros" + "\n");
           }
       }
   }
   
   private static void mensajeDeApertura(int numero){
       System.out.print("\n");
       System.out.println("Imprimiendo numeros del 1-" + numero);
   }
    
}
