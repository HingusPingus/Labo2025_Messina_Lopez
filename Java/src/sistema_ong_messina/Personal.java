package sistema_ong_messina;

import java.time.LocalDate;

public abstract class Personal extends Participante{
    private int sueldo;
    private Banco banco;
    private LocalDate fechaCobro;
    private LocalDate fechaDeAlta;

    public Personal(String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta) {
        super(codigoPostal, quiereRegistrarse);
        this.sueldo = sueldo;
        this.banco = banco;
        this.fechaCobro = fechaCobro;
        this.fechaDeAlta = fechaDeAlta;
    }

    public Personal(String nombre, String apellido, int edad, String direccion, LocalDate fechaNacimiento, String mail, String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta) {
        super(nombre, apellido, edad, direccion, fechaNacimiento, mail, codigoPostal, quiereRegistrarse);
        this.sueldo = sueldo;
        this.banco = banco;
        this.fechaCobro = fechaCobro;
        this.fechaDeAlta = fechaDeAlta;
    }

    public Personal(String nombre, int edad, String direccion, String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta) {
        super(nombre, edad, direccion, codigoPostal, quiereRegistrarse);
        this.sueldo = sueldo;
        this.banco = banco;
        this.fechaCobro = fechaCobro;
        this.fechaDeAlta = fechaDeAlta;
    }

    public Personal(String nombre, String apellido, int edad, String direccion, String codigoPostal, boolean quiereRegistrarse, int sueldo, Banco banco, LocalDate fechaCobro, LocalDate fechaDeAlta) {
        super(nombre, apellido, edad, direccion, codigoPostal, quiereRegistrarse);
        this.sueldo = sueldo;
        this.banco = banco;
        this.fechaCobro = fechaCobro;
        this.fechaDeAlta = fechaDeAlta;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public LocalDate getFechaCobro() {
        return fechaCobro;
    }

    public void setFechaCobro(LocalDate fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    @Override
    public void accionSolidaria() {

    }
}
