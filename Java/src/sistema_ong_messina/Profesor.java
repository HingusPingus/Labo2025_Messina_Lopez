package sistema_ong_messina;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public abstract class Profesor extends Personal{
    private HashMap<String, Integer> materias;

    public Profesor(String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, HashMap<String, Integer> materias) {
        super(codigoPostal, quiereRegistrarse, sueldo, banco, fechaCobro, fechaDeAlta);
        this.materias = materias;
    }

    public Profesor(String nombre, String apellido, int edad, String direccion, LocalDate fechaNacimiento, String mail, String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, HashMap<String, Integer> materias) {
        super(nombre, apellido, edad, direccion, fechaNacimiento, mail, codigoPostal, quiereRegistrarse, sueldo, banco, fechaCobro, fechaDeAlta);
        this.materias = materias;
    }

    public Profesor(String nombre, int edad, String direccion, String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, HashMap<String, Integer> materias) {
        super(nombre, edad, direccion, codigoPostal, quiereRegistrarse, sueldo, banco, fechaCobro, fechaDeAlta);
        this.materias = materias;
    }

    public Profesor(String nombre, String apellido, int edad, String direccion, String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta, HashMap<String, Integer> materias) {
        super(nombre, apellido, edad, direccion, codigoPostal, quiereRegistrarse, sueldo, banco, fechaCobro, fechaDeAlta);
        this.materias = materias;
    }

    public HashMap<String, Integer> getMaterias() {
        return materias;
    }

    public void setMaterias(HashMap<String, Integer> materias) {
        this.materias = materias;
    }
    @Override
    public void accionSolidaria() {
        for(String s: materias.keySet()){
            System.out.println(s);
        }
    }
}
