package personas;

public class Autor extends Persona{
    public Autor() {
        super();
    }

    public Autor(String nombre, int edad, String direccion) {
        super(nombre, edad, direccion);
    }

    public Autor(String nombre, String apellido, int edad, String direccion) {
        super(nombre, apellido, edad, direccion);
    }
}
