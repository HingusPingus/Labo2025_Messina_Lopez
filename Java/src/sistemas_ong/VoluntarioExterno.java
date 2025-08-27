package sistemas_ong;

public class VoluntarioExterno extends Participante {
    private Institucion institucion;

    @Override
    public String quienSoy() {
        return "VolunEx";
    }
}
