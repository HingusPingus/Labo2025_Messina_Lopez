package sistemapoblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Continente extends Lugar{
    private HashMap<Integer, Pais> paises;

    public Continente(String nombre, int codigo, HashSet<Double> coordenadas, HashMap<Integer, Pais> paises) {
        super(nombre, codigo, coordenadas);
        this.paises = paises;
    }

    public HashMap<Integer, Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashMap<Integer, Pais> paises) {
        this.paises = paises;
    }

    public void putPais(Pais pais){
        paises.put(pais.getCodigo(),pais);
    }

    public void deletePais(Pais pais){
        if(paises.containsValue(pais)){
            paises.remove(pais.getCodigo());
        }
        else{
            System.out.println("Ese pais no está dentro de este continente");
        }
    }

    public void updatePais(Pais paisold, Pais paisnew){
        if(paises.containsValue(paisold)){
            paises.remove(paisold.getCodigo());
            paises.put(paisnew.getCodigo(),paisnew);

        }
        else{
            System.out.println("Ese pais no esta");
        }
    }

    public int getPoblacion(){
        int poblacion=0;
        for(Pais p: paises.values()){
            poblacion+=p.getPoblacion();
        }
        return poblacion;
    }
}
