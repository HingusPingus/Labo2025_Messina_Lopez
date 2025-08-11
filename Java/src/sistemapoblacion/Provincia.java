package sistemapoblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Provincia extends Lugar{
    private HashMap<Integer, Ciudad> ciudades;

    public Provincia(String nombre, int codigo, HashSet<Double> coordenadas, HashMap<Integer, Ciudad> ciudades) {
        super(nombre, codigo, coordenadas);
        this.ciudades = ciudades;
    }

    public HashMap<Integer, Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashMap<Integer, Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public void putCiudad(Ciudad ciudad){
        ciudades.put(ciudad.getCodigo(),ciudad);
    }

    public void deleteCiudad(Ciudad ciudad){
        if(ciudades.containsValue(ciudad)){
            ciudades.remove(ciudad.getCodigo());
        }
        else{
            System.out.println("Esa Ciudad no está dentro de esta Provincia");
        }
    }

    public void updateCiudad(Ciudad ciudadold, Ciudad ciudadnew){
        if(ciudades.containsValue(ciudadold)){
            ciudades.remove(ciudadold,getCodigo());
            ciudades.put(ciudadnew.getCodigo(),ciudadnew);

        }
        else{
            System.out.println("Esa Ciudad no esta");
        }
    }

    public int getPoblacion(){
        int poblacion=0;
        for(Ciudad c: ciudades.values()){
            poblacion+=c.getPoblacion();
        }
        return poblacion;
    }
}
