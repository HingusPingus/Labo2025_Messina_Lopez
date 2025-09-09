package oracles;

import java.util.ArrayList;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("HRApp Starts");

        EmployeeFinal_Messina e1 = new EmployeeFinal_Messina(1001010, "toto",100000);
        EmployeeFinal_Messina e2 = new EmployeeFinal_Messina(1091919,"juan",90000);



        DepartmentFinal_Messina dept = new DepartmentFinal_Messina("Education",new ArrayList<>());
        dept.addEmp(e1);
        dept.addEmp(e2);


        System.out.println("Emp"+e1);
        System.out.println("Emp"+e2);
        ArrayList<EmployeeFinal_Messina>emps=dept.getEmploye();

        for (EmployeeFinal_Messina e: emps){
            System.out.println("Emp"+e);
        }
        System.out.println("Total"+dept.getTotalSalary());
        System.out.println("Promedio"+dept.getAverageSalary());
        System.out.println("Emp"+dept.getEmployeeById(1001010));
    }
}
