package sistemas_ong;

public class ProfesorTitular extends Personal {
    private Materia materia;
    private int horasLaburo;

    @Override
    public String quienSoy() {
        return "ProfeTitu";
    }
}
