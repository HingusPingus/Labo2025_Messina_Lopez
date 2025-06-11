package sistemaDrones;

public class Mision {
    private double longitudOrigen;
    private double latitudOrigen;
    private double longitudDestino;
    private double latitudDestino;
    private EstadoMision estado;

    public Mision(double longitudDestino, double latitudDestino, EstadoMision estado) {
        this.longitudOrigen = -34.573195;
        this.latitudOrigen = -58.504111;
        this.longitudDestino = longitudDestino;
        this.latitudDestino = latitudDestino;
        this.estado = estado;
    }
    public Mision(){
        longitudOrigen=-34.573195;
        latitudOrigen=-58.504111;
        longitudDestino=20;
        latitudDestino=10;
        estado=EstadoMision.SINEMPEZAR;
    }

    public double getLongitudDestino() {
        return longitudDestino;
    }

    public void setLongitudDestino(double longitudDestino) {
        this.longitudDestino = longitudDestino;
    }

    public double getLatitudDestino() {
        return latitudDestino;
    }

    public void setLatitudDestino(double latitudDestino) {
        this.latitudDestino = latitudDestino;
    }

    public EstadoMision getEstado() {
        return estado;
    }

    public void setEstado(EstadoMision estado) {
        this.estado = estado;
    }

    public double LonOrgToRadians(){
        return Math.toRadians(latitudOrigen);
    }
    public double LatOrgToRadians(){
        return Math.toRadians(longitudOrigen);
    }
    public double LonDestToRadians(){
        return Math.toRadians(latitudOrigen);
    }
    public double LatDestToRadians(){
        return Math.toRadians(latitudOrigen);
    }
    public double FormulaDeHaversine(){
        double lat1Rad = Math.toRadians(latitudOrigen);
        double lon1Rad = Math.toRadians(longitudOrigen);
        double lat2Rad = Math.toRadians(latitudDestino);
        double lon2Rad = Math.toRadians(longitudDestino);

        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double radioTierraKm = 6371;
        return radioTierraKm * c;
    }

}
