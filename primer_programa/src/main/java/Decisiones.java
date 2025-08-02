public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLazamiento = 1999;
        boolean IncluidoEnElPlan = true;
        double  notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLazamiento >= 2022){
            System.out.println("Peliculas mas populares");
        }
        else {
            System.out.println("Pelicula retro que aún vale la pena ver");
        }

        if (IncluidoEnElPlan && tipoPlan.equals("plus")){
            System.out.println("Disfrute de su pelicula");
        }else {
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
