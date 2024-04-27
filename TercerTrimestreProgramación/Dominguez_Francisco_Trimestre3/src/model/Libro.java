package model;

public abstract class Libro {

    private String autor, titulo, isbn;
    private int numeroPaginas;

    public Libro(String autor, String titulo, int numeroPaginas, String isbn) {

        this.autor = autor;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.isbn = isbn;

    }

    public Libro() {
    } // constructor vacio (Hibernate)

    public void mostrarDatos() {
        System.out.println("autor "+ autor);
        System.out.println("titulo "+ titulo);
        System.out.println("numeroPaginas "+ numeroPaginas);
        System.out.println("isbn "+ isbn);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
