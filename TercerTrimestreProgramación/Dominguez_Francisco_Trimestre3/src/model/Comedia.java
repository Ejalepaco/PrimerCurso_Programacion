package model;

public class Comedia extends Libro {
    private String tipoHumor;


    public Comedia() {
    }

    public Comedia(String autor, String titulo, int numeroPaginas, String isbn, String tipoHumor) {
        super(autor, titulo, numeroPaginas, isbn);
        this.tipoHumor = tipoHumor;
    }
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de humor: "+tipoHumor);
    }

    public String getTipoHumor() {
        return tipoHumor;
    }

    public void setTipoHumor(String tipoHumor) {
        this.tipoHumor = tipoHumor;
    }
}
