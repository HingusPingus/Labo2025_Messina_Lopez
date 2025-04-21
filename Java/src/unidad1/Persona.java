package unidad1;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;

    public Persona(){
        this.nombre="carlos";
        this.edad=38;
        this.direccion="Bulgaria 4385";
    }

    public Persona(String nombre, int edad, String direccion){
        this.nombre=nombre;
        this.edad=edad;
        this.direccion=direccion;
        this.apellido="Perez";
    }

    public Persona(String nombre,String apellido, int edad, String direccion){
        this.nombre=nombre;
        this.edad=edad;
        this.direccion=direccion;
        this.apellido=apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarTodo(){
        System.out.println(this.nombre +" "+ this.edad +" "+ this.direccion +" "+ this.apellido);
    }

    public static void main(String[] args) {
        Persona p1=new Persona();
        p1.mostrarTodo();
    }
}
