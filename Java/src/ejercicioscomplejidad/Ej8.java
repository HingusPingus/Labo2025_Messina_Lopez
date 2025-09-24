package ejercicioscomplejidad;

import java.util.ArrayList;

public class Ej8 {
    public static void main(String[] args) {
        int[] v1={1,4,5,8,9,15,100};
        int[] v2={2,3,6,7,10,15,90,98};
        int[] resultado=concatenar(v1,v2);

        for(int i:resultado){
            System.out.println(i);
        }
    }

    public static int[] concatenar(int[] v1,int[] v2){
        int[] resultado = new int[v1.length+v2.length];
        int aux=0;
        for (int i = 0; i < v1.length; i++) {
            if(aux<v2.length) {
                for (int j = 0; j < v2.length; ) {
                    if (v2[j] <= v1[i]) {
                        resultado[aux] = v2[j];
                        aux++;
                        j++;

                    } else {
                        resultado[aux] = v1[i];
                        aux++;
                        if (i < v1.length - 1) {
                            i++;

                        }
                    }
                }
            }
            resultado[aux]=v1[i];
            aux++;
        }

        return resultado;
    }
}
