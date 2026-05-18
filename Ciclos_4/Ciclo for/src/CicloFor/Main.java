/*
for(inicialización ; condición ; aumento o decremento) {
Intrucciones;
}
*/

package CicloFor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int contador = obtenerNumero(sc);
            int i = 1;
            mensajeDeInicio(i, contador);
            for(i=1;i<=contador;i++){
            System.out.println(i);
        }
            
        } catch (Exception e) {
            System.out.println("Error critico en " + e.getMessage());
        }   
    }
    
    private static Integer obtenerNumero(Scanner ssc){
        while(true){
            System.out.print("Ingrese hasta que numero quiere contar: ");
            String input = ssc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada");
                continue;
            }
            try {
                Integer aux = Integer.parseInt(input);
                if(aux <=0){
                    System.out.println("Ingrese un  numero mayor a 0");
                    continue;
                }
                return aux;
            } catch (Exception e) {
                System.out.println("Error solo se admiten numeros enteros");
            }
            
        }
    }
    
    private static void mensajeDeInicio(int inicio, int fin){
        System.out.println("Imprimiendo numeros del " + inicio + "-" + fin + ": ");
        
    }
    
}
