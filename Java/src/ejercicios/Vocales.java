package ejercicios;

public class Vocales {
    public static void main(String[] args) {
        char[] vocales={'a','A','e','E','i','I','o','O','u','U','á','é','í','ó','ú','Á','É','Í','Ó','Ú'};
        String oracion= "Ayer me compré muñecos de la marca ‘ToyCo’ por internet.";
        int cVocales=0;
        for (int i = 0; i < oracion.length(); i++) {
            for (int j = 0; j < vocales.length; j++) {
                if(vocales[j]==oracion.charAt(i)){
                    cVocales++;
                }
            }
        }
        System.out.println(cVocales);

    }
}
