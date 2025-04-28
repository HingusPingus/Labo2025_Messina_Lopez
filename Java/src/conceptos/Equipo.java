package conceptos;

import personas.Jugador;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String barrio;
    private ArrayList<Jugador> plantel;
    private String disponible;
    private int partidosJugados;


    public Equipo() {
        this.disponible = "Noche";
        this.plantel = new ArrayList<Jugador>();
        plantel.add(new Jugador(1));
        plantel.add(new Jugador(2));
        plantel.add(new Jugador(3));
        plantel.add(new Jugador(4));
        plantel.add(new Jugador(5));
        plantel.add(new Jugador(6));
        plantel.add(new Jugador(7));
        plantel.add(new Jugador(8));
        plantel.add(new Jugador(9));
        plantel.add(new Jugador(true,10));
        plantel.add(new Jugador(11));
        this.barrio = "Nuñez";
        this.nombre = "River Plate";
        this.partidosJugados=0;
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.disponible = "Noche";
        this.plantel = new ArrayList<Jugador>();
        plantel.add(new Jugador(1));
        plantel.add(new Jugador(2));
        plantel.add(new Jugador(3));
        plantel.add(new Jugador(4));
        plantel.add(new Jugador(5));
        plantel.add(new Jugador(6));
        plantel.add(new Jugador(7));
        plantel.add(new Jugador(8));
        plantel.add(new Jugador(9));
        plantel.add(new Jugador(true,10));
        plantel.add(new Jugador(11));
        this.barrio = "Nuñez";
        this.partidosJugados=0;
    }

    public Equipo(String disponible, ArrayList<Jugador> plantel, String barrio, String nombre) {
        this.disponible = disponible;
        this.plantel = plantel;
        this.barrio = barrio;
        this.nombre = nombre;
        this.partidosJugados=0;
        comprobar();
    }

    private void comprobar(){
        boolean loop, existe;
        ArrayList<Integer> numerosUsados=new ArrayList<Integer>();
        for(Jugador jugador:this.plantel){
            numerosUsados.add(jugador.getNumeroCamiseta());
            loop=true;
            existe=false;
            while(loop) {
                for (int numero : numerosUsados) {
                    if (numero == jugador.getNumeroCamiseta()) {
                        existe=true;
                    }
                }
                if(existe){
                    jugador.setNumeroCamiseta(jugador.getNumeroCamiseta()+1);
                }
                else{
                    loop=false;
                }
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }
    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
    public ArrayList<Jugador> getPlantel() {
        return plantel;
    }

    public void setPlantel(ArrayList<Jugador> plantel) {
        this.plantel = plantel;
        comprobar();
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void agregarJugador(Jugador jugador){
        this.plantel.add(jugador);
        comprobar();
    }
}
