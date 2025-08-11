package pagodeempleados;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

class DiseñadorTest {

    private Diseñador diseñador;
    private Proyecto proyecto1;
    private Proyecto proyecto2;
    private HashMap<Proyecto, Integer> proyectos;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setUp() {
        proyecto1 = new Proyecto("Proyecto A", 5000);
        proyecto2 = new Proyecto("Proyecto B", 3000);

        proyectos = new HashMap<>();
        proyectos.put(proyecto1, 5000);
        proyectos.put(proyecto2, 3000);

        diseñador = new Diseñador("Luis", Tipo.UX, proyectos);

        // Prepare to capture System.out
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testTipoPorcentaje() {
        assertEquals(0.07, Tipo.UX.getPorcentaje());
        assertEquals(0.08, Tipo.UI.getPorcentaje());
        assertEquals(0.12, Tipo.IT.getPorcentaje());
    }

    @Test
    void testProyectoGettersAndSetters() {
        Proyecto proyecto = new Proyecto("Sitio Web", 5000);
        assertEquals("Sitio Web", proyecto.getNombre());
        assertEquals(5000, proyecto.getPago());

        proyecto.setNombre("App Móvil");
        proyecto.setPago(8000);
        assertEquals("App Móvil", proyecto.getNombre());
        assertEquals(8000, proyecto.getPago());
    }

    @Test
    void testDiseñadorDefaultConstructor() {
        Diseñador dis = new Diseñador();
        assertEquals("pepe", dis.getNombre());
        assertEquals(Tipo.IT, dis.getTipo());
        assertTrue(dis.getProyectos().isEmpty());
    }

    @Test
    void testDiseñadorCustomConstructorAndSetters() {
        assertEquals("Luis", diseñador.getNombre());
        assertEquals(Tipo.UX, diseñador.getTipo());
        assertEquals(2, diseñador.getProyectos().size());

        diseñador.setNombre("Carlos");
        diseñador.setTipo(Tipo.UI);
        assertEquals("Carlos", diseñador.getNombre());
        assertEquals(Tipo.UI, diseñador.getTipo());
    }

    @Test
    void testRecaudoOutputsCorrectAmount() {
        diseñador.recaudo();
        String output = outContent.toString().trim();
        double expected = (5000 + 3000) * (1 + Tipo.UX.getPorcentaje());
        assertEquals(String.valueOf(expected), output);
    }

    @Test
    void testProyectosTotales() {
        diseñador.proyectosTotales();
        assertEquals("2", outContent.toString().trim());
    }

    @Test
    void testCuantoGanoProyectoEspecifico() {
        diseñador.cuantoGanoProyectoEspecifico(proyecto1);
        assertEquals("5000", outContent.toString().trim());
    }

    @Test
    void testInfoProyecto() {
        outContent.reset();

        diseñador.infoProyecto();

        String[] lines = outContent.toString().trim().split("\\r?\\n");

        boolean found = false;
        for (int i = 0; i < lines.length - 3; i++) {
            String nombre = lines[i];
            String valor = lines[i + 1];
            String objeto = lines[i + 2];
            String calculo = lines[i + 3];

            if (nombre.equals(proyecto1.getNombre())) {
                assertEquals(String.valueOf(5000), valor);

                assertTrue(objeto.contains("Proyecto"));

                double esperado = proyecto1.getPago() * Tipo.UX.getPorcentaje();
                double actual = Double.parseDouble(calculo);
                assertEquals(esperado, actual, 0.0001);

                found = true;
                break;
            }
        }
        assertTrue(found, "No se encontró el bloque para proyecto1 en la salida.");
    }

}
