package personas;

import objetos.Tarjeta;

public class Cliente extends Persona{
    private int telefono;
    private String metodoPago;
    private Tarjeta tarjeta;

    public Cliente() {
        super();
        this.metodoPago = "Efectivo";
        this.telefono = 324902384;
    }

    public Cliente(String nombre, String apellido, int edad, String direccion, int telefono, String metodoPago) {
        super(nombre, apellido, edad, direccion);
        this.metodoPago = metodoPago;
        this.telefono = telefono;
    }

    public Cliente(String nombre, String apellido, int edad, String direccion, int telefono, Tarjeta tarjeta) {
        super(nombre, apellido, edad, direccion);
        this.tarjeta = tarjeta;
        this.metodoPago = "Tarjeta";
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
}
