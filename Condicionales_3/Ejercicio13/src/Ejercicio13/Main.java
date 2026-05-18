/*
Ejercicio 13: Hacer un programa que simule un
cajero automático con un saldo inicial de 1000
Dólares, con el siguiente menú de opciones:
1. Ingresar dinero a la cuenta
2. Retirar dinero de la cuenta
3. Salir
*/

package Ejercicio13;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
         JOptionPane.showMessageDialog(null, "Cajero automatico", "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
         
         String[] opciones = {"Ingresar Dinero", "Retirar Dinero", "Salir"};
         double saldoInicial =1000;
         double sumaDeIngresos = 0;
         double restaDeIngresos = 0;
         
         while(true){
            int seleccion = laSeleccion(opciones, saldoInicial); 
            if(seleccion == -1 || seleccion == 2){mensajeDeSalida(); return;}
            
            if(seleccion == 0){
                String opcion = "INGRESO";
                String operacion = "Deposito:         $";
                String mensaje = "ingresar";
                while(true){
                    Double ingreso = obtenerDinero(saldoInicial, opcion, mensaje);
                    if(ingreso == null){break;}
                    sumaDeIngresos = ingreso;
                    double saldoFinal = saldoInicial + sumaDeIngresos;
                    mensajeDelDepositoORetiro(saldoInicial, sumaDeIngresos, saldoFinal, operacion);
                    saldoInicial = saldoFinal;
                    break;
                    
                }
            }
            if(seleccion == 1){
                String opcion = "RETIRO";
                String operacion = "Retiro:             $";
                String mensaje = "retirar";
                while(true){
                     Double retiro = obtenerDinero(saldoInicial, opcion, mensaje);
                     if(retiro == null){break;}
                     restaDeIngresos = retiro;
                     double saldoFinal = saldoInicial - restaDeIngresos;
                     if(saldoFinal < 0){
                         saldoInsuficiente();
                         break;
                     }
                     mensajeDelDepositoORetiro(saldoInicial, restaDeIngresos, saldoFinal, operacion);
                     saldoInicial = saldoFinal;
                     break;
                }
            }
            
         }
        
        
    }
    
    private static Integer  laSeleccion( String[] opciones, double saldo){
        int seleccion = JOptionPane.showOptionDialog(
            null, 
        "Saldo actual: $" + String.format("%.2f",saldo) + "\n" + 
        "¿Qué desea hacer?", 
        "CAJERO AUTOMÁTICO", 
        JOptionPane.DEFAULT_OPTION, 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        opciones, 
        opciones[0]
        );
        return seleccion;
    }
    private static void mensajeDeSalida(){
        JOptionPane.showMessageDialog(null, "Usted esta saliendo del Programa...", "CLOSE", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static Double obtenerDinero(double dineroActual, String opcion, String mensaje){
        while(true){
            String input = JOptionPane.showInputDialog(null,"Saldo actual: $" + String.format("%.2f",dineroActual) + "\n" + 
                                            "Saldo a " + mensaje +": $" ,
                                            opcion +" DE DINERO",
                                            JOptionPane.QUESTION_MESSAGE);
            if(input == null){ return null; }
            if(input.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se ha ingresado nada", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            
            try {
                double aux = Double.parseDouble(input);
                if(aux <=0){
                    JOptionPane.showMessageDialog(null, "No se puede ingresar cantidades menor o iguales 0", "ERROR", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                return aux;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese datos numericos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    
    private static void mensajeDelDepositoORetiro(double inicial, double deposito, double resultado, String operacion){
        JOptionPane.showMessageDialog(null, "---FACTURA---" + "\n" + 
                                            "Saldo inicial:   $" + String.format("%.2f",inicial) + "\n" + 
                                            operacion + String.format("%.2f",deposito) + "\n" + 
                                            "Saldo final:      $" + String.format("%.2f",resultado),
                                            "SISTEMA",
                                            JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void saldoInsuficiente(){
        JOptionPane.showMessageDialog(null, "No tienes suficientes fondos", "FONDOS INSUFICIENTES", JOptionPane.WARNING_MESSAGE);
    }
    
    
    
}







