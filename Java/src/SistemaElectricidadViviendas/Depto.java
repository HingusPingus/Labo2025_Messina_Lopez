package SistemaElectricidadViviendas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Depto extends Vivienda{
    private int ambientes;
    private static int pagoPorKWh=50;

    public Depto(String direccion, String codigoPostal, Duenio duenio, HashMap<LocalDate, Integer> registros, int ambientes) {
        super(direccion, codigoPostal, duenio, registros);
        this.ambientes = ambientes;
    }

    public static int getPagoPorKWh() {
        return pagoPorKWh;
    }

    public static void setPagoPorKWh(int pagoPorKWh) {
        Depto.pagoPorKWh = pagoPorKWh;
    }

    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }

    @Override
    public int getKWhPorClase() {
        return getPagoPorKWh();
    }
}

