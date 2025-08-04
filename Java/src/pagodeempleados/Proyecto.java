package pagodeempleados;

public class Proyecto {
    private String nombre;
    private int pago;


    public Proyecto(String nombre, int pago) {
        this.nombre = nombre;
        this.pago = pago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }
}
