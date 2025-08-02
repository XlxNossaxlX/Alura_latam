package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtrar(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien");
        }else if (clasificacion.getClasificacion() >= 2){
            System.out.println("popular en el momento");
        }else {
            System.out.println("En lista");
        }
    }
}
