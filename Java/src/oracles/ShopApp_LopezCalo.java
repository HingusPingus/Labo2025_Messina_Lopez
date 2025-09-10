package oracles;
import java.util.Arrays;
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
        Clothing_LopezCalo [] items={item1,item2,item3,item4};
        c1.setItems(items);
        /*try {
            Itemlist list = new Itemlist(items);
            Routing routing = Routing.builder()
            .get("/items",list).build();
            ServerConfiguration config = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost())
                    .port(8888).build();
            WebServer ws = WebServer.create(config,routing);
            ws.start();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } */
        System.out.println("Welcome " + c1.getName());
        for (Clothing_LopezCalo item : c1.getItems()) {
            System.out.println(item.toString());
        }
        total=c1.getTotalClothingCost();
        int i=0;
        double avg = 0;
        for(Clothing_LopezCalo item:c1.getItems()){

            if(item.getSize().equals("L")){
                i++;
                avg+=item.getPrice();
            }
            
            
        }
        try{
            avg=avg/i;

            System.out.println("average: "+avg+" count: "+i);
        }
        catch(ArithmeticException e){
            System.out.println("don't divide by 0");
        }
       
        System.out.println(total);
        Arrays.sort(c1.getItems());
        for (Clothing_LopezCalo item : c1.getItems()) {
            System.out.println(item.toString());
        }
    }

}