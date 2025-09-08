package campeonatoArcoFlecha;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.HashSet;

public class CampeonatoArcoFlechaTest {

    private Sistema sistema;
    private HashSet<Bar> bares;
    private HashSet<Diana> dianas;
    private HashSet<Beneficio> beneficios;

    private DianaCircular dianaCircular;
    private DianaCuadrado dianaCuadrado;
    private DianaRectangulo dianaRectangulo;
    private Bar bar;
    private BeneficioComida beneficioComida;
    private BeneficioGaseosa beneficioGaseosa;
    private BeneficioTragos beneficioTragos;

    @BeforeEach
    void setUp() {
        HashMap<Integer, Color> colorPuntaje1 = new HashMap<>();
        colorPuntaje1.put(10, Color.ROJO);
        colorPuntaje1.put(20, Color.VERDE);
        colorPuntaje1.put(30, Color.AMARILLO);

        HashMap<Integer, Color> colorPuntaje2 = new HashMap<>();
        colorPuntaje2.put(5, Color.NEGRO);
        colorPuntaje2.put(15, Color.BLANCO);
        colorPuntaje2.put(25, Color.ROJO);
        colorPuntaje2.put(35, Color.VERDE);

        HashMap<Integer, Color> colorPuntaje3 = new HashMap<>();
        colorPuntaje3.put(8, Color.AMARILLO);
        colorPuntaje3.put(18, Color.BLANCO);

        dianaCircular = new DianaCircular("Diana Circular", Dificultad.DIFICIL, colorPuntaje1, 10);
        dianaCuadrado = new DianaCuadrado("Diana Cuadrada", Dificultad.NORMAL, colorPuntaje2, 8);
        dianaRectangulo = new DianaRectangulo("Diana Rectangular", Dificultad.FACIL, colorPuntaje3, 6, 4);

        dianas = new HashSet<>();
        dianas.add(dianaCircular);
        dianas.add(dianaCuadrado);
        dianas.add(dianaRectangulo);

        HashSet<String> comidas = new HashSet<>();
        comidas.add("Hamburguesa");
        comidas.add("Pizza");
        beneficioComida = new BeneficioComida("Comida Gratis", "Restaurante ABC", comidas);

        HashSet<String> gaseosas = new HashSet<>();
        gaseosas.add("Coca-Cola");
        gaseosas.add("Sprite");
        beneficioGaseosa = new BeneficioGaseosa("Gaseosa Gratis", "Bebidas XYZ", gaseosas);

        HashSet<String> tragos = new HashSet<>();
        tragos.add("Mojito");
        tragos.add("Daiquiri");
        beneficioTragos = new BeneficioTragos("Tragos Premium", "Bar Principal", tragos);

        beneficios = new HashSet<>();
        beneficios.add(beneficioComida);
        beneficios.add(beneficioGaseosa);
        beneficios.add(beneficioTragos);

        HashSet<Cliente> clientes = new HashSet<>();
        clientes.add(new Cliente("Juan Pérez"));
        clientes.add(new Cliente("María García"));

        HashSet<Acumulable> beneficiosAcumulables = new HashSet<>();
        beneficiosAcumulables.add(beneficioComida);
        beneficiosAcumulables.add(beneficioGaseosa);

        bar = new Bar(new HashSet<>(dianas), clientes, 100000, new HashSet<>(beneficios), beneficiosAcumulables);

        bares = new HashSet<>();
        bares.add(bar);

        sistema = new Sistema(bares, dianas, beneficios);
    }

    @Test
    void testDianaCircular() {
        assertEquals("Diana Circular", dianaCircular.getNombre());
        assertEquals(Dificultad.DIFICIL, dianaCircular.getDificultad());
        assertEquals(10, dianaCircular.getRadio());
        assertEquals(314, dianaCircular.calcularArea());
        assertEquals(3, dianaCircular.getColorPuntaje().size());
    }

    @Test
    void testDianaCuadrado() {
        assertEquals("Diana Cuadrada", dianaCuadrado.getNombre());
        assertEquals(Dificultad.NORMAL, dianaCuadrado.getDificultad());
        assertEquals(8, dianaCuadrado.getLado());
        assertEquals(64, dianaCuadrado.calcularArea());
        assertEquals(4, dianaCuadrado.getColorPuntaje().size());
    }

    @Test
    void testDianaRectangulo() {
        assertEquals("Diana Rectangular", dianaRectangulo.getNombre());
        assertEquals(Dificultad.FACIL, dianaRectangulo.getDificultad());
        assertEquals(6, dianaRectangulo.getBase());
        assertEquals(4, dianaRectangulo.getAltura());
        assertEquals(24, dianaRectangulo.calcularArea());
        assertEquals(2, dianaRectangulo.getColorPuntaje().size());
    }

    @Test
    void testBeneficioComida() {
        assertEquals("Comida Gratis", beneficioComida.getNombreBeneficio());
        assertEquals("Restaurante ABC", beneficioComida.getNombreCreador());
        assertEquals(2, beneficioComida.getTragos().size());
        assertTrue(beneficioComida.getTragos().contains("Hamburguesa"));
        assertEquals(4500, beneficioComida.aplicarDescuentoExtra());
    }

    @Test
    void testBeneficioGaseosa() {
        assertEquals("Gaseosa Gratis", beneficioGaseosa.getNombreBeneficio());
        assertEquals("Bebidas XYZ", beneficioGaseosa.getNombreCreador());
        assertEquals(2, beneficioGaseosa.getTragos().size());
        assertTrue(beneficioGaseosa.getTragos().contains("Coca-Cola"));
        assertEquals(1000, beneficioGaseosa.aplicarDescuentoExtra());
    }

    @Test
    void testBeneficioTragos() {
        assertEquals("Tragos Premium", beneficioTragos.getNombreBeneficio());
        assertEquals("Bar Principal", beneficioTragos.getNombreCreador());
        assertEquals(2, beneficioTragos.getTragos().size());
        assertTrue(beneficioTragos.getTragos().contains("Mojito"));
    }

    @Test
    void testBar() {
        assertEquals(3, bar.getDianas().size());
        assertEquals(2, bar.getClientes().size());
        assertEquals(100000, bar.getPlata());
        assertEquals(3, bar.getBeneficios().size());
        assertEquals(2, bar.getBeneficiosAcumulables().size());
        assertEquals(1, bar.beneficiosNoAcumulables());
    }

    @Test
    void testSistema() {
        assertEquals(1, sistema.getBares().size());
        assertEquals(3, sistema.getDianas().size());
        assertEquals(3, sistema.getBeneficios().size());
    }

    @Test
    void testDianaConMasPuntajesDistintos() {
        Diana dianaConMasPuntajes = sistema.dianaConMasPuntajesDistintos();
        assertNotNull(dianaConMasPuntajes);
        assertEquals("Diana Cuadrada", dianaConMasPuntajes.getNombre());
        assertEquals(4, dianaConMasPuntajes.getColorPuntaje().size());
    }

    @Test
    void testCliente() {
        Cliente cliente = new Cliente("Carlos López");
        assertEquals("Carlos López", cliente.getNombre());

        cliente.setNombre("Ana Martínez");
        assertEquals("Ana Martínez", cliente.getNombre());
    }

    @Test
    void testEnumDificultad() {
        assertEquals("FACIL", Dificultad.FACIL.name());
        assertEquals("NORMAL", Dificultad.NORMAL.name());
        assertEquals("DIFICIL", Dificultad.DIFICIL.name());
    }

    @Test
    void testEnumColor() {
        assertEquals("NEGRO", Color.NEGRO.name());
        assertEquals("ROJO", Color.ROJO.name());
        assertEquals("VERDE", Color.VERDE.name());
        assertEquals("AMARILLO", Color.AMARILLO.name());
        assertEquals("BLANCO", Color.BLANCO.name());
    }

    @Test
    void testSetters() {
        dianaCircular.setNombre("Nueva Diana");
        assertEquals("Nueva Diana", dianaCircular.getNombre());

        dianaCircular.setDificultad(Dificultad.FACIL);
        assertEquals(Dificultad.FACIL, dianaCircular.getDificultad());

        beneficioComida.setNombreBeneficio("Nuevo Beneficio");
        assertEquals("Nuevo Beneficio", beneficioComida.getNombreBeneficio());

        bar.setPlata(50000);
        assertEquals(50000, bar.getPlata());
    }
}