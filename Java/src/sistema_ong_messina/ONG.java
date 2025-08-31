package sistema_ong_messina;

import java.util.HashSet;

public class ONG {
    private HashSet<Participante> participantes;

    public ONG(HashSet<Participante> participantes) {
        this.participantes = participantes;
    }

    public HashSet<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(HashSet<Participante> participantes) {
        this.participantes = participantes;
    }


}
