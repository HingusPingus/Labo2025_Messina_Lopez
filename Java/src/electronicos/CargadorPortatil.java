package electronicos;

public class CargadorPortatil extends Cargador{

    private int carga;

    public CargadorPortatil() {
        this.carga = 90;
    }

    public CargadorPortatil(String nombre, double precio, int stock, int carga) {
        super(nombre, precio, stock);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}
