package electronicos;

public class Parlante extends Multimedia{
    private boolean bluetooth;

    public Parlante() {
        super();
        this.bluetooth = true;
    }

    public Parlante(String nombre, double precio, int stock, boolean bluetooth) {
        super(nombre, precio, stock);
        this.bluetooth = bluetooth;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}
