package unidad1;

public class rectangulo {
    private float base;
    private float altura;

    public rectangulo(){
        this.base=2;
        this.altura=2;
    }

    public rectangulo(float base, float altura){
        this.base=base;
        this.altura=altura;
    }

    public float getAltura() {
        return altura;
    }

    public float getBase() {
        return base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setBase(float base) {
        this.base = base;
    }
    public float area(float base,float altura){
        float ara;
        ara=base*altura;
        return ara;
    }
    public float perimeter(float base, float altura){
        float perimetro;
        perimetro=2*(base+altura);
        return perimetro;
    }

    public static void main(String[] args) {
        rectangulo c1=new rectangulo();
        System.out.println(c1.getBase()+c1.getAltura());
        System.out.println(c1.area(c1.getBase(),c1.getAltura()));
        System.out.println(c1.perimeter(c1.getBase(),c1.getAltura()));
    }
}
