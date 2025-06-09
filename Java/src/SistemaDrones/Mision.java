package SistemaDrones;

public class Mision {
    private double longitudOrigen;
    private double latitudOrigen;
    private double longitudDestino;
    private double latitudDestino;

    private double LonOrgToRadians(){
        double lat1Rad = Math.toRadians(latitudOrigen);
        return lat1Rad;
    }
    private double LatOrgToRadians(){
        double lon1Rad = Math.toRadians(longitudOrigen);
        return lon1Rad;
    }
    private double LonDestToRadians(){
        double lat1Rad = Math.toRadians(latitudOrigen);
        return lat1Rad;
    }
    private double LatDestToRadians(){
        double lat1Rad = Math.toRadians(latitudOrigen);
        return lat1Rad;
    }


}
