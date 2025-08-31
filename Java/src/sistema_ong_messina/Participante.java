package sistema_ong_messina;

import personas.Persona;

import java.time.LocalDate;

public abstract class Participante extends Persona {
    private String codigoPostal;
    private boolean quiereRegistrarse;


    public Participante(String codigoPostal, boolean quiereRegistrarse) {
        this.codigoPostal = codigoPostal;
        this.quiereRegistrarse = quiereRegistrarse;
    }

    public Participante(String nombre, String apellido, int edad, String direccion, LocalDate fechaNacimiento, String mail, String codigoPostal, boolean quiereRegistrarse) {
        super(nombre, apellido, edad, direccion, fechaNacimiento, mail);
        this.codigoPostal = codigoPostal;
        this.quiereRegistrarse = quiereRegistrarse;
    }

    public Participante(String nombre, int edad, String direccion, String codigoPostal, boolean quiereRegistrarse) {
        super(nombre, edad, direccion);
        this.codigoPostal = codigoPostal;
        this.quiereRegistrarse = quiereRegistrarse;
    }

    public Participante(String nombre, String apellido, int edad, String direccion, String codigoPostal, boolean quiereRegistrarse) {
        super(nombre, apellido, edad, direccion);
        this.codigoPostal = codigoPostal;
        this.quiereRegistrarse = quiereRegistrarse;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public boolean isQuiereRegistrarse() {
        return quiereRegistrarse;
    }

    public void setQuiereRegistrarse(boolean quiereRegistrarse) {
        this.quiereRegistrarse = quiereRegistrarse;
    }
    public boolean soyMayor(){
        return getEdad() >= 18;
    }


    public abstract void accionSolidaria();
}
