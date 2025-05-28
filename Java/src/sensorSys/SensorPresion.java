package sensorSys;

import java.time.LocalDate;

public class SensorPresion extends Sensor{

    public SensorPresion(boolean estado, int medida, int umbral, LocalDate añoAdq) {
        super(estado, medida, umbral, añoAdq);
    }

    public SensorPresion() {
        super();
    }

    @Override
    public void alarma() {
        System.out.println("Sensor de presión activado");
    }
}
