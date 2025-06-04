package componentespc;

import enums.Fabricante;

public class Impresora extends PerifericoOut{
    private MetodoImpresion metodoImpresion;

    public Impresora() {
        super();
        this.metodoImpresion = MetodoImpresion.LASER;
    }

    public Impresora(int stock, double precio, String modelo, Fabricante fabricante, int puertos, MetodoImpresion metodoImpresion) {
        super(stock, precio, modelo, fabricante, puertos);
        this.metodoImpresion = metodoImpresion;
    }

    public String getMetodoImpresion() {
        return metodoImpresion.name();
    }

    public void setMetodoImpresion(MetodoImpresion metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }
}
