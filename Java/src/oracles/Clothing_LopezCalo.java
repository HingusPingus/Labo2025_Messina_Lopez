package oracles;


public class Clothing_LopezCalo {
    private String description;
    private double price;
    private String size;

    public Clothing_LopezCalo(){
        this.description = "Black T-Shirt";
        this.price = 10.99;
        this.size = "M";
    }
    public Clothing_LopezCalo(String description, double price, String size){
        this.description = description;
        this.price = price;
        this.size = size;
    }
    public String getDescription(){
        return this.description;
    }
    public double getPrice(){
        return this.price;
    }
    public String getSize(){
        return this.size;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setSize(String size){
        this.size=size;
    }
}