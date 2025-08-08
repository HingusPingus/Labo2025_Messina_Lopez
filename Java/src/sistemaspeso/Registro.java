package sistemaspeso;

public class Registro {
    private double peso;
    private double altura;

    public Registro(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double pesos) {
        this.peso = pesos;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
