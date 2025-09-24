package masterchef;

import java.time.LocalDate;

public class Experto extends Participante implements Entrada, Principal{
    private static int tiempoLimite=80;

    public Experto(String nombre, LocalDate fechaNacimiento, String localidad, Color colorEquipo) {
        super(nombre, fechaNacimiento, localidad, colorEquipo);
    }

    public static int getTiempoLimite() {
        return tiempoLimite;
    }

    public static void setTiempoLimite(int tiempoLimite) {
        Experto.tiempoLimite = tiempoLimite;
    }

    @Override
    public void prepararTrabajo() {
        System.out.println("Perdi 5 minutos preparando la mesa por lo que mi tiempo restante es:"+(getTiempoLimite()-5));
    }

    @Override
    public void cocinarServirEntrada() {

    }

    @Override
    public void cocinarServirPrincipal() {

    }
}
