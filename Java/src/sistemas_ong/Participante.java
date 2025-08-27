package sistemas_ong;

import personas.Persona;

import java.util.HashSet;

public abstract class Participante extends Persona {
    private boolean mensualidad;
    private Barrio barrio;

    public abstract String quienSoy();

    private void checkBarrio(){
        String clase=this.quienSoy();
        if(quienSoy().equals("ProfeIn")||quienSoy().equals("ProfeTitu")){
            clase="Profe";
        }

        HashSet<Barrio> barrios= ONG.adonde(clase);
        try{
            boolean check=false;
            for(Barrio b:barrios){
                if(b.equals(this.barrio)){
                    check=true;
                }
            }
            if(!check){

            }
        }
    }
}
