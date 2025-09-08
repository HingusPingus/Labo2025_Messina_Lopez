package modificacionsangre;

import java.time.LocalDate;

public class Niño extends Paciente implements Tratamiento{
    public int tolerancia;
    public int diasTeoricos;
    public int diasTratamiento;
    public boolean tratamientoEmpezado;

    public Niño(TipoSangre sangre, boolean positivo, int tolerancia) {
        super(sangre, positivo);
        check(tolerancia);
    }

    public Niño(String nombre, String apellido, int edad, String direccion, LocalDate fechaNacimiento, String mail, TipoSangre sangre, boolean positivo, int tolerancia) {
        super(nombre, apellido, edad, direccion, fechaNacimiento, mail, sangre, positivo);
        check(tolerancia);
    }

    public Niño(String nombre, int edad, String direccion, TipoSangre sangre, boolean positivo, int tolerancia) {
        super(nombre, edad, direccion, sangre, positivo);
        check(tolerancia);
    }

    public Niño(String nombre, String apellido, int edad, String direccion, TipoSangre sangre, boolean positivo, int tolerancia) {
        super(nombre, apellido, edad, direccion, sangre, positivo);
        check(tolerancia);
    }
    private void check(int tolerancia){
        if(tolerancia>10){
            this.tolerancia=10;
        }
        else if(tolerancia<1){
            this.tolerancia=1;
        }
        else{
            this.tolerancia=tolerancia;
        }
        diasTeoricos=this.tolerancia*2;
        diasTratamiento=0;
        tratamientoEmpezado=false;
    }

    @Override
    public boolean tratar() {
        if(checkearTratamiento()){
            diasTratamiento++;
            if(diasTratamiento==diasTeoricos){
                this.setSangre(TipoSangre.AB);
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

    public int getTolerancia() {
        return tolerancia;
    }

    public void setTolerancia(int tolerancia) {
        this.tolerancia = tolerancia;
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
        return 450000*tolerancia;
    }

    @Override
    public boolean checkearTratamiento() {
        if(this.getSangre().equals(TipoSangre.AB)){
            return false;
        }
        else if(this.getEdad()<3){
            if(!tratamientoEmpezado){
                System.out.println("Aún es muy chico para hacer el tratamiento");
            }
            return false;
        }
        else{
            if (!tratamientoEmpezado){
                System.out.println("El tratamiento durará: "+diasTeoricos+" días");
            }
            return true;
        }
    }
}
