package electronicos;

public abstract class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
        this.nombre = "Carlos";
        this.precio = 100.99;
        this.stock = 6969;
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract String getSeccion();
}
