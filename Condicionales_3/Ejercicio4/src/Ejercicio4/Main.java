/*
Ejercicio 4: En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los $300. ¿Cuál será la cantidad que
pagará una persona por su compra?
*/
package Ejercicio4;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        final double DESCUENTO = 0.20;
        double descuento = 0;
        double totalAPagar = 0;
        
        
        JOptionPane.showMessageDialog(null,"Ingrese el total de su compra para ver si tiene 20% de descuento");
        Double compra = obtenerNumeroValido("Ingrese el Precio total de su compra: ");
        if(compra == null){
                JOptionPane.showMessageDialog(null,"Usted esta saliendo del Programa...", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        if(compra>300){
             descuento = compra*DESCUENTO; 
             totalAPagar = compra - descuento;
        }
        
            mensaje(compra, descuento, totalAPagar);
        
        
        
        
    }
    private static Double obtenerNumeroValido(String texto){
         
        while (true) {       
           String input = JOptionPane.showInputDialog(null, texto, "Sistema", JOptionPane.QUESTION_MESSAGE);
           if(input == null)return null;
           if(input.isEmpty()){
               JOptionPane.showMessageDialog(null, "No se ha ingresado nada", "Error", JOptionPane.ERROR_MESSAGE);
               continue;
           }
           
            try {
                return Double.parseDouble(input);
                
            } 
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Introduce un numero ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
    
    private static void mensaje(double original, double descuento, double totalAPagar){
        JOptionPane.showMessageDialog(null,"--- TICKET DE VENTA ---" + 
                                            "\nCompra original: $"+ String.format("%.2f",original) + 
                                            "\nDescuento aplicado (20%): $" + String.format("%.2f",descuento) + 
                                            "\nTotal a pagar: $" + String.format("%.2f",totalAPagar), 
                                            "Descuento del 20%", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
