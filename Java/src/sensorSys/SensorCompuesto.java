package sensorSys;

import java.time.LocalDate;
import java.util.ArrayList;

public class SensorCompuesto{
    int umbral;
    ArrayList<Sensor> SensorComp;

    public SensorCompuesto(int umbral, ArrayList<Sensor> sensorComp) {
        this.umbral=umbral;
        SensorComp = sensorComp;
    }

    public SensorCompuesto(ArrayList<Sensor> sensorComp) {
        umbral=50;
        SensorComp = sensorComp;
    }
    public SensorCompuesto(){
        umbral=90;
        SensorComp=new ArrayList<>();
        SensorComp.add(new DetectorHumo(true, 10, 20, LocalDate.of(2022, 11, 13)));
        SensorComp.add(new SensorTemp(true, 20, 30, LocalDate.of(2023, 2, 28)));
    }

    public ArrayList<Sensor> getSensorComp() {
        return SensorComp;
    }

    public void setSensorComp(ArrayList<Sensor> sensorComp) {
        SensorComp = sensorComp;
    }
    public void addSensor(Sensor sensor){ SensorComp.add(sensor); }

    public boolean alarma(){
        int aux=0;
        for(Sensor s:SensorComp){
            aux+=s.getMedida();
        }
        if((aux/3)>= this.umbral){
            System.out.println("alarma");
            return true;
        }
        return false;
    }
}
