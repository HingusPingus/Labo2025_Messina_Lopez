package mascotas;

import personas.Persona;

public abstract class Terrestre extends Mascota {
    private int felicidad;

    public Terrestre() {
        super();
        this.felicidad = 1;
    }

    public Terrestre(String nombre, Persona duenio) {
        super(nombre, duenio);
        this.felicidad = 1;
    }

    public int getFelicidad() {
        return felicidad;
    }

    public void setFelicidad(int felicidad) {
        this.felicidad = felicidad;
    }
    public void alimentar(){
        this.felicidad++;
    }
}
