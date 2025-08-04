package gestionTickets;

import componentespc.CPU;
import componentespc.Componente;
import componentespc.PerifericoIn;

public class TicketHardware extends Ticket{
    private Componente dispositivo;

    public TicketHardware() {
        super();
        dispositivo=new CPU();
    }

    public TicketHardware(ClienteTicket clienteAsignado, String descripcion) {
        super(clienteAsignado, descripcion);
        this.dispositivo = dispositivo;
    }

    public Componente getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Componente dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public boolean resolver() {
        if(dispositivo.getStock()>0 && this.getEstado().equals(Estado.EN_PROGRESO)){
            this.setEstado(Estado.RESUELTO);
            return true;
        }
        else{
            return false;
        }
    }
}
