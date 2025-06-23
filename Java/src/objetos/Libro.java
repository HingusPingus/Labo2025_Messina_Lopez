package objetos;

import enums.LibroEnum;
import personas.Autor;
import personas.Persona;
import conceptos.Fecha;

public class Libro{
    private String titulo;
    private Autor autor;
    private int ISBN;
    private int paginas;
    private LibroEnum editorial;
    private Fecha fechaPublicacion;

    public Libro(){
        this.titulo="Carlitos y el Sanguche de Milanesa Místico";
        this.autor=new Autor();
        this.ISBN=6991218;
        this.paginas=69;
        this.editorial=LibroEnum.EL_ATENEO;
        this.fechaPublicacion= new Fecha(28,7,1986);
    }
    public Libro(String titulo){
        this.titulo=titulo;
        this.autor=new Autor();
        this.ISBN=6991218;
        this.paginas=69;
        this.editorial=LibroEnum.ATLÁNTIDA;
        this.fechaPublicacion= new Fecha(28,7,1986);
    }
    public Libro(String titulo, Autor autor, int paginas, int ISBN, LibroEnum editorial, Fecha fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public LibroEnum getEditorial() {
        return editorial;
    }

    public void setEditorial(LibroEnum editorial) {
        this.editorial = editorial;
    }

    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void mostrarInfo(){
        this.autor.mostrarTodo();
        System.out.println(this.titulo+" "+this.ISBN+" "+this.paginas+" "+this.editorial+" ");
        this.fechaPublicacion.corta();
    }

    public void anteriorQue(Libro l1){
        Fecha f1=l1.getFechaPublicacion();
        this.fechaPublicacion.mayorQue(f1.getDia(),f1.getMes(),f1.getAnio());
    }
}
