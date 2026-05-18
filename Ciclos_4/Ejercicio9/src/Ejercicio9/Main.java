/*
Ejercicio 9: Escribir todos los números del 100 al 0 de 7 en 7.
*/

package Ejercicio9;
public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Se imprimiran todos los numeros del 100 al 0 de 7 en 7");
            for (int i = 100; i >=0; i-=7) {
                System.out.println("\t" + i);
            }
        } catch (Exception e) {
            System.out.println("Error critico en " + e.getMessage());
        }
    }
    
}
