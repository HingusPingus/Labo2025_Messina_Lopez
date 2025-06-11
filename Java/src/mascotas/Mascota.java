package mascotas;

import personas.Persona;

public abstract class Mascota {
    private String nombre;
    private Persona duenio;

    public Mascota(){
        this.nombre="Carlitos";
        this.duenio=new Persona();
    }

    public Mascota(String nombre, Persona duenio) {
        this.nombre = nombre;
        this.duenio = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    public abstract String saludo(Persona usuario);

    public abstract String quienSoy();
}

