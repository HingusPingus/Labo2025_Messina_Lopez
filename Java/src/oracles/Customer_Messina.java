package oracle;
public class Customer_Messina {
private String name;
private String size;
private Clothing_Messina [] items;

public Customer_Messina(){
    this.name="pinky";
    this.size="S";
}
public Customer_Messina(String name, int measurement){
    this.name=name;
    setSize(measurement);
}

public String getName(){
    return name;
}
public String getSize() {
    return size;
}
public Clothing_Messina[] getItems() {
    return items;
}

public void setName(String name) {
    this.name = name;
}
public void setSize(String size) {
    this.size = size;
}
public void setItems(Clothing_Messina[] items) {
    this.items = items;
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
public double getTotalClothingCost(Clothing_Messina[] items){
    double total = 0;
    for(Clothing_Messina item : items){
        if(getSize().equals(item.getSize())){
            total+=item.getPrice();
            if(total<15){ break;}
        }
    }
    return total;
}
    public static void main(String args[]){
        Customer_Messina c1=new Customer_Messina();
        System.out.println("Nombre: "+c1.getName());
    }
}