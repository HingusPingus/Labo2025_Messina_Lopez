package SistemaBebidas;

public abstract class Bebida {
    private String nombre;
    private int CoeficienteNegatividad;
    private int CoeficientePositividad;

    public Bebida(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoeficienteNegatividad() {
        return CoeficienteNegatividad;
    }

    public void setCoeficienteNegatividad(int coeficienteNegatividad) {
        CoeficienteNegatividad = coeficienteNegatividad;
    }

    public int getCoeficientePositividad() {
        return CoeficientePositividad;
    }

    public void setCoeficientePositividad(int coeficientePositividad) {
        CoeficientePositividad = coeficientePositividad;
    }
}
