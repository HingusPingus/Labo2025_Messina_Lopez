package masterchef;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map;

public class Principiante extends Participante implements Entrada{
    HashSet<String> ingredientesProhibidos;

    public Principiante(String nombre, LocalDate fechaNacimiento, String localidad, Color colorEquipo, HashSet<String> ingredientesProhibidos) {
        super(nombre, fechaNacimiento, localidad, colorEquipo);
        this.ingredientesProhibidos = ingredientesProhibidos;
    }

    public HashSet<String> getIngredientesProhibidos() {
        return ingredientesProhibidos;
    }

    public void setIngredientesProhibidos(HashSet<String> ingredientesProhibidos) {
        this.ingredientesProhibidos = ingredientesProhibidos;
    }

    @Override
    public void prepararTrabajo() {
        System.out.println("Ya guarde todos los elementos prohibidos y no voy a usar:");
        for(String s:ingredientesProhibidos){
            System.out.println(s);
        }
    }

    @Override
    public Plato cocinarEntrada(Plato plato) {
        try{
            for(String s:getIngredientesProhibidos()){
                for(String a:plato.getIngredientesNecesarios().keySet()){
                    if(s.equals(a)){
                        throw new NoIngredientsException("usa ingredientes prohibidos");
                    }
                }
            }
            return servirEntrada(plato);
        }
        catch(NoIngredientsException n){
            System.err.println(n);
        }
        return null;
    }
    @Override
    public Plato servirEntrada(Plato plato) {
        return plato;
    }
}
