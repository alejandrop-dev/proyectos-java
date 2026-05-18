/*
Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros números impares.
*/

package Ejercicio11;
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Este programa le mostrara el producto de los primeros 10 numeros impares");
            long producto =1;
            int j=1;
            for (int i = 1; i <=20; i+=2, j++) {
                producto*=i;
                mensajeDeIteracion(producto, j);
            }
            mensajeDelPrograma(producto);
        } catch (Exception e) {
            System.out.println("Error critico en " + e.getMessage());
        }
    }
    
    private static void mensajeDelPrograma(long producto){
        System.out.print("\n");
        System.out.println("El producto es: " + producto);
    }
    private static void mensajeDeIteracion(long producto, int j){
        System.out.println("El producto del #" + j + " numero es: " + producto);
    }
    
    
}
