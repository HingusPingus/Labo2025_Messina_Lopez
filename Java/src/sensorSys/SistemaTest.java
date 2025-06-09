package sensorSys;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaTest {
    private SensorCompuesto sensorC;
    private ArrayList<Sensor>sensores;
    private Sensor s1;
    private SensorPresion s2;
    private DetectorHumo s3;
    private SensorTemp s4;

    @BeforeEach
    public void setup(){
        sensorC=new SensorCompuesto(80, new ArrayList<>());
        s2=new SensorPresion(true, 10, 30, LocalDate.of(1990, 10, 10));
        s3=new DetectorHumo(false, 0, 7, LocalDate.of(2000, 3, 7));
        s4=new SensorTemp(true, 20, 40, LocalDate.of(2020, 5, 6));
        sensores.add(s1);
        sensorC.addSensor(s2);
        sensorC.addSensor(s3);
        sensorC.addSensor(s4);
    }

    @Test
    public void testAlarmaSensorCompuesto(){
        assertFalse(sensorC.alarma());
    }

}
