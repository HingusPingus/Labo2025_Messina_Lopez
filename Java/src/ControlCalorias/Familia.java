package ControlCalorias;
import personas.Persona;

import java.util.ArrayList;
import java.util.HashSet;

public class Familia {
    private HashSet<Flaco> familia;

    public Familia(HashSet<Flaco> familia) {
        this.familia = familia;
    }

    public HashSet<Flaco> getFamilia() {
        return familia;
    }

    public void setFamilia(HashSet<Flaco> familia) {
        this.familia = familia;
    }

    public int promedioCalorias(){
        int aux=0;
        int counter=0;
        for(Flaco f:familia){
            aux+=f.getCalorias();
            counter++;
        }
        return aux/counter;
    }
    public Flaco personaQueConsumioMasCalorias(){
        int aux=0;
        Flaco auxFlaco = null;
        for(Flaco f:familia) {
            if(f.getCalorias() > aux){
                aux = f.getCalorias();
                auxFlaco=f;
            }
        }
        return auxFlaco;
    }
    public Flaco personaQueConsumioMenosCalorias(){
        Flaco auxFlaco = null;
        ArrayList<Flaco> familia2=new ArrayList<>(familia);
        int aux=familia2.getFirst().getCalorias();
        for(Flaco f:familia) {
            if(f.getCalorias() < aux){
                aux = f.getCalorias();
                auxFlaco=f;
            }
        }
        return auxFlaco;
    }

}
