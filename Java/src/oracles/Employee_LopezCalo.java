package oracles;
import java.time.LocalDate;
public class Employee_LopezCalo extends Persona {
    private int ID;
    private double salary;
    public Employee_LopezCalo(int ID, int dni, int edad, String nombre, LocalDate fechaNacimiento, double salary) {
        super(dni,edad,nombre,fechaNacimiento);
        this.ID = ID;
        this.salary = salary;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Employee "+ getID() + ":  " + this.getNombre() + ", " + getSalary();
    }
}
