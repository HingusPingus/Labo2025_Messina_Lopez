package pagodeempleados;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Diseñador {
    private String nombre;
    private Tipo tipo;
    HashMap<Proyecto, Integer> proyectos;

    public Diseñador() {
        nombre = "pepe";
        tipo=Tipo.IT;
        proyectos=new HashMap<>();
    }

    public Diseñador(String nombre, Tipo tipo, HashMap<Proyecto, Integer> proyectos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.proyectos = proyectos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public HashMap<Proyecto, Integer> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashMap<Proyecto, Integer> proyectos) {
        this.proyectos = proyectos;
    }

    public void recaudo(){
        double pago = 0;
        for(Map.Entry<Proyecto, Integer> p: proyectos.entrySet()){
            pago+= p.getValue();
        }
        System.out.println(pago+(pago*tipo.getPorcentaje()));
    }
    public void proyectosTotales(){
        System.out.println(proyectos.size());
    }
    public void cuantoGanoProyectoEspecifico(Proyecto proyecto){
        for(Map.Entry<Proyecto, Integer> p: proyectos.entrySet()){
            if(p.getKey()==proyecto){
                System.out.println(p.getValue());
            }
        }
    }
    public void infoProyecto(){
        for(Map.Entry<Proyecto, Integer> p: proyectos.entrySet()){
            System.out.println(p.getKey().getNombre());
            System.out.println(p.getValue());
            System.out.println(p.getKey());
            System.out.println(p.getKey().getPago()* tipo.getPorcentaje());
        }
    }
}
