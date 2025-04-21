package unidad1;

public class libro{
    private String titulo;
    private Persona autor;
    private int ISBN;
    private int paginas;
    private String editorial;
    private Fecha fechaPublicacion;

    public libro(){
        this.titulo="Carlitos y el Sanguche de Milanesa Místico";
        this.autor=new Persona();
        this.ISBN=6991218;
        this.paginas=69;
        this.editorial="Editorial sumamente real";
        this.fechaPublicacion= new Fecha(28,7,1986);
    }
    public libro(String titulo){
        this.titulo=titulo;
        this.autor=new Persona();
        this.ISBN=6991218;
        this.paginas=69;
        this.editorial="Editorial sumamente real";
        this.fechaPublicacion= new Fecha(28,7,1986);
    }
    public libro(String titulo, Persona autor, int paginas, int ISBN, String editorial, Fecha fechaPublicacion) {
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

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
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

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
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

    public void anteriorQue(libro l1){
        Fecha f1=l1.getFechaPublicacion();
        this.fechaPublicacion.mayorQue(f1.getDia(),f1.getMes(),f1.getAnio());
    }
}
