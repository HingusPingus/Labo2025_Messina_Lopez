package CampeonatoArcoFlecha;

import java.util.HashMap;

public class DianaCircular extends Diana{
    private int radio=13;

    public DianaCircular(String nombre, Dificultad dificultad, HashMap<Integer, Color> colorPuntaje, int radio) {
        super(nombre, dificultad, colorPuntaje);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public int calcularArea() {
        return (int)(3.14*radio*radio);
    }
}
