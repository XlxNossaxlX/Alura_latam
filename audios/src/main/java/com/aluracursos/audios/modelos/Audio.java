package com.aluracursos.audios.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproduciones;
    private int totalDeMeGusta;
    private int clasificacion;

    public void meGusta(){
        this.totalDeMeGusta++;
    }
    public void reproduce(){
        this.totalDeReproduciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    public int getTotalDeReproduciones() {
        return totalDeReproduciones;
    }

    public void setTotalDeReproduciones(int totalDeReproduciones) {
        this.totalDeReproduciones = totalDeReproduciones;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
