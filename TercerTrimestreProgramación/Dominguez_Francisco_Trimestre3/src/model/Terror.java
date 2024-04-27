package model;

public class Terror extends Libro{
private String calificacion;

    public Terror(String autor, String titulo, int numeroPaginas, String isbn, String calificacion) {
        super(autor, titulo, numeroPaginas, isbn);
        this.calificacion = calificacion;
    }

    public Terror() {}

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Calificacion "+calificacion);
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
}
