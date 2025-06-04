package componentespc;

import enums.Fabricante;

public class CPU extends Componente{

    public CPU() {
    super();
    }

    public CPU(int stock, double precio, String modelo, Fabricante fabricante) {
        super(stock, precio, modelo, fabricante);
    }
    public String quienSoy(){
        return "CPU";
    }
}
