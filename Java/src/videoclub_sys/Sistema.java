package videoclub_sys;

import java.util.ArrayList;

public class Sistema {
    ArrayList<Videoclub> videoclubes;

    public Sistema(ArrayList<Videoclub> videoclubes) {
        this.videoclubes = videoclubes;
    }
    public Sistema(){
        videoclubes= new ArrayList<Videoclub>();
        videoclubes.add(new Videoclub());
    }

    public ArrayList<Videoclub> getVideoclubes() {
        return videoclubes;
    }
    public void setVideoclubes(ArrayList<Videoclub> videoclubes) {
        this.videoclubes = videoclubes;
    }

    public void addVideoclub(Videoclub videoclub){
        this.videoclubes.add(videoclub);
    }
    public Videoclub masPeliculas(){
        int aux=0;
        Videoclub VCaux= new Videoclub();
        for(Videoclub VC : videoclubes){
            for(Estanteria E : VC.getEstanterias()){
                if(aux<VC.getEstanterias().size()){
                    VCaux=VC;
                }
            }
        }
        return VCaux;
    }
    public void deleteVideoclub(int posicion) {
        this.videoclubes.remove(posicion);
    }
    public void comuna(int comuna){
        int[] codigos={1008,1114,1201,1166,1107,1405,1412,1437,1406,1439,1419,1430,1429,1414,1118};
        for (Videoclub vc : this.videoclubes){
            if(vc.getCodigoPostal()==codigos[comuna+1]){
                System.out.println(vc.getDireccion());
            }
        }
    }
    public void pelisGenero(String genero){

        for(Videoclub v: this.videoclubes){
            ArrayList<Pelicula> pelisDelGenero = new ArrayList<>();
            for (Estanteria e: v.getEstanterias()) {
                for(Pelicula p:e.getEstanteria()){
                    if(p.getGenero().equalsIgnoreCase(genero)){
                        pelisDelGenero.add(p);
                    }
                }
            }
            System.out.println(v.getDireccion()+":");
            if(pelisDelGenero.isEmpty()){
                System.out.println("Este videclub no tiene pelis de ese género");
            }
            else {
                for (Pelicula p : pelisDelGenero) {
                    System.out.println(p.getNombre());
                }
            }
        }
    }
}
