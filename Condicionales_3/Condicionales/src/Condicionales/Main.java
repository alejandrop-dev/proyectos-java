/*
La sentencia if:

if(condicion) {
Instruccion;
}
else{
Instruccion2;
}
*/

package Condicionales;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        int dato=5;
        
        Integer numero  = obtenerNumeroValido("Digite un numero para comparar: ");
        if(numero !=null){
            if(numero == dato){
                JOptionPane.showMessageDialog(null, "¡Exacto! El número es 5.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "El número es diferente de 5.", "Resultado", JOptionPane.WARNING_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Operación cancelada por el usuario.");
        }
    }
    
    private static Integer obtenerNumeroValido(String mensaje){
        while(true){
            String entrada = JOptionPane.showInputDialog(null, mensaje, "Entrada de datos", JOptionPane.QUESTION_MESSAGE);
            if(entrada == null){
                return null;
            }
            try {
                return Integer.parseInt(entrada);
            } 
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR: Debe ingresar un valor numérico entero.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
}
