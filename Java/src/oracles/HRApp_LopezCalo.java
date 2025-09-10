package oracles;

import java.time.LocalDate;
import java.util.ArrayList;

public class HRApp_LopezCalo {
    public static void main(String[] args) {
        System.out.println("HRApp Starts");
        Employee_LopezCalo e1 = new Employee_LopezCalo(239192,48715785,45, "Calos",LocalDate.now(),100000);
        Employee_LopezCalo e2 = new Employee_LopezCalo(345345,12234324,34, "Paco",LocalDate.now(),100000);
        Department_LopezCalo dept = new Department_LopezCalo("Salud",new ArrayList<>());
        dept.addEmp(e1);
        dept.addEmp(e2);
        System.out.println("Emp"+e1);
        System.out.println("Emp"+e2);
        ArrayList<Employee_LopezCalo>empleados=dept.getEmployee();
        for (Employee_LopezCalo e: empleados){
            System.out.println("Emp"+e);
        }
        System.out.println("Total"+dept.getTotalSalary());
        System.out.println("Promedio"+dept.getAverageSalary());
        System.out.println("Emp"+dept.getEmployeeById(239192));
    }
}
