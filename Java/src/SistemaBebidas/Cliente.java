package SistemaBebidas;

import personas.Persona;

import java.util.ArrayList;

public class Cliente extends Persona {
    private int DNI;
    private ArrayList<Bebida> bebidasPedidas;

    public Cliente(String nombre, String apellido, int edad, String direccion, int DNI, ArrayList<Bebida> bebidasPedidas) {
        super(nombre, apellido, edad, direccion);
        this.DNI = DNI;
        this.bebidasPedidas=bebidasPedidas;
    }

    public int sumaCoeficiente(){
        for(Bebida b:this.bebidasPedidas){

        }
    }
}
