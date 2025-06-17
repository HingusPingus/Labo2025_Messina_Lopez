package oracles;

public class ShopApp_LopezCalo {


    public static void main(String[] args){
        double tax=0.2;
        double total=0;
        System.out.println(Clothing_LopezCalo.getMinPrice());
        System.out.println("Welcome to the Duke Choice Shop");
        Customer_LopezCalo c1= new Customer_LopezCalo("Pinky");
        c1.setSize("S");
        int measurement=3; 
        Clothing_LopezCalo item1= new Clothing_LopezCalo("Blue Jacket",20.9,"M");
        Clothing_LopezCalo item2= new Clothing_LopezCalo("Orange T-Shirt",10.5,"S");
        Clothing_LopezCalo item3= new Clothing_LopezCalo("Green Scarf",5,"S");
        Clothing_LopezCalo item4= new Clothing_LopezCalo("Blue T-Shirt",10.5,"S");
        c1.addItem(item1);
        c1.addItem(item2);
        c1.addItem(item3);
        c1.addItem(item4);
        System.out.println("Welcome " + c1.getName());
        for (Clothing_LopezCalo item : c1.getItems()) {
            System.out.println(item.toString());
        }
        total=c1.getTotalClothingCost();
       
        System.out.println(total);

    }

}