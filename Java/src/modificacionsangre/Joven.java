package modificacionsangre;

import java.time.LocalDate;
import java.util.HashSet;

public class Joven extends Paciente implements Tratamiento{
    static int edadMinima=20;
    static int edadMaxima=30;
    private HashSet<String> actividadesFisicas;
    private int diasTeoricos;
    private int diasTratamiento;
    private boolean tratamientoEmpezado;

    public Joven(TipoSangre sangre, boolean positivo, HashSet<String> actividadesFisicas) {
        super(sangre, positivo);
        this.actividadesFisicas = actividadesFisicas;
        diasTeoricos=(edadMaxima-this.getEdad())*2;
        diasTratamiento=0;
        tratamientoEmpezado=false;
    }

    public Joven(String nombre, String apellido, int edad, String direccion, LocalDate fechaNacimiento, String mail, TipoSangre sangre, boolean positivo, HashSet<String> actividadesFisicas) {
        super(nombre, apellido, edad, direccion, fechaNacimiento, mail, sangre, positivo);
        this.actividadesFisicas = actividadesFisicas;
        diasTeoricos=(edadMaxima-this.getEdad())*2;
        diasTratamiento=0;
        tratamientoEmpezado=false;
    }

    public Joven(String nombre, int edad, String direccion, TipoSangre sangre, boolean positivo, HashSet<String> actividadesFisicas) {
        super(nombre, edad, direccion, sangre, positivo);
        this.actividadesFisicas = actividadesFisicas;
        diasTeoricos=(edadMaxima-this.getEdad())*2;
        diasTratamiento=0;
        tratamientoEmpezado=false;
    }

    public Joven(String nombre, String apellido, int edad, String direccion, TipoSangre sangre, boolean positivo, HashSet<String> actividadesFisicas) {
        super(nombre, apellido, edad, direccion, sangre, positivo);
        this.actividadesFisicas = actividadesFisicas;
        diasTeoricos=(edadMaxima-this.getEdad())*2;
        diasTratamiento=0;
        tratamientoEmpezado=false;
    }

    @Override
    public boolean tratar() {
        if(checkearTratamiento()){
            diasTratamiento++;
            if(diasTratamiento==diasTeoricos){
                this.setSangre(TipoSangre.A);
                this.setPositivo(true);
                return true;
            }
            else{
                return false;
            }
        }
        else {
            return true;
        }
    }

    public static int getEdadMinima() {
        return edadMinima;
    }

    public static void setEdadMinima(int edadMinima) {
        Joven.edadMinima = edadMinima;
    }

    public static int getEdadMaxima() {
        return edadMaxima;
    }

    public static void setEdadMaxima(int edadMaxima) {
        Joven.edadMaxima = edadMaxima;
    }

    public HashSet<String> getActividadesFisicas() {
        return actividadesFisicas;
    }

    public void setActividadesFisicas(HashSet<String> actividadesFisicas) {
        this.actividadesFisicas = actividadesFisicas;
    }

    public int getDiasTeoricos() {
        return diasTeoricos;
    }

    public void setDiasTeoricos(int diasTeoricos) {
        this.diasTeoricos = diasTeoricos;
    }

    public int getDiasTratamiento() {
        return diasTratamiento;
    }

    public void setDiasTratamiento(int diasTratamiento) {
        this.diasTratamiento = diasTratamiento;
    }

    public boolean isTratamientoEmpezado() {
        return tratamientoEmpezado;
    }

    public void setTratamientoEmpezado(boolean tratamientoEmpezado) {
        this.tratamientoEmpezado = tratamientoEmpezado;
    }

    @Override
    public double calcularPrecio() {
        if(this.getFechaNacimiento().getYear()%2==1){
             return this.getFechaNacimiento().getMonthValue()*760000;
        }
        return this.getFechaNacimiento().getDayOfMonth()*145400;
    }

    @Override
    public boolean checkearTratamiento() {
        if(this.getSangre().equals(TipoSangre.A)&&this.isPositivo()){
            return false;
        }
        else if(edadMaxima-this.getEdad()<2){
            if(!tratamientoEmpezado){
                System.out.println("Lamentamos comunicarte que tu sangre aún no va a poder ser modificada");
            }
            return false;
        }
        else{
            if (!tratamientoEmpezado){
                System.out.println("Será un tratamiento costoso, pero lo vamos a lograr");
            }
            return true;
        }
    }
}
