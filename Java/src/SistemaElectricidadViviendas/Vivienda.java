package SistemaElectricidadViviendas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.HashMap;
import java.util.HashSet;

public abstract class Vivienda {
    private String direccion;
    private String codigoPostal;
    private Duenio duenio;
    private HashMap<LocalDate, Integer> registros;

    public Vivienda(String direccion, String codigoPostal, Duenio duenio, HashMap<LocalDate, Integer> registros) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.duenio = duenio;
        this.registros = registros;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }


    public HashMap<LocalDate, Integer> getRegistros() {
        return registros;
    }

    public void setRegistros(HashMap<LocalDate, Integer> registros) {
        this.registros = registros;
    }

    public abstract int getKWhPorClase();

    public void addRegistro(LocalDate l, Integer val){
        registros.put(l, val);
    }
}
