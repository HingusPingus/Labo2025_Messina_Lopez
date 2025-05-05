package videoclub_sys;

import java.time.Duration;
import java.util.ArrayList;

public class Videoclub {
    private String direccion;
    private int codigoPostal;
    private ArrayList<Estanteria> estanterias;

    public Videoclub(){
        direccion="Carlos Antonio Lopez 4248";
        codigoPostal=1419;
        estanterias=new ArrayList<Estanteria>();
        estanterias.add(new Estanteria());
    }
    public Videoclub(String direccion, int codigoPostal, ArrayList<Estanteria> estanterias) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.estanterias = estanterias;
    }
    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    public int getCodigoPostal() {return codigoPostal;}
    public void setCodigoPostal(int codigoPostal) {this.codigoPostal = codigoPostal;}
    public ArrayList<Estanteria> getEstanterias() {return estanterias;}
    public void setEstanterias(ArrayList<Estanteria> estanterias) {this.estanterias = estanterias;}

    public void addEstanteria(Estanteria estanteria){
        this.estanterias.add(estanteria);
    }
    public void deleteEstanteria(int posicion) {
        this.estanterias.remove(posicion);
    }

    public void mostrarPelicula(){
        Duration aux=estanterias.getFirst().getEstanteria().getFirst().getDuracion();
        int aux1=0;
        int aux2=0;
        for(int i=0; i<estanterias.size(); i++){
            for(int j = 0; j< estanterias.get(i).getEstanteria().size(); j++){
                if(aux.compareTo(estanterias.get(i).getEstanteria().get(j).getDuracion())<0){
                    aux=estanterias.get(i).getEstanteria().get(j).getDuracion();
                    aux1=i;
                    aux2=j;
                }
            }
        }
        System.out.println("Nombre: "+estanterias.get(aux1).getEstanteria().get(aux2).getNombre()+" Estanteria: "+aux1);
    }


}
