package masterchef;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Intermedio extends Participante implements Principal{
    HashMap<String, Integer> stockIngredientes;

    public Intermedio(String nombre, LocalDate fechaNacimiento, String localidad, Color colorEquipo, HashMap<String, Integer> stockIngredientes) {
        super(nombre, fechaNacimiento, localidad, colorEquipo);
        this.stockIngredientes = stockIngredientes;
    }

    public HashMap<String, Integer> getStockIngredientes() {
        return stockIngredientes;
    }

    public void setStockIngredientes(HashMap<String, Integer> stockIngredientes) {
        this.stockIngredientes = stockIngredientes;
    }

    @Override
    public void prepararTrabajo() {
        System.out.println("Mi stock a utilizar es de");
        for(Map.Entry<String, Integer> n:stockIngredientes.entrySet()){
            if(n.getValue()>1){
                System.out.println(n.getKey());
            }
        }
    }

    @Override
    public Plato cocinarPrincipal(Plato plato) {
        try{
            for(Map.Entry<String, Integer> n:stockIngredientes.entrySet()){
                for(Map.Entry<String, Integer> a:plato.getIngredientesNecesarios().entrySet()){
                    if(a.getKey().equals(n.getKey())){
                        if(n.getValue()>=a.getValue()){
                            System.out.println("hice el plato principal "+plato.getNombre());
                            n.setValue(n.getValue()-a.getValue());
                            return servirPrincipal(plato);
                        }
                        else{
                            throw new NoIngredientsException("no hay ingredientes suficientes");
                        }
                    }
                    else{
                        throw new NoIngredientsException("no esta el ingrediente");
                    }
                }
            }
        }
        catch(NoIngredientsException n){
            System.err.println(n);
        }
        return null;
    }
    @Override
    public Plato servirPrincipal(Plato plato) {
        return plato;
    }
}
