package ejercicios0;

import java.util.Scanner;

public class PalabrasIguales {
    public static void main(String[] args) {
        Scanner asd= new Scanner(System.in);
        String palabra1;
        String palabra2;
        boolean igual=true;
        System.out.println("ingrese palabra 1");
        palabra1=asd.next();
        System.out.println("ingrese palabra 2");
        palabra2=asd.next();

        if (palabra1.length()!=palabra2.length()){
            igual=false;
        }
        else{
            for (int i = 0; i < palabra1.length(); i++) {
                if(palabra1.charAt(i)!=palabra2.charAt(i)){
                    igual=false;
                }
            }
        }
        if (igual){
            System.out.println("son iguales");
        }
        else{
            System.out.println("no son iguales");
        }
    }
}
