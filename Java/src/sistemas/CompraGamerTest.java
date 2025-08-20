package sistemas;
import componentespc.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import personas.Cliente;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CompraGamerTest {
    SistemaCompraGamer s1;
    Impresora i1;
    PerifericoOut po1;
    PerifericoIn pi1;
    ArrayList<Periferico> perifericos,perifericos2;
    ArrayList<Componente> componentes;
    CPU cpu1;
    PC pc;
    Cliente comprador;

    @BeforeEach
    public void setup(){
        i1=new Impresora();
        po1=new PerifericoOut();
        pi1=new PerifericoIn();
        cpu1=new CPU();
        comprador=new Cliente();
        perifericos=new ArrayList<>();
        perifericos2=new ArrayList<>();
        componentes=new ArrayList<>();
        componentes.add(i1);
        componentes.add(po1);
        componentes.add(pi1);
        componentes.add(cpu1);
        perifericos.add(i1);
        perifericos.add(po1);
        perifericos.add(pi1);
        pc=new PC(cpu1, perifericos,comprador);
        s1=new SistemaCompraGamer(componentes, pc);
    }

    @Test
    public void testCheckeo(){
        try {
            s1.venderPC();
            assertEquals(1, s1.getVentas().size());
        } catch (StockException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testVenta(){
        try{
        s1.venderPC();
        assertEquals(2,s1.getComponentes().getFirst().getStock());
        } catch (StockException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testPrecio(){
        assertEquals(11.96,pc.calcularPrecio());
    }

    @Test
    public void testCantidadPerifericos(){
        assertEquals(3,pc.cantidadPerifericos());
    }
}
