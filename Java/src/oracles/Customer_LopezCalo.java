package oracles;

public class Customer_LopezCalo {
    private String name;
    private String size;
    private Clothing_LopezCalo [] items;

    public Customer_LopezCalo(){
        this.name="Carlitos";
    }

    public Customer_LopezCalo(String name){
        this.name=name;
    }
    public String getSize(){
        return this.size;
    }
    public void setSize(String size){
        this.name=size;
    }
    public void addItem(Clothing_LopezCalo item){
     //   items[itemstrue,.length()+1]=item;
    }

    public Clothing_LopezCalo[] getItems() {
    return items;
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
    //public String getName(){
    //    return this.name;
    }
    //public void setName(String name){
    //    this.name=name;
   // }

   // public double getTotalClothingCost(){
      //  double total = 0;
      //  for(Clothing_LopezCalo item:list){
         //   if(item.getSize.equals(c1.getSize)){
         //       total+=item.getPrice();
//System.out.println(item.getDescription()+", "+item.getPrice()+", "+item.getSize());
        //    }
        //    if(total>15){
         //       break;
         //   }
     //   }
    //return total;
//}
//}
