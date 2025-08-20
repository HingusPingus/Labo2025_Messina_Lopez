package SistemaBebidas;

import controlLlamadas.Empleado;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Cliente> clientes;
    private ArrayList<Bebida> bebidas;

    public Sistema(ArrayList<Cliente> clientes, ArrayList<Bebida> bebidas) {
        this.clientes = clientes;
        this.bebidas = bebidas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public void addCliente(Cliente cliente){
        try{
            for(Cliente c:clientes){
                if(cliente.getDNI()==c.getDNI()){
                    throw new DNIyaEstaException("El dni puesto ya esta en sistema.");
                }
            }
            clientes.add(cliente);
        }
        catch(DNIyaEstaException d){
            System.out.println(d);
        }
    }



    public Cliente clienteMejorHidratacion(){
        Cliente mejor = null;
        int maxHidratacion = Integer.MIN_VALUE;
        try {
            if(clientes.isEmpty()){
                throw new NullPointerException("No hay ningun cliente.");
            }
            for (Cliente c : this.getClientes()) {
                int hidratacion = c.sumaCoeficientePorTipo();
                if (hidratacion > maxHidratacion) {
                    maxHidratacion = hidratacion;
                    mejor = c;
                }
            }
            return mejor;
        }
        catch(NullPointerException n){
            System.out.println(n);
            return null;
        }
    }


}
