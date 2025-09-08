package campeonatoArcoFlecha;

public abstract class Beneficio {
    private String nombreBeneficio;
    private String nombreCreador;

    public Beneficio(String nombreBeneficio, String nombreCreador) {
        this.nombreBeneficio = nombreBeneficio;
        this.nombreCreador = nombreCreador;
    }

    public String getNombreBeneficio() {
        return nombreBeneficio;
    }

    public void setNombreBeneficio(String nombreBeneficio) {
        this.nombreBeneficio = nombreBeneficio;
    }

    public String getNombreCreador() {
        return nombreCreador;
    }

    public void setNombreCreador(String nombreCreador) {
        this.nombreCreador = nombreCreador;
    }
}
