package sistemaspeso;

import personas.Persona;

import java.time.LocalDate;
import java.util.HashMap;

public class ClientePeso extends Persona {
    private LocalDate fechaNacimiento;
    private HashMap<LocalDate, Registro> registros;

    public ClientePeso(LocalDate fechaNacimiento, HashMap<LocalDate, Registro> registros) {
        super();
        this.fechaNacimiento = fechaNacimiento;
        this.registros = registros;
    }

    public ClientePeso() {
        super();
        this.fechaNacimiento = LocalDate.now();
        this.registros = new HashMap<>();
    }

    public ClientePeso(String nombre, int edad, String direccion, LocalDate fechaNacimiento, HashMap<LocalDate, Registro> registros) {
        super(nombre, edad, direccion);
        this.fechaNacimiento = fechaNacimiento;
        this.registros = registros;
    }

    public ClientePeso(String nombre, String apellido, int edad, String direccion, LocalDate fechaNacimiento, HashMap<LocalDate, Registro> registros) {
        super(nombre, apellido, edad, direccion);
        this.fechaNacimiento = fechaNacimiento;
        this.registros = registros;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public HashMap<LocalDate, Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(HashMap<LocalDate, Registro> registros) {
        this.registros = registros;
    }

    public void addRegistro(Registro registro){
        if(registros.containsKey(LocalDate.now())) {
            System.out.println("Usted ya registro ese dia");
        }
        else {
            this.registros.put(LocalDate.now(), registro);
        }
    }

    public String seeRegistro(LocalDate fecha){
        if(registros.containsKey(fecha)){
            double peso=this.registros.get(fecha).getPeso();
            double altura=this.registros.get(fecha).getAltura();
            return "Peso: "+peso+" Altura: "+altura;
        }
        else {
            return"No existe registro en esa fecha";
        }
    }
    public double seeRegistroPeso(LocalDate fecha){
        if(registros.containsKey(fecha)){
            double peso=this.registros.get(fecha).getPeso();
            return peso;
        }
        else {
            return 0;
        }
    }
    public double seeRegistroAltura(LocalDate fecha){
        if(registros.containsKey(fecha)){
            double altura=this.registros.get(fecha).getAltura();
            return altura;
        }
        else {
            return 0;
        }
    }

    public double getPromedioPesoAnio(int anio){
        double peso=0;
        int aux=0;
        for (LocalDate fecha:registros.keySet()){
            if(fecha.getYear()==anio){
                peso+=registros.get(fecha).getPeso();
                aux++;
            }
        }
        return peso/aux;
    }
    public double getPromedioAlturaAnio(int anio){
        double altura=0;
        int aux=0;
        for (LocalDate fecha:registros.keySet()){
            if(fecha.getYear()==anio){
                altura+=registros.get(fecha).getAltura();
                aux++;
            }
        }
        return altura/aux;
    }

    public double getPorcentajeCrecimientoAltura(LocalDate fecha){
        LocalDate anterior=LocalDate.now();
        boolean primero=true;
        if(registros.containsKey(fecha)){

            for (LocalDate f: registros.keySet()){
                if(primero){
                    primero=false;
                    anterior=f;
                }
                if(f.isBefore(fecha)&&f.isAfter(anterior)){
                    anterior=f;
                }
                else if(f.isBefore(fecha)&&anterior.isAfter(fecha)){
                    anterior=f;
                }
            }
            double promedio=(registros.get(fecha).getAltura()-registros.get(anterior).getAltura())/registros.get(anterior).getAltura()*100;
            return promedio;
        }
        return 0;
    }

    public double getPorcentajeCrecimientoPeso(LocalDate fecha){
        LocalDate anterior=LocalDate.now();
        boolean primero=true;
        if(registros.containsKey(fecha)){

            for (LocalDate f: registros.keySet()){
                if(primero){
                    primero=false;
                    anterior=f;
                }
                if(f.isBefore(fecha)&&f.isAfter(anterior)){
                    anterior=f;
                }
                else if(f.isBefore(fecha)&&anterior.isAfter(fecha)){
                    anterior=f;
                }
            }
            double promedio=(registros.get(fecha).getPeso()-registros.get(anterior).getPeso())/registros.get(anterior).getPeso()*100;
            return promedio;
        }
        return 0;
    }
}
