package elecciones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class EleccionesTest {

    private Trabajador trabajador;
    private Telefono telefono;
    private PalomaMensajera paloma;

    @BeforeEach
    void setUp() {
        trabajador = new Trabajador(
                "Juan", "Pérez", 30, "Calle Falsa 123",
                LocalDate.of(1995, 5, 20), "juan@mail.com",
                20123456, 50000, "Calle Nueva 456",
                LocalTime.of(8, 0), LocalTime.of(18, 0)
        );

        telefono = new Telefono(
                "12345", "Samsung", "S20",
                Telefonia.CLARO, 11223344, true, true
        );

        paloma = new PalomaMensajera("Blanco", "Mensajera", "Columba", true);
    }

    @Test
    void testTrabajadorEnviarMensajeDentroHorario() {
        trabajador.setHorario_entrada(LocalTime.MIN);
        trabajador.setHorario_salida(LocalTime.MAX);
        String mensaje = trabajador.enviarMensaje();
        assertTrue(mensaje.contains("te invito a que votes"));
    }

    @Test
    void testTrabajadorEnviarMensajeFueraHorario() {
        trabajador.setHorario_entrada(LocalTime.of(23, 0));
        trabajador.setHorario_salida(LocalTime.of(23, 30));
        assertEquals("", trabajador.enviarMensaje());
    }

    @Test
    void testTelefonoEnviarMensajeConCreditoYPrendido() {
        assertEquals(
                "Conectando con la antena mas cercana.... Vote por el partido para un futuro mejor",
                telefono.enviarMensaje()
        );
    }

    @Test
    void testTelefonoEnviarMensajeSinCredito() {
        telefono.setCreditoDisponible(false);
        assertEquals("", telefono.enviarMensaje());
    }

    @Test
    void testPalomaEnviarMensajeConMapa() {
        assertEquals(
                "Lanzado un papelito que dice: Vote por el partido para un mejor futuro",
                paloma.enviarMensaje()
        );
    }

    @Test
    void testPalomaEnviarMensajeSinMapa() {
        paloma.setConoceMapa(false);
        assertEquals("", paloma.enviarMensaje());
    }

    @Test
    void testPartidoAgregarMensajeroYCampaña() {
        HashSet<Campaña> mensajeros = new HashSet<>();
        Partido partido = new Partido("Partido X", "Av. Siempreviva 742", 1000, mensajeros);

        partido.addMensajero(trabajador);
        partido.addMensajero(telefono);
        partido.addMensajero(paloma);

        assertEquals(3, partido.getMensajeros().size());
        partido.hacerCampaña();
    }
}
