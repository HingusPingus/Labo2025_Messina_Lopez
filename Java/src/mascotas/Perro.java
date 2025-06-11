package mascotas;

import personas.Persona;

public class Perro extends Terrestre{
    public Perro(){
        super();
    }
    public Perro(String nombre, Persona duenio) {
        super(nombre, duenio);
    }

    @Override
    public String saludo(Persona usuario){
        String saludo="";
        int felicidad=this.getFelicidad();
        for (int i = 0; i <felicidad ; i++) {
            if(usuario.equals(this.getDuenio())){
                saludo=saludo+"GUAU!";
            }
            else{
                saludo=saludo+"guau";
            }
        }
        if(felicidad>1){
            this.setFelicidad(felicidad--);
        }
        return saludo;
    }

    @Override
    public String quienSoy() {
        return "Perro";
    }
}
