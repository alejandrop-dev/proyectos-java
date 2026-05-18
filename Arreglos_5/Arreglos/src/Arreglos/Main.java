package Arreglos;
public class Main {
    public static void main(String[] args) {
        try {
            int [] numeros = {1,2,3,4,5,6,7,8,9,10};
            for (int i = 0; i < numeros.length; i++) { //Esta con i< 10 pero le puse mejor  numeros.length
                System.out.println(numeros[i]);
            }
        } catch (Exception e) {
            System.out.println("Error critico en " + e.getMessage());
        }
    }
    
}
