package objetos;

public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private int v;

    public Auto(){
        this.marca="BMW";
        this.color="negro";
        this.modelo="a";
        this.v=10;
    }
    public Auto(String marca, String modelo, String color, int v){
        this.marca=marca;
        this.color=color;
        this.modelo=modelo;
        this.v=v;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getColor() {
        return color;
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
