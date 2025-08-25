package SistemaElectricidadViviendas;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Map;

public class Sistema {
    HashSet<Vivienda> viviendas;

    public Sistema(HashSet<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }

    public HashSet<Vivienda> getViviendas() {
        return viviendas;
    }

    public void setViviendas(HashSet<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }

    public int calcularGasto(int KWhGastados, Vivienda vivienda) {
        int res;
        Month month= LocalDate.now().getMonth();
        int year=LocalDate.now().getYear();
        int lastYear=year-1;
        int consumoAnterior=0;
        for(Map.Entry<LocalDate, Integer> entrada:vivienda.getRegistros().entrySet()){
            if(entrada.getKey().getYear()==lastYear && entrada.getKey().getMonth()==month){
                        consumoAnterior= entrada.getValue();
            }
        }
        int consumoAnteriorParaDescuento= (int) (consumoAnterior-(consumoAnterior*0.1));
        if(KWhGastados<=consumoAnteriorParaDescuento){
            int semiRes;
            semiRes=KWhGastados*vivienda.getKWhPorClase();
            res= (int) (semiRes-(semiRes*0.05));
        }
        else{
            res=KWhGastados*vivienda.getKWhPorClase();
        }
        return res;
    }
}
