package unidad1;

public class Cafetera {
    private int cantMax;
    private int cantAct;
    private int cantidad;
    private int capacidadMax_taza;
    private int capacidadAct_taza;

    public Cafetera(){
        cantMax=1000;
        cantAct=0;
        cantidad=0;
        capacidadMax_taza=10;
        capacidadAct_taza=0;
    }

    public Cafetera(int cantMax, int cantAct, int cantidad, int capacidadMax_taza, int capacidadAct_taza) {
        this.cantMax = cantMax;
        this.cantAct = cantAct;
        this.cantidad = cantidad;
        this.capacidadMax_taza = capacidadMax_taza;
        this.capacidadAct_taza = capacidadAct_taza;
    }
    public Cafetera(int cantMax){
        this.cantAct=cantMax;
        this.cantidad = 0;
        this.capacidadMax_taza = 10;
        this.capacidadAct_taza = 0;
    }
    public Cafetera(int cantMax, int cantAct){
        if(this.cantMax<cantAct){
            cantAct=this.cantMax;
        }
    }

    public void llenarCafetera(){
        this.cantAct=this.cantMax;
    }
    public void llenar_taza(int capacidad){
        this.capacidadAct_taza+=capacidad;
    }
    public void vaciar_cafetera(){
        this.cantAct=0;
    }
    public void agregar_cafe(int cantidad){
        this.cantAct+=cantidad;
    }
}
