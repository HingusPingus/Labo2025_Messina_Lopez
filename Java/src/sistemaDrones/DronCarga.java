package sistemaDrones;

import java.time.LocalDate;
import java.util.ArrayList;

public class DronCarga extends Dron {
    private int peso;
    public DronCarga(String modelo, LocalDate fechaAdq, int carga, Estado estado, int peso, ArrayList<Mision> misiones) {
        super(modelo, fechaAdq, carga, estado, misiones);
        this.peso=peso;
    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    @Override
    public void actualizarMision(Mision mision) {
        if(mision.getEstado()!=EstadoMision.FALLADA){
            if(mision.getEstado()==EstadoMision.ENPROCESO){
                if(mision.FormulaDeHaversine()<30 && getCarga()>48){
                    for(Mision m:this.getMisiones()){
                        if(m==mision){
                            m.setEstado(EstadoMision.COMPLETADA);
                            setCarga(getCarga()-48);
                        }
                    }
                }
                else{
                    for(Mision m:this.getMisiones()){
                        if(m==mision){
                            m.setEstado(EstadoMision.FALLADA);
                        }
                    }
                }
            }
            else if(mision.getEstado()==EstadoMision.SINEMPEZAR){
                for(Mision m:this.getMisiones()){
                    if(m==mision){
                        m.setEstado(EstadoMision.ENPROCESO);
                    }
                }
            }
        }
    }
}
