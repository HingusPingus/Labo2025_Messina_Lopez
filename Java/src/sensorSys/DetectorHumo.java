package sensorSys;

import java.time.LocalDate;

public class DetectorHumo extends Sensor{
    public DetectorHumo(boolean estado, int medida, int umbral, LocalDate añoAdq) {
        super(estado, medida, umbral, añoAdq);
    }

    public DetectorHumo() {
        super();
    }

    @Override
    public void alarma() {
        System.out.println("llamada a bomberos");
    }
}
