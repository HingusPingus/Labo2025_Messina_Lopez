package sistemaDrones;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Dron> drones;

    public Sistema(ArrayList<Dron> drones) {
        this.drones = drones;
    }

    public ArrayList<Dron> getDrones() {
        return drones;
    }
    public void setDrones(ArrayList<Dron> drones) {
        this.drones = drones;
    }

}
