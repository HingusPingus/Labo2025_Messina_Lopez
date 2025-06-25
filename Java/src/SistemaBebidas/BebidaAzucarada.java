package SistemaBebidas;

public class BebidaAzucarada extends Bebida{
    private int cantAzucar;

    public BebidaAzucarada(String nombre, int cantAzucar) {
        super(nombre);
        this.setCoeficienteNegatividad(cantAzucar*10);
        this.setCoeficientePositividad(1);
        this.cantAzucar = cantAzucar;
    }

    public int getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(int cantAzucar) {
        this.cantAzucar = cantAzucar;
    }

    @Override
    public int sumaCoeficiente() {
        return getCoeficientePositividad()-getCoeficienteNegatividad();
    }
}
