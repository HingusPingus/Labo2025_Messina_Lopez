package ejercicios;

import java.util.Scanner;

public class IntrocucirNumeros {
    public static void main(String[] args) {
        Scanner asd= new Scanner(System.in);
        int numero=0;
        int cantidad=-1;
        while(numero!=-1){
            cantidad++;
            numero=asd.nextInt();

        }
        System.out.println(cantidad);
    }
}
