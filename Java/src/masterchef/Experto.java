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
    public Plato cocinarEntrada(Plato plato) {
        try {
            if((getTiempoLimite()-plato.getTiempoPreparacion())>0) {
                System.out.println("cocine la entrada " + plato.getNombre() + " en " + plato.getTiempoPreparacion() + " minutos.");
                setTiempoLimite(getTiempoLimite() - plato.getTiempoPreparacion());
                return servirEntrada(plato);
            }
            else{
                throw new NoTimeException("No tiene tiempo suficiente");
            }
        }
        catch(NoTimeException n){
            System.err.println(n);
        }
        return null;
    }

    @Override
    public Plato cocinarPrincipal(Plato plato) {
        try {
            if((getTiempoLimite()-plato.getTiempoPreparacion())>0) {
                System.out.println("cocine el plato principal " + plato.getNombre() + " en " + plato.getTiempoPreparacion() + " minutos.");
                setTiempoLimite(getTiempoLimite() - plato.getTiempoPreparacion());
                return servirPrincipal(plato);
            }
            else{
                throw new NoTimeException("No tiene tiempo suficiente");
            }
        }
        catch(NoTimeException n){
            System.err.println(n);
        }
        return null;
    }

    @Override
    public Plato servirEntrada(Plato plato) {
        return plato;
    }

    @Override
    public Plato servirPrincipal(Plato plato) {
        return plato;
    }
}
