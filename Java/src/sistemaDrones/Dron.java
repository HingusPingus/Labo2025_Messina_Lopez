package sistemaDrones;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Dron {
    private String modelo;
    private LocalDate fechaAdq;
    private int carga;
    private static int id;
    private Estado estado;
    private ArrayList<Mision> misiones;

    public Dron(String modelo, LocalDate fechaAdq, int carga, Estado estado, ArrayList<Mision> misiones) {
        this.modelo = modelo;
        this.fechaAdq = fechaAdq;
        this.carga = carga;
        this.estado = estado;
        if(estado==Estado.OPERATIVO || estado==Estado.ENVUELO){
            id+=1;
        }
        this.misiones=misiones;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public LocalDate getFechaAdq() {
        return fechaAdq;
    }
    public void setFechaAdq(LocalDate fechaAdq) {
        this.fechaAdq = fechaAdq;
    }
    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
    public static int getId() {
        return id;
    }
    public static void setId(int id) {
        Dron.id = id;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public ArrayList<Mision> getMisiones() {
        return misiones;
    }
    public void setMisiones(ArrayList<Mision> misiones) {
        this.misiones = misiones;
    }

    public void fixBateria(){
        if(carga>100){
            setCarga(100);
        }
        else if(carga<0){
            setCarga(0);
        }
    }
    public void cargarBateria(){
        fixBateria();
        if(carga<=20){
            setCarga(100);
        }
        else if(carga>20){
            setCarga(carga+=10);
        }
        fixBateria();
    }

    public abstract void actualizarMision(Mision mision);
}
