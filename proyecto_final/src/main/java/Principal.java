import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escriba el límite de la tarjeta:");
        try {
            double limite = lectura.nextDouble();
            TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);
            int opcion;

            do {
                System.out.println("----------------------------------");
                System.out.println("Menú:");
                System.out.println("1. Realizar una compra");
                System.out.println("0. Salir y ver resumen");
                System.out.print("Seleccione una opción: ");
                opcion = lectura.nextInt();

                if (opcion == 1) {
                    System.out.println("\nEscriba la descripción de la compra:");
                    lectura.nextLine();
                    String descripcion = lectura.nextLine();

                    System.out.println("Escriba el valor de la compra:");
                    double valor = lectura.nextDouble();

                    Compra compra = new Compra(valor, descripcion);
                    boolean compraRealizada = tarjeta.lanzarCompra(compra);

                    if (compraRealizada) {
                        System.out.println("Compra realizada!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                        break;
                    }
                } else if (opcion != 0) {
                    System.out.println("Opción no válida. Intente de nuevo.");
                }

            } while (opcion != 0);

            System.out.println("\n**********************************");
            System.out.println("COMPRAS REALIZADAS:");
            Collections.sort(tarjeta.getListadoDeCompra());

            for (Compra compra : tarjeta.getListadoDeCompra()) {
                System.out.println(compra);
            }

            System.out.println("\n**********************************");
            System.out.println("Saldo de la tarjeta: " + tarjeta.getSaldo());

        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor, ingrese un número válido.");
        } finally {
            lectura.close();
        }
    }
}