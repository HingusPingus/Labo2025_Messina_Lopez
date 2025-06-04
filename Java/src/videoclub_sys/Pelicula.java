package videoclub_sys;

import enums.Genero;
import personas.Persona;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private Genero genero;
    private Duration duracion;
    private ArrayList<Persona> directores;
    private ArrayList<Persona> actores;
    private ArrayList<String> idiomas;

    public Pelicula(String nombre, Genero genero, Duration duracion, ArrayList<Persona> directores, ArrayList<String> idiomas, ArrayList<Persona> actores) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.directores = directores;
        this.idiomas = idiomas;
        this.actores = actores;
    }
    public Pelicula(){
        nombre="la paraste";
        genero= Genero.COMEDIA;
        duracion= Duration.ofHours(2);
        directores= new ArrayList<Persona>();
        directores.add(new Persona());
        actores= new ArrayList<Persona>();
        actores.add(new Persona());
        idiomas= new ArrayList<String>();
        idiomas.add("inglés");
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getGenero() {return genero.name();}
    public void setGenero(Genero genero) {this.genero = genero;}
    public Duration getDuracion() {return duracion;}
    public void setDuracion(Duration duracion) {this.duracion = duracion;}
    public ArrayList<Persona> getDirectores() {return directores;}
    public void setDirectores(ArrayList<Persona> directores) {this.directores = directores;}
    public ArrayList<Persona> getActores() {return actores;}
    public void setActores(ArrayList<Persona> actores) {this.actores = actores;}
    public ArrayList<String> getIdiomas() {return idiomas;}
    public void setIdiomas(ArrayList<String> idiomas) {this.idiomas = idiomas;}

    public ArrayList<Persona> actoresAdultos(){
        ArrayList<Persona> actoresMayores=new ArrayList<>();
        for (Persona actor: this.actores){
            if(actor.getEdad()>=18){
                actoresMayores.add(actor);
            }
        }
        return actoresMayores;
    }
}
