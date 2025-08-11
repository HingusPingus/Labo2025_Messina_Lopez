package ControlCalorias;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class ControlCaloriasTest {

    private Plato plato1;
    private Plato plato2;
    private Plato plato3;
    private Flaco flaco1;
    private Flaco flaco2;
    private Flaco flaco3;
    private Familia familia;

    @BeforeEach
    void setUp() {
        plato1 = new Plato("Ensalada", "Lechuga", 150);
        plato2 = new Plato("Pasta", "Trigo", 400);
        plato3 = new Plato("Carne", "Vacuno", 600);

        HashMap<Plato, Integer> platosComidos1 = new HashMap<>();
        platosComidos1.put(plato1, 1);

        HashMap<Plato, Integer> platosComidos2 = new HashMap<>();
        platosComidos2.put(plato2, 2);

        HashMap<Plato, Integer> platosComidos3 = new HashMap<>();
        platosComidos3.put(plato3, 3);

        flaco1 = new Flaco("Juan", "Perez", 25, "Calle Falsa 123", 150, platosComidos1);
        flaco2 = new Flaco("Maria", "Lopez", 30, "Av. Siempre Viva 742", 800, platosComidos2);
        flaco3 = new Flaco("Carlos", "Gomez", 28, "Ruta 66", 400, platosComidos3);

        HashSet<Flaco> miembros = new HashSet<>();
        miembros.add(flaco1);
        miembros.add(flaco2);
        miembros.add(flaco3);

        familia = new Familia(miembros);
    }

    @Test
    void testGetAndSetPlato() {
        assertEquals("Ensalada", plato1.getNombre());
        plato1.setNombre("Sopa");
        assertEquals("Sopa", plato1.getNombre());

        assertEquals("Lechuga", plato1.getIngrediente());
        plato1.setIngrediente("Tomate");
        assertEquals("Tomate", plato1.getIngrediente());

        assertEquals(150, plato1.getCalorias());
        plato1.setCalorias(200);
        assertEquals(200, plato1.getCalorias());
    }

    @Test
    void testGetAndSetFlaco() {
        assertEquals(150, flaco1.getCalorias());
        flaco1.setCalorias(300);
        assertEquals(300, flaco1.getCalorias());

        assertEquals(1, flaco1.getPlatosComidos().get(plato1));
        HashMap<Plato, Integer> newPlatos = new HashMap<>();
        newPlatos.put(plato2, 5);
        flaco1.setPlatosComidos(newPlatos);
        assertEquals(5, flaco1.getPlatosComidos().get(plato2));
    }

    @Test
    void testComerPlato() {
        int caloriasIniciales = flaco1.getCalorias();
        flaco1.comerPlato(plato2);
        assertEquals(caloriasIniciales + plato2.getCalorias(), flaco1.getCalorias());
        assertEquals(1, flaco1.getPlatosComidos().get(plato2)); // Se comió por primera vez
    }

    @Test
    void testPromedioCalorias() {
        int promedioEsperado = (150 + 800 + 400) / 3;
        assertEquals(promedioEsperado, familia.promedioCalorias());
    }

    @Test
    void testPersonaQueConsumioMasCalorias() {
        assertEquals(flaco2, familia.personaQueConsumioMasCalorias());
    }

    @Test
    void testPersonaQueConsumioMenosCalorias() {
        assertEquals(flaco1, familia.personaQueConsumioMenosCalorias());
    }
}
