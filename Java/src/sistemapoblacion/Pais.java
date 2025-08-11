package sistemapoblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Pais extends Lugar{
    private HashMap<Integer, Provincia> provincias;

    public Pais(String nombre, int codigo, HashSet<Double> coordenadas, HashMap<Integer, Provincia> provincias) {
        super(nombre, codigo, coordenadas);
        this.provincias = provincias;
    }

    public HashMap<Integer, Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashMap<Integer, Provincia> provincias) {
        this.provincias = provincias;
    }
    public void putProvincia(Provincia provincia){
        provincias.put(provincia.getCodigo(),provincia);
    }

    public void deleteProvincia(Provincia provincia){
        if(provincias.containsValue(provincia)){
            provincias.remove(provincia.getCodigo());
        }
        else{
            System.out.println("Esa provincia no está dentro de este pais");
        }
    }

    public void updateProvincia(Provincia provinciaold, Provincia provincianew){
        if(provincias.containsValue(provinciaold)){
            provincias.remove(provinciaold.getCodigo());
            provincias.put(provincianew.getCodigo(),provincianew);

        }
        else{
            System.out.println("Esa provincia no esta");
        }
    }

    public int getPoblacion(){
        int poblacion=0;
        for(Provincia p: provincias.values()){
            poblacion+=p.getPoblacion();
        }
        return poblacion;
    }
}
