package formas;

public class Rectangulo extends Forma {
    private float base;
    private float altura;

    public Rectangulo(){
        this.base=2;
        this.altura=2;
    }

    public Rectangulo(float base, float altura){
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
    @Override
    public double area(){
        float ara;
        ara=base*altura;
        return ara;
    }
    @Override
    public double perimetro(){
        float perimetro;
        perimetro=2*(base+altura);
        return perimetro;
    }

    public static void main(String[] args) {
        Rectangulo c1=new Rectangulo();
        System.out.println(c1.getBase()+c1.getAltura());
        System.out.println(c1.area());
        System.out.println(c1.perimetro());
    }
}
