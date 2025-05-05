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
}
