package sensorSys;

import java.time.LocalDate;

public abstract class Sensor {
    private boolean estado;
    private int medida;
    private int umbral;
    private LocalDate añoAdq;

    public Sensor(boolean estado, int medida, int umbral, LocalDate añoAdq) {
        this.estado = estado;
        this.medida = medida;
        this.umbral = umbral;
        this.añoAdq = añoAdq;
    }
    public Sensor(){
        estado=true;
        medida=20;
        umbral=30;
        añoAdq=LocalDate.of(2020, 4, 4);
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public int getUmbral() {
        return umbral;
    }

    public void setUmbral(int umbral) {
        this.umbral = umbral;
    }

    public LocalDate getAñoAdq() {
        return añoAdq;
    }

    public void setAñoAdq(LocalDate añoAdq) {
        this.añoAdq = añoAdq;
    }

    public void checkAlarma(){
        if(estado && medida>=umbral){
            alarma();
        }
    }
    public void alarma(){

    }
}
