package SistemaElectricidadViviendas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.HashMap;
import java.util.Map;

public class Casa extends Vivienda{
    private String metrosCubiertos;
    private String metrosDescubiertos;
    private static int pagoPorKWh=100;


    public Casa(String direccion, String codigoPostal, Duenio duenio, HashMap<LocalDate, Integer> registros, String metrosCubiertos, String metrosDescubiertos) {
        super(direccion, codigoPostal, duenio, registros);
        this.metrosCubiertos = metrosCubiertos;
        this.metrosDescubiertos = metrosDescubiertos;
    }

    public static int getPagoPorKWh() {
        return pagoPorKWh;
    }

    public static void setPagoPorKWh(int pagoPorKWh) {
        Casa.pagoPorKWh = pagoPorKWh;
    }

    public String getMetrosCubiertos() {
        return metrosCubiertos;
    }

    public void setMetrosCubiertos(String metrosCubiertos) {
        this.metrosCubiertos = metrosCubiertos;
    }

    public String getMetrosDescubiertos() {
        return metrosDescubiertos;
    }

    public void setMetrosDescubiertos(String metrosDescubiertos) {
        this.metrosDescubiertos = metrosDescubiertos;
    }

    public int getKWhPorClase() {
        return getPagoPorKWh();
    }
}
