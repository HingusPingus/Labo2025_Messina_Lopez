package unidad1;

import java.util.ArrayList;

public class Alumno {
    private Persona estudiante;
    private Fecha fechaNacimiento;
    private ArrayList<Double> notas;
    private ArrayList<Materia> listaMaterias;

    public Alumno(Persona estudiante, Fecha fechaNacimiento, ArrayList<Double> notas, ArrayList<Materia> listaMaterias) {
        this.estudiante = estudiante;
        this.fechaNacimiento = fechaNacimiento;
        this.notas = notas;
        this.listaMaterias=listaMaterias;
    }

    public Alumno() {
        this.estudiante = new Persona("Carlos","Gómez", 21,"Habana 4825");
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

    public Persona getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Persona estudiante) {
        this.estudiante = estudiante;
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
