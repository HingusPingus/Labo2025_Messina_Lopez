package ejercicioscomplejidad;

import java.util.ArrayList;

public class Ej7 {

    public static boolean[] algo(boolean[][] matriz) {
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[0][j] ^= matriz[i][j];
            }
        }
        return matriz[0];
    }


    public static void main(String[] args) {
        boolean[][] matriz = {
                {true,  false, true,  false},
                {false, true,  true,  false},
                {true,  false, true,  false},
                {true,  true,  false, false},
                {false, true,  true,  false}
        };


        boolean[] res=algo(matriz);

        for(int i=0;i< res.length;i++){
            System.out.println(res[i]);
        }
    }
}
