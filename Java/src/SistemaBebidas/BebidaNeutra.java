package SistemaBebidas;

public class BebidaNeutra extends Bebida{

    public BebidaNeutra(String nombre, int coeficienteN, int coeficienteP) {
        super(nombre);
        this.setCoeficienteNegatividad(coeficienteN);
        this.setCoeficientePositividad(coeficienteP);
    }

    @Override
    public int sumaCoeficiente() {
        return getCoeficientePositividad()-getCoeficienteNegatividad();
    }
}
