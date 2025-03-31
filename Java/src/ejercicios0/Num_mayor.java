package ejercicios0;
import java.util.Scanner;

public class Num_mayor {
    public static void main(String[] args) {
        Scanner may=new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese primer numero.");
        num1=may.nextInt();
        System.out.println("Ingrese segundo numero.");
        num2=may.nextInt();
        if(num1>num2){
            System.out.println("Primer numero es mayor que segundo.");
        }
        else if(num1<num2){
            System.out.println("Segundo numero es mayor que primero.");
        }
        else{
            System.out.println("Los numeros son iguales.");
        }
    }
}