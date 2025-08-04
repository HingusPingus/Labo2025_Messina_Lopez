package gestionTickets;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Ticket {
    private ClienteTicket clienteAsignado;
    private String descripcion;
    private LocalDateTime inicio;
    private LocalDateTime cierre;
    private ArrayList<String> anotaciones;
    private Estado estado;

    public Ticket() {
        this.clienteAsignado = new ClienteTicket();
        this.descripcion = "pinta";
        this.inicio = LocalDateTime.now();
        this.anotaciones = new ArrayList<>();
        this.estado = Estado.ABIERTO;
    }

    public Ticket(ClienteTicket clienteAsignado, String descripcion) {
        this.clienteAsignado = clienteAsignado;
        this.descripcion = descripcion;
        this.inicio = LocalDateTime.now();
        this.anotaciones = anotaciones;
        this.estado = Estado.ABIERTO;
    }

    public ClienteTicket getClienteAsignado() {
        return clienteAsignado;
    }

    public void setClienteAsignado(ClienteTicket clienteAsignado) {
        this.clienteAsignado = clienteAsignado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getCierre() {
        return cierre;
    }

    public void setCierre(LocalDateTime cierre) {
        this.cierre = cierre;
    }

    public ArrayList<String> getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(ArrayList<String> anotaciones) {
        this.anotaciones = anotaciones;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
        if(estado.equals(Estado.CANCELADO)||estado.equals(Estado.CERRADO)||estado.equals(Estado.RESUELTO)){
            this.cierre=LocalDateTime.now();
        }
    }

    public void addComentario(String comentario){
        this.anotaciones.add(comentario);
    }

    public abstract boolean resolver();
}
