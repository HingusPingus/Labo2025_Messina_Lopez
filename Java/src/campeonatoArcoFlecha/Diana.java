package campeonatoArcoFlecha;

import java.util.HashMap;

public abstract class Diana {
    private String nombre;
    private Dificultad dificultad;
    private HashMap<Integer, Color> colorPuntaje;

    public Diana(String nombre, Dificultad dificultad, HashMap<Integer, Color> colorPuntaje) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.colorPuntaje = colorPuntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public HashMap<Integer, Color> getColorPuntaje() {
        return colorPuntaje;
    }

    public void setColorPuntaje(HashMap<Integer, Color> colorPuntaje) {
        this.colorPuntaje = colorPuntaje;
    }



    public abstract int calcularArea();
}
