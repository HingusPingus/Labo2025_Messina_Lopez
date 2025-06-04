package vehiculos;

import enums.Color;
import enums.Marca;

public class Camioneta extends Automovil {
    private double capacidad;
    private double carga_actual;

    public Camioneta(){
        super();
        this.capacidad=690;
    }

    public Camioneta(Marca marca, String modelo, Color color, int ruedas, int fechaFabricacion, String patente, double capacidad) {
        super(marca, modelo, color, ruedas, fechaFabricacion, patente);
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCarga_actual() {
        return carga_actual;
    }
    public String claseVehiculo(){
        return"Camioneta";
    }

    public void aumentarCarga(double carga){
        if(carga_actual+carga>capacidad){
            System.out.println("La carga actual sobrepasa la capacidad");
        }
        else{
            this.carga_actual+=carga;
        }
    }


}
