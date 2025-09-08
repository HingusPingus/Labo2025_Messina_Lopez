package CampeonatoArcoFlecha;

import java.util.HashSet;

public class Sistema {
    private HashSet<Bar> bares;
    private HashSet<Diana> dianas;
    private HashSet<Beneficio> beneficios;


    public Sistema(HashSet<Bar> bares, HashSet<Diana> dianas, HashSet<Beneficio> beneficios) {
        this.bares = bares;
        this.dianas = dianas;
        this.beneficios = beneficios;
    }

    public HashSet<Bar> getBares() {
        return bares;
    }

    public void setBares(HashSet<Bar> bares) {
        this.bares = bares;
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        this.dianas = dianas;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    public Diana dianaConMasPuntajesDistintos(){
        Diana diana=null;
        int aux=0;
        for(Diana d:dianas){
            if(diana==null || d.getColorPuntaje().size()>aux){
                diana=d;
                aux=d.getColorPuntaje().size();
            }
        }
        return diana;
    }
}
