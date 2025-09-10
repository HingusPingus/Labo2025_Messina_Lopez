package oracles;
import java.util.ArrayList;

public class Department_LopezCalo {
    private String name;
    private ArrayList<Employee_LopezCalo> employees = new ArrayList<>();
    private int ultimoempleadoagregadoIndex= -1;

    public Department_LopezCalo(String name, ArrayList<Employee_LopezCalo> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee_LopezCalo> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee_LopezCalo> employes) {
        this.employees = employes;
    }

    public void addEmp(Employee_LopezCalo anEmployee){
        if(ultimoempleadoagregadoIndex<employees.size()){
            ultimoempleadoagregadoIndex++;
            employees.add(anEmployee);
        }
    }


    public ArrayList<Employee_LopezCalo> getEmployee(){
        ArrayList<Employee_LopezCalo> actualizarEmpleados = new ArrayList<>();

        for (Employee_LopezCalo e: employees){
            actualizarEmpleados.add(e);
        }
        return actualizarEmpleados;
    }

    public int getEmployescount(){
        return ultimoempleadoagregadoIndex+1;
    }

    public Employee_LopezCalo getEmployeeById(int empId){
        for(Employee_LopezCalo e: employees){

            if(empId==e.getID()){
                return e;
            }
        }
        return null;
    }


    public double getTotalSalary(){
        double totalSalario=0.0;
        for (Employee_LopezCalo e: employees){
            totalSalario+=e.getSalary();
        }
        return totalSalario;
    }

    public double getAverageSalary(){
        if(ultimoempleadoagregadoIndex>-1){
            return getTotalSalary()/employees.size();
        }
        return 0.0;
    }
    @Override
    public String toString(){
        return name;
    }
}
