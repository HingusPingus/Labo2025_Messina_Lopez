package sistemaspeso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class PesoTesteo {

    private ClientePeso cliente;

    @BeforeEach
    public void setUp() {
        HashMap<LocalDate, Registro> registros = new HashMap<>();
        registros.put(LocalDate.of(2023, 1, 1), new Registro(60, 1.60));
        registros.put(LocalDate.of(2024, 1, 1), new Registro(65, 1.65));
        registros.put(LocalDate.of(2025, 1, 1), new Registro(70, 1.70));

        cliente = new ClientePeso("Juan", "Pérez", 30, "Av. Siempre Viva", LocalDate.of(1995, 5, 5), registros);
    }

    @Test
    public void testAddRegistroNuevo() {
        Registro nuevo = new Registro(75, 1.75);
        cliente.addRegistro(nuevo);


        assertTrue(cliente.getRegistros().containsKey(LocalDate.now()));
        assertEquals(75, cliente.getRegistros().get(LocalDate.now()).getPeso());
    }

    @Test
    public void testAddRegistroExistente() {
        cliente.getRegistros().put(LocalDate.now(), new Registro(70, 1.70));


        cliente.addRegistro(new Registro(70, 1.80));

        assertEquals(70, cliente.getRegistros().get(LocalDate.now()).getPeso());
    }

    @Test
    public void testSeeRegistroExistente() {
        String registro = cliente.seeRegistro(LocalDate.of(2023, 1, 1));
        assertEquals("Peso: 60.0 Altura: 1.6", registro);
    }

    @Test
    public void testSeeRegistroInexistente() {
        String registro = cliente.seeRegistro(LocalDate.of(2022, 1, 1));
        assertEquals("No existe registro en esa fecha", registro);
    }

    @Test
    public void testPromedioPesoAnio() {
        double promedio = cliente.getPromedioPesoAnio(2024);
        assertEquals(65.0, promedio);
    }

    @Test
    public void testPromedioAlturaAnio() {
        double promedio = cliente.getPromedioAlturaAnio(2024);
        assertEquals(1.65, promedio);
    }

    @Test
    public void testCrecimientoAltura() {
        double porcentaje = cliente.getPorcentajeCrecimientoAltura(LocalDate.of(2024, 1, 1));
        assertEquals(3.125, porcentaje, 0.001);
    }

    @Test
    public void testCrecimientoPeso() {
        double porcentaje = cliente.getPorcentajeCrecimientoPeso(LocalDate.of(2024, 1, 1));
        assertEquals(8.333, porcentaje, 0.001);
    }

    @Test
    public void testCrecimientoConUnSoloRegistro() {
        ClientePeso clienteNuevo = new ClientePeso();
        clienteNuevo.getRegistros().put(LocalDate.of(2025, 1, 1), new Registro(80, 1.80));

        double crecimientoPeso = clienteNuevo.getPorcentajeCrecimientoPeso(LocalDate.of(2025, 1, 1));
        assertEquals(0.0, crecimientoPeso);
    }

}
