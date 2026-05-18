package Curso_Java9;

import javax.swing.JOptionPane;


public class EntradaYSalidaDeDatosConJOptionPane {

    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Ingrese una cadena");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
        letra = JOptionPane.showInputDialog("Ingrese un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un decimal: "));
        
        JOptionPane.showMessageDialog(null, "La cadena es:" + cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: " + entero);
        JOptionPane.showMessageDialog(null, "El caracter es: " + letra);
        JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);
        
        
    }
    
}
