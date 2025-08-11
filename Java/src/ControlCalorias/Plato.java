package ControlCalorias;

public class Plato {
    private String nombre;
    private String ingrediente;
    private int calorias;

    public Plato(String nombre, String ingrediente, int calorias) {
        this.nombre = nombre;
        this.ingrediente = ingrediente;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
