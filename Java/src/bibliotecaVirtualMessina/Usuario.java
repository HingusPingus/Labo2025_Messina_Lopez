package bibliotecaVirtualMessina;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Usuario {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int credito;
    private String mail;
    private HashSet<Publicacion> publicacionesLeidas;
    private HashMap<Publicacion, Integer> prestamos;
    private int numeroSocio;
}
