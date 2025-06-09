package electronicos;

public class Televisor extends Multimedia{
    private Tecnologia tecnologia;

    public Televisor( ) {
        this.tecnologia = Tecnologia.CUATROKA;
    }

    public Televisor(String nombre, double precio, int stock, Tecnologia tecnologia) {
        super(nombre, precio, stock);
        this.tecnologia = tecnologia;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }
}
