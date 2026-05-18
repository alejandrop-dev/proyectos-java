package Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String MENOR = "menor";
        final String MAYOR = "mayor";
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Juego de adivinar un numero entre 1-100" + "\n");
            int numero;
            int contador =0;
            int aleatorio =(int) (Math.random()* 100);
            do {                
                numero = obtenerNumero(sc);
                contador+=1;
                    if(numero == aleatorio){
                        mensajeDeLogro(aleatorio,contador);
                    }
                    else if(numero > aleatorio){
                        mensajeCorto(MENOR);
                    }
                    else{
                        mensajeCorto(MAYOR);
                    }
                    
                    
            } while (numero != aleatorio);
        } catch (Exception e) {
            System.out.println("Error critico en " + e.getMessage());
        }
    }
    
    private static Integer obtenerNumero(Scanner sc){
        while(true){
            System.out.print("Ingrese un numero: ");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada");
                continue;
            }
            
            try {
                int aux = Integer.parseInt(input);
                if(aux < 0 || aux >100){
                    System.out.println("El rango de numeros es de (0-100)");
                    continue;
                }
                return aux;
            } catch (NumberFormatException e) {
                System.out.println("Solo se admiten numeros enteros");
            }
        }
    }
    
    private static void mensajeCorto(String opcion){
        System.out.println("El numero es " + opcion + "\n");
    }
    
    private static void mensajeDeLogro(int numero, int intentos){
        System.out.println("------ACERTASTE------");
        System.out.println("Falicidades el numero era " + numero);
        System.out.println("Numero de intentos: " + intentos);
    }
    
}
