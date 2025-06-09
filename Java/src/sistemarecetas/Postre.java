package sistemarecetas;

import java.util.ArrayList;

public class Postre extends Plato{
    private double temperatura;
    private boolean aptoCeliaco;

    public Postre() {
        super(Tipo.POSTRE);
        this.temperatura = 10.0;
        this.aptoCeliaco = true;
    }


    public Postre(String nombre, Dificultad dificultad, ArrayList<String> pasos, double temperatura, boolean aptoCeliaco) {
        super(nombre, dificultad, pasos,Tipo.POSTRE);
        this.temperatura = temperatura;
        this.aptoCeliaco = aptoCeliaco;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isAptoCeliaco() {
        return aptoCeliaco;
    }

    public void setAptoCeliaco(boolean aptoCeliaco) {
        this.aptoCeliaco = aptoCeliaco;
    }

    @Override
    public void pasoAPaso() {
        for (int i = 0; i < this.getPasos().size(); i++) {
            System.out.println(i+1+": "+ getPasos().get(i)+" Recordar tener la cocina limpia y el horno al mínimo");
        }
    }
}
