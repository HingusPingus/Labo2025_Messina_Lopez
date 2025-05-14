package formas;


public class Circulo extends Forma {
    private float radio;


    public Circulo(){
        this.radio= 2.0F;
    }

    public Circulo(float radio){
        this.radio=radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double area(){
        float ara;
        ara=3.14F*(radio*radio);
        return ara;
    }
    public double perimeter(){
        float perimetro;
        perimetro=2*3.14F*radio;
        return perimetro;
    }

    public static void main(String[] args) {
        Circulo c1=new Circulo();
        System.out.println(c1.getRadio());
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}

