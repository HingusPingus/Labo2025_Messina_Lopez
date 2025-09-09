package oracles;

import java.util.ArrayList;

public class Employee_Messina {
    private String name;
    private Department_Messina dep;

    public Employee_Messina(){
        name="pepe";
        dep= new Department_Messina();
    }
    public Employee_Messina(String name, Department_Messina dep){
        this.name=name;
        this.dep=dep;
    }
    public Employee_Messina(String name){
        this.name=name;
        this.dep=new Department_Messina();
    }

    public String getName() {
        return name;
    }
    public Department_Messina getDep() {
        return dep;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDep(Department_Messina dep) {
        this.dep = dep;
    }


}
