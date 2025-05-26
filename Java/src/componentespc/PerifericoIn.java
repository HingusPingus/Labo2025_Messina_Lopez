package componentespc;

public class PerifericoIn extends Periferico {
    private String conector;

    public PerifericoIn() {
        super();
        this.conector = "USB";
    }

    public PerifericoIn(int stock, double precio, String modelo, String fabricante, int puertos, String conector) {
        super(stock, precio, modelo, fabricante, puertos);
        this.conector = conector;
    }

    public String getConector() {
        return conector;
    }

    public void setConector(String conector) {
        this.conector = conector;
    }

    public String quienSoy(){
        return "Entrada";
    }
}
