package lunch_sys;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Pedido {
    private LocalDate tiempo_creacion;
    private Plato plato;
    private Persona solicitante;
    private LocalTime hora_entrega;
    private String estado;

    public Pedido(LocalDate tiempo_creacion, Plato plato, Persona solicitante, LocalTime hora_entrega, String estado) {
        this.tiempo_creacion = tiempo_creacion;
        this.plato = plato;
        this.solicitante = solicitante;
        this.hora_entrega = hora_entrega;
        this.estado = estado;
    }
    public Pedido(){
        tiempo_creacion=LocalDate.of(1990, 1, 27);
        plato=new Plato();
        solicitante=new Profesor();
        hora_entrega= LocalTime.of(13, 16, 40);
        estado="piola";
    }

    public LocalDate getTiempo_creacion() {
        return tiempo_creacion;
    }
    public void setTiempo_creacion(LocalDate tiempo_creacion) {
        this.tiempo_creacion = tiempo_creacion;
    }
    public Plato getPlato() {
        return plato;
    }
    public void setPlato(Plato plato) {
        this.plato = plato;
    }
    public Persona getSolicitante() {
        return solicitante;
    }
    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }
    public LocalTime getHora_entrega() {
        return hora_entrega;
    }
    public void setHora_entrega(LocalTime hora_entrega) {
        this.hora_entrega = hora_entrega;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

}
