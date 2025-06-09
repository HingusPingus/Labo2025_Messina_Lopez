package componentespc;

import enums.Fabricante;

public abstract class Componente {
    private Fabricante fabricante;
    private String modelo;
    private double precio;
    private int stock;

    public Componente() {
        this.stock = 3;
        this.precio = 2.99;
        this.modelo = "Kumara";
        this.fabricante = Fabricante.REDRAGON;
    }

    public Componente(int stock, double precio, String modelo, Fabricante fabricante) {
        this.stock = stock;
        this.precio = precio;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante.name();
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public abstract String quienSoy();

}
