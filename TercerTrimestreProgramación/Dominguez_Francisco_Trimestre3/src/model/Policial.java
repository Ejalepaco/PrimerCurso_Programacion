package model;

public class Policial extends Libro{
private String personajes;

    public Policial(String autor, String titulo, int numeroPaginas, String isbn, String personajes) {
        super(autor, titulo, numeroPaginas, isbn);
        this.personajes = personajes;
    }

    public Policial() {}

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Personajes "+personajes);
    }

    public String getPersonajes() {
        return personajes;
    }

    public void setPersonajes(String personajes) {
        this.personajes = personajes;
    }
}
