package vehiculos;

import enums.Color;
import enums.Marca;

public class Bicicleta extends Vehiculo{
    public Bicicleta(Marca marca, String modelo, Color color, int ruedas, int fechaFabricacion) {
        super(marca, modelo, color, ruedas, fechaFabricacion);
    }
    public Bicicleta(){
        super(Marca.BMW,"mujica",Color.BLANCO,2,2015);
    }
    public String claseVehiculo(){
        return"Bicicleta";
    }
}
