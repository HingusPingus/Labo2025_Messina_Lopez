package electronicos;

public class Multimedia extends Producto {



    public Multimedia() {
        super();
    }

    public Multimedia(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }

    public String getSeccion(){
        return "Multimedia";
    }
}
