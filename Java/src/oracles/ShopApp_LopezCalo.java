package oracles;

public class ShopApp_LopezCalo {


    public static void main(String[] args){
        double tax=0.2;
        double total=0;
        
        System.out.println("Welcome to the Duke Choice Shop");
        Customer_LopezCalo c1= new Customer_LopezCalo("Pinky");
        c1.setSize("S");
        int measurement=3; 
        Clothing_LopezCalo item1= new Clothing_LopezCalo("Blue Jacket",20.9,"M");
        Clothing_LopezCalo item2= new Clothing_LopezCalo("Orange T-Shirt",10.5,"S");
        Clothing_LopezCalo item3= new Clothing_LopezCalo("Green Scarf",5,"S");
        Clothing_LopezCalo item4= new Clothing_LopezCalo("Blue T-Shirt",10.5,"S");
        Clothing_LopezCalo[] list={item1, item2,item3,item4};
        //System.out.println("Welcome " + c1.getName());
        //System.out.println(item1.getDescription()+", "+item1.getPrice()+", "+item1.getSize());
        //System.out.println(item2.getDescription()+", "+item2.getPrice()+", "+item2.getSize());
        //total=(2*item2.getPrice()+item1.getPrice())+(2*item2.getPrice()+item1.getPrice())*tax;

       // for(Clothing_LopezCalo item:list){
            //if(item.getSize.equals(c1.getSize)){
           //     total+=item.getPrice()*(1+tax);
           //     System.out.println(item.getDescription()+", "+item.getPrice()+", "+item.getSize());
           // }
           // if(total>15){
          //      break;
          //  }
      //  }
       // System.out.println(total);

    }

}