package componentespc;

public class CPU extends Componente{

    public CPU() {
    super();
    }

    public CPU(int stock, double precio, String modelo, String fabricante) {
        super(stock, precio, modelo, fabricante);
    }
    public String quienSoy(){
        return "CPU";
    }
}
