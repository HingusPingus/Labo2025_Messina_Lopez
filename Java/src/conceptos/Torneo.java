package conceptos;

import java.util.ArrayList;
import java.util.Random;
public class Torneo {
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> fixture;



    public Torneo(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
        crearFixture();
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
    public ArrayList<Partido> getFixture() {
        return fixture;
    }

    public void setFixture(ArrayList<Partido> fixture) {
        this.fixture = fixture;
    }

    private boolean comprobacion(Equipo equipoAComprobar){
        boolean existe=false;
        for(Equipo equipo:this.equipos){
            if (equipo.getNombre().equals(equipoAComprobar.getNombre())){
                existe=true;
            }
        }
        return existe;
    }

    public void agregarEquipo(Equipo equipo) {
        if(comprobacion(equipo)){
            System.out.println("Ya existe un equipo con ese nombre");
        }
        else{
            this.equipos.add(equipo);
        }
    }

    private void crearFixture(){
        ArrayList<Fecha> fechas=new ArrayList<Fecha>();
        fixture=new ArrayList<Partido>();
        Random random=new Random();
        boolean nojugaron;
        for (int i = 0; i < this.equipos.size()-1; i++) {
            fechas.add(new Fecha(random.nextInt(29)+1, random.nextInt(11)+1, 2025));
        }


        for (int i = 0; i < this.equipos.size()-1; i++) {
            for(Equipo equipo: this.equipos){
                if(equipo.getPartidosJugados()<i){
                    equipo.setPartidosJugados(equipo.getPartidosJugados()+1);
                    for(Equipo equipoContra: this.equipos) {
                        nojugaron=true;
                        if(equipoContra.getPartidosJugados()<i){
                            for (Partido partido: fixture) {
                                if(equipo.getNombre().equals(partido.getEquipo1().getNombre())&&equipoContra.getNombre().equals(partido.getEquipo2().getNombre())){
                                    nojugaron=false;
                                }
                                else if(equipo.getNombre().equals(partido.getEquipo2().getNombre())&&equipoContra.getNombre().equals(partido.getEquipo1().getNombre())) {
                                    nojugaron = false;
                                }
                            }
                            if(nojugaron) {
                                equipoContra.setPartidosJugados(equipoContra.getPartidosJugados() + 1);
                                if (random.nextBoolean()) {
                                    this.fixture.add(new Partido(fechas.get(i), equipo.getDisponible(), equipo, equipoContra));
                                    break;
                                } else {
                                    this.fixture.add(new Partido(fechas.get(i), equipoContra.getDisponible(), equipo, equipoContra));
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Equipo> equipos= new ArrayList<Equipo>();
        equipos.add(new Equipo("River"));
        equipos.add(new Equipo("Boca"));
        equipos.add(new Equipo("Racing"));
        equipos.add(new Equipo("Independiente"));
        equipos.add(new Equipo("San Lorenzo"));
        equipos.add(new Equipo("Velez"));
        equipos.add(new Equipo("Estudiantes"));
        equipos.add(new Equipo("Gimnasia"));
        equipos.add(new Equipo("Huracan"));
        equipos.add(new Equipo("Tigre"));
        equipos.add(new Equipo("Platense"));
        equipos.add(new Equipo("Argentinos"));
        equipos.add(new Equipo("Colon"));
        equipos.add(new Equipo("Union"));

        Torneo copaDeLaLiga = new Torneo(equipos);
        ArrayList<Partido> fixture=copaDeLaLiga.getFixture();
        for(Partido partido:fixture ){
            partido.getDiaPartido().corta();
            System.out.println(partido.getTurno());
            System.out.println(partido.getEquipo1().getNombre());
            System.out.println(partido.getEquipo2().getNombre());
        }
    }
}
