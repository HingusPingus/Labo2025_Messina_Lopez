package unidad1;

import java.util.ArrayList;

public class ejercicios_array {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<String> palabras=new ArrayList<String>();
        ArrayList<Persona> personas=new ArrayList<Persona>();
        numeros.add(5);
        numeros.add(6);
        numeros.add(3);
        palabras.add("Lucas");
        personas.add(new Persona("Carlos",45,"Jose Cubas 6969"));
        int aux=0;
        char letra='l';

        for(int numero: numeros){
            aux+=numero;
        }
        System.out.println(aux);
        for(String palabra: palabras){
            if(palabra.toLowerCase().charAt(0)==letra){
                System.out.println(palabra);
            }

        }
        for(Persona persona: personas){
            if(persona.getEdad()>30){
                persona.mostrarTodo();
            }
        }

    }
}
