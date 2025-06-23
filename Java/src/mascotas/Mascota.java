package mascotas;

import personas.Persona;

public abstract class Mascota {
    private String nombre;
    private Duenio duenio;

    public Mascota(){
        this.nombre="Carlitos";
        this.duenio=new Duenio();
    }

    public Mascota(Duenio duenio) {
        this.duenio = duenio;
    }

    public Mascota(String nombre, Duenio duenio) {
        this.nombre = nombre;
        this.duenio = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public abstract String saludo(Duenio usuario);

    public abstract String quienSoy();
    public abstract void alimentarM();
}

