public class Main {
    public static void main(String[] angs){
        System.out.println("Bievenid@ a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLazamiento = 1999;
        boolean IncluidoEnElPlan = true;
        double  notaDeLaPelicula = 8.2;

        double  media = (8.2 + 6.5 + 9.3) / 3;
        System.out.println(media);

        String sinopsis= """
                Matrix es un paradoja
                La mejor pelicula del fin del milenio
                Fe lanzada en:
                """+fechaDeLazamiento;
        System.out.println(sinopsis);

        double clasificacion = (int) (media / 2);
        System.out.println(clasificacion);
    }
}
