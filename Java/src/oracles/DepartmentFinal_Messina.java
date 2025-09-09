package oracles;

import java.util.ArrayList;

public class DepartmentFinal_Messina {
    private String name;
    private ArrayList<EmployeeFinal_Messina> employeeFinalMessinas = new ArrayList<>();
    private int ultimoempleadoagregadoIndex= -1;

    public DepartmentFinal_Messina(String name, ArrayList<EmployeeFinal_Messina> employeeFinalMessinas) {
        this.name = name;
        this.employeeFinalMessinas = employeeFinalMessinas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<EmployeeFinal_Messina> getEmployes() {
        return employeeFinalMessinas;
    }

    public void setEmployes(ArrayList<EmployeeFinal_Messina> employeeFinalMessinas) {
        this.employeeFinalMessinas = employeeFinalMessinas;
    }

    public void addEmp(EmployeeFinal_Messina anEmployee){
        if(ultimoempleadoagregadoIndex< employeeFinalMessinas.size()){
            ultimoempleadoagregadoIndex++;
            employeeFinalMessinas.add(anEmployee);
        }
    }


    public ArrayList<EmployeeFinal_Messina> getEmploye(){
        ArrayList<EmployeeFinal_Messina> actualizarEmpleados = new ArrayList<>();

        for (EmployeeFinal_Messina e: employeeFinalMessinas){
            actualizarEmpleados.add(e);
        }
        return actualizarEmpleados;
    }

    public int getEmployescount(){
        return ultimoempleadoagregadoIndex+1;
    }

    public EmployeeFinal_Messina getEmployeeById(int empId){
        for(EmployeeFinal_Messina e: employeeFinalMessinas){

            if(empId==e.getID()){
                return e;
            }
        }
        return null;
    }


    public double getTotalSalary(){
        double totalSalario=0.0;
        for (EmployeeFinal_Messina e: employeeFinalMessinas){
            totalSalario+=e.getSalary();
        }
        return totalSalario;
    }

    public double getAverageSalary(){
        if(ultimoempleadoagregadoIndex>-1){
            return getTotalSalary()/ employeeFinalMessinas.size();
        }
        return 0.0;
    }
    public String toString(){
        return name;
    }
}
