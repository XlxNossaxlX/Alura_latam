import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();

        int numeroSecreto = generador.nextInt(100) + 1 ;
        int intentos = 0;

        while (true){
            System.out.println("Adivina el numero (Entre el 1 y el 100)");
            int intento = teclado.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("Mas alto...");
            } else if (intento > numeroSecreto) {
                System.out.println("Mas bajo...");
            }else {
                System.out.println("Correcto! Adivinaste en: " + intentos +" intentos");
                break;
            }
        }
        teclado.close();
    }
}
