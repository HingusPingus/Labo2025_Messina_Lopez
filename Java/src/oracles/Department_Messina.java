package oracle;

import java.util.ArrayList;

public class Department_Messina {
    private String name;
    private ArrayList<Employee_Messina> employees;

    public Department_Messina(String name, ArrayList<Employee_Messina> employees) {
        this.name = name;
        this.employees = employees;
    }
    public Department_Messina(){
        name="gral. paz";
        employees=new ArrayList<>();
        employees.add(new Employee_Messina());
    }

    public void assign(Employee_Messina emp) {
        employees.add(emp);
        emp.setDep(this);
    }

    public ArrayList<Employee_Messina> getEmployees() {
        return employees;
    }
}
