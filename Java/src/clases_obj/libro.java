package clases_obj;

public class libro{
    private String titulo;
    private persona autor;
    private int ISBN;
    private int paginas;
    private String editorial;
    private fecha fechaPublicacion;

    public libro(){
        this.titulo="Carlitos y el Sanguche de Milanesa Místico";
        this.autor=new persona();
        this.ISBN=6991218;
        this.paginas=69;
        this.editorial="Editorial sumamente real";
        this.fechaPublicacion= new fecha(28,7,1986);
    }
    public libro(String titulo){
        this.titulo=titulo;
        this.autor=new persona();
        this.ISBN=6991218;
        this.paginas=69;
        this.editorial="Editorial sumamente real";
        this.fechaPublicacion= new fecha(28,7,1986);
    }


    public libro(String titulo, persona autor, int paginas, int ISBN, String editorial, fecha fechaPublicacion) {
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

    public persona getAutor() {
        return autor;
    }

    public void setAutor(persona autor) {
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

    public fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void mostrarInfo(){
        this.autor.mostrarTodo();
        System.out.println(this.titulo+" "+this.ISBN+" "+this.paginas+" "+this.editorial+" ");
        this.fechaPublicacion.corta();
    }

    public void anteriorQue(libro l1){
        fecha f1=l1.getFechaPublicacion();
        this.fechaPublicacion.mayorQue(f1.getDia(),f1.getMes(),f1.getAnio());
    }
}
