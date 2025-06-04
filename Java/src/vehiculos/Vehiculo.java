package vehiculos;

import enums.Color;
import enums.Marca;

public class Vehiculo {
    private Marca marca;
    private String modelo;
    private Color color;
    private int ruedas;
    private int fechaFabricacion;


    public Vehiculo() {
        this.marca = Marca.CHEVROLET;
        this.modelo = "Spin";
        this.color = Color.AZUL;
        this.ruedas = 4;
        this.fechaFabricacion = 2016;
    }

    public Vehiculo(Marca marca, String modelo, Color color, int ruedas, int fechaFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ruedas = ruedas;
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getMarca() {
        return marca.name();
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color.getNombre();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(int fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String claseVehiculo(){
        return "";
    }
}
