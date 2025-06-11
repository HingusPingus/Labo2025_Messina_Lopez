package mascotas;

import personas.Persona;

public class Pajarito extends Terrestre{
    private boolean cantor;
    private String canto;

    public Pajarito(String nombre, Persona duenio, String canto) {
        super(nombre, duenio);
        this.canto = canto;
        this.cantor=true;
    }

    public Pajarito(String nombre, Persona duenio) {
        super(nombre, duenio);
        this.canto = "pio";
        this.cantor=true;
    }

    @Override
    public String saludo(Persona usuario) {
        String saludo="";
        int felicidad=this.getFelicidad();
        if(usuario.equals(this.getDuenio())) {
            for (int i = 0; i < felicidad; i++) {

                saludo = saludo + canto;

            }
            if(felicidad>1){
                this.setFelicidad(felicidad--);
            }
        }
        else {
            return "";
        }
        return saludo;
    }

    @Override
    public String quienSoy() {
        return "Pajarito";
    }
}
