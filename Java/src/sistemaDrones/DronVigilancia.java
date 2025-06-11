package sistemaDrones;

import java.time.LocalDate;
import java.util.ArrayList;

public class DronVigilancia extends Dron{
    private int memoria;

    public DronVigilancia(String modelo, LocalDate fechaAdq, int carga, Estado estado, int memoria, ArrayList<Mision> misiones) {
        super(modelo, fechaAdq, carga, estado, misiones);
        this.memoria=memoria;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }


    @Override
    public void actualizarMision(Mision mision) {
        double espacioNecesario=(mision.FormulaDeHaversine()/2)*12;
        if(mision.getEstado()!=EstadoMision.FALLADA || mision.getEstado()!=EstadoMision.COMPLETADA){
            if(mision.getEstado()==EstadoMision.ENPROCESO) {
                if (getMemoria() >= espacioNecesario) {
                    for (Mision m : this.getMisiones()) {
                        if (m == mision) {
                            m.setEstado(EstadoMision.COMPLETADA);
                        }
                    }
                }
                else{
                    for (Mision m : this.getMisiones()) {
                        if (m == mision) {
                            m.setEstado(EstadoMision.FALLADA);
                        }
                    }
                }
            }
            else if(mision.getEstado()==EstadoMision.SINEMPEZAR) {
                for (Mision m : this.getMisiones()) {
                    if (m == mision) {
                        m.setEstado(EstadoMision.ENPROCESO);
                    }
                }
            }
        }

    }
}
