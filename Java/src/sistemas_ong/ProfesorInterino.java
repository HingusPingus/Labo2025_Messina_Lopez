package sistemas_ong;

import java.util.HashSet;

public class ProfesorInterino extends Personal {
    private HashSet<Materia> materias;
    private int horasLaburo;

    @Override
    public String quienSoy() {
        return "ProfeIn";
    }
}
