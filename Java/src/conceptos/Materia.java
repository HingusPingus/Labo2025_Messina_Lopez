package conceptos;

import personas.Alumno;

import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<String> listaContenidos;
    private ArrayList<Alumno> alumnosInscriptos;

    public Materia(){
        this.nombre="Carlos";
        this.listaContenidos=new ArrayList<String>();
        this.alumnosInscriptos=new ArrayList<Alumno>();
        listaContenidos.add("a");
        alumnosInscriptos.add(new Alumno());
    }

    public Materia(ArrayList<String> listaContenidos, String nombre, ArrayList<Alumno> alumnosInscriptos) {
        this.listaContenidos = listaContenidos;
        this.nombre = nombre;
        this.alumnosInscriptos = alumnosInscriptos;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getListaContenidos() {
        return listaContenidos;
    }

    public ArrayList<Alumno> getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaContenidos(ArrayList<String> listaContenidos) {
        this.listaContenidos = listaContenidos;
    }

    public void setAlumnosInscriptos(ArrayList<Alumno> alumnosInscriptos) {
        this.alumnosInscriptos = alumnosInscriptos;
    }

    public ArrayList<Materia> addMateria(ArrayList<Materia> materias, Materia nuevaMateria){
        materias.add(nuevaMateria);
        return materias;
    }
    public ArrayList<Double> promedioEdadAlumnos(ArrayList<Materia>materias){
        double avg;
        double total=0;
        ArrayList<Double> promedio=new ArrayList<Double>();
        for(Materia materia : materias){
            for(Alumno alumno:alumnosInscriptos){
                total+=alumno.getEstudiante().getEdad();
            }
            avg=total/alumnosInscriptos.size();
            promedio.add(avg);
        }
        return promedio;
    }
    public ArrayList<Double> promedioNotasAlumno(ArrayList<Materia>materias){
        double avg;
        double total=0;
        double a=0;
        ArrayList<Double> promedio=new ArrayList<Double>();
        for(Materia materia : materias) {
            for(Alumno alumno:alumnosInscriptos){
                total=alumno.calculaTotal()/alumno.getNotas().size();
                a+=total;
            }
            avg=a/alumnosInscriptos.size();
            promedio.add(avg);
        }
        return promedio;
    }
}
