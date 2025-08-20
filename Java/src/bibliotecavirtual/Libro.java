package bibliotecavirtual;

public class Libro {
    private static int cantDescargas =145;
    private String titulo;
    private Autor autor;
    private Genero genero;
    private int cantDescargasAct;
    private String nombrePdf;

    public Libro(String titulo, Autor autor, Genero genero, String nombrePdf) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.cantDescargasAct = cantDescargas;
        this.nombrePdf = nombrePdf;
    }

    public static int getCantDescargas() {
        return cantDescargas;
    }

    public static void setCantDescargas(int cantDescargas) {
        Libro.cantDescargas = cantDescargas;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getCantDescargasAct() {
        return cantDescargasAct;
    }

    public void setCantDescargasAct(int cantDescargasAct) {
        this.cantDescargasAct = cantDescargasAct;
    }

    public String getNombrePdf() {
        return nombrePdf;
    }

    public void setNombrePdf(String nombrePdf) {
        this.nombrePdf = nombrePdf;
    }
}
