package bibliotecavirtual;

import personas.Persona;

import java.util.HashSet;

public class Autor extends Persona {
    public HashSet<Libro> bibliografia;

    public Autor(String nombre, String apellido, int edad, String direccion, HashSet<Libro> bibliografia) {
        super(nombre, apellido, edad, direccion);
        this.bibliografia = bibliografia;
    }


    public void addLibro(Libro libro) {
        bibliografia.add(libro);
    }

    public void deleteLibro(Libro libro) {
        if (bibliografia.contains(libro)) {
            bibliografia.remove(libro);
        }
    }

    public void modifyLibros(Libro libroOld, Libro libroNew) {
        if (bibliografia.contains(libroOld)) {
            bibliografia.remove(libroOld);
            bibliografia.add(libroNew);
        }
    }

    public HashSet<Libro> getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(HashSet<Libro> bibliografia) {
        this.bibliografia = bibliografia;
    }
}
