package organizaciones;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fechaNacimiento;
    private LocalDate fechaContrato;

    public Persona(String nombre, LocalDate fechaNacimiento, String apellido, int dni) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaContrato =LocalDate.now();
    }

    public Persona(String nombre, String apellido, int dni, LocalDate fechaNacimiento, LocalDate fechaContrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContrato = fechaContrato;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getfechaNacimiento() {
        return fechaNacimiento;
    }

    public void setfechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getfechaContrato() {
        return fechaContrato;
    }

    public void setfechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public String antiguedad(){
        LocalDate antiguedad;
        int dias=this.fechaContrato.getDayOfMonth();
        int meses=this.fechaContrato.getMonthValue();
        int anios=this.fechaContrato.getYear();
        antiguedad= LocalDate.now().minusDays(dias);
        antiguedad= antiguedad.minusMonths(meses);
        antiguedad=antiguedad.minusYears(anios);

        return antiguedad.toString();
    }
    public long antiguedadint(){
        return ChronoUnit.DAYS.between(fechaContrato, LocalDate.now());
    }
}
