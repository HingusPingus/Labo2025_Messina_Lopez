package ControlLlamadas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {
    ArrayList<Llamada> llamadas;

    public Sistema(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    public ArrayList<Empleado> empleadosSinRepetir(){
        ArrayList<Empleado> empleados=new ArrayList<>();
        for(Llamada l:llamadas){
            if(empleados.contains(l.getEmpOrigen())){

            }
            else{
                empleados.add(l.getEmpOrigen());
            }
        }
        return empleados;
    }
    public ArrayList<Empleado> ranking(){
        ArrayList<Integer> minutosDeLlamada=new ArrayList<>();
        ArrayList<Empleado> empleados=empleadosSinRepetir();
        for(Empleado e:empleados){
            minutosDeLlamada.add(e.sumLlamadasExterior(llamadas));
        }
        for (int i = 0; i < minutosDeLlamada.size() - 1; i++) {
            for (int j = i + 1; j < minutosDeLlamada.size(); j++) {
                if (minutosDeLlamada.get(j) > minutosDeLlamada.get(i)) {

                    int tempMin = minutosDeLlamada.get(i);
                    minutosDeLlamada.set(i, minutosDeLlamada.get(j));
                    minutosDeLlamada.set(j, tempMin);

                    Empleado tempEmp = empleados.get(i);
                    empleados.set(i, empleados.get(j));
                    empleados.set(j, tempEmp);
                }
            }
        }
        return empleados;
    }
}
