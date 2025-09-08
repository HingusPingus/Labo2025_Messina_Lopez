package modificacionsangre;

import personas.Persona;

import java.time.LocalDate;

public abstract class Paciente extends Persona {
    private TipoSangre Sangre;
    private boolean positivo;

    public Paciente(TipoSangre sangre, boolean positivo) {
        Sangre = sangre;
        this.positivo = positivo;
    }

    public Paciente(String nombre, String apellido, int edad, String direccion, LocalDate fechaNacimiento, String mail, TipoSangre sangre, boolean positivo) {
        super(nombre, apellido, edad, direccion, fechaNacimiento, mail);
        Sangre = sangre;
        this.positivo = positivo;
    }

    public Paciente(String nombre, int edad, String direccion, TipoSangre sangre, boolean positivo) {
        super(nombre, edad, direccion);
        Sangre = sangre;
        this.positivo = positivo;
    }

    public Paciente(String nombre, String apellido, int edad, String direccion, TipoSangre sangre, boolean positivo) {
        super(nombre, apellido, edad, direccion);
        Sangre = sangre;
        this.positivo = positivo;
    }

    public TipoSangre getSangre() {
        return Sangre;
    }

    public void setSangre(TipoSangre sangre) {
        Sangre = sangre;
    }

    public boolean isPositivo() {
        return positivo;
    }

    public void setPositivo(boolean positivo) {
        this.positivo = positivo;
    }
}
