package Curso_Java8;

import java.util.Scanner;                           //Linea importante para la entrada de datos 

public class EntradaYSalidaDeDatos {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);  //Linea necesaria para la entrada de datos
        
        System.out.println("*****************Guardar numeros*****************");
        int numero;
        System.out.print("Digite un numero entero: ");
        numero = entrada.nextInt();
        
        
        //******************************************************
        
        float numero_flotante ; 
        System.out.print("Ingrese un numero flotante: ");
        numero_flotante = entrada.nextFloat();  //Al momento de poner el numero decimal se pone una coma y no un punto 
        
        
        //******************************************************
        
        double numero_double;
        System.out.print("Ingrese un numero double: ");
        numero_double = entrada.nextDouble();
        
        System.out.println("\nNumeros ingresados:");
        System.out.println("El numero entero es: " + numero);
        System.out.println("El numero flotante es: " + numero_flotante);
        System.out.println("El numero double es: " + numero_double);
        
        entrada.nextLine();
        //******************************************************
        System.out.print("\n*****************Guardar caracteres*****************\n");
        String cadena ;
        System.out.print(  "Digite una cadena:");
        cadena = entrada.nextLine();    //si lo dejamos en entrada.next solo se guardara la primera palabra hasta que se encuentre un espacio 
        
        char letra ;
        System.out.print("Ingrese una letra:");
        letra = entrada.next().charAt(0);
        
        
        System.out.println("La cadena de caracteres es: " + cadena);
        System.out.println("La letra ingresada es:" + letra);
        
        
        
    }
     
}
