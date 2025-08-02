package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.Calculadora;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Encanto", 2021);
        pelicula.setDuracionEnMinutos(120);
        pelicula.setIncluidoEnElPlan(true);

        pelicula.fichaTecnica();

        pelicula.evalua(10);
        pelicula.evalua(10);
        pelicula.evalua(7.8);
        System.out.println(pelicula.getTotalDeLasEvaluaciones());
        System.out.println(pelicula.calculaMedia());

        Serie casaDragon = new Serie("La casa del dragon", 2022);
        casaDragon.setTemporada(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodioPorTemporada(10);
        casaDragon.fichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula pelicula1 = new Pelicula("Matrix", 1999);
        pelicula1.setDuracionEnMinutos(180);

        Calculadora calculadora = new Calculadora();
        calculadora.incluye(pelicula);
        calculadora.incluye(pelicula1);
        calculadora.incluye(casaDragon);
        System.out.println("Peliculas para ver en tus vaciones " + calculadora.getTiempoTotal() + "minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtrar(pelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(30);

        filtroRecomendacion.filtrar(episodio);

        var pelicula2 = new Pelicula("El señor de los anillos", 2001);
        pelicula2.setDuracionEnMinutos(188);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(pelicula);
        listaDePeliculas.add(pelicula1);
        listaDePeliculas.add(pelicula2);

        System.out.println("Tamaño de la pelicula: " + listaDePeliculas.size());
        System.out.println("La primera perlicula es: " + listaDePeliculas.get(0).getNombre());

        System.out.println("Estas son todas las peliculas: " + listaDePeliculas.toString());
    }
}