/*
Ejercicio 18: Hacer unas modificaciones al
ejercicio anterior suponiendo que no se
introduce el precio por litro. Solo existen
tres productos con precios:
1- 0,6 $/litro
2- 3 $/litro
3- 1,25 €/litro.
*/

package Ejercicio18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double OPCION1 = 0.60;
        final double OPCION2 = 3;
        final double OPCION3 = 1.25;

        try(Scanner sc = new Scanner(System.in)) {
            int codigo;
            int litros;
            double precioPorLitro;
            double precioDeFactura;
            int sumaDeLitros = 0;
            int contadorDePreciosMayoresA600 =0;
            int opcion;
            double facturacionTotal = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.print("\n");
                System.out.println("-------FACTURA #" + i + "-------");
                codigo = obtenerCodigoDeFactura(sc, i);
                litros = obtenerNumeroDeLitros(sc);
                sumaDeLitros += litros;
                opcion = obtenerOpcion(sc);
                precioPorLitro = obtenerElPrecioDeLitros(opcion, OPCION1, OPCION2, OPCION3);
                precioDeFactura = obtenerPreciodeFacrura(litros, precioPorLitro);
                facturacionTotal+=precioDeFactura;
                if(precioDeFactura>600) contadorDePreciosMayoresA600++;
            }
            mensajeDelPrograma(facturacionTotal, sumaDeLitros, contadorDePreciosMayoresA600);
        } catch (Exception e) {
            System.out.println("Error critico en " + e.getMessage());
        }
        
    }
    private static Integer obtenerCodigoDeFactura(Scanner sc, int i){
        while(true){
            System.out.print("Ingrese el numero del #" + i + " codigo: ");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada" + "\n");
                continue;
            }
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Solo se admiten numeros enteros" + "\n");
            }
        }
    }
    private static Integer obtenerNumeroDeLitros(Scanner sc){
        while(true){
            System.out.print("Digite la cantidad en litros: ");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada" + "\n");
                continue;
            }
            try { 
                int aux = Integer.parseInt(input);
                if(aux <=0){
                    System.out.println("La cantidad de litros no puede ser menor o igual a 0" + "\n");
                    continue;
                }
                return aux;
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Solo se admiten numeros enteros" + "\n");
            }
        }
    }
    
    private static double obtenerElPrecioDeLitros(double opcion, double opc1, double opc2, double opc3){
        if(opcion ==1) return opc1;
        else if (opcion == 2) return opc2;
        return opc3;
    }
    private static Double obtenerPreciodeFacrura(int litros, double precio){
        return litros * precio;
    }
    private static void mensajeDelPrograma(double total, int litros, int contadorDePreciosMayoresA600){
        System.out.print("\n");
        System.out.println("-------RESUMEN DE VENTAS------");
        System.out.println("Facturacion total: $" + String.format("%.2f", total));
        System.out.println("Cantidad en litros vendidos: " + litros);
        System.out.println("Cantidad de facturas mayores a $600: " + contadorDePreciosMayoresA600);
    

    }
    
    private static Integer obtenerOpcion(Scanner sc){
        while(true){
            System.out.println("Seleccione la opcion de los precios");
            System.out.println("1- 0,6 $/litro");
            System.out.println("2- 3 $/litro");
            System.out.println("3- 1,25 $/litro.");
            System.out.print("opcion: ");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada" + "\n");
                continue;
            }
            try {
                int aux = Integer.parseInt(input);
                if(aux < 1 || aux >3){
                    System.out.println("Selecione una de las 3 opciones" + "\n");
                    continue;
                }
                return aux;
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Solo se admiten numeros enteros");
            }
        }
    }

}
