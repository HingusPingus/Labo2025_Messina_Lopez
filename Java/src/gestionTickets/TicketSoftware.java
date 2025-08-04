package gestionTickets;

public class TicketSoftware extends Ticket{
    private static int intentos = 3;
    private int intentosRestantes;
    private Software software;

    public TicketSoftware() {
        super();
        this.intentosRestantes = intentos;
        this.software=new Software();
    }

    public TicketSoftware(ClienteTicket clienteAsignado, String descripcion, Software software) {
        super(clienteAsignado, descripcion);
        this.intentosRestantes = intentos;
        this.software=software;
    }

    public int getIntentosRestantes() {
        return intentosRestantes;
    }

    public void setIntentosRestantes(int intentosRestantes) {
        this.intentosRestantes = intentosRestantes;
    }

    public static int getIntentos() {
        return intentos;
    }

    public static void setIntentos(int intentos) {
        TicketSoftware.intentos = intentos;
    }

    @Override
    public boolean resolver() {
        if(software.isParcheAplicable()&&this.getEstado().equals(Estado.EN_PROGRESO)){
            return true;
        }
        else{
            return false;
        }
    }
}
