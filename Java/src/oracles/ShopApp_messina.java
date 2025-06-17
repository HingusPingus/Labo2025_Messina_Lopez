package oracle;
public class ShopApp_messina {
    
    public static void main(String[] args) {
        double tax=0.2;
        double total=0;
        int measurement= 3;
        System.out.println(Clothing_Messina.MIN_PRICE);
        Customer_Messina c1=new Customer_Messina("pinky", 3);

        Clothing_Messina item1=new Clothing_Messina("Blue Jacket", 20.9, "M");
        Clothing_Messina item2=new Clothing_Messina("Orange T-shirt", 10.5, "S");
        Clothing_Messina item3=new Clothing_Messina("Green Scarf", 5, "S");
        Clothing_Messina item4=new Clothing_Messina("Blue T-shirt", 10.5, "S");

        Clothing_Messina[] items={item1, item2, item3, item4};

        //System.out.println(item1.getDesc()+","+item1.getPrice()+","+item1.getSize());
        //System.out.println(item2.getDesc()+","+item2.getPrice()+","+item2.getSize());
        //total=(item2.getPrice()*2)+item1.getPrice();
        for(Clothing_Messina item: c1.getItems()){
            System.out.println("Item "+item);
        }
        
        c1.setItems(items);
        c1.setSize(measurement);
        
        c1.getTotalClothingCost(items);
        total=total-(tax*total);
        System.out.println(total);
        
    }
}
