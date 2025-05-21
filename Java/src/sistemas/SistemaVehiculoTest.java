package sistemas;


import org.junit.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vehiculos.Auto;
import vehiculos.Bicicleta;
import vehiculos.Camioneta;
import vehiculos.Vehiculo;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SistemaVehiculoTest {
    Auto a1, a2;
    Camioneta c1;
    Bicicleta b1;
    ArrayList<Vehiculo> vehiculos;
    SistemaVehiculo sys;

    @BeforeEach
    public void setUp(){
        a1=new Auto();
        a2=new Auto("a","b","c",4,2019,"asasf",true);
        c1=new Camioneta();
        b1=new Bicicleta();
        vehiculos=new ArrayList<>();
        vehiculos.add(a1);
        vehiculos.add(a2);
        vehiculos.add(c1);
        vehiculos.add(b1);
        sys=new SistemaVehiculo(vehiculos);
    }

    @Test
    public void testMasCantVehiculo(){
        assertEquals("Auto",sys.masCantVehiculo());

    }

    @Test
    public void testPorcentajeDescapotables(){
        assertEquals(50,sys.porcentajeDescapotables());
    }
}
