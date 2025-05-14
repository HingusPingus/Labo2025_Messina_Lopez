package vehiculos;

public class Auto extends Automovil {
    private boolean descapotable;

    public Auto(){
        super();
        this.descapotable = false;
    }

    public Auto(String marca, String modelo, String color, int ruedas, int fechaFabricacion, String patente, boolean descapotable) {
        super(marca, modelo, color, ruedas, fechaFabricacion, patente);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
}
