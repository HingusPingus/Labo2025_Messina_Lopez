package elecciones;

import java.util.HashSet;

public class Partido {
    private String nombre;
    private String direccion;
    private int cantidadAfiliados;
    private HashSet<Campaña> mensajeros;

    public Partido(String nombre, String direccion, int cantidadAfiliados, HashSet<Campaña> mensajeros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadAfiliados = cantidadAfiliados;
        this.mensajeros = mensajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadAfiliados() {
        return cantidadAfiliados;
    }

    public void setCantidadAfiliados(int cantidadAfiliados) {
        this.cantidadAfiliados = cantidadAfiliados;
    }

    public HashSet<Campaña> getMensajeros() {
        return mensajeros;
    }

    public void setMensajeros(HashSet<Campaña> mensajeros) {
        this.mensajeros = mensajeros;
    }

    public void addMensajero(Campaña mensajero){
        mensajeros.add(mensajero);
    }

    public void hacerCampaña(){


        for(Campaña c:mensajeros){
            System.out.println(c.enviarMensaje());
        }
    }
}
