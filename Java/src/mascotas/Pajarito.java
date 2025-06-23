package mascotas;

import personas.Persona;

public class Pajarito extends Terrestre{
    private String canto;

    public Pajarito(String nombre, Duenio duenio, String canto) {
        super(nombre, duenio);
        this.canto = canto;
    }

    public Pajarito(String nombre, Duenio duenio) {
        super(nombre, duenio);
        this.canto = "pio";
    }
    public Pajarito(Duenio duenio) {
        super(duenio);
        this.canto="pio";
    }

    public String getCanto() {
        return canto;
    }

    public void setCanto(String canto) {
        this.canto = canto;
    }

    @Override
    public String saludo(Duenio usuario) {
        String saludo="";
        int felicidad=this.getFelicidad();
        if(usuario.equals(this.getDuenio())) {
            for (int i = 0; i < felicidad; i++) {

                saludo = saludo + canto+" ";

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
