package sistemapoblacion;

import java.util.HashSet;

public abstract class Lugar {
    private String nombre;
    private int codigo;
    private HashSet<Double> coordenadas;

    public Lugar(String nombre, int codigo, HashSet<Double> coordenadas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.coordenadas = coordenadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public HashSet<Double> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(HashSet<Double> coordenadas) {
        this.coordenadas = coordenadas;
    }

    public abstract int getPoblacion();

}
