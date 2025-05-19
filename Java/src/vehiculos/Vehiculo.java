package vehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int ruedas;
    private int fechaFabricacion;


    public Vehiculo() {
        this.marca = "Chevrolet";
        this.modelo = "Spin";
        this.color = "Azula";
        this.ruedas = 4;
        this.fechaFabricacion = 2016;
    }

    public Vehiculo(String marca, String modelo, String color, int ruedas, int fechaFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ruedas = ruedas;
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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
