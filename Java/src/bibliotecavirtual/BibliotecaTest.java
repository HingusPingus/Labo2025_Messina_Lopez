package bibliotecavirtual;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    private Biblioteca biblioteca;
    private Autor autor;
    private Libro libro1;
    private Libro libro2;
    private Usuario usuarioBronce;

    @BeforeEach
    void setUp() {
        autor = new Autor("Gabriel", "García Márquez", 70, "Colombia", new HashSet<>());

        libro1 = new Libro("Cien años de soledad", autor, Genero.FICCION, "cien_anos.pdf");
        libro2 = new Libro("El amor en los tiempos del cólera", autor, Genero.ROMANCE, "amor_colera.pdf"); // sin descargas

        autor.addLibro(libro1);
        autor.addLibro(libro2);

        HashSet<Libro> coleccion = new HashSet<>();
        coleccion.add(libro1);
        coleccion.add(libro2);
        biblioteca = new Biblioteca(coleccion);

        usuarioBronce = new Usuario("Juan", "Pérez", 30, "Argentina",
                LocalDate.of(1995, 1, 1), "juan@mail.com", Membresia.BRONCE);
        usuarioBronce.setLibrosPrestados(new HashSet<>());
    }

    @Test
    void testPrestamoExitoso() {
        biblioteca.prestamo(usuarioBronce, libro1);

        assertTrue(usuarioBronce.getLibrosPrestados().contains(libro1));
        assertEquals(2, libro1.getCantDescargasAct());
        assertEquals(Biblioteca.cantidadPrestamo(Membresia.BRONCE) - 1, usuarioBronce.getPrestamosRestantes());
    }

    @Test
    void testPrestamoLibroSinDescargas() {
        assertThrows(LimiteDePrestamosAlcanzadoException.class,
                () -> biblioteca.prestamo(usuarioBronce, libro2));
    }

    @Test
    void testPrestamoExcedeMembresia() {
        usuarioBronce.setPrestamosRestantes(0);

        assertThrows(MembresiaException.class,
                () -> biblioteca.prestamo(usuarioBronce, libro1));
    }

    @Test
    void testDevolucionExitoso() {
        biblioteca.prestamo(usuarioBronce, libro1);
        biblioteca.devolucion(usuarioBronce, libro1);

        assertFalse(usuarioBronce.getLibrosPrestados().contains(libro1));
        assertEquals(3, libro1.getCantDescargasAct());
        assertEquals(Biblioteca.cantidadPrestamo(Membresia.BRONCE), usuarioBronce.getPrestamosRestantes());
    }
}
