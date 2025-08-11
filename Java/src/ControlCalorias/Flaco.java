package ControlCalorias;

import personas.Persona;

import java.util.HashMap;

public class Flaco extends Persona {
    private int calorias;
    HashMap<Plato, Integer> platosComidos;

    public Flaco(int calorias, HashMap<Plato, Integer> platosComidos) {
        this.calorias = calorias;
        this.platosComidos = platosComidos;
    }

    public Flaco(String nombre, int edad, String direccion, int calorias, HashMap<Plato, Integer> platosComidos) {
        super(nombre, edad, direccion);
        this.calorias = calorias;
        this.platosComidos = platosComidos;
    }

    public Flaco(String nombre, String apellido, int edad, String direccion, int calorias, HashMap<Plato, Integer> platosComidos) {
        super(nombre, apellido, edad, direccion);
        this.calorias = calorias;
        this.platosComidos = platosComidos;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public HashMap<Plato, Integer> getPlatosComidos() {
        return platosComidos;
    }

    public void setPlatosComidos(HashMap<Plato, Integer> platosComidos) {
        this.platosComidos = platosComidos;
    }

    public void comerPlato(Plato plato){
        setCalorias(this.calorias+=plato.getCalorias());
        int aux=platosComidos.getOrDefault(plato, 0);
        platosComidos.put(plato, aux+1);
    }

}
