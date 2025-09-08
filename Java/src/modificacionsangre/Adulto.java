package modificacionsangre;

import java.time.LocalDate;

public class Adulto extends Paciente{
    public Adulto(TipoSangre sangre, boolean positivo) {
        super(sangre, positivo);
    }

    public Adulto(String nombre, String apellido, int edad, String direccion, LocalDate fechaNacimiento, String mail, TipoSangre sangre, boolean positivo) {
        super(nombre, apellido, edad, direccion, fechaNacimiento, mail, sangre, positivo);
    }

    public Adulto(String nombre, int edad, String direccion, TipoSangre sangre, boolean positivo) {
        super(nombre, edad, direccion, sangre, positivo);
    }

    public Adulto(String nombre, String apellido, int edad, String direccion, TipoSangre sangre, boolean positivo) {
        super(nombre, apellido, edad, direccion, sangre, positivo);
    }
}
