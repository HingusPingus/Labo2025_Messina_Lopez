package electronicos;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Producto> productos;

    public Sistema() {
        this.productos = new ArrayList<>();
    }

    public Sistema(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public void eliminarProducto(Producto producto){
        this.productos.remove(producto);
    }

    public void modificarProducto(Producto productov, Producto producton){
        this.productos.remove(productov);
        this.productos.add(producton);
    }

    public Producto mayorStock(){
        Producto mayor=this.productos.getFirst();
        for(Producto p: this.productos){
            if(p.getStock()>mayor.getStock()){
                mayor=p;
            }
        }
        return mayor;
    }
    public Producto menorStock() {
        Producto menor = this.productos.getFirst();
        for (Producto p : this.productos) {
            if (p.getStock() < menor.getStock()) {
                menor = p;
            }
        }
        return menor;
    }
}
