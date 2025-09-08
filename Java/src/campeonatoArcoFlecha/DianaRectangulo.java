package campeonatoArcoFlecha;

import java.util.HashMap;

public class DianaRectangulo extends Diana{
    private int base;
    private int altura;

    public DianaRectangulo(String nombre, Dificultad dificultad, HashMap<Integer, Color> colorPuntaje, int base, int altura) {
        super(nombre, dificultad, colorPuntaje);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int calcularArea() {
        return base*altura;
    }
}
