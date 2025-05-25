package oracle;

import java.util.ArrayList;

public class DepartmentFinder_Messina {
    private static ArrayList<Department_Messina> departments;

    public DepartmentFinder_Messina(){
        departments=new ArrayList<>();
        departments.add(new Department_Messina());
    }

    public static Department_Messina find(int index){
        return departments.get(index);
    }
}
