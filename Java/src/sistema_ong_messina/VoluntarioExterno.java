package sistema_ong_messina;

import java.time.LocalDate;

public class VoluntarioExterno extends Participante{
    private Institucion institucion;


    public VoluntarioExterno(String codigoPostal, boolean quiereRegistrarse, Institucion institucion) {
        super(codigoPostal, quiereRegistrarse);
        this.institucion = institucion;
    }

    public VoluntarioExterno(String nombre, String apellido, int edad, String direccion, LocalDate fechaNacimiento, String mail, String codigoPostal, boolean quiereRegistrarse, Institucion institucion) {
        super(nombre, apellido, edad, direccion, fechaNacimiento, mail, codigoPostal, quiereRegistrarse);
        this.institucion = institucion;
    }

    public VoluntarioExterno(String nombre, int edad, String direccion, String codigoPostal, boolean quiereRegistrarse, Institucion institucion) {
        super(nombre, edad, direccion, codigoPostal, quiereRegistrarse);
        this.institucion = institucion;
    }

    public VoluntarioExterno(String nombre, String apellido, int edad, String direccion, String codigoPostal, boolean quiereRegistrarse, Institucion institucion) {
        super(nombre, apellido, edad, direccion, codigoPostal, quiereRegistrarse);
        this.institucion = institucion;
    }


    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }
    public void accionSolidaria() {
        System.out.println("Ofrezco mi ayuda para lo que necesiten");
    }
}
