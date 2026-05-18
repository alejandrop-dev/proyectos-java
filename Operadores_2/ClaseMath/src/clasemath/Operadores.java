//Clase Math
package clasemath;

import java.util.Scanner;

public class Operadores {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //*************************************************************************************
        double raiz = Math.sqrt(36.67);     //Raiz cuadrada de un numero 
        System.out.println("La raiz de 36.67 es:  " + raiz);     //Mostrar la Raiz cadrada de uun numero 
        //************************************************************************************
        double base =5 , exponente = 2;                     //Potencia
        double resultado = Math.pow(base, exponente);       //Potencia
        System.out.println("El resultado es:" + resultado); //Mostrar potencia
        //************************************************************************************
        double numero = 20.4587125;                         //round para redondear n numero
        long respuesta1 = Math.round(numero);        //round para redondear un nuemro
        System.out.println("El numero redondeado con long es: " + respuesta1 );   //Mostra r numero redondeado con long 
        
        double numero2 = 541.21558569;
        int respuesta2 = Math.round(respuesta1);
        System.out.println("El numero redondeado con int es: " + respuesta2);
        //*************************************************************************************
        double num_random = Math.random ();
        System.out.println("El numero randon es: " + num_random);
        
        
    }
    
}
