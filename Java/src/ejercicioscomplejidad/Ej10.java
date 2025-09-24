package ejercicioscomplejidad;

import java.util.HashMap;

public class Ej10 {
    public static void main(String[] args) {
        int[] v1={1,1,2,3,3,2,1,3,2,1};
        int[] resultado=ordenar(v1);
        for (int i:resultado){
            System.out.print(i);
        }
    }


    public static int[] ordenar(int[] v1){
        int[] resultado= new int[v1.length];
        HashMap<Integer,Integer> cantidad=new HashMap<>();
        cantidad.putIfAbsent(1,0);
        cantidad.putIfAbsent(2,0);
        cantidad.putIfAbsent(3,0);
        for (int i = 0; i < v1.length; i++) {
            cantidad.put(v1[i], cantidad.get(v1[i])+1);
        }
        for(int i=0;i<v1.length;i++){
            if(i<cantidad.get(1)){
                resultado[i]=1;
            }
            else if(i<cantidad.get(1)+ cantidad.get(2)){
                resultado[i]=2;
            }
            else{
                resultado[i]=3;
            }
        }

        return resultado;
    }
}
