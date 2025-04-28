package conceptos;

public class Partido {
    private Fecha diaPartido;
    private String turno;
    private Equipo equipo1;
    private Equipo equipo2;

    public Partido(Fecha diaPartido, String turno, Equipo equipo1, Equipo equipo2) {
        this.diaPartido = diaPartido;
        this.turno = turno;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public Fecha getDiaPartido() {
        return diaPartido;
    }

    public void setDiaPartido(Fecha diaPartido) {
        this.diaPartido = diaPartido;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }
}
