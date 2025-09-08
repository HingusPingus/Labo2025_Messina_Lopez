package elecciones;

import personas.Persona;

import java.time.LocalDate;
import java.time.LocalTime;

public class Trabajador extends Persona implements Campaña{
    private int cuil;
    private double sueldo;
    private String direccion;
    private LocalTime horario_entrada;
    private LocalTime horario_salida;

    public Trabajador(int cuil, double sueldo, String direccion, LocalTime horario_entrada, LocalTime horario_salida) {
        this.cuil = cuil;
        this.sueldo = sueldo;
        this.direccion = direccion;
        this.horario_entrada = horario_entrada;
        this.horario_salida = horario_salida;
    }

    public Trabajador(String nombre, String apellido, int edad, String direccion, LocalDate fechaNacimiento, String mail, int cuil, double sueldo, String direccion1, LocalTime horario_entrada, LocalTime horario_salida) {
        super(nombre, apellido, edad, direccion, fechaNacimiento, mail);
        this.cuil = cuil;
        this.sueldo = sueldo;
        this.direccion = direccion1;
        this.horario_entrada = horario_entrada;
        this.horario_salida = horario_salida;
    }

    public Trabajador(String nombre, int edad, String direccion, int cuil, double sueldo, String direccion1, LocalTime horario_entrada, LocalTime horario_salida) {
        super(nombre, edad, direccion);
        this.cuil = cuil;
        this.sueldo = sueldo;
        this.direccion = direccion1;
        this.horario_entrada = horario_entrada;
        this.horario_salida = horario_salida;
    }

    public Trabajador(String nombre, String apellido, int edad, String direccion, int cuil, double sueldo, String direccion1, LocalTime horario_entrada, LocalTime horario_salida) {
        super(nombre, apellido, edad, direccion);
        this.cuil = cuil;
        this.sueldo = sueldo;
        this.direccion = direccion1;
        this.horario_entrada = horario_entrada;
        this.horario_salida = horario_salida;


    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalTime getHorario_entrada() {
        return horario_entrada;
    }

    public void setHorario_entrada(LocalTime horario_entrada) {
        this.horario_entrada = horario_entrada;
    }

    public LocalTime getHorario_salida() {
        return horario_salida;
    }

    public void setHorario_salida(LocalTime horario_salida) {
        this.horario_salida = horario_salida;
    }

    @Override
    public String enviarMensaje() {
        if(horario_entrada.isBefore(LocalTime.now())&&horario_salida.isAfter(LocalTime.now())){
            return"Yo, "+this.getNombre()+" te invito a que votes por el partido para un futuro mejor";
        }
        return"";
    }
}
