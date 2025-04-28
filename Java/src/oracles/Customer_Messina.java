package oracles;

public class Customer_Messina {
private String name;

public Customer_Messina(){
    this.name="pinky";
}
public String getName(){
    return name;
}
    public static void main(String args[]){
        Customer_Messina c1=new Customer_Messina();
        System.out.println("Nombre: "+c1.getName());
    }
}