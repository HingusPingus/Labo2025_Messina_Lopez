package modificacionsangre;

import java.util.HashSet;

public class Fundacion {
    private HashSet<Tratamiento> tratados;
    private HashSet<Paciente> pacientesTotales;

    public HashSet<Tratamiento> getTratados() {
        return tratados;
    }

    public void setTratados(HashSet<Tratamiento> tratados) {
        this.tratados = tratados;
    }

    public HashSet<Paciente> getPacientesTotales() {
        return pacientesTotales;
    }

    public void setPacientesTotales(HashSet<Paciente> pacientesTotales) {
        this.pacientesTotales = pacientesTotales;
    }

    public Fundacion(HashSet<Tratamiento> tratados, HashSet<Paciente> pacientesTotales) {
        this.tratados = tratados;
        this.pacientesTotales = pacientesTotales;
    }

    public void checkearPacientes(){


        for(Tratamiento t : tratados){
            if(t.tratar()){
                tratados.remove(t);
            }
        }
    }

    public int cantidadNoTratados(){
        int count=0;

        for(Paciente p:pacientesTotales){
            if(!(p instanceof Tratamiento)){
                count++;
            }
        }
        return count;
    }
}
