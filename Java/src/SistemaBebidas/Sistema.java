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

    public Cliente clienteMejorHidratacion(){
        Cliente mejor = null;
        int maxHidratacion = Integer.MIN_VALUE;

        for (Cliente c : this.getClientes()) {
            int hidratacion = c.sumaCoeficientePorTipo();
            if (hidratacion > maxHidratacion) {
                maxHidratacion = hidratacion;
                mejor = c;
            }
        }
        return mejor;
    }


}
