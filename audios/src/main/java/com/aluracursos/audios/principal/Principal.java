package com.aluracursos.audios.principal;

import com.aluracursos.audios.modelos.Cancion;
import com.aluracursos.audios.modelos.Favoritos;
import com.aluracursos.audios.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
         miCancion.setTitulo("Forever ");
         miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setTitulo("Cafe.Tech ");
        miPodcast.setPresentador("Gabriela");

        //canciones
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }
        //Podcast
        for (int i = 0; i < 200; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 6000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total de reproduciones: " + miCancion.getTotalDeReproduciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalDeMeGusta());

        Favoritos favoritos = new Favoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);
    }
}
