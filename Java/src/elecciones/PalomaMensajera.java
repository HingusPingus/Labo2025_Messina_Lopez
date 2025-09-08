package elecciones;

public class PalomaMensajera extends Pajaro implements Campaña{
    private boolean conoceMapa;

    public PalomaMensajera(String color, String nombre, String especie, boolean conoceMapa) {
        super(color, nombre, especie);
        this.conoceMapa = conoceMapa;
    }

    public boolean isConoceMapa() {
        return conoceMapa;
    }

    public void setConoceMapa(boolean conoceMapa) {
        this.conoceMapa = conoceMapa;
    }

    @Override
    public String enviarMensaje() {
        if(conoceMapa){
            return "Lanzado un papelito que dice: Vote por el partido para un mejor futuro";
        }
        return"";
    }
}
