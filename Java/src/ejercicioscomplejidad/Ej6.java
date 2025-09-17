package ejercicioscomplejidad;

import java.util.ArrayList;

public class Ej6 {
    public static void main(String[] args) {
        ArrayList<Integer> secuenciaNumeros=new ArrayList<>();
        secuenciaNumeros.add(1);
        secuenciaNumeros.add(2);
        secuenciaNumeros.add(3);
        secuenciaNumeros.add(4);
        secuenciaNumeros.add(5);
        secuenciaNumeros.add(6);
        secuenciaNumeros.add(7);
        System.out.println(elementosImpares(secuenciaNumeros));


    }

    public static int elementosImpares(ArrayList<Integer> lista){
        int j=0;
        for (int i = 0; i < lista.size(); i++) {

            if(lista.get(i)%2==1){
                j++;
            }

        }
        return j;
    }
}
