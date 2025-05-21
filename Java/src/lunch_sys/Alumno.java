package lunch_sys;

public class Alumno extends Persona{
    private String division;

    public Alumno(String nombre, String apellido, String division) {
        super(nombre, apellido);
        this.division = division;
    }
    public Alumno(){
        super();
        division="1ro";
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}
