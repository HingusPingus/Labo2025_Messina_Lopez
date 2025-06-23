package sistemaDrones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
public class SIstemaTest {
    private DronCarga dron;
    private Mision mision;
    private DronCarga dron1;
    private DronCarga dron2;
    private DronCarga dron3;
    private Mision mision1;
    private Mision mision2;
    private DronVigilancia dronV;
    @BeforeEach
    public void setup(){
        mision1 = new Mision(10, 10, EstadoMision.ENPROCESO);
        mision2 = new Mision(20, 10, EstadoMision.SINEMPEZAR);
        mision = new Mision(-34.6, -58.5, EstadoMision.ENPROCESO);
        ArrayList<Mision> misiones = new ArrayList<>();
        misiones.add(mision);
        misiones.add(mision1);
        misiones.add(mision2);
        dronV = new DronVigilancia("VigiX", LocalDate.now(), 100, Estado.OPERATIVO, 5, misiones);
        dron = new DronCarga("ModelX", LocalDate.now(), 15, Estado.OPERATIVO, 50, new ArrayList<>());
        dron1 = new DronCarga("CargoX", LocalDate.now(), 100, Estado.OPERATIVO, 100, misiones);
        dron2 = new DronCarga("CargoY", LocalDate.now(), 100, Estado.OPERATIVO, 50, misiones);
        dron3 = new DronCarga("Overcharge", LocalDate.now(), 150, Estado.OPERATIVO, 100, new ArrayList<>());
    }
    @Test
    public void testCargarBateria() {
        dron.cargarBateria();
        assertEquals(100, dron.getCarga());
    }

    @Test
    public void testActualizarMisionDronCargaCompletada() {
        dron1.actualizarMision(mision);
        assertEquals(EstadoMision.COMPLETADA, mision.getEstado());
        assertEquals(100, dron1.getCarga());
    }

    @Test
    public void testActualizarMisionDronVigilanciaFallidaPorMemoria() {
        dronV.actualizarMision(mision1);
        assertEquals(EstadoMision.FALLADA, mision1.getEstado());
    }

    @Test
    public void testEstadoMisionCambioASinEmpezar() {
        dron2.actualizarMision(mision2);
        assertEquals(EstadoMision.ENPROCESO, mision2.getEstado());
    }

    @Test
    public void testFixBateriaLímites() {
        dron3.fixBateria();
        assertEquals(100, dron3.getCarga());
        dron3.setCarga(-10);
        dron3.fixBateria();
        assertEquals(0, dron3.getCarga());
    }
}

