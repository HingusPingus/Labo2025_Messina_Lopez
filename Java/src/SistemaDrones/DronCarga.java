package SistemaDrones;

import java.time.LocalDate;
import java.util.ArrayList;

public class DronCarga extends Dron {
    private int peso;
    private ArrayList<Mision> misiones;
    public DronCarga(String modelo, LocalDate fechaAdq, int carga, Estado estado, int peso, ArrayList<Mision> misiones) {
        super(modelo, fechaAdq, carga, estado);
        this.peso=peso;
        this.misiones=misiones;
    }

}
