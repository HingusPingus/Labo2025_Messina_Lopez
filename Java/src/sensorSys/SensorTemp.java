package sensorSys;

import java.time.LocalDate;

public class SensorTemp extends Sensor{
    public SensorTemp(boolean estado, int medida, int umbral, LocalDate añoAdq) {
        super(estado, medida, umbral, añoAdq);
    }

    public SensorTemp() {
        super();
    }

    @Override
    public void alarma(){
        System.out.println("¡Cuidado! La temperatura sube");
    }
}
