package sistemapoblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Ciudad extends Lugar{
    private HashMap<Integer, Barrio> barrios;

    public Ciudad(String nombre, int codigo, HashSet<Double> coordenadas, HashMap<Integer, Barrio> barrios) {
        super(nombre, codigo, coordenadas);
        this.barrios = barrios;
    }

    public HashMap<Integer, Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashMap<Integer, Barrio> barrios) {
        this.barrios = barrios;
    }

    public void addBarrio(Barrio barrio){
        barrios.put(barrio.getCodigo(), barrio);
    }

    public void deleteBarrio(Barrio barrio){
        if(barrios.containsValue(barrio)){
            barrios.remove(barrio.getCodigo());
        }
        else{
            System.out.println("Ese barrio no está dentro de esta ciudad");
        }
    }

    public void updateBarrio(Barrio barrioold, Barrio barrionew){
        if(barrios.containsValue(barrioold)){
            barrios.remove(barrioold.getCodigo());
            barrios.put(barrionew.getCodigo(), barrionew);

        }
        else{
            System.out.println("Ese barrio no esta");
        }
    }

    public int getPoblacion(){
        int poblacion=0;
        for(Barrio b: barrios.values()){
            poblacion+=b.getPoblacion();
        }
        return poblacion;
    }


}
