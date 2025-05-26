package componentespc;

public class Impresora extends PerifericoOut{
    private String metodoImpresion;

    public Impresora() {
        super();
        this.metodoImpresion = "Laser";
    }

    public Impresora(int stock, double precio, String modelo, String fabricante, int puertos, String metodoImpresion) {
        super(stock, precio, modelo, fabricante, puertos);
        this.metodoImpresion = metodoImpresion;
    }

    public String getMetodoImpresion() {
        return metodoImpresion;
    }

    public void setMetodoImpresion(String metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }
}
