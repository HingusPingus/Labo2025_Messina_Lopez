package ejercicios0;

import java.util.ArrayList;

public class DivisibleWhile {
    public static void main(String[] args) {
        int dos = 2;
        int tres = 3;
        int aux = 0;
        ArrayList<Integer>multiplos = new ArrayList<Integer>();
        boolean loop=true;
        while(loop){
            if(dos<tres){
                dos=dos+2;
            }
            else if(dos>tres){
                tres=tres+3;
            }
            else if(dos==tres) {
                multiplos.add(dos);
                aux++;
                dos=dos+2;
            }
            if(dos>=100 && tres>=100){
                loop=false;
            }
        }
        for(int i=0; i<multiplos.size();i++){
            System.out.print(multiplos.get(i) +", ");
        }
    }
}
