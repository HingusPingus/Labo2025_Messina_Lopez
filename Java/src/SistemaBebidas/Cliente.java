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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public ArrayList<Bebida> getBebidasPedidas() {
        return bebidasPedidas;
    }

    public void setBebidasPedidas(ArrayList<Bebida> bebidasPedidas) {
        this.bebidasPedidas = bebidasPedidas;
    }

    public int sumaCoeficientePorTipo() {
        int sumNeutra = 0;
        int cantNeutra = 0;
        int sumAzucarada = 0;
        int cantAzucarada = 0;
        int sumAlcoholica = 0;
        int cantAlcoholica = 0;

        for (Bebida b : bebidasPedidas) {
            if (b instanceof BebidaNeutra) {
                sumNeutra += b.sumaCoeficiente();
                cantNeutra++;
            }
            else if (b instanceof BebidaAzucarada) {
                sumAzucarada += b.sumaCoeficiente();
                cantAzucarada++;
            }
            else if (b instanceof BebidaAlcoholica) {
                sumAlcoholica += b.sumaCoeficiente();
                cantAlcoholica++;
            }
        }
        int res = (sumNeutra * cantNeutra) +
                (sumAzucarada * cantAzucarada) +
                (sumAlcoholica * cantAlcoholica);
        return res;
    }

    public void tomoBebida(ArrayList<Bebida> bebidas){
        for(Bebida b:bebidas){
            bebidasPedidas.add(b);
        }
    }
}
