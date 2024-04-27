package model;

public class Ensayo extends Libro{
private String genero;

    public Ensayo(String autor, String titulo, int numeroPaginas, String isbn, String genero) {
        super(autor, titulo, numeroPaginas, isbn);
        this.genero = genero;
    }

    public Ensayo() {}

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Ensayo "+genero);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
