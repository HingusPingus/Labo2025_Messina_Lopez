package sistema_ong_messina;

import java.time.LocalDate;
import java.util.HashMap;

public class ProfesorInterino extends Profesor{

    public ProfesorInterino(String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, HashMap<String, Integer> materias) {
        super(codigoPostal, quiereRegistrarse, sueldo, banco, fechaCobro, fechaDeAlta, materias);
    }

    public ProfesorInterino(String nombre, String apellido, int edad, String direccion, LocalDate fechaNacimiento, String mail, String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, HashMap<String, Integer> materias) {
        super(nombre, apellido, edad, direccion, fechaNacimiento, mail, codigoPostal, quiereRegistrarse, sueldo, banco, fechaCobro, fechaDeAlta, materias);
    }

    public ProfesorInterino(String nombre, int edad, String direccion, String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, HashMap<String, Integer> materias) {
        super(nombre, edad, direccion, codigoPostal, quiereRegistrarse, sueldo, banco, fechaCobro, fechaDeAlta, materias);
    }

    public ProfesorInterino(String nombre, String apellido, int edad, String direccion, String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, HashMap<String, Integer> materias) {
        super(nombre, apellido, edad, direccion, codigoPostal, quiereRegistrarse, sueldo, banco, fechaCobro, fechaDeAlta, materias);
    }
}
