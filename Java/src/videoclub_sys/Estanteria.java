package videoclub_sys;

import personas.Persona;

import java.time.Duration;
import java.util.ArrayList;

public class Estanteria {
    ArrayList<Pelicula> estanteria;

    public Estanteria(){
        estanteria=new ArrayList<Pelicula>();
        estanteria.add(new Pelicula());
    }
    public Estanteria(ArrayList<Pelicula> estanteria) {
        this.estanteria = estanteria;
    }

    public ArrayList<Pelicula> getEstanteria() {
        return estanteria;
    }
    public void setEstanteria(ArrayList<Pelicula> estanteria) {
        this.estanteria = estanteria;
    }

    public void addPelicula(Pelicula pelicula){
        this.estanteria.add(pelicula);
    }
    public void deletePelicula(int posicion) {
        this.estanteria.remove(posicion);
    }
    public ArrayList<String> dirUsual(ArrayList<Pelicula> estanteria){
        ArrayList<String> a=new ArrayList<String>();
        ArrayList<String> b=new ArrayList<String>();
        for(int i=0;i<estanteria.size();i++){
            for(int j=0;j<estanteria.get(i).getDirectores().size();j++){
                a.add(estanteria.get(i).getDirectores().get(j).getNombre());
            }
        }
        int n=a.size();
        for(int ii=0;ii<n;ii++){
            for(int jj=ii+1;jj<n;jj++){
                if(a.get(ii).equals(a.get(jj))){
                    if(!b.contains(a.get(ii))){
                        b.add(a.get(ii));
                    }
                }
            }
        }
        return b;
    }
    public ArrayList<Pelicula> cortos(){
        ArrayList<Pelicula> peliscortas= new ArrayList<>();
        Duration aux= Duration.ofMinutes(90);
        for (Pelicula peli: this.estanteria){
            if(aux.compareTo(peli.getDuracion())>0){
                peliscortas.add(peli);
            }
        }
        return peliscortas;
    }
}
