package nullpointer;

public class Main {
    static String nombre = null;


    public static void metodoPrint() throws NullPointerException{
        System.out.println("El largo del nombre es:" + nombre.length());
    }

    public static void nombreLongitudmenora4(String n) throws MuyChico{
        if(n.length()<4){
            throw new MuyChico("un nombre no puede tener menos de 4 caracteres.");
        }

    }

    public static void Main(String[] args){


        try{
            System.out.println("El largo del nombre es:" + nombre.length());
        }
        catch(NullPointerException n){
            System.err.println("Nombre no tiene un valor asignado.");
        }
        finally{
            System.out.println("Messina");
        }
        try{
            if(nombre==null){
                throw new NullPointerException("no puso nombre");
            }
        }
        catch(Exception n){
            System.err.println(n);
        }
        finally{
            System.out.println("Messina");
        }
        try{
            metodoPrint();
        }
        catch(NullPointerException n){
            System.err.println("nombre no tiene nombre");
        }
        try{
            nombreLongitudmenora4(nombre);
        }
        catch(MuyChico m){

        }
    }

}
