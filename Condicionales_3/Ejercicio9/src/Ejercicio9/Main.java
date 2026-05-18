/*
Ejercicio 9: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.
*/

package Ejercicio9;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Digite el día, mes y año de una fecha y se le indicara si la fecha es correcta.", "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
        Integer dia = obtenerNumeroValido("Ingrese el dia: ");
        Integer mes = obtenerNumeroValido("Ingrese el mes: ");
        Integer año = obtenerNumeroValido("Ingrese el año: ");
        if( dia == null || mes == null || año == null){ mensajeDeSalida(); return; }
        
        String verificacion = mensajeDelPrograma(dia, mes, año);
        mensajeDelSistema(dia, mes, año, verificacion);
        
    }
    
    private static Integer obtenerNumeroValido(String texto){
        while(true){
            String input = JOptionPane.showInputDialog(null, texto, "SISTEMA", JOptionPane.QUESTION_MESSAGE);
            if(input == null) return null;
            if(input.isEmpty()){
                JOptionPane.showMessageDialog(null,"No se ha ingresado nada", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Solo se admiten numeros enteros", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private static void mensajeDeSalida(){
        JOptionPane.showMessageDialog(null,"Usted esta saliendo del Programa...", "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static String mensajeDelPrograma(int dia, int mes, int año){
        if((dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12) && (año !=0)){
            return "correcta";
        }
        return "incorrecta"; 
    }
    
    private static void mensajeDelSistema(int dia, int mes, int año, String resultado){
        JOptionPane.showMessageDialog(null,"---RESULTADOS---" + "\n" + 
                                            "La fecha: " + dia + "/" + mes + "/" + año + "\n" + 
                                            "Es " + resultado,
                                            "SISTEMA",
                                            JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
