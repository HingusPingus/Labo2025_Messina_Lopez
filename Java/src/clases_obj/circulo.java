package clases_obj;


public class circulo {
    private float radio;


    public circulo(){
        this.radio= 2.0F;
    }

    public circulo(float radio){
        this.radio=radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float area(float radio){
        float ara;
        ara=3.14F*(radio*radio);
        return ara;
    }
    public float perimeter(float radio){
        float perimetro;
        perimetro=2*3.14F*radio;
        return perimetro;
    }

    public static void main(String[] args) {
        circulo c1=new circulo();
        System.out.println(c1.getRadio());
        System.out.println(c1.area(c1.getRadio()));
        System.out.println(c1.perimeter(c1.getRadio()));
    }
}

