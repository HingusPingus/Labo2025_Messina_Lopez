package objetos;

import personas.Autor;
import personas.Persona;

public class Cancion {
    private String titulo;
    private Persona autor;

    public Cancion(){
        this.autor=new Autor();
        this.titulo="Puente";
    }

    public Cancion(Persona autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }
}
