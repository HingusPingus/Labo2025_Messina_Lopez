package ejercicios0;
import java.util.Scanner;

public class dia_laboral {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String dia;
        dia=a.nextLine();
        switch(dia){
            case "Lunes":
                System.out.println("Laboral");
                break;
            case "Martes":
                System.out.println("Laboral");
                break;
            case "Miercoles":
                System.out.println("Laboral");
                break;
            case "Jueves":
                System.out.println("Laboral");
                break;
            case "Viernes":
                System.out.println("Laboral");
                break;
            case "Sabado":
                System.out.println("No laboral");
                break;
            case "Domingo":
                System.out.println("No laboral");
                break;
            default:
                System.out.println("escribi bien");
        }
    }
}
