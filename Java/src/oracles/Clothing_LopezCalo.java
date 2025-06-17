package oracles;


public class Clothing_LopezCalo {

    
    private String description;
    private double price;
    private String size;
    private static double minPrice=10;
    private static double tax=0.2;


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
        return this.price*(1+tax);
    }
    public String getSize(){
        return this.size;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setPrice(double price){
        if(price>=minPrice){
            this.price=price;
        }
    }
    public void setSize(String size){
        this.size=size;
    }
    public static double getMinPrice() {
        return minPrice;
    }

    public static void setMinPrice(double minPrice) {
        Clothing_LopezCalo.minPrice = minPrice;
    }

    public static double getTax() {
        return tax;
    }

    public static void setTax(double tax) {
        Clothing_LopezCalo.tax = tax;
    }
    @Override
    public String toString(){
        return this.description+", "+this.price+", "+this.size;
    }
}