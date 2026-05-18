package Curso_Java7;

public class Introduccion_Constantes {

    public static void main(String[] args) {
        System.out.println("***************Explicacion de variables constantes***************");
        System.out.println("Una variable constante no puede cambiar su valor ");
        System.out.println("Ejemplo:\n"
                + "int numero = 15\n"
                + "Mostrara el numero 15\n"
                + "\n***************\n"
                + "Ejemplo mostrando una variable cambiando de valor\n"
                + "int numero2 = 15\n"
                + "numero2 = 20\n"
                + "Mostrara el numero 20\n"
                + "\n***************\n"
                + "Ejemplo de una variable constante que no puede cambiar de valor\n"
                + "final int numero_constante = 50\n"
                + "Mostrara el numero 50\n"
                + "\n***************\n"
                + "final numero_constante2 = 50\n"
                + "numero_constante2 = 45\n"
                + "Se mostrara un error ya que la variable numero_constante2 no se puede modificar por el final que le pusimos antes de declarar la variable\n");
      
    }
    
}
