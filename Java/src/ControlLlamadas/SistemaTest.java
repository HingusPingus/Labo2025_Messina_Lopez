package ControlLlamadas;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaTest {
    private Sistema sistema;
    private Empleado empleado1;
    private Empleado empleado2;
    private Llamada llamada1;
    private Llamada llamada2;
    private ArrayList<Llamada> llamadas;

    @BeforeEach
    void setUp() {
        empleado1 = new Empleado("Juan", "Perez", 12345, "Argentina", 987654321);
        empleado2 = new Empleado("Maria", "Gomez", 67890, "Brazil", 123456789);

        llamada1 = new Llamada(empleado2, empleado1, LocalDate.of(2025, 6, 1), 15);
        llamada2 = new Llamada(empleado1, empleado2, LocalDate.of(2025, 6, 2), 20);

        llamadas = new ArrayList<>();
        llamadas.add(llamada1);
        llamadas.add(llamada2);

        sistema = new Sistema(llamadas);
    }

    @Test
    void testEmpleadosSinRepetir() {
        List<Empleado> empleados = sistema.empleadosSinRepetir();
        assertEquals(2, empleados.size());
        assertTrue(empleados.contains(empleado1));
        assertTrue(empleados.contains(empleado2));
    }

    @Test
    void testRanking() {
        ArrayList<Empleado> ranking = sistema.ranking();
        assertEquals(2, ranking.size());
        assertEquals(empleado2, ranking.get(0));
        assertEquals(empleado1, ranking.get(1));
    }

    @Test
    void testSumLlamadasExterior() {
        int minutosEmpleado1 = empleado1.sumLlamadasExterior(llamadas);
        int minutosEmpleado2 = empleado2.sumLlamadasExterior(llamadas);

        assertEquals(15, minutosEmpleado1);
        assertEquals(20, minutosEmpleado2);
    }

    @Test
    void testLlamadasEmpleado() {
        ArrayList<Llamada> llamadasEmp1 = empleado1.llamadasEmpleado(llamadas);
        assertEquals(1, llamadasEmp1.size());
        assertEquals(llamada1, llamadasEmp1.get(0));
    }
}