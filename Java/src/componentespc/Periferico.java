package componentespc;

import enums.Fabricante;

public abstract class Periferico extends Componente{
    private int puertos;

    public Periferico() {
        super();
        this.puertos=1;
    }

    public Periferico(int stock, double precio, String modelo, Fabricante fabricante, int puertos) {
        super(stock, precio, modelo, fabricante);
        this.puertos = puertos;
    }

    public int getPuertos() {
        return puertos;
    }

    public void setPuertos(int puertos) {
        this.puertos = puertos;
    }
}
