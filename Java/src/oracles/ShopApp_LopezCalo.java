package oracles;

public class ShopApp_LopezCalo {


    public static void main(String[] args){
        double tax=0.2;
        double total=0;
        System.out.println("Welcome to the Duke Choice Shop");
        Customer_LopezCalo c1= new Customer_LopezCalo("Pinky");
        Clothing_LopezCalo item1= new Clothing_LopezCalo("Blue Jacket",20.9,"M");
        Clothing_LopezCalo item2= new Clothing_LopezCalo("Orange T-Shirt",10.5,"S");
        System.out.println("Welcome " + c1.getName());
        System.out.println(item1.getDescription()+", "+item1.getPrice()+", "+item1.getSize());
        System.out.println(item2.getDescription()+", "+item2.getPrice()+", "+item2.getSize());
        total=(2*item2.getPrice()+item1.getPrice())+(2*item2.getPrice()+item1.getPrice())*tax;
        System.out.println(total);

    }

}