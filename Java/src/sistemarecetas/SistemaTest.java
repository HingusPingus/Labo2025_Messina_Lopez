package sistemarecetas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SistemaTest {

    Entrada entrada;
    Postre postre;
    Principal principal;
    Sistema sistema;

    @BeforeEach
    public void setUp(){
        ArrayList<String> pasos=new ArrayList<>();
        pasos.add("a");
        pasos.add("a");
        pasos.add("a");
        pasos.add("a");
        pasos.add("a");
        entrada=new Entrada("kiwi",Dificultad.AVANZADO,pasos,Temperatura.FRIO);
        postre=new Postre();
        principal=new Principal();
        sistema=new Sistema();
    }

    @Test
    public void amr(){
        assertEquals(0,sistema.getRecetas().size());
        sistema.agregarReceta(entrada);
        assertEquals(1,sistema.getRecetas().size());
        sistema.agregarReceta(principal);
        assertEquals(2,sistema.getRecetas().size());
        sistema.eliminarReceta(entrada);
        assertEquals(1,sistema.getRecetas().size());
    }

    @Test
    public void stockTest(){
        ArrayList<Plato> asd=new ArrayList<>();
        ArrayList<Plato> asdasd=new ArrayList<>();
        asd.add(principal);
        asdasd.add(entrada);
        sistema.agregarReceta(entrada);
        sistema.agregarReceta(principal);
        sistema.agregarReceta(postre);
        assertEquals(entrada,sistema.masPasos());
        assertEquals(asd,sistema.filtroTipo(Tipo.PRINCIPAL));
        assertEquals(asdasd,sistema.busquedaDificultad(Dificultad.AVANZADO));
    }
}
