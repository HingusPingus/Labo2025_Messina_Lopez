package sistema_ong_messina;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BarriosAsignados {

    private static HashSet<Barrio> VOLUNTARIOS_MIEMBROS = new HashSet<>();
    private static HashSet<Barrio> VOLUNTARIOS_EXTERNOS = new HashSet<>();
    private static HashSet<Barrio> PROFESORES = new HashSet<>();
    private static HashSet<Barrio> ADMINISTRATIVOS = new HashSet<>();

    static {
        Collections.addAll(VOLUNTARIOS_MIEMBROS,
                Barrio.MONSERRAT,
                Barrio.NUEVA_POMPEYA,
                Barrio.NUÑEZ,
                Barrio.BELGRANO,
                Barrio.CONSTITUCION
        );

        Collections.addAll(VOLUNTARIOS_EXTERNOS,
                Barrio.COGHLAN,
                Barrio.PALERMO,
                Barrio.BARRACAS,
                Barrio.PARQUE_PATRICIOS,
                Barrio.RETIRO,
                Barrio.SAAVEDRA
        );

        Collections.addAll(PROFESORES,
                Barrio.PUERTO_MADERO,
                Barrio.SAN_CRISTOBAL,
                Barrio.PALERMO,
                Barrio.MONTE_CASTRO,
                Barrio.VERSALLES,
                Barrio.VILLA_SANTA_RITA,
                Barrio.COLEGIALES
        );

        Collections.addAll(ADMINISTRATIVOS,
                Barrio.FLORES,
                Barrio.FLORESTA,
                Barrio.AGRONOMIA,
                Barrio.COLEGIALES,
                Barrio.PARQUE_CHAS
        );
    }

    public static HashSet<Barrio> getBarriosVoluntariosMiembros() {
        return VOLUNTARIOS_MIEMBROS;
    }

    public static HashSet<Barrio> getBarriosVoluntariosExternos() {
        return VOLUNTARIOS_EXTERNOS;
    }

    public static HashSet<Barrio> getBarriosProfesores() {
        return PROFESORES;
    }

    public static HashSet<Barrio> getBarriosAdministrativos() {
        return ADMINISTRATIVOS;
    }
}
