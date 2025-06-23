package mascotas;

import personas.Persona;

public class Pez extends Mascota{
    private int vidas;
    private boolean muerto;

    public Pez() {
        super();
        this.vidas = 10;
        this.muerto=false;
    }

    public Pez(String nombre, Duenio duenio) {
        super(nombre, duenio);
        this.vidas = 10;
        this.muerto=false;
    }
    public Pez(Duenio duenio) {
        super(duenio);
        this.vidas=10;
        this.muerto=false;
    }

    public int getVidas() {
        return vidas;
    }

    public boolean isMuerto() {
        return muerto;
    }

    @Override
    public String saludo(Duenio usuario) {
        if(this.getDuenio().equals(usuario)){
            if(this.vidas<=1){

                this.muerto=true;
            }
            this.vidas--;
            return "glub glub";
        }
        else{
            this.vidas=0;
            this.muerto=true;
            return"me muero";
        }
    }

    @Override
    public String quienSoy() {
        return "Pez";
    }

    @Override
    public void alimentarM() {
        if(this.vidas<10){
            this.vidas++;
        }
    }
}
