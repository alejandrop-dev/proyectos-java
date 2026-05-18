/*
Ejercicio 17: Una empresa que se dedica a la venta
de desinfectantes necesita un programa para
gestionar las facturas. En cada factura figura: el
código del artículo, la cantidad vendida en litros y el
precio por litro. Se pide de 5 facturas introducidas:
Facturacion total, cantidad en litros vendidos del
artículo 1 y cuantas facturas se emitieron de más de
$600.
*/

package Ejercicio17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int codigo;
            int litros;
            double precioPorLitro;
            double precioDeFactura;
            int sumaDeLitros = 0;
            int contadorDePreciosMayoresA600 =0;
            double facturacionTotal = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.print("\n");
                System.out.println("-------FACTURA #" + i + "-------");
                codigo = obtenerCodigoDeFactura(sc, i);
                litros = obtenerNumeroDeLitros(sc);
                sumaDeLitros += litros;
                precioPorLitro = obtenerElPrecioDeLitros(sc);
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
    
    private static Integer obtenerElPrecioDeLitros(Scanner sc){
        while(true){
            System.out.print("Digite el precio por litros: $");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("No se ha ingresado nada" + "\n");
                continue;
            }
            try { 
                int aux = Integer.parseInt(input);
                if(aux <=0){
                    System.out.println("El precio por litros no puede ser menor o igual a 0" + "\n");
                    continue;
                }
                return aux;
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Solo se admiten numeros enteros" + "\n");
            }
        }
    }
    private static Double obtenerPreciodeFacrura(int litros, double precio){
        return (double)litros * precio;
    }
    private static void mensajeDelPrograma(double total, int litros, int contadorDePreciosMayoresA600){
        System.out.print("\n");
        System.out.println("-------RESUMEN DE VENTAS------");
        System.out.println("Facturacion total: $" + String.format("%.2f", total));
        System.out.println("Cantidad en litros vendidos: " + litros);
        System.out.println("Cantidad de facturas mayores a $600: " + contadorDePreciosMayoresA600);
    }
    
}
