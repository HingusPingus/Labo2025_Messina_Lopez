package campeonatoArcoFlecha;

import java.util.HashMap;

public class DianaCuadrado extends Diana{
    private int lado;

    public DianaCuadrado(String nombre, Dificultad dificultad, HashMap<Integer, Color> colorPuntaje, int lado) {
        super(nombre, dificultad, colorPuntaje);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int calcularArea() {
        return lado*lado;
    }
}
