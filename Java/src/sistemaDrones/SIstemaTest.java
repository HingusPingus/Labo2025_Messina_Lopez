package sistemaDrones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
public class SIstemaTest {
    @Test
    public void testCargarBateria() {
        DronCarga dron = new DronCarga("ModelX", LocalDate.now(), 15, Estado.OPERATIVO, 50, new ArrayList<>());
        dron.cargarBateria();
        assertEquals(100, dron.getCarga());
    }

    @Test
    public void testActualizarMisionDronCargaCompletada() {
        Mision mision = new Mision(-34.6, -58.5, EstadoMision.ENPROCESO); // cercana
        ArrayList<Mision> misiones = new ArrayList<>();
        misiones.add(mision);
        DronCarga dron = new DronCarga("CargoX", LocalDate.now(), 100, Estado.OPERATIVO, 100, misiones);

        dron.actualizarMision(mision);
        assertEquals(EstadoMision.COMPLETADA, mision.getEstado());
        assertEquals(52, dron.getCarga()); // 100 - 48
    }

    @Test
    public void testActualizarMisionDronVigilanciaFallidaPorMemoria() {
        Mision mision = new Mision(10, 10, EstadoMision.ENPROCESO); // distancia considerable
        ArrayList<Mision> misiones = new ArrayList<>();
        misiones.add(mision);
        DronVigilancia dron = new DronVigilancia("VigiX", LocalDate.now(), 100, Estado.OPERATIVO, 5, misiones);

        dron.actualizarMision(mision);
        assertEquals(EstadoMision.FALLADA, mision.getEstado());
    }

    @Test
    public void testEstadoMisionCambioASinEmpezar() {
        Mision mision = new Mision(20, 10, EstadoMision.SINEMPEZAR);
        ArrayList<Mision> misiones = new ArrayList<>();
        misiones.add(mision);
        DronCarga dron = new DronCarga("CargoY", LocalDate.now(), 100, Estado.OPERATIVO, 50, misiones);

        dron.actualizarMision(mision);
        assertEquals(EstadoMision.ENPROCESO, mision.getEstado());
    }

    @Test
    public void testFixBateriaLímites() {
        DronCarga dron = new DronCarga("Overcharge", LocalDate.now(), 150, Estado.OPERATIVO, 100, new ArrayList<>());
        dron.fixBateria();
        assertEquals(100, dron.getCarga());

        dron.setCarga(-10);
        dron.fixBateria();
        assertEquals(0, dron.getCarga());
    }
}

