import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = "Eduar Nossa";
        String tipoDeCuenta = "Ahorros";
        double[] saldo = {1000.0}; // Usamos un array para permitir modificación dentro de lambdas
        int[] opcion = {0};

        System.out.println("--------------------------");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("\nEl tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("\nSu saldo disponible es: $" + saldo[0]);
        System.out.println("\n---------------------------");

        String menu = """
                *** Escriba el número de la opción deseada *** 
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Map<Integer, Runnable> acciones = new HashMap<>();
        acciones.put(1, () -> System.out.println("El saldo actual es de: $" + saldo[0]));

        acciones.put(2, () -> {
            System.out.println("¿Cuál es el valor que desea retirar?");
            double valor = teclado.nextDouble();
            if (valor > saldo[0]) {
                System.out.println("Saldo insuficiente");
            } else {
                saldo[0] -= valor;
                System.out.println("El saldo actualizado es: $" + saldo[0]);
            }
        });

        acciones.put(3, () -> {
            System.out.println("¿Cuál es el valor que desea depositar?");
            double valor = teclado.nextDouble();
            saldo[0] += valor;
            System.out.println("El saldo actualizado es: $" + saldo[0]);
        });

        acciones.put(9, () -> System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios."));

        while (opcion[0] != 9) {
            System.out.println(menu);
            opcion[0] = teclado.nextInt();
            acciones.getOrDefault(opcion[0], () -> System.out.println("Opción incorrecta")).run();
        }
    }
}
