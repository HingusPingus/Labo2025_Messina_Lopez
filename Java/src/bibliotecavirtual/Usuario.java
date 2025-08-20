package bibliotecavirtual;

import personas.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Usuario extends Persona {
    private Membresia membresia;
    private int prestamosRestantes;
    private HashSet<Libro> librosPrestados;

    public Usuario(String nombre, String apellido, int edad, String direccion, LocalDate fechaNacimiento, String mail, Membresia membresia) {
        super(nombre, apellido, edad, direccion, fechaNacimiento, mail);
        this.membresia = membresia;
        this.prestamosRestantes=Biblioteca.cantidadPrestamo(membresia);
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public int getPrestamosRestantes() {
        return prestamosRestantes;
    }

    public void setPrestamosRestantes(int prestamosRestantes) {
        this.prestamosRestantes = prestamosRestantes;
    }

    public HashSet<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(HashSet<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
}
