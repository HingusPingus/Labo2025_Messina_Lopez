package controlLlamadas;

import java.util.ArrayList;

public class Empleado {
    private String nombre, apellido;
    private int dni;
    private String pais;
    private int telefono;

    public Empleado(String nombre, String apellido, int dni, String pais, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.pais = pais;
        this.telefono = telefono;
    }

    public Empleado(){
        nombre="a";
        apellido="b";
        dni=1234;
        pais="fnjis";
        telefono=816498;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int sumLlamadasExterior(ArrayList<Llamada> llamadas){
        int aux=0;
        for(Llamada l:llamadas){
            if(this==l.getEmpOrigen()){
                if(this.getPais().equals(l.getEmpDestino().getPais())){
                }
                else{
                    aux+=l.getDuracion();
                }
            }
        }
        return aux;
    }
    public ArrayList<Llamada> llamadasEmpleado(ArrayList<Llamada> llamadas){
        ArrayList<Llamada> llamadasEmp=new ArrayList<>();
        for(Llamada l:llamadas){
            if(this==l.getEmpOrigen()){
                llamadasEmp.add(l);
            }
        }
        return llamadasEmp;
    }
}
