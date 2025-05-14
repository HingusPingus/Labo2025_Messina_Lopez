package personas;

import conceptos.Fecha;
import conceptos.Materia;

import java.util.ArrayList;

public class Alumno extends Persona {
    private Fecha fechaNacimiento;
    private ArrayList<Double> notas;
    private ArrayList<Materia> listaMaterias;

    public Alumno(String nombre, String apellido, int edad, String direccion, Fecha fechaNacimiento, ArrayList<Double> notas, ArrayList<Materia> listaMaterias) {
        super(nombre, apellido, edad, direccion);
        this.fechaNacimiento = fechaNacimiento;
        this.notas = notas;
        this.listaMaterias=listaMaterias;
    }

    public Alumno() {
        super();
        this.fechaNacimiento = new Fecha(9,12,2003);
        this.notas = new ArrayList<Double>();
        this.listaMaterias=new ArrayList<Materia>();
        this.notas.add(6.0);
        this.notas.add(8.0);
        this.notas.add(7.0);
        this.notas.add(8.5);
        this.listaMaterias.add(new Materia());
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }


    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void agregarNota(double nota){
        this.notas.add(nota);
    }

    public double calculaTotal(){
        double notaTotal=0;
        for(double numero: this.notas){
            notaTotal+=numero;
        }
        return notaTotal;
    }
    public boolean menorNota(Alumno alumnoAComparar){

        if (calculaTotal()< alumnoAComparar.calculaTotal()){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean mayorNota(Alumno alumnoAComparar){

        if (calculaTotal()> alumnoAComparar.calculaTotal()){
            return true;
        }
        else {
            return false;
        }
    }
}
