package bibliotecavirtual;

import java.util.HashSet;

public class Biblioteca {
    private static int prestBronce=5;
    private static int prestPlata=15;
    private static int prestOro=50;
    private HashSet<Libro> libros;


    public Biblioteca(HashSet<Libro> libros) {
        this.libros = libros;
    }



    public static int  cantidadPrestamo(Membresia membresia){
        if(membresia==Membresia.BRONCE){
            return prestBronce;
        }
        else if(membresia==Membresia.PLATA){
            return prestPlata;
        }
        else if(membresia==Membresia.ORO) {
            return prestOro;
        }
        else{
            return 0;
        }
    }
    public void addLibro(Libro libro){
        libros.add(libro);
    }
    public void deleteLibro(Libro libro){
        if(libros.contains(libro)) {
            libros.remove(libro);
        }
    }
    public void modifyLibros(Libro libroOld, Libro libroNew){
        if(libros.contains(libroOld)){
            libros.remove(libroOld);
            libros.add(libroNew);
        }
    }

    public void prestamo(Usuario usuario, Libro libro){
        if(libros.contains(libro)&& !usuario.getLibrosPrestados().contains(libro)){
            if(libro.getCantDescargasAct()>0 && usuario.getPrestamosRestantes()>1){
                libro.setCantDescargasAct(libro.getCantDescargasAct()-1);
                usuario.setPrestamosRestantes(usuario.getPrestamosRestantes()-1);
                HashSet<Libro> librosUsuario=usuario.getLibrosPrestados();
                librosUsuario.add(libro);
                usuario.setLibrosPrestados(librosUsuario);
            }
            else if(usuario.getPrestamosRestantes()>1){
                throw new LimiteDePrestamosAlcanzadoException("Ese libro ha alcanzado el límite de prestamos");
            }
            else {
                throw new MembresiaException("Usted ha alcanzado la cantidad límite de libros prestados");
            }
        }
    }

    public void devolucion(Usuario usuario, Libro libro){
        if(libros.contains(libro)&& usuario.getLibrosPrestados().contains(libro)){
            usuario.setPrestamosRestantes(usuario.getPrestamosRestantes()+1);
            libro.setCantDescargasAct(libro.getCantDescargasAct()+1);
            HashSet<Libro> librosUsuario=usuario.getLibrosPrestados();
            librosUsuario.remove(libro);
            usuario.setLibrosPrestados(librosUsuario);
        }
    }

}
