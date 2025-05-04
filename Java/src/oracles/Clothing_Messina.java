package oracle;
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
    
}
