/*
Ejercicio 3: Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
*/
package Ejercicio3;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Ingrese un caracter para ver si es mayuscula o minuscula","Informacion", JOptionPane.INFORMATION_MESSAGE);
        String entrada;
        while (true) {            
             entrada = JOptionPane.showInputDialog(null,"Digite una letra: ", "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
            if(entrada == null){
                JOptionPane.showMessageDialog(null,"Usted esta saliendo del Programa...", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(entrada.isEmpty()){
                JOptionPane.showMessageDialog(null,"No se ha ingresado nada", "Waring", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            if(!Character.isLetter(entrada.charAt(0))){
                JOptionPane.showMessageDialog(null, "Por favor, ingrese solo letras.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            break;
        }
        
        char letra = entrada.charAt(0);
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "La letra '" + letra + "' es una MAYÚSCULA", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "El carácter '" + letra + "' NO es una mayúscula", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }
    
}
