package modificacionsangre;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.HashSet;

class SangreTest {

    private Niño niño;
    private Joven joven;
    private Adulto adulto;
    private Geronte geronte;
    private Fundacion fundacion;

    @BeforeEach
    void setUp() {
        niño = new Niño("Juan", "Perez", 5, "Calle 123",
                LocalDate.of(2018, 5, 15), "juan@email.com",
                TipoSangre.A, true, 5);

        HashSet<String> actividades = new HashSet<>();
        actividades.add("Natación");
        actividades.add("Fútbol");

        joven = new Joven("Maria", "Gomez", 25, "Avenida 456",
                LocalDate.of(1998, 3, 10), "maria@email.com",
                TipoSangre.B, false, actividades);

        adulto = new Adulto("Carlos", "Lopez", 40, "Calle 789",
                TipoSangre.AB, true);

        geronte = new Geronte("Ana", "Martinez", 70, "Avenida 101",
                TipoSangre.O, false);

        HashSet<Tratamiento> tratados = new HashSet<>();
        tratados.add(niño);
        tratados.add(joven);

        HashSet<Paciente> pacientes = new HashSet<>();
        pacientes.add(niño);
        pacientes.add(joven);
        pacientes.add(adulto);
        pacientes.add(geronte);

        fundacion = new Fundacion(tratados, pacientes);
    }

    @Test
    void testNiñoConstructor() {
        assertNotNull(niño);
        assertEquals("Juan", niño.getNombre());
        assertEquals("Perez", niño.getApellido());
        assertEquals(5, niño.getEdad());
        assertEquals(TipoSangre.A, niño.getSangre());
        assertTrue(niño.isPositivo());
        assertEquals(5, niño.tolerancia);
    }

    @Test
    void testNiñoToleranciaLimites() {
        Niño niñoMin = new Niño(TipoSangre.A, true, 0);
        Niño niñoMax = new Niño(TipoSangre.A, true, 15);

        assertEquals(1, niñoMin.tolerancia);
        assertEquals(10, niñoMax.tolerancia);
    }

    @Test
    void testNiñoCheckearTratamiento() {
        assertTrue(niño.checkearTratamiento());

        Niño niñoAB = new Niño(TipoSangre.AB, true, 5);
        assertFalse(niñoAB.checkearTratamiento());

        Niño niñoBebe = new Niño("Bebe", 2, "Calle 123", TipoSangre.A, true, 3);
        assertFalse(niñoBebe.checkearTratamiento());
    }

    @Test
    void testNiñoTratar() {
        for (int i = 0; i < niño.diasTeoricos - 1; i++) {
            assertFalse(niño.tratar());
        }
        assertTrue(niño.tratar());
        assertEquals(TipoSangre.AB, niño.getSangre());
    }

    @Test
    void testNiñoCalcularPrecio() {
        Niño niñoPrecio = new Niño(TipoSangre.A, true, 7);
        assertEquals(450000 * 7, niñoPrecio.calcularPrecio());
    }

    @Test
    void testJovenConstructor() {
        assertNotNull(joven);
        assertEquals("Maria", joven.getNombre());
        assertEquals("Gomez", joven.getApellido());
        assertEquals(25, joven.getEdad());
        assertEquals(TipoSangre.B, joven.getSangre());
        assertFalse(joven.isPositivo());
        assertEquals(10, joven.getDiasTeoricos());
    }

    @Test
    void testJovenCheckearTratamiento() {
        assertTrue(joven.checkearTratamiento());

        Joven jovenATratado = new Joven(TipoSangre.A, true, new HashSet<>());
        assertFalse(jovenATratado.checkearTratamiento());

        Joven jovenViejo = new Joven("Viejo", 29, "Calle 123", TipoSangre.B, false, new HashSet<>());
        assertFalse(jovenViejo.checkearTratamiento());
    }

    @Test
    void testJovenTratar() {
        for (int i = 0; i < joven.getDiasTeoricos() - 1; i++) {
            assertFalse(joven.tratar());
        }
        assertTrue(joven.tratar());
        assertEquals(TipoSangre.A, joven.getSangre());
        assertTrue(joven.isPositivo());
    }

    @Test
    void testJovenCalcularPrecio() {
        Joven jovenImpar = new Joven("Test", 25, "Calle", TipoSangre.B, false, new HashSet<>());
        jovenImpar.setFechaNacimiento(LocalDate.of(1999, 5, 15)); // Año impar
        assertEquals(5 * 760000, jovenImpar.calcularPrecio());

        Joven jovenPar = new Joven("Test", 25, "Calle", TipoSangre.B, false, new HashSet<>());
        jovenPar.setFechaNacimiento(LocalDate.of(2000, 5, 20)); // Año par
        assertEquals(20 * 145400, jovenPar.calcularPrecio());
    }

    @Test
    void testFundacionCantidadNoTratados() {
        assertEquals(2, fundacion.cantidadNoTratados());
    }

    @Test
    void testFundacionCheckearPacientes() {
        int tratadosInicial = fundacion.getTratados().size();
        fundacion.checkearPacientes();

        assertTrue(fundacion.getTratados().size() <= tratadosInicial);
    }

    @Test
    void testTipoSangreEnum() {
        assertEquals(4, TipoSangre.values().length);
        assertTrue(TipoSangre.valueOf("A") instanceof TipoSangre);
        assertTrue(TipoSangre.valueOf("B") instanceof TipoSangre);
        assertTrue(TipoSangre.valueOf("AB") instanceof TipoSangre);
        assertTrue(TipoSangre.valueOf("O") instanceof TipoSangre);
    }

    @Test
    void testPacienteHerencia() {
        assertTrue(niño instanceof Paciente);
        assertTrue(joven instanceof Paciente);
        assertTrue(adulto instanceof Paciente);
        assertTrue(geronte instanceof Paciente);
        assertTrue(niño instanceof Tratamiento);
        assertTrue(joven instanceof Tratamiento);
        assertFalse(adulto instanceof Tratamiento);
        assertFalse(geronte instanceof Tratamiento);
    }
}