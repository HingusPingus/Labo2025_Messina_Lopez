package vehiculos;

public class Camioneta extends Automovil {
    private double capacidad;
    private double capacidad_actual;

    public Camioneta(){
        super();
        this.capacidad=690;
    }

    public Camioneta(String marca, String modelo, String color, int ruedas, int fechaFabricacion, String patente, double capacidad) {
        super(marca, modelo, color, ruedas, fechaFabricacion, patente);
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCapacidad_actual() {
        return capacidad_actual;
    }
}
