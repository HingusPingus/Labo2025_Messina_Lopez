package sistemarecetas;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Plato> recetas;

    public Sistema(){
        this.recetas=new ArrayList<>();
    }

    public Sistema(ArrayList<Plato> recetas) {
        this.recetas = recetas;
    }

    public ArrayList<Plato> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Plato> recetas) {
        this.recetas = recetas;
    }

    public void agregarReceta(Plato receta){
        this.recetas.add(receta);
    }

    public void eliminarReceta(Plato receta){
        this.recetas.remove(receta);
    }

    public void modificarReceta(Plato recetaOld, Plato recetaNew){
        this.recetas.remove(recetaOld);
        this.recetas.add(recetaNew);
    }

    public ArrayList<Plato> busquedaDificultad(Dificultad dificultad){
        ArrayList<Plato> platos=new ArrayList<>();
        for(Plato receta:this.recetas){
            if(receta.getDificultad().equals(dificultad)){
                platos.add(receta);
            }
        }
        return platos;
    }

    public int cantidadRecetas(){
        return this.recetas.size();
    }

    public Plato masPasos(){
        Plato mayor =this.recetas.getFirst();

        for(Plato receta:this.recetas){
            if(receta.getPasos().size()>mayor.getPasos().size()){
                mayor=receta;
            }
        }
        return mayor;
    }

    public ArrayList<Plato> filtroTipo(Tipo tipo){
        ArrayList<Plato> platos=new ArrayList<>();
        for(Plato receta:this.recetas){
            if(receta.getTipo().equals(tipo)){
                platos.add(receta);
            }
        }
        return platos;
    }
}
