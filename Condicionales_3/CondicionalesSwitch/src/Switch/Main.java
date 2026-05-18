/*
La sentencia switch:

switch (dato) {
case 1: Intrucciones1;
break;
case 2: Intrucciones2;
break;
..
case n: IntroccionesN;
break;
default: CasoContrario;
break;

}
*/
package Switch;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Integer dato =ObtenerDatoValido("Seleccione una opcion (1-5): ");
        
        if(dato == null){
            JOptionPane.showMessageDialog(null,"Saliendo del Programa...");
            return ;
        }
        switch (dato) {
            case 1-> mostrarMensaje("Elegiste la opcion 1");
            case 2-> mostrarMensaje("Elegiste la opcion 2");
            case 3-> mostrarMensaje("Elegiste la opcion 3");
            case 4-> mostrarMensaje("Elegiste la opcion 4");
            case 5-> mostrarMensaje("Elegiste la opcion 5");
            default-> JOptionPane.showMessageDialog(null, "Opción fuera de rango", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private static Integer ObtenerDatoValido(String mensaje){
        while(true){
            String input = JOptionPane.showInputDialog(null, mensaje, "Entrada segura", JOptionPane.QUESTION_MESSAGE);
            if (input == null) return null;
            try {
                return Integer.parseInt(input);
            } 
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Introduce un numero entero", "Error", JOptionPane.ERROR_MESSAGE);
            }     
        }
    }
    
    private static void mostrarMensaje(String texto){
        JOptionPane.showMessageDialog(null, texto, "Sistema", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
