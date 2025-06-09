package electronicos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaTest {
    Parlante parlante;
    Televisor tv;
    CargadorPortatil cargador;
    Sistema sistema;

    @BeforeEach
    public void setUp(){
        parlante=new Parlante("JBL",2.75,100,true);
        tv=new Televisor("Samsung",150.00,15,Tecnologia.CUATROKA);
        cargador=new CargadorPortatil("Apple",190.00,10,200);
        sistema=new Sistema();
    }

    @Test
    public void amr(){
        assertEquals(0,sistema.getProductos().size());
        sistema.agregarProducto(parlante);
        assertEquals(1,sistema.getProductos().size());
        sistema.agregarProducto(tv);
        assertEquals(2,sistema.getProductos().size());
        sistema.eliminarProducto(parlante);
        assertEquals(1,sistema.getProductos().size());
    }

    @Test
    public void stockTest(){
        sistema.agregarProducto(parlante);
        sistema.agregarProducto(tv);
        sistema.agregarProducto(cargador);
        assertEquals(parlante,sistema.mayorStock());
        assertEquals(cargador,sistema.menorStock());
    }


}
