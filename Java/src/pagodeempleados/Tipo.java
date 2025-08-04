package pagodeempleados;

public enum Tipo {
    UX(0.07), UI(0.08), IT(0.12);
    private double porcentaje;

    private Tipo(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }
}
