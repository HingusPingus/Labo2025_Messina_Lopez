package componentespc;

public class Componente {
    private String fabricante;
    private String modelo;
    private double precio;
    private int stock;

    public Componente() {
        this.stock = 3;
        this.precio = 2.99;
        this.modelo = "Kumara";
        this.fabricante = "Redragon";
    }

    public Componente(int stock, double precio, String modelo, String fabricante) {
        this.stock = stock;
        this.precio = precio;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
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

    public String quienSoy(){
        return "";
    }

}
