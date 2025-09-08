package CampeonatoArcoFlecha;

import java.util.HashSet;

public class Bar {
    private HashSet<Diana> dianas;
    private HashSet<Cliente> clientes;
    private int plata;
    private HashSet<Beneficio> beneficios;
    private HashSet<Acumulable> beneficiosAcumulables;

    public Bar(HashSet<Diana> dianas, HashSet<Cliente> clientes, int plata, HashSet<Beneficio> beneficios, HashSet<Acumulable> beneficiosAcumulables) {
        this.dianas = dianas;
        this.clientes = clientes;
        this.plata = plata;
        this.beneficios = beneficios;
        this.beneficiosAcumulables = beneficiosAcumulables;
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        this.dianas = dianas;
    }

    public HashSet<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(HashSet<Cliente> clientes) {
        this.clientes = clientes;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    public HashSet<Acumulable> getBeneficiosAcumulables() {
        return beneficiosAcumulables;
    }

    public void setBeneficiosAcumulables(HashSet<Acumulable> beneficiosAcumulables) {
        this.beneficiosAcumulables = beneficiosAcumulables;
    }


    public int beneficiosNoAcumulables(){
        return beneficios.size()-beneficiosAcumulables.size();
    }
}
