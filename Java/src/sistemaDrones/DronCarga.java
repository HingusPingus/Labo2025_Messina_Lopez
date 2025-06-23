package sistemaDrones;

import java.time.LocalDate;
import java.util.ArrayList;

public class DronCarga extends Dron {
    private int peso;
    private int contadorViajes;
    public DronCarga(String modelo, LocalDate fechaAdq, int carga, Estado estado, int peso, ArrayList<Mision> misiones) {
        super(modelo, fechaAdq, carga, estado, misiones);
        contadorViajes=0;
        this.peso=peso;
    }

    public int getPeso() {
        return peso;
    }

    public int getContadorViajes() {
        return contadorViajes;
    }

    public void setContadorViajes(int contadorViajes) {
        this.contadorViajes = contadorViajes;
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
                            setContadorViajes(getContadorViajes()+1);
                            if(getContadorViajes()%3==0) {
                                setCarga(getCarga() - 50);
                            }
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
