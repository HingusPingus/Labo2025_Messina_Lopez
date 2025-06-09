package vehiculos;

import enums.Color;
import enums.Marca;

public abstract class Automovil extends Vehiculo{
    private String patente;

    public Automovil(){
        super();
        this.patente="AB223HA";
    }

    public Automovil(Marca marca, String modelo, Color color, int ruedas, int fechaFabricacion, String patente) {
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
