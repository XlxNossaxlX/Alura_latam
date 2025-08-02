package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class principalConListas {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Encanto", 2021);
        pelicula.evalua(9);
        Pelicula pelicula1 = new Pelicula("Matrix", 1999);
        pelicula.evalua(6);
        var pelicula2 = new Pelicula("El señor de los anillos", 2001);
        pelicula.evalua(10);
        Serie casaDragon = new Serie("La casa del dragon", 2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(pelicula);
        lista.add(pelicula1);
        lista.add(pelicula2);
        lista.add(casaDragon);

        for (Titulo iteam:lista){
            System.out.println(iteam.getNombre());
            if (iteam instanceof Pelicula pelicula3 && pelicula3.getClasificacion() > 2){
                System.out.println(pelicula3.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtista = new ArrayList<>();
        listaDeArtista.add("Penelope");
        listaDeArtista.add("Antonio");
        listaDeArtista.add("Ricardo");

        Collections.sort(listaDeArtista);
        System.out.println("Lista de artistas" + listaDeArtista);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados" + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenado por fecha: " + lista);
    }
}
