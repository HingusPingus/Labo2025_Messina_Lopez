package objetos;

import enums.Color;
import enums.Marca;

public class Auto {
    private Marca marca;
    private String modelo;
    private Color color;
    private int v;

    public Auto(){
        this.marca= Marca.BMW;
        this.color= Color.NEGRO;
        this.modelo="a";
        this.v=10;
    }
    public Auto(Marca marca, String modelo, Color color, int v){
        this.marca=marca;
        this.color=color;
        this.modelo=modelo;
        this.v=v;
    }

    public String getMarca() {
        return marca.name();
    }
    public String getModelo() {
        return modelo;
    }
    public String getColor() {
        return color.getNombre();
    }

    public int getV() {
        return v;
    }

    public void acelerar(){
        this.v++;
    }
    public void frenar(){
        this.v--;
    }
    public void velocidad(){
        System.out.println(this.v);
    }
}
