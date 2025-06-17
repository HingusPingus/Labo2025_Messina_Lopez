package oracles;

public class Customer_LopezCalo {
    private String name;
    private String size;
    private Clothing_LopezCalo [] items;
    private int currentSize;

    public Customer_LopezCalo(){
        this.name="Carlitos";
        this.currentSize=0;
    }

    public Customer_LopezCalo(String name){
        this.name=name;
        this.currentSize=0;
    }
    public String getSize(){
        return this.size;
    }
    public void setSize(String size){
        this.name=size;
    }
    public void addItem(Clothing_LopezCalo item){
        this.items[this.currentSize]=item;
        this.currentSize++;
    }

    public Clothing_LopezCalo[] getItems() {
        return this.items;
    }   

    public void setSize(int measurement){
    switch(measurement){
        case 1, 2, 3:
            setSize("S");
            break;
        case 4, 5, 6:
            setSize("M");
            break;
        case 7, 8, 9:
            setSize("L");
            break;
        default:
            setSize("X");
    }
}
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public double getTotalClothingCost(){
        double total = 0;
        for(Clothing_LopezCalo item:items){
            if(item.getSize().equals(this.size)){
                total+=item.getPrice();
System.out.println(item.getDescription()+", "+item.getPrice()+", "+item.getSize());
            }
            if(total>15){
                break;
            }
        }
    return total;
}
}
