package com.aluracursos.audios.modelos;

public class Cancion extends Audio {
    private String album;
    private String cantante;
    private String genero;

    @Override
    public int getClasificacion() {
        if(getTotalDeMeGusta() >= 5000){
            return 8;
        }else {
            return 4;
        }
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
