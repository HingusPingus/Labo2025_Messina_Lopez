package campeonatoArcoFlecha;

import java.util.HashSet;

public class BeneficioTragos extends Beneficio{
    HashSet<String> tragos;

    public BeneficioTragos(String nombreBeneficio, String nombreCreador, HashSet<String> tragos) {
        super(nombreBeneficio, nombreCreador);
        this.tragos = tragos;
    }

    public HashSet<String> getTragos() {
        return tragos;
    }

    public void setTragos(HashSet<String> tragos) {
        this.tragos = tragos;
    }
}
