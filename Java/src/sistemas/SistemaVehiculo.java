package sistemas;

import vehiculos.Auto;
import vehiculos.Vehiculo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class SistemaVehiculo {
    private ArrayList<Vehiculo> vehiculos;

    public SistemaVehiculo() {
        this.vehiculos = new ArrayList<>();
    }

    public SistemaVehiculo(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public String masCantVehiculo (){
        String resultado;
        int a=0, b=0, c=0;
        ArrayList<Integer> resultados= new ArrayList<>();
        for(Vehiculo v1: this.vehiculos){
            switch(v1.claseVehiculo()){
                case "Auto":
                    a++;
                    break;
                case "Camioneta":
                    c++;
                    break;
                case "Bicicleta":
                    b++;
                    break;
            }


        }
        resultados.add(a);
        resultados.add(b);
        resultados.add(c);
        int max=Collections.max(resultados);

        switch(resultados.indexOf(max)) {
            case 0:
                resultado = "Auto";
                break;
            case 1:
                resultado = "Camioneta";
                break;
            case 2:
                resultado = "Bicicleta";
                break;
            default:
                resultado="a";
        }

        return resultado;
    }

    public double porcentajeDescapotables(){
        ArrayList<Auto> autos = new ArrayList<>();
        int descapotables=0;
        for (Vehiculo v: this.vehiculos){
            if (v.claseVehiculo().equals("Auto")){
                autos.add((Auto) v);
            }
        }
        for (Auto a: autos){
            if(a.isDescapotable()){
                descapotables++;
            }
        }
        return descapotables*100/autos.size();
    }
}
