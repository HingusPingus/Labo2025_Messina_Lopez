package vehiculos;

public class Automovil extends Vehiculo{
    private String patente;

    public Automovil(){
        super();
        this.patente="AB223HA";
    }

    public Automovil(String marca, String modelo, String color, int ruedas, int fechaFabricacion, String patente) {
        super(marca, modelo, color, ruedas, fechaFabricacion);
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
