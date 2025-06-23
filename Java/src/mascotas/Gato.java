package mascotas;

import personas.Persona;

public class Gato extends Terrestre{

    public Gato() {
        super();
    }

    public Gato(String nombre, Duenio duenio) {
        super(nombre, duenio);
    }
    public Gato( Duenio duenio) {
        super(duenio);
    }

    @Override
    public String saludo(Duenio usuario){
        String saludo="";
        int felicidad=this.getFelicidad();
        for (int i = 0; i <felicidad ; i++) {
            if(this.getDuenio().equals(usuario)){
                saludo=saludo+"MIAU! ";
            }
            else{
                saludo=saludo+"miau ";
            }
        }
        if(felicidad>1){
            this.setFelicidad(felicidad-1);
        }
        return saludo;
    }

    @Override
    public String quienSoy() {
        return "Gato";
    }
}
