package com.aluracursos.audios.modelos;

public class Favoritos {
    public void adicione(Audio audio){
        if (audio.getClasificacion() <= 8) {
            System.out.println(audio.getTitulo() + "Es un favorito");
        }else {
            System.out.println(audio.getTitulo() + "Tambien es un favorito");
        }
    }
}
