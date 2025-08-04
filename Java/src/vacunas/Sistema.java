package vacunas;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashMap<Ciudadano, HashSet<Vacuna>> registro;

    public Sistema() {
        this.registro = new HashMap<>();
    }

    public Sistema(HashMap<Ciudadano, HashSet<Vacuna>> registro) {
        this.registro = registro;
    }

    public void registrarVacuna(Vacuna v, Ciudadano c){
        if(this.registro.containsKey(c)){
            this.registro.get(c).add(v);
        }
    }

    public HashSet<Vacuna> consultarHistorial(int dni){
        for(Ciudadano c: registro.keySet()){
            if (c.getDni()==dni){
                return registro.get(c);
            }
        }
        return null;
    }

    public HashSet<Ciudadano> porProvincia(Provincia provincia){
        HashSet<Ciudadano> ciudadanos = new HashSet<>();
        for(Ciudadano c:registro.keySet()){
            if (c.getProvincia()==provincia){
                ciudadanos.add(c);
            }
        }
        return ciudadanos;
    }

    public HashSet<Ciudadano> cantidadVacunas(int cantidad){
        HashSet<Ciudadano> ciudadanos = new HashSet<>();
        for(Ciudadano c:registro.keySet()){
            if(registro.get(c).size()>=cantidad){
                ciudadanos.add(c);
            }
        }
        return ciudadanos;
    }
    public HashSet<Ciudadano> porVacuna(Vacuna v) {
        HashSet<Ciudadano> ciudadanos = new HashSet<>();
        for (Ciudadano c : registro.keySet()) {
            if (registro.get(c).contains(v)) {
                ciudadanos.add(c);
            }
        }
        return ciudadanos;
    }
}
