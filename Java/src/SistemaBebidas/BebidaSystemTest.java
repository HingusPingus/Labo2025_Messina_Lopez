package SistemaBebidas;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

    public class BebidaSystemTest {

        private BebidaAlcoholica bebidaAlcoholica;
        private BebidaAzucarada bebidaAzucarada;
        private BebidaNeutra bebidaNeutra;
        private Cliente cliente;
        private Sistema sistema;

        @Before
        public void setUp() {
            bebidaAlcoholica = new BebidaAlcoholica("Vino", 15);
            bebidaAzucarada = new BebidaAzucarada("Coca-Cola", 30);
            bebidaNeutra = new BebidaNeutra("Agua", 2, 10);

            ArrayList<Bebida> bebidasCliente = new ArrayList<>();
            bebidasCliente.add(bebidaAlcoholica);
            bebidasCliente.add(bebidaAzucarada);

            cliente = new Cliente("Juan", "Perez", 30, "Calle 123", 12345678, bebidasCliente);

            ArrayList<Cliente> clientes = new ArrayList<>();
            clientes.add(cliente);

            ArrayList<Bebida> bebidas = new ArrayList<>();
            bebidas.add(bebidaAlcoholica);
            bebidas.add(bebidaAzucarada);
            bebidas.add(bebidaNeutra);

            sistema = new Sistema(clientes, bebidas);
        }


        @Test
        public void testBebidaAlcoholicaSumaCoeficiente() {
            assertEquals(-300, bebidaAlcoholica.sumaCoeficiente());
        }



        @Test
        public void testBebidaAzucaradaSumaCoeficiente() {
            assertEquals(-299, bebidaAzucarada.sumaCoeficiente());
        }



        @Test
        public void testBebidaNeutraSumaCoeficiente() {
            assertEquals(8, bebidaNeutra.sumaCoeficiente());
        }


        @Test
        public void testSumaCoeficientePorTipo() {
            assertEquals(-599, cliente.sumaCoeficientePorTipo());
        }

        @Test
        public void testTomarBebida() {
            ArrayList<Bebida> nuevasBebidas = new ArrayList<>();
            nuevasBebidas.add(bebidaNeutra);

            cliente.tomarBebida(bebidaNeutra, 1, nuevasBebidas);
            assertEquals(3, cliente.getBebidasPedidas().size());
            assertTrue(cliente.getBebidasPedidas().contains(bebidaNeutra));
        }

        @Test
        public void testSistemaConstructor() {
            assertEquals(1, sistema.getClientes().size());
            assertEquals(3, sistema.getBebidas().size());
        }

        @Test
        public void testClienteMejorHidratacion() {
            ArrayList<Bebida> bebidasHidratado = new ArrayList<>();
            bebidasHidratado.add(new BebidaNeutra("Agua Mineral", 1, 20));
            Cliente hidratado = new Cliente("Maria", "Gomez", 25, "Avenida 456", 87654321, bebidasHidratado);

            sistema.getClientes().add(hidratado);

            assertEquals(hidratado, sistema.clienteMejorHidratacion());
        }

        @Test
        public void testClienteMejorHidratacionWithNegativeValues() {
            assertEquals(cliente, sistema.clienteMejorHidratacion());
        }
    }
