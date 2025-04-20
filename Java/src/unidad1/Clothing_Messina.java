public class Clothing_Messina {
    private String description;
    private double price;
    private String size;

    public Clothing_Messina(){
        this.description="cosa";
        this.price=10;
        this.size="M";
    }
    public Clothing_Messina(String description, double price, String size){
        this.description=description;
        this.price=price;
        this.size=size;
    }
    public String getDesc(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public String getSize(){
        return size;
    }
    public static void main(String[] args) {
        double tax=0.2;
        double total;
        Clothing_Messina item1=new Clothing_Messina("Blue Jacket", 20.9, "M");
        Clothing_Messina item2=new Clothing_Messina("Orange T-shirt", 10.5, "S");
        System.out.println(item1.getDesc()+","+item1.getPrice()+","+item1.getSize());
        System.out.println(item2.getDesc()+","+item2.getPrice()+","+item2.getSize());
        total=(item2.getPrice()*2)+item1.getPrice();
        total=total-(tax*total);
        System.out.println(total);
    }
}
