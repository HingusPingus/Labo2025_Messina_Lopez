package SistemaDrones;

import java.time.LocalDate;
import java.util.ArrayList;

public class DronVigilancia extends Dron{
    private int memoria;
    private ArrayList<Mision> misiones;
    public DronVigilancia(String modelo, LocalDate fechaAdq, int carga, Estado estado, int memoria, ArrayList<Mision> misiones) {
        super(modelo, fechaAdq, carga, estado);
        this.memoria=memoria;
        this.misiones=misiones;
    }

}
