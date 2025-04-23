package unidad1;

public class Clothing{
  private String description;
  private double price;
  private String size;

  public Clothing(){
    this.description = "Black T-Shirt";
    this.price = 10.99;
    this.size = "M";
  }
  public Clothing(String description, double price, String size){
    this.description = description;
    this.price = price;
    this.size = size;
  }
  public String getDescription(){
    return this.description;
  }
  public String getPrice(){
    return this.price;
  }
  public String getSize(){
    return this.size;
  }
  public void setName(String description){
    this.description=description;
  }
  public void setName(String price){
    this.price=price;
  }
  public void setName(String size){
    this.size=size;
  }
}

public class Customer{
  private String name;

  public Customer(){
    this.name="Carlitos";
  }
  
  public Customer(String name){
    this.name=name;
  }
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name=name;
  }

}

public class ShopApp{
  
  
  public static void main(String[] args){
    double tax=0.2;
    double total=0;
    System.out.println("Welcome to the Duke Choice Shop");
    Customer c1= new Customer("Pinky");
    Clothing item1= new Clothing("Blue Jacket",20.9,"M");
    Clothing item2= new Clothing("Orange T-Shirt",10.5,"S");
    System.out.println("Welcome " + c1.getName());
    System.out.println(item1.getDescription()+", "+item1.getPrice()+", "+item1.getSize());
    System.out.println(item2.getDescription()+", "+item2.getPrice()+", "+item2.getSize());
    total=(2*item2.getPrice()+item1.getPrice())+(2*item2.getPrice()+item1.getPrice())*tax;
    System.out.prinln(total);
    
  }
  
}

