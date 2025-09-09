package oracles;

public class DepartmentsMain_Messina {
    public static void main(String[] args) {
        Employee_Messina newEmp = new Employee_Messina("Alice");
        Department_Messina aDept = DepartmentFinder_Messina.find(2);
        aDept.assign(newEmp);
        System.out.println(aDept.getEmployees());   
    }
}
