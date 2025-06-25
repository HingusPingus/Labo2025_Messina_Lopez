package SistemaBebidas;

public class BebidaAlcoholica extends Bebida{
    private int cantidadAlcohol;

    public BebidaAlcoholica(String nombre, int cantidadAlcohol) {
        super(nombre);
        this.setCoeficienteNegatividad(getCantidadAlcohol()*20);
        this.setCoeficientePositividad(0);
        this.cantidadAlcohol = cantidadAlcohol;
    }

    public int getCantidadAlcohol() {
        return cantidadAlcohol;
    }

    public void setCantidadAlcohol(int cantidadAlcohol) {
        this.cantidadAlcohol = cantidadAlcohol;
    }

    @Override
    public int sumaCoeficiente() {
        return getCoeficientePositividad()-getCoeficienteNegatividad();
    }
}
