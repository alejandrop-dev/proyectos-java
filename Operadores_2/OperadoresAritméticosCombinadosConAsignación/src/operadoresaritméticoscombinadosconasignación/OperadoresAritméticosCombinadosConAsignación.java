package operadoresaritméticoscombinadosconasignación;

import java.util.Scanner;


public class OperadoresAritméticosCombinadosConAsignación {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero = 100;
        
        
        System.out.println("Se mostraran operadores combinados");
        System.out.println("Valor original de la variable numero: 100 ");
        
        numero = 100;
        numero += 20;
        System.out.println("numero += 20: " + numero);
        
        
        numero = 100;
        numero -=20;
        System.out.println("numero -= 20: " + numero) ;
        
        
        numero = 100;
        numero *=20;
        System.out.println("numero x= 20: " + numero);
        
        
        numero = 100;
        numero /=20;
        System.out.println("numero /=20: " + numero);
        
        
    }
    
}
