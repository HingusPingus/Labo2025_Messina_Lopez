package campeonatoArcoFlecha;

import java.util.HashSet;

public class BeneficioComida extends Beneficio implements Acumulable{
    HashSet<String> tragos;

    public BeneficioComida(String nombreBeneficio, String nombreCreador, HashSet<String> tragos) {
        super(nombreBeneficio, nombreCreador);
        this.tragos = tragos;
    }

    public HashSet<String> getTragos() {
        return tragos;
    }

    public void setTragos(HashSet<String> tragos) {
        this.tragos = tragos;
    }

    @Override
    public int aplicarDescuentoExtra() {
        return 4500;
    }
}
