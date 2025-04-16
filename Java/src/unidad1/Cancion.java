package unidad1;

public class Cancion {
    private String titulo;
    private persona autor;

    public Cancion(){
        this.autor=new persona();
        this.titulo="Puente";
    }

    public Cancion(persona autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
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
}
