package lunch_sys;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sistema {
    private ArrayList<Pedido>pedidos;
    private ArrayList<Plato>platos;

    public Sistema(ArrayList<Pedido> pedidos, ArrayList<Plato>platos) {
        this.pedidos = pedidos;
        this.platos=platos;
    }
    public Sistema(){
        pedidos=new ArrayList<>();
        pedidos.add(new Pedido());
        pedidos.add(new Pedido(LocalDate.of(2000, 10, 9), platos.get(1), new Alumno(), LocalTime.of(1, 2, 3), "Bien"));
        platos=new ArrayList<>();
        platos.add(new Plato());
        platos.add(new Plato("milanesas", 200));
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void addPlato(Plato plato){
        platos.add(plato);
    }
    public void removePlato(int index){
        platos.remove(index);
    }
    public void modifyPlato(Plato plato, int index){
        if(index<platos.size() && index>=0){
            platos.set(index, plato);
        }
    }
    public void modifyPedido(Pedido pedido, int index){
        pedidos.set(index, pedido);
    }
    public void checkPrecio(Pedido pedido, int numPedido){
        if(pedido.getSolicitante().getClass().getCanonicalName().equals("Profesor")){
            pedido.getPlato().setPrecio(pedido.getPlato().getPrecio()+(pedido.getPlato().getPrecio()*0.10));
        }
        modifyPedido(pedido, numPedido);
    }

    public ArrayList<Plato> cuantosPlatosPorDia(LocalDate dia){
        ArrayList<Plato>platosACrear=new ArrayList<>();
        for(Pedido p:pedidos){
            if(p.getTiempo_creacion()==dia){
                platosACrear.add(p.getPlato());
            }
        }
        return platosACrear;
    }
    public Map<Plato, Integer> platosMasPedidos(){
        Map<Plato, Integer> counter=new HashMap<>();
        for(Pedido p:pedidos){
            Plato plato=p.getPlato();
            counter.put(plato, counter.getOrDefault(plato, 0)+1);
        }
        return counter;
    }
    public ArrayList<Plato> top3() {
        Map<Plato, Integer>counter=platosMasPedidos();
        int n = counter.size();

        ArrayList<Map.Entry<Plato, Integer>> entryList=new ArrayList<>();
        entryList.addAll(counter.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        ArrayList<Plato>topPlatos=new ArrayList<>();
        for (int i = 0; i < Math.min(3, entryList.size()); i++) {
            topPlatos.add(entryList.get(i).getKey());
        }
        return topPlatos;
    }
}
