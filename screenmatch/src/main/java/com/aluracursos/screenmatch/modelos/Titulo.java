package com.aluracursos.screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {
    private String nombre;
    private int fechaDeLanzamiento;
    private  int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    public void fichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: "+ duracionEnMinutos);
    }
    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }
    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
