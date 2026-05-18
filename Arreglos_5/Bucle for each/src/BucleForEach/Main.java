/*
Bucles for each
*/
package BucleForEach;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Se usara el bucle for each y se mostrara 5 textos" , "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
        String [] nombres = {"Alejandro" , "Gems", "Gata Rompe hogares: Nayla" , "I like Japan", "<3"};
        StringBuilder resultado = new StringBuilder("Los nombres son: " + "\n");
        for(String c : nombres){
            resultado.append(": ").append(c).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado, "SALIDA DEL FOR EACH", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
