package personas;

import conceptos.Fecha;

public class Jugador extends Persona {
    private Fecha fechaNacimiento;
    private int numeroCamiseta;
    private boolean capitan;

    public Jugador() {
        super();
        this.capitan = false;
        this.numeroCamiseta = 23;
        this.fechaNacimiento = new Fecha(9,12,2018);
    }

    public Jugador(String nombre, String apellido, int edad, String direccion, boolean capitan, int numeroCamiseta, Fecha fechaNacimiento) {
        super(nombre, apellido, edad, direccion);
        this.capitan = capitan;
        this.numeroCamiseta = numeroCamiseta;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Jugador(boolean capitan) {
        super();
        this.capitan = capitan;
        this.numeroCamiseta = 23;
        this.fechaNacimiento = new Fecha(9,12,2018);
    }
    public Jugador(int numeroCamiseta) {
        super();
        this.capitan = false;
        this.numeroCamiseta = numeroCamiseta;
        this.fechaNacimiento = new Fecha(9,12,2018);
    }

    public Jugador(boolean capitan,int numeroCamiseta) {
        super();
        this.capitan = capitan;
        this.numeroCamiseta = numeroCamiseta;
        this.fechaNacimiento = new Fecha(9,12,2018);
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



    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
