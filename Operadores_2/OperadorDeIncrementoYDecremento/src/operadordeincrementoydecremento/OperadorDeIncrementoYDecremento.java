package operadordeincrementoydecremento;

import java.util.Scanner;

public class OperadorDeIncrementoYDecremento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Formas de hacerlo:");
        int x= 5,y;
        
        x++;
        System.out.println("5++ = " + x);
        
        
        x = 5;
        x--;
        System.out.println("5-- = " + x);
        
        x=5;
        y=x++;
        System.out.println("***************");
        System.out.println("y = x++: ");
        System.out.println("y = " + y);
        System.out.println("x = " + x);
        
        System.out.println("***************");
        x=5;
        y= ++x; 
        
        System.out.println("y = ++x");
        System.out.println("y = " + y);
        System.out.println("x = " + x);
        
        
        
        
    }
    
}
