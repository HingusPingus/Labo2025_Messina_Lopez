package sensorSys;

import java.time.LocalDate;
import java.util.ArrayList;

public class SensorCompuesto extends Sensor{
    ArrayList<Sensor> SensorComp;

    public SensorCompuesto(boolean estado, int medida, int umbral, LocalDate añoAdq, ArrayList<Sensor> sensorComp) {
        super(estado, medida, umbral, añoAdq);
        SensorComp = sensorComp;
    }

    public SensorCompuesto(ArrayList<Sensor> sensorComp) {
        super();
        SensorComp = sensorComp;
    }
    public SensorCompuesto(){
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

    public void alarma(){
        int aux=0;
        for(Sensor s:SensorComp){
            aux+=s.getMedida();
        }
        if((aux/3)>= this.getUmbral()){
            System.out.println("alarma");
        }
    }
}
