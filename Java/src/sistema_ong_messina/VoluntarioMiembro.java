package sistema_ong_messina;

import java.time.LocalDate;

public class VoluntarioMiembro extends Participante{
    private int puntaje;


    public VoluntarioMiembro(String codigoPostal, boolean quiereRegistrarse, int puntaje) {
        super(codigoPostal, quiereRegistrarse);
        this.puntaje = puntaje;
    }

    public VoluntarioMiembro(String nombre, String apellido, int edad, String direccion, LocalDate fechaNacimiento, String mail, String codigoPostal, boolean quiereRegistrarse, int puntaje) {
        super(nombre, apellido, edad, direccion, fechaNacimiento, mail, codigoPostal, quiereRegistrarse);
        this.puntaje = puntaje;
    }

    public VoluntarioMiembro(String nombre, int edad, String direccion, String codigoPostal, boolean quiereRegistrarse, int puntaje) {
        super(nombre, edad, direccion, codigoPostal, quiereRegistrarse);
        this.puntaje = puntaje;
    }

    public VoluntarioMiembro(String nombre, String apellido, int edad, String direccion, String codigoPostal, boolean quiereRegistrarse, int puntaje) {
        super(nombre, apellido, edad, direccion, codigoPostal, quiereRegistrarse);
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public void accionSolidaria() {
        System.out.println("Ofrezco mi ayuda para lo que necesiten");
        setPuntaje(getPuntaje()+1);
    }
}
