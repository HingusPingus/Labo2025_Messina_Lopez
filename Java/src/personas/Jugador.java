package personas;

import conceptos.Fecha;

public class Jugador {
    private Persona datos;
    private Fecha fechaNacimiento;
    private int numeroCamiseta;
    private boolean capitan;

    public Jugador() {
        this.datos = new Persona();
        this.capitan = false;
        this.numeroCamiseta = 23;
        this.fechaNacimiento = new Fecha(9,12,2018);
    }

    public Jugador(Persona datos, boolean capitan, int numeroCamiseta, Fecha fechaNacimiento) {
        this.datos = datos;
        this.capitan = capitan;
        this.numeroCamiseta = numeroCamiseta;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Jugador(boolean capitan) {
        this.datos = new Persona();
        this.capitan = capitan;
        this.numeroCamiseta = 23;
        this.fechaNacimiento = new Fecha(9,12,2018);
    }
    public Jugador(int numeroCamiseta) {
        this.datos = new Persona();
        this.capitan = false;
        this.numeroCamiseta = numeroCamiseta;
        this.fechaNacimiento = new Fecha(9,12,2018);
    }

    public Jugador(boolean capitan,int numeroCamiseta) {
        this.datos = new Persona();
        this.capitan = capitan;
        this.numeroCamiseta = numeroCamiseta;
        this.fechaNacimiento = new Fecha(9,12,2018);
    }

    public Persona getDatos() {
        return datos;
    }

    public void setDatos(Persona datos) {
        this.datos = datos;
    }

    public boolean isCapitan() {
        return capitan;
    }

    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
