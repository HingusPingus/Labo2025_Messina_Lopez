package sensorSys;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {
    ArrayList<Sensor> sensores;

    public Sistema(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }
    public Sistema(){
        sensores=new ArrayList<>();
        sensores.add(new DetectorHumo());
        sensores.add(new SensorTemp(false, 30, 20, LocalDate.of(1950, 12, 4)));
        sensores.add(new SensorPresion(true, 20, 100, LocalDate.of(2025, 5, 5)));
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }

    public static void main(String[] args) {
        Sistema sys=new Sistema();
        for(Sensor s:sys.getSensores()){
            if(s.getUmbral()<s.getMedida() && s.isEstado()){
                s.alarma();
            }
        }
    }
}
