package vacunas;

import personas.Persona;

public class Ciudadano extends Persona {
    private int dni;
    private Provincia provincia;
    private String mail;


    public Ciudadano() {
        super();
        this.dni = 13123123;
        this.mail = "pepito@gmail.com";
        this.provincia = Provincia.BUENOS_AIRES;
    }
    public Ciudadano(String nombre, String apellido, int edad, String direccion, int dni, String mail, Provincia provincia) {
        super(nombre, apellido, edad, direccion);
        this.dni = dni;
        this.mail = mail;
        this.provincia = provincia;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
