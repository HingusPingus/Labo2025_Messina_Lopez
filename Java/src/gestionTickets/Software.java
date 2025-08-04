package gestionTickets;

public class Software {
    private boolean parcheAplicable;

    public Software() {
        this.parcheAplicable = true;
    }

    public Software(boolean parcheAplicable) {
        this.parcheAplicable = parcheAplicable;
    }

    public boolean isParcheAplicable() {
        return parcheAplicable;
    }

    public void setParcheAplicable(boolean parcheAplicable) {
        this.parcheAplicable = parcheAplicable;
    }
}
