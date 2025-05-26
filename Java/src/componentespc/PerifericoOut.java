package componentespc;

public class PerifericoOut extends Periferico {

    public PerifericoOut() {
        super();
    }

    public PerifericoOut(int stock, double precio, String modelo, String fabricante, int puertos) {
        super(stock, precio, modelo, fabricante, puertos);
    }

    public String quienSoy(){
        return "Salida";
    }
}
