package ejercicios0;
import java.util.Scanner;

public class IngresoDatos {
    public static void main(String[] args) {
        Scanner asd= new Scanner(System.in);
        int N;
        double NA;
        double A;
        double AN;
        char C;
        System.out.println("Ingrese el valor de N:");
        N=asd.nextInt();
        System.out.println("Ingrese el valor de A:");
        A=asd.nextDouble();
        System.out.println("Ingrese el valor de C:");
        C=asd.next().charAt(0);
        System.out.println("Valor de N: "+N);
        System.out.println("Valor de A: "+A);
        System.out.println("Valor de C: "+C);
        NA=N+A;
        System.out.println("N+A="+NA);
        AN=A-N;
        System.out.println("A-N="+AN);
        System.out.println("Valor numerico del caracter "+C+"="+(int)C);
    }
}