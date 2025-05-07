package organizaciones;

import java.time.LocalDate;
import java.util.ArrayList;

public class BancoNacion {
    private String direccion;
    private boolean bool1;
    private boolean bool2;
    private ArrayList<Persona> trabajadores;

    public BancoNacion(String direccion, boolean bool1, boolean bool2) {
        this.direccion = direccion;
        this.bool1 = bool1;
        this.bool2 = bool2;
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

    public boolean isbool2() {
        return bool2;
    }

    public void setbool2(boolean bool2) {
        this.bool2 = bool2;
    }

    public boolean isbool1() {
        return bool1;
    }

    public void setbool1(boolean bool1) {
        this.bool1 = bool1;
    }

    public void agregarTrabajador(Persona trabajador){
        this.trabajadores.add(trabajador);
    }

    public int cantidadTrabajadores(){
        return this.trabajadores.size();
    }

    public Persona empleadoMayorAntiguedad(){
        Persona antiguo=this.trabajadores.getFirst();
        for(Persona p: this.trabajadores){
            if(antiguo.antiguedadint()<p.antiguedadint()){
                antiguo=p;
            }

        }
        return antiguo;
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Miguel", "Lopez", 32987990,
                LocalDate.of(1985, 10, 12), LocalDate.of(2020, 5, 8));
        Persona p2 = new Persona("Juana", "Gomez", 39987990,
                LocalDate.of(1986, 7, 28));
        Persona p3 = new Persona("Candela", "Navarro", 40987990,
                LocalDate.of(1993, 2, 4), LocalDate.of(2017, 5, 25));

        BancoNacion sucursalUrquiza = new BancoNacion("Av. Triunvirato 3450", true, false);
        BancoNacion sucursalPueyrredon = new BancoNacion("Cochrane 2874", true, true);

        ArrayList<BancoNacion> sucursales = new ArrayList<>();

        sucursales.add(sucursalUrquiza);
        sucursales.add(sucursalPueyrredon);

        sucursalUrquiza.agregarTrabajador(p1);
        sucursalUrquiza.agregarTrabajador(p3);
        sucursalPueyrredon.agregarTrabajador(p2);

        sucursalPueyrredon.cantidadTrabajadores();

        for (BancoNacion b : sucursales) {
            Persona p = b.empleadoMayorAntiguedad();
            System.out.println(p.getNombre() + " " + p.antiguedad());
        }
    }
}
