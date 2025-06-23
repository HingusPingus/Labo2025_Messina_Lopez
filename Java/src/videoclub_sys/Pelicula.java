package videoclub_sys;

import enums.Genero;
import personas.Autor;
import personas.Persona;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private Genero genero;
    private Duration duracion;
    private ArrayList<Autor> directores;
    private ArrayList<Autor> actores;
    private ArrayList<String> idiomas;

    public Pelicula(String nombre, Genero genero, Duration duracion, ArrayList<Autor> directores, ArrayList<String> idiomas, ArrayList<Autor> actores) {
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
        directores= new ArrayList<>();
        directores.add(new Autor());
        actores= new ArrayList<>();
        actores.add(new Autor());
        idiomas= new ArrayList<String>();
        idiomas.add("inglés");
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getGenero() {return genero.name();}
    public void setGenero(Genero genero) {this.genero = genero;}
    public Duration getDuracion() {return duracion;}
    public void setDuracion(Duration duracion) {this.duracion = duracion;}
    public ArrayList<Autor> getDirectores() {return directores;}
    public void setDirectores(ArrayList<Autor> directores) {this.directores = directores;}
    public ArrayList<Autor> getActores() {return actores;}
    public void setActores(ArrayList<Autor> actores) {this.actores = actores;}
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
