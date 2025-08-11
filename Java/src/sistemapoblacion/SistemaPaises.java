package sistemapoblacion;

import java.util.HashMap;
import java.util.HashSet;

public class SistemaPaises {
    HashMap<Integer, Continente> continentes;

    public SistemaPaises(HashMap<Integer, Continente> continentes) {
        this.continentes = continentes;
    }

    public HashMap<Integer, Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(HashMap<Integer, Continente> continentes) {
        this.continentes = continentes;
    }

    public void putContinente(Continente continente){
        continentes.put(continente.getCodigo(),continente);
    }

    public void deleteContinente(Continente continente){
        if(continentes.containsValue(continente)){
            continentes.remove(continente.getCodigo());
        }
        else{
            System.out.println("Ese Continente no está dentro de este sistema");
        }
    }

    public void updateContinente(Continente continenteold, Continente continentenew){
        if(continentes.containsValue(continenteold)){
            continentes.remove(continenteold.getCodigo());
            continentes.put(continentenew.getCodigo(),continentenew);

        }
        else{
            System.out.println("Esa Continente no esta");
        }
    }
    
    public int poblacionCodigo(int codigo){
        int poblacion=0;
        for(int c:continentes.keySet()){
            if(c==codigo){
                poblacion= continentes.get(c).getPoblacion();
            }
            else{
                HashMap<Integer,Pais>paises=continentes.get(c).getPaises();
                for(int cpa:paises.keySet()){
                    if(cpa==codigo){
                        poblacion= paises.get(cpa).getPoblacion();
                    }
                    else{
                        HashMap<Integer,Provincia>provincias=paises.get(cpa).getProvincias();
                        for(int cpr:provincias.keySet()){
                            if(cpr==codigo){
                                poblacion= provincias.get(cpr).getPoblacion();
                            }
                            else{
                                HashMap<Integer,Ciudad>ciudades=provincias.get(cpr).getCiudades();
                                for(int cc:ciudades.keySet()){
                                    if(cc==codigo){
                                        poblacion= ciudades.get(cc).getPoblacion();
                                    }
                                    else{
                                        HashMap<Integer,Barrio>barrios=ciudades.get(cc).getBarrios();
                                        for(int cb:barrios.keySet()){
                                            if(cb==codigo){
                                                poblacion= barrios.get(cb).getPoblacion();
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return poblacion;
    }
    public Pais paisMas(){
        int i=0;
        Pais pais = null;
        for(Continente c: continentes.values()){
            for(Pais p: c.getPaises().values()){
                if(i==0){
                    i++;
                    pais=p;
                }
                else if(pais.getPoblacion()<p.getPoblacion()){
                    pais=p;
                }
            }
        }
        return pais;
    }

    public Pais paisMenos(){
        int i=0;
        Pais pais = null;
        for(Continente c: continentes.values()){
            for(Pais p: c.getPaises().values()){
                if(i==0){
                    i++;
                    pais=p;
                }
                else if(pais.getPoblacion()>p.getPoblacion()){
                    pais=p;
                }
            }
        }
        return pais;
    }
    public Continente continenteMenos(){
        int i=0;
        Continente continente = null;
        for(Continente c: continentes.values()){
            if(i==0){
                i++;
                continente=c;
            }
            else if(continente.getPoblacion()>c.getPoblacion()){
                continente=c;
            }
        }
        return continente;
    }

    public Continente continenteMas(){
        int i=0;
        Continente continente = null;
        for(Continente c: continentes.values()){
            if(i==0){
                i++;
                continente=c;
            }
            else if(continente.getPoblacion()<c.getPoblacion()){
                continente=c;
            }
        }
        return continente;
    }
    public void info(){
        System.out.println("País más poblado "+paisMas().getNombre() );
        System.out.println("País menos poblado "+paisMenos().getNombre() );
        System.out.println("Continente más poblado "+continenteMas().getNombre() );
        System.out.println("Continente menos poblado "+continenteMenos().getNombre() );

    }
}

