import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe el nombre de tu pelicula: ");
        String pelicula = teclado.nextLine();
        System.out.print("Ahora escribe la fecha de lanzamiento: ");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.print("Por ultimo dinos que nota le das a esta pelicula: ");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);

    }
}
