package vehiculos;

public class Bicicleta extends Vehiculo{
    public Bicicleta(String marca, String modelo, String color, int ruedas, int fechaFabricacion) {
        super(marca, modelo, color, ruedas, fechaFabricacion);
    }
    public Bicicleta(){
        super("pepe","mujica","blanco",2,2015);
    }
}
