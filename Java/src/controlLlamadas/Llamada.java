package controlLlamadas;

import java.time.LocalDate;

public class Llamada {
    private Empleado empDestino;
    private Empleado empOrigen;
    private LocalDate fecha;
    private int duracion;

    public Llamada(Empleado empDestino, Empleado empOrigen, LocalDate fecha, int duracion) {
        this.empDestino = empDestino;
        this.empOrigen = empOrigen;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public Empleado getEmpDestino() {
        return empDestino;
    }

    public void setEmpDestino(Empleado empDestino) {
        this.empDestino = empDestino;
    }

    public Empleado getEmpOrigen() {
        return empOrigen;
    }

    public void setEmpOrigen(Empleado empOrigen) {
        this.empOrigen = empOrigen;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
