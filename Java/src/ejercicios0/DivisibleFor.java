package ejercicios0;

import java.util.ArrayList;

public class DivisibleFor {
    public static void main(String[] args) {
        ArrayList<Integer> multiplos = new ArrayList<Integer>();

        for (int i = 1; i <= 100; i++) {
            if(i%2==0 && i%3==0){
                multiplos.add(i);
                System.out.print(i+", ");
            }

        }
    }
}
