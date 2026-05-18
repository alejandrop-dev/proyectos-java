/*
Ejercicio 14: Hacer un programa que pase de Kg a otra unidad de medida de masa, mostrar en
pantalla un menú con las opciones posibles.
*/


package Ejercicio14;

import com.sun.source.tree.ContinueTree;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {    //Para la ingenua Gemi: I always winner <3
        final double GRAMOS = 1000;
        final double LIBRAS = 2.20462;
        final double TONELADAS = 1000;
        final double ONZAS = 35.274;
        final String kg = "KILOGRAMOS ";
        
        JOptionPane.showMessageDialog(null, "Conversor de kilogramos a otras masas con 2 decimales", "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
        String [] unidades = {"Gramos", "Libras", "Toneladas", "Onzas", "CANCELAR"};
        
        while(true){
            Double cantidad = cantidadDeKilogramos("Ingrese la cantidad de Kilogramos");
            if(cantidad == null){ mensajeDeSalida(); return; }
            int opcion = opcionEscogida(cantidad, unidades);
            if(opcion == -1 || opcion ==4){
                continue;
            }
            if(opcion == 0){
                String opcionDeConversion = "gramos";
                String opcionM = " GRAMOS";
                double total = conversionGramos(cantidad, GRAMOS);
                mensajeDeRespuesta(cantidad, opcionDeConversion, total, kg, opcionM);
                
            }
            if(opcion == 1){
                String opcionDeConversion = "libras";
                String opcionM = " LIBRAS";
                double total = conversionLibras(cantidad, LIBRAS);
                mensajeDeRespuesta(cantidad, opcionDeConversion, total, kg, opcionM);
            }
            if(opcion == 2){
                String opcionDeConversion = "toneladas";
                String opcionM = " TONELADAS";
                double total = conversionToneladas(cantidad, TONELADAS);
                mensajeDeRespuesta(cantidad, opcionDeConversion, total, kg, opcionM);
            }
            if(opcion == 3){
                String opcionDeConversion = "onzas";
                String opcionM = " ONZAS";
                double total = conversionOnzas(cantidad, ONZAS);
                mensajeDeRespuesta(cantidad, opcionDeConversion, total, kg, opcionM);
            }
            
        }
        
    }
    
    private static Double cantidadDeKilogramos(String texto){
        while(true){
            String input = JOptionPane.showInputDialog(null, texto + "\n"+ 
                                                        "Kg: ",
                                                        "ENTRADA DE DATOS",
                                                        JOptionPane.QUESTION_MESSAGE);
            
            if(input == null) return null;
            if(input.isEmpty()){
                JOptionPane.showMessageDialog(null,"No se ha ingresado nada", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            try {
                double aux = Double.parseDouble(input);
                if(aux <=0){
                    JOptionPane.showMessageDialog(null, "Ingrese una cantidad mayor aa 0", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    continue;
                }
                return aux;
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se admiten datos numericos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private static void mensajeDeSalida(){
        JOptionPane.showMessageDialog(null, "Usted esta saliendo del Programa...", "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static Integer opcionEscogida(double kg,String[] unidades ){
        int opcion = JOptionPane.showOptionDialog(null,
                                                "Cantidad de Kg ingresada: " + String.format("%.2f", kg) + "\n" + 
                                                "Seleccione una opcion: ", "OPCIONES DE CONVERSION", 
                                                JOptionPane.DEFAULT_OPTION,
                                                JOptionPane.QUESTION_MESSAGE, 
                                                null,
                                                unidades,
                                                unidades[0]);
        return opcion;
    }
    
    private static Double conversionGramos(double kg, double gramos){
        return kg * gramos;
    }
    private static Double conversionLibras(double kg, double libras){
        return kg * libras;
    }
    private static Double conversionToneladas(double kg, double toneladas){
        return kg / toneladas;
    }
    private static Double conversionOnzas(double kg, double onzas){
        return kg * onzas;
    }
    
    private static void mensajeDeRespuesta(double kg, String opcion, double resultado, String kilogramos, String opcionM){
        JOptionPane.showMessageDialog(null, "---CONVRERSION---" + "\n" + 
                                            "Kilogramos (kg):    " + String.format("%.2f", kg) + "\n" + 
                                            "Kilogramos a " + opcion + ": " + String.format("%.2f", resultado) ,
                                            kilogramos + "A" + opcionM ,
                                            JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
