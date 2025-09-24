package masterchef;

import java.time.LocalDate;
import java.util.HashSet;

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
    public void cocinarServirEntrada() {

    }
}
