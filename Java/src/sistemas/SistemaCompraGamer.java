package sistemas;

import componentespc.*;


import java.util.ArrayList;

public class SistemaCompraGamer {
    private ArrayList<Componente> componentes;
    private ArrayList<PC> ventas;
    private PC pc;

    public SistemaCompraGamer(PC pc) {
        this.componentes = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.pc=pc;
    }

    public SistemaCompraGamer(ArrayList<Componente> componentes, ArrayList<PC> ventas,PC pc) {
        this.componentes = componentes;
        this.ventas = ventas;
        this.pc=pc;
    }

    public SistemaCompraGamer(ArrayList<Componente> componentes,PC pc) {
        this.componentes = componentes;
        this.ventas = new ArrayList<>();
        this.pc=pc;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setPc(PC pc) {
        this.pc = pc;
    }

    public PC getPc() {
        return pc;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public ArrayList<PC> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<PC> ventas) {
        this.ventas = ventas;
    }

    private boolean checkStock(Componente c1){
        if(c1.getStock()<1){
            return false;
        }
        else{
            return true;
        }
    }

    public void venderPC() throws StockException {
        boolean posible=false;
        ArrayList<Componente> componentes1= new ArrayList<>();
        if(this.pc.confirmacion()){
            posible=true;
            for (Componente c1: this.componentes) {
                for(Periferico p1:this.pc.getPerifericos()){
                    if(c1.equals(p1)){
                        if(posible){
                            posible=checkStock(c1);
                            componentes1.add(c1);
                        }
                        else{
                            throw new StockException("Este componente no tiene stock: "+c1);
                        }
                    }
                }
                if(c1.equals(pc.getCpu())){
                    if(posible){
                        posible=checkStock(c1);
                        componentes1.add(c1);
                    }
                    else{
                        throw new StockException("Este componente no tiene stock: "+c1);
                    }
                }
            }
        }
        if(posible){
            ventas.add(pc);
            for (Componente c1: componentes1) {
                for (Componente p1 : this.pc.getPerifericos()) {
                    if (c1.equals(p1)) {
                        c1.setStock(c1.getStock()-1);
                    }
                }
            }
        }
        else{
            System.out.println("No se ha podido concretar la compra");
        }
    }
}
