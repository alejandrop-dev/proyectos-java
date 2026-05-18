/*
Ejercicio 10: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años
bisiestos.
*/

package Ejercicio10;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
       
        JOptionPane.showMessageDialog(null,"Digite el día, mes y año de una fecha y se le indicara si la fecha es correcta.", "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
        
        Integer dia = obtenerNumeroValido("Ingrese el dia: ");
        if( dia == null ){ mensajeDeSalida(); return; }
        
        Integer mes = obtenerNumeroValido("Ingrese el mes: ");
        if( mes == null ){ mensajeDeSalida(); return; }
        
        Integer año = obtenerNumeroValido("Ingrese el año: ");
        if( año == null){ mensajeDeSalida(); return; }
        
        String resultado = verificacion(dia, mes, año);
        mensajeDelSistema(dia, mes, año, resultado);
        
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
    
    private static String verificacion(int dia, int mes, int año){
        if(año !=0){
            if(mes >= 1 && mes <=12){
                switch(mes){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: if( dia >=1 && dia <= 31 ){ return "correcta";} else{ return "incorrecta"; }
                    case 4:
                    case 6:
                    case 9:
                    case 11: if( dia >=1 && dia <= 30 ){ return "correcta";} else{ return "incorrecta"; }
                    case 2: if( dia >=1 && dia <= 28 ){ return "correcta";} else{ return "incorrecta"; }
                }
                
            }
            else{
                return "incorrecta"; 
            }
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
