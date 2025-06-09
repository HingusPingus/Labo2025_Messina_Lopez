package sistemarecetas;

import java.time.LocalTime;
import java.util.ArrayList;

public class Principal extends Plato{
    private LocalTime tiempoCoccion;
    private int comensales;

    public Principal() {
        super(Tipo.PRINCIPAL);
        this.tiempoCoccion = LocalTime.of(0,30);
        this.comensales = 1;
    }

    public Principal(String nombre, Dificultad dificultad, ArrayList<String> pasos, LocalTime tiempoCoccion, int comensales) {
        super(nombre, dificultad, pasos,Tipo.PRINCIPAL);
        this.tiempoCoccion = tiempoCoccion;
        this.comensales = comensales;
    }

    public LocalTime getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(LocalTime tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    @Override
    public void pasoAPaso() {
        System.out.println("Esta receta tarda en cocinarse:"+tiempoCoccion.toString()+"y los pasos son: ");
        for (int i = 0; i < this.getPasos().size(); i++) {
            System.out.println(i+1+": "+ getPasos().get(i));
        }
    }
}
