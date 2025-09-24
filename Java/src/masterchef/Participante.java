package masterchef;

import java.time.LocalDate;

public abstract class Participante {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String localidad;
    private Color colorEquipo;

    public Participante(String nombre, LocalDate fechaNacimiento, String localidad, Color colorEquipo) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.localidad = localidad;
        this.colorEquipo = colorEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Color getColorEquipo() {
        return colorEquipo;
    }

    public void setColorEquipo(Color colorEquipo) {
        this.colorEquipo = colorEquipo;
    }

    public abstract void prepararTrabajo();


}
