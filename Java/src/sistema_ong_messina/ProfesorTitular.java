package sistema_ong_messina;

import java.time.LocalDate;
import java.util.HashMap;

public class ProfesorTitular extends Profesor{

    public ProfesorTitular(String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, HashMap<String, Integer> materias) {
        super(codigoPostal, quiereRegistrarse, sueldo, banco, fechaCobro, fechaDeAlta, materias);
    }

    public ProfesorTitular(String nombre, String apellido, int edad, String direccion, LocalDate fechaNacimiento, String mail, String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, HashMap<String, Integer> materias) {
        super(nombre, apellido, edad, direccion, fechaNacimiento, mail, codigoPostal, quiereRegistrarse, sueldo, banco, fechaCobro, fechaDeAlta, materias);
    }

    public ProfesorTitular(String nombre, int edad, String direccion, String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, HashMap<String, Integer> materias) {
        super(nombre, edad, direccion, codigoPostal, quiereRegistrarse, sueldo, banco, fechaCobro, fechaDeAlta, materias);
    }

    public ProfesorTitular(String nombre, String apellido, int edad, String direccion, String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, HashMap<String, Integer> materias) {
        super(nombre, apellido, edad, direccion, codigoPostal, quiereRegistrarse, sueldo, banco, fechaCobro, fechaDeAlta, materias);
    }
}
