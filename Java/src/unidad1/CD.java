package unidad1;

import java.util.ArrayList;

public class CD {
    private ArrayList<Cancion> canciones;


    public CD() {
        this.canciones = new ArrayList<Cancion>();
        canciones.add(new Cancion());
    }
    public CD(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }


    public int numeroCanciones(ArrayList<Cancion> canciones){
        return canciones.size();
    }
    public Cancion verCancion(int posicion, ArrayList<Cancion> canciones){
        return canciones.get(posicion);
    }
    public ArrayList<Cancion> grabarCancion(int posicion, Cancion nuevaCancion, ArrayList<Cancion> canciones){
        canciones.set(posicion, nuevaCancion);
        return canciones;
    }
    public ArrayList<Cancion> addCancion(Cancion nuevaCancion, ArrayList<Cancion> canciones){
        canciones.add(nuevaCancion);
        return canciones;
    }
    public ArrayList<Cancion> eraseCancion(int posicion, ArrayList<Cancion> canciones){
        canciones.remove(posicion);
        return canciones;
    }

}
