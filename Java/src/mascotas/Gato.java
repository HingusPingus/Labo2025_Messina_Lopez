package mascotas;

import personas.Persona;

public class Gato extends Terrestre{

    @Override
    public String saludo(Persona usuario){
        String saludo="";
        int felicidad=this.getFelicidad();
        for (int i = 0; i <felicidad ; i++) {
            if(usuario.equals(this.getDuenio())){
                saludo=saludo+"MIAU!";
            }
            else{
                saludo=saludo+"miau";
            }
        }
        if(felicidad>1){
            this.setFelicidad(felicidad--);
        }
        return saludo;
    }

    @Override
    public String quienSoy() {
        return "Gato";
    }
}
