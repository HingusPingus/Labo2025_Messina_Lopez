package oracles;

import java.time.LocalDate;
import java.util.ArrayList;

public class CustomerFinal_Messina extends Persona

{

    private char size;
    private ArrayList<ClothingFinal_Messina> items;


    public void addItems(ArrayList<ClothingFinal_Messina> someItems){
        items=someItems;

    }

    public CustomerFinal_Messina(int dni, int edad, LocalDate fechaNacimiento, String nombre, char size, ArrayList<ClothingFinal_Messina>items) {
        super(dni, edad, nombre, fechaNacimiento);

        this.size = size;
        this.items = items;
    }
    public CustomerFinal_Messina() {
        super(100101010, 18, "juan", LocalDate.now());
        this.size = size;
        this.items = new ArrayList<>();
    }

    public CustomerFinal_Messina(char size, ArrayList<ClothingFinal_Messina>items) {

        this.size = size;
        this.items = items;
    }

    public double getTotalClothingCost(){
        double total=0.0;

            for (ClothingFinal_Messina item : items){
                if(getSize()==item.getSize()) {
                    System.out.println("Iteams datos:"+" "+item.getDescription()+" "+ item.getPrice()+ " "+item.getSize());
                    total = total + item.getPrice();


            }
        }
            return total;
    }
    public double getPromedioClothingCost(){
    double promedio=0.0;
    int cantidad=0;
    double promi =0.0;

    for (ClothingFinal_Messina item : items){
        if(getSize()==item.getSize()) {
            System.out.println("Iteams datos:"+" "+item.getDescription()+" "+ item.getPrice()+ " "+item.getSize());
            promedio = promedio + item.getPrice();
            cantidad = cantidad+1;


        }
    }
    try{
       promi=promedio/cantidad;
    }
    catch (ArithmeticException e){
        System.out.println("no dividas por cero");
    }
    return promi;
}

    public ArrayList<ClothingFinal_Messina> getItems() {
        return items;
    }

    public void setItems(ArrayList<ClothingFinal_Messina>items) {
        this.items = items;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
    public void setSize(int mesurement){
        switch(mesurement){
            case 1,2,3:
                size = 's';
                break;
                case 4, 5, 6:
                    size='m';
                    break;
                    case 7, 8 ,9:
                        size='l';
                        break;
                        default:
                            size='x';
        }

    }


  
        public static void main(String[] args) {
           
            

          
        }
    }
