package mascotas;

import java.util.ArrayList;

public class SistemaMascotas {
    private ArrayList<Mascota> mascotas;
    private Duenio usuario;

    public SistemaMascotas() {
        this.mascotas = new ArrayList<>();
        this.usuario = new Duenio();
    }

    public SistemaMascotas(ArrayList<Mascota> mascotas, Duenio usuario) {
        this.mascotas = mascotas;
        this.usuario = usuario;
    }

    public Duenio getUsuario() {
        return usuario;
    }

    public void setUsuario(Duenio usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void agregarMascota(Mascota mascota){
        mascotas.add(mascota);
    }
    public void eliminarMascota(Mascota mascota){
        mascotas.remove(mascota);
    }
    public void modificarMascota(Mascota mascotaV, Mascota mascotaN){
        mascotas.remove(mascotaV);
        mascotas.add(mascotaN);
    }

    public String saludar(Mascota mascota){
        return mascota.saludo(usuario);
    }
    public String saludar(Pez pez){
        String saludo =pez.saludo(usuario);
        if(pez.isMuerto()){
            mascotas.remove(pez);
        }
        return saludo;
    }

    public void alimentar(Mascota mascota){
        mascota.alimentarM();
    }
}
