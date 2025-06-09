package sistemarecetas;

import java.util.ArrayList;

public abstract class Plato {
    private String nombre;
    private Dificultad dificultad;
    private ArrayList<String>pasos;
    private Tipo tipo;

    public Plato() {
        this.nombre = "Kiwi";
        this.dificultad = Dificultad.FACIL;
        this.pasos = new ArrayList<>();
        this.pasos.add("Cortar el kiwi al medio");
        this.pasos.add("Agarrar una cuchara");
        this.pasos.add("Comer");
    }
    public Plato(Tipo tipo) {
        this.nombre = "Kiwi";
        this.dificultad = Dificultad.FACIL;
        this.pasos = new ArrayList<>();
        this.pasos.add("Cortar el kiwi al medio");
        this.pasos.add("Agarrar una cuchara");
        this.pasos.add("Comer");
        this.tipo=tipo;
    }

    public Plato(String nombre, Dificultad dificultad, ArrayList<String> pasos, Tipo tipo) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.pasos = pasos;
        this.tipo=tipo;
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

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }
    public abstract void pasoAPaso();
}
