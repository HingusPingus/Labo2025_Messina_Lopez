package organizaciones;

import java.util.ArrayList;

public class BancoNacion {
    private String direccion;
    private boolean bolas1;
    private boolean bolas2;
    private ArrayList<Persona> trabajadores;

    public BancoNacion(String direccion, boolean bolas1, boolean bolas2) {
        this.direccion = direccion;
        this.bolas1 = bolas1;
        this.bolas2 = bolas2;
        this.trabajadores = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Persona> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Persona> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public boolean isBolas2() {
        return bolas2;
    }

    public void setBolas2(boolean bolas2) {
        this.bolas2 = bolas2;
    }

    public boolean isBolas1() {
        return bolas1;
    }

    public void setBolas1(boolean bolas1) {
        this.bolas1 = bolas1;
    }
}
