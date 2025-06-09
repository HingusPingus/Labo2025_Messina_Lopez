package sistemarecetas;

import java.util.ArrayList;

public class Entrada extends Plato {
    private Temperatura temperatura;

    public Entrada() {
        super(Tipo.ENTRADA);
        this.temperatura = Temperatura.FRIO;
    }

    public Entrada(String nombre, Dificultad dificultad, ArrayList<String> pasos, Temperatura temperatura) {
        super(nombre, dificultad, pasos,Tipo.ENTRADA);
        this.temperatura = temperatura;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void pasoAPaso() {
        boolean frio = true;
        if(temperatura.equals(Temperatura.CALIENTE)) {
            frio = false;
            System.out.println("Recuerde prender el horno");
        }
        for (int i = 0; i < this.getPasos().size(); i++) {
            System.out.println(i+1+": "+ getPasos().get(i));
        }
        if(frio){
            System.out.println("Guardar el resultado en la heladera");
        }
    }
}
