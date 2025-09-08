package elecciones;

import java.time.LocalTime;

public class Telefono extends Dispositivo implements Campaña{
    private Telefonia companiaTelefonia;
    private int numero;
    private boolean prendido;
    private boolean creditoDisponible;

    public Telefono(String numeroSerie, String fabricante, String modelo, Telefonia companiaTelefonia, int numero, boolean prendido, boolean creditoDisponible) {
        super(numeroSerie, fabricante, modelo);
        this.companiaTelefonia = companiaTelefonia;
        this.numero = numero;
        this.prendido = prendido;
        this.creditoDisponible = creditoDisponible;
    }

    public Telefonia getCompaniaTelefonia() {
        return companiaTelefonia;
    }

    public void setCompaniaTelefonia(Telefonia companiaTelefonia) {
        this.companiaTelefonia = companiaTelefonia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isPrendido() {
        return prendido;
    }

    public void setPrendido(boolean prendido) {
        this.prendido = prendido;
    }

    public boolean isCreditoDisponible() {
        return creditoDisponible;
    }

    public void setCreditoDisponible(boolean creditoDisponible) {
        this.creditoDisponible = creditoDisponible;
    }

    @Override
    public String enviarMensaje() {
        if(prendido && creditoDisponible){
            return"Conectando con la antena mas cercana.... Vote por el partido para un futuro mejor";
        }
        return"";
    }

}
