package SistemaElectricidadViviendas;

import personas.Persona;

import java.time.LocalDate;

public class Duenio extends Persona {
    private int DNI;

    public Duenio(int DNI) {
        this.DNI = DNI;
    }

    public Duenio(String nombre, String apellido, int edad, String direccion, LocalDate fechaNacimiento, String mail, int DNI) {
        super(nombre, apellido, edad, direccion, fechaNacimiento, mail);
        this.DNI = DNI;
    }

    public Duenio(String nombre, int edad, String direccion, int DNI) {
        super(nombre, edad, direccion);
        this.DNI = DNI;
    }

    public Duenio(String nombre, String apellido, int edad, String direccion, int DNI) {
        super(nombre, apellido, edad, direccion);
        this.DNI = DNI;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
}
