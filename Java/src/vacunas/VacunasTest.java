package vacunas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class VacunasTest {

    private Sistema sistema;
    private Ciudadano ciudadano1;
    private Ciudadano ciudadano2;
    private Vacuna vacuna1;
    private Vacuna vacuna2;

    @BeforeEach
    public void setUp() {
        sistema = new Sistema();

        ciudadano1 = new Ciudadano("Juan", "Pérez", 30, "Calle Falsa 123", 12345678, "juan@mail.com", Provincia.BUENOS_AIRES);
        ciudadano2 = new Ciudadano("Ana", "Gómez", 25, "Av. Siempre Viva", 87654321, "ana@mail.com", Provincia.CORDOBA);

        vacuna1 = new Vacuna(LocalDate.of(2023, 1, 10), LocalDate.of(2022, 12, 1), 101, 1001, "Pfizer");
        vacuna2 = new Vacuna(LocalDate.of(2023, 2, 15), LocalDate.of(2023, 1, 1), 102, 1002, "Moderna");

        sistema.registrarVacuna(vacuna1, ciudadano1); // No se registra porque no está en el mapa
        HashSet<Vacuna> vacunas = new HashSet<>();
        vacunas.add(vacuna1);
        HashMap<Ciudadano, HashSet<Vacuna>> registroInicial = new HashMap<>();
        registroInicial.put(ciudadano1, vacunas);
        registroInicial.put(ciudadano2, new HashSet<>());
        sistema = new Sistema(registroInicial);
    }

    @Test
    public void testRegistrarVacuna() {
        sistema.registrarVacuna(vacuna2, ciudadano1);
        assertTrue(sistema.consultarHistorial(ciudadano1.getDni()).contains(vacuna2));
    }

    @Test
    public void testConsultarHistorialExistente() {
        HashSet<Vacuna> historial = sistema.consultarHistorial(12345678);
        assertNotNull(historial);
        assertEquals(1, historial.size());
        assertTrue(historial.contains(vacuna1));
    }

    @Test
    public void testConsultarHistorialInexistente() {
        assertNull(sistema.consultarHistorial(99999999));
    }

    @Test
    public void testPorProvincia() {
        HashSet<Ciudadano> ciudadanos = sistema.porProvincia(Provincia.BUENOS_AIRES);
        assertEquals(1, ciudadanos.size());
        assertTrue(ciudadanos.contains(ciudadano1));
    }

    @Test
    public void testCantidadVacunas() {
        sistema.registrarVacuna(vacuna2, ciudadano1);
        HashSet<Ciudadano> ciudadanos = sistema.cantidadVacunas(2);
        assertEquals(1, ciudadanos.size());
        assertTrue(ciudadanos.contains(ciudadano1));
    }

    @Test
    public void testPorVacuna() {
        sistema.registrarVacuna(vacuna2, ciudadano1);
        HashSet<Ciudadano> ciudadanos = sistema.porVacuna(vacuna2);
        assertEquals(1, ciudadanos.size());
        assertTrue(ciudadanos.contains(ciudadano1));
    }
}
