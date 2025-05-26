package componentespc;

import personas.Cliente;

import java.util.ArrayList;

public class PC {
    private CPU cpu;
    private ArrayList<Periferico> perifericos;
    private Cliente comprador;

    public PC(CPU cpu, ArrayList<Periferico> perifericos, Cliente comprador) {
        this.cpu = cpu;
        this.perifericos = perifericos;
        this.comprador=comprador;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public ArrayList<Periferico> getPerifericos() {
        return perifericos;
    }

    public void setPerifericos(ArrayList<Periferico> perifericos) {
        this.perifericos = perifericos;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public boolean confirmacion(){
        boolean in=false, out=false;
        for(Periferico p1:this.perifericos){
            if(p1.quienSoy().equals("Entrada")){
                in=true;
            }
            else if (p1.quienSoy().equals("Salida")||p1.quienSoy().equals("Impresora")){
                out=true;
            }
        }
        if(in && out){
            return true;
        }
        else{
            return false;
        }

    }
}

