package electronicos;

public class Cargador extends Producto{

    public Cargador() {
        super();
    }

    public Cargador(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }

    public String getSeccion(){
        return "Cargador";
    }
}
