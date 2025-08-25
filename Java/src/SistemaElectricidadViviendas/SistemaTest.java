package SistemaElectricidadViviendas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaTest {

    private Duenio duenio;
    private Casa casa;
    private Depto depto;
    private Sistema sistema;

    @BeforeEach
    void setUp() {
        duenio = new Duenio("Juan", "Perez", 40, "Calle Falsa 123", 12345678);

        HashMap<LocalDate, Integer> registrosCasa = new HashMap<>();
        HashMap<LocalDate, Integer> registrosDepto = new HashMap<>();

        LocalDate lastYearSameMonth = LocalDate.now().minusYears(1).withMonth(LocalDate.now().getMonthValue());
        registrosCasa.put(lastYearSameMonth, 100);
        registrosDepto.put(lastYearSameMonth, 200);

        casa = new Casa("Av. Siempreviva 742", "1000", duenio, registrosCasa, "120m2", "30m2");
        depto = new Depto("Mitre 555", "2000", duenio, registrosDepto, 3);

        HashSet<Vivienda> viviendas = new HashSet<>();
        viviendas.add(casa);
        viviendas.add(depto);

        sistema = new Sistema(viviendas);
    }

    @Test
    void testCasaGettersSetters() {
        assertEquals("Av. Siempreviva 742", casa.getDireccion());
        casa.setDireccion("Nueva Direccion");
        assertEquals("Nueva Direccion", casa.getDireccion());

        assertEquals("120m2", casa.getMetrosCubiertos());
        casa.setMetrosCubiertos("150m2");
        assertEquals("150m2", casa.getMetrosCubiertos());
    }

    @Test
    void testDeptoGettersSetters() {
        assertEquals(3, depto.getAmbientes());
        depto.setAmbientes(5);
        assertEquals(5, depto.getAmbientes());

        assertEquals(50, depto.getKWhPorClase());
        Depto.setPagoPorKWh(60);
        assertEquals(60, depto.getKWhPorClase());
    }

    @Test
    void testAddRegistro() {
        LocalDate today = LocalDate.now();
        casa.addRegistro(today, 150);
        assertTrue(casa.getRegistros().containsKey(today));
        assertEquals(150, casa.getRegistros().get(today));
    }

    @Test
    void testCalcularGastoConDescuento() {
        int gasto = sistema.calcularGasto(80, casa);
        int expected = (int)((80 * Casa.getPagoPorKWh()) * 0.95);
        assertEquals(expected, gasto);
    }

    @Test
    void testCalcularGastoSinDescuento() {
        int gasto = sistema.calcularGasto(250, depto);
        int expected = 250 * Depto.getPagoPorKWh();
        assertEquals(expected, gasto);
    }

    @Test
    void testGetViviendas() {
        assertTrue(sistema.getViviendas().contains(casa));
        assertTrue(sistema.getViviendas().contains(depto));
    }
}

