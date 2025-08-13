package sistemapoblacion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class SistemaPaisesTest {

    private Barrio barrio1, barrio2;
    private Ciudad ciudad1, ciudad2;
    private Provincia provincia1, provincia2;
    private Pais pais1, pais2;
    private Continente continente1, continente2;
    private SistemaPaises sistema;

    @BeforeEach
    void setUp() {
        barrio1 = new Barrio("Barrio A", 101, coords(1.0, 2.0), 1000);
        barrio2 = new Barrio("Barrio B", 102, coords(3.0, 4.0), 2000);

        HashMap<Integer, Barrio> barriosC1 = new HashMap<>();
        barriosC1.put(barrio1.getCodigo(), barrio1);
        ciudad1 = new Ciudad("Ciudad X", 201, coords(5.0, 6.0), barriosC1);

        HashMap<Integer, Barrio> barriosC2 = new HashMap<>();
        barriosC2.put(barrio2.getCodigo(), barrio2);
        ciudad2 = new Ciudad("Ciudad Y", 202, coords(7.0, 8.0), barriosC2);

        HashMap<Integer, Ciudad> ciudadesP1 = new HashMap<>();
        ciudadesP1.put(ciudad1.getCodigo(), ciudad1);
        provincia1 = new Provincia("Provincia Uno", 301, coords(9.0, 10.0), ciudadesP1);

        HashMap<Integer, Ciudad> ciudadesP2 = new HashMap<>();
        ciudadesP2.put(ciudad2.getCodigo(), ciudad2);
        provincia2 = new Provincia("Provincia Dos", 302, coords(11.0, 12.0), ciudadesP2);

        HashMap<Integer, Provincia> provinciasPais1 = new HashMap<>();
        provinciasPais1.put(provincia1.getCodigo(), provincia1);
        pais1 = new Pais("Pais Alfa", 401, coords(13.0, 14.0), provinciasPais1);

        HashMap<Integer, Provincia> provinciasPais2 = new HashMap<>();
        provinciasPais2.put(provincia2.getCodigo(), provincia2);
        pais2 = new Pais("Pais Beta", 402, coords(15.0, 16.0), provinciasPais2);

        HashMap<Integer, Pais> paisesCont1 = new HashMap<>();
        paisesCont1.put(pais1.getCodigo(), pais1);
        continente1 = new Continente("Continente Norte", 501, coords(17.0, 18.0), paisesCont1);

        HashMap<Integer, Pais> paisesCont2 = new HashMap<>();
        paisesCont2.put(pais2.getCodigo(), pais2);
        continente2 = new Continente("Continente Sur", 502, coords(19.0, 20.0), paisesCont2);

        HashMap<Integer, Continente> continentesSistema = new HashMap<>();
        continentesSistema.put(continente1.getCodigo(), continente1);
        continentesSistema.put(continente2.getCodigo(), continente2);
        sistema = new SistemaPaises(continentesSistema);
    }

    private HashSet<Double> coords(Double... vals) {
        HashSet<Double> set = new HashSet<>();
        for (Double v : vals) set.add(v);
        return set;
    }

    @Test
    void testPoblacionLevels() {
        assertEquals(1000, barrio1.getPoblacion());
        assertEquals(2000, barrio2.getPoblacion());

        assertEquals(1000, ciudad1.getPoblacion());
        assertEquals(2000, ciudad2.getPoblacion());

        assertEquals(1000, provincia1.getPoblacion());
        assertEquals(2000, provincia2.getPoblacion());

        assertEquals(1000, pais1.getPoblacion());
        assertEquals(2000, pais2.getPoblacion());

        assertEquals(1000, continente1.getPoblacion());
        assertEquals(2000, continente2.getPoblacion());
    }

    @Test
    void testPutAndDeleteMethods() {
        Barrio barrioExtra = new Barrio("Extra", 103, coords(21.0, 22.0), 500);
        ciudad1.addBarrio(barrioExtra);
        assertTrue(ciudad1.getBarrios().containsKey(103));

        ciudad1.deleteBarrio(barrioExtra);
        assertFalse(ciudad1.getBarrios().containsKey(103));

        Provincia provExtra = new Provincia("ProvExtra", 303, coords(23.0, 24.0), new HashMap<>());
        pais1.putProvincia(provExtra);
        assertTrue(pais1.getProvincias().containsKey(303));

        pais1.deleteProvincia(provExtra);
        assertFalse(pais1.getProvincias().containsKey(303));

        Pais paisExtra = new Pais("PaisExtra", 403, coords(25.0, 26.0), new HashMap<>());
        continente1.putPais(paisExtra);
        assertTrue(continente1.getPaises().containsKey(403));

        continente1.deletePais(paisExtra);
        assertFalse(continente1.getPaises().containsKey(403));

        Continente contExtra = new Continente("ContExtra", 503, coords(27.0, 28.0), new HashMap<>());
        sistema.putContinente(contExtra);
        assertTrue(sistema.getContinentes().containsKey(503));

        sistema.deleteContinente(contExtra);
        assertFalse(sistema.getContinentes().containsKey(503));
    }

    @Test
    void testSistemaStats() {
        assertEquals(pais2, sistema.paisMas());
        assertEquals(pais1, sistema.paisMenos());
        assertEquals(continente2, sistema.continenteMas());
        assertEquals(continente1, sistema.continenteMenos());
    }

    @Test
    void testPoblacionCodigo() {
        assertEquals(2000, sistema.poblacionCodigo(402));
        assertEquals(1000, sistema.poblacionCodigo(401));
        assertEquals(2000, sistema.poblacionCodigo(202));
        assertEquals(1000, sistema.poblacionCodigo(101));
    }
}
