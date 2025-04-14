package clases_obj;

public class persona {
    private String nombre;
    private int edad;
    private String direccion;

    public persona(){
        this.nombre="carlos";
        this.edad=38;
        this.direccion="Bulgaria 4385";
    }

    public persona(String nombre, int edad, String direccion){
        this.nombre=nombre;
        this.edad=edad;
        this.direccion=direccion;
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
        System.out.println(this.nombre +" "+ this.edad +" "+ this.direccion);
    }

    public static void main(String[] args) {
        persona p1=new persona();
        p1.mostrarTodo();
    }
}
