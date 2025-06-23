package mascotas;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MascotasTest {
    Gato g1;
    Perro p1;
    Pez pe1;
    Pez pe2;
    Pajarito pa1;
    Pajarito pa2;
    ArrayList<Mascota> mascotas;
    SistemaMascotas sys;
    SistemaMascotas sys2;
    @BeforeEach
    public void setUp(){
        Duenio d1 = new Duenio();
        Duenio d2=new Duenio("asd","asd",12,"asd");
        g1=new Gato(d1);
        p1=new Perro(d1);
        pe1=new Pez(d1);
        pe2=new Pez(d2);
        pa1=new Pajarito("Juancito",d1,"hola");
        pa2=new Pajarito(d2);
        mascotas=new ArrayList<>();
        mascotas.add(g1);
        mascotas.add(p1);
        mascotas.add(pe1);
        mascotas.add(pe2);
        mascotas.add(pa1);
        sys=new SistemaMascotas(mascotas, d1);
        sys2=new SistemaMascotas(mascotas, d2);
    }

    @Test
    public void testGatoPerro(){
        assertEquals("MIAU! ",sys.saludar(g1));
        assertEquals("miau ",sys2.saludar(g1));
        sys.alimentar(g1);
        assertEquals("MIAU! MIAU! ",sys.saludar(g1));
        sys.alimentar(g1);
        assertEquals("miau miau ",sys2.saludar(g1));
    }
    @Test
    public void testPajarito(){
        assertEquals("hola ",sys.saludar(pa1));
        assertEquals("",sys.saludar(pa2));
        sys2.alimentar(pa1);
        assertEquals("pio ",sys2.saludar(pa2));
        assertEquals("hola hola ",sys.saludar(pa1));
    }

    @Test
    public void testPez(){
        assertEquals("glub glub",sys.saludar(pe1));
        assertEquals("me muero",sys.saludar(pe2));
        sys2.alimentar(pe1);
        assertEquals("glub glub",sys.saludar(pe1));
        assertEquals(9, pe1.getVidas());
    }

}

