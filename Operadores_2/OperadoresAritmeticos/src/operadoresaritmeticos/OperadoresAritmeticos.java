package operadoresaritmeticos;

import java.util.Scanner;       //Libreria para leer datos 

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);       //Para guardar los datos 
        
        float numero1, numero2, suma, resta, multi, div, resto  ;
        System.out.println("Ingrese dos numeros");
        
        System.out.print("Ingrese el primer numero: ");
        numero1 = sc.nextFloat();
        System.out.print("Ingrese el segundo nuemro: ");
        numero2 = sc.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multi = numero1 * numero2;
        div = numero1 / numero2;
        resto = numero1 % numero2;
        
        System.out.println("\nResultados:");
        System.out.println(numero1 + " + " + numero2 + " = " + suma);
        System.out.println(numero1 + " - " + numero2 + " = " + resta);
        System.out.println(numero1 + " x " + numero2 + " = " + multi);
        System.out.println(numero1 + " / " + numero2 + " = " + div);
        System.out.println(numero1 + " % " + numero2 + " = " + resto);
        
        
    }
    
}
