import controller.Biblioteca;
import model.*;

public class Entrada {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Vicalvaro","Paco");
        biblioteca.crearCatalogo(4);
        Libro libro1 = new Comedia ("Isabel Allende","Violeta",90,"8401027470","Blanco");
        Libro libro2 = new Terror ("Pablo Neruda","Obras",90,"8447345041","Thriller");
        Libro libro3 = new Ensayo ("Juan Gómez Jurado","Reina Roja",90,"9877800527","Historico");
        Libro libro4 = new Policial ("Ernest Hemingway", "El viejo y el mar",90,"8497594584","Jack");
        Libro libro5 = new Ensayo("George Orwell","Rebelion en la granja",90,"8468405167","Politica");


        try{
            biblioteca.agregarLibro (libro1);
            biblioteca.agregarLibro (libro2);
            biblioteca.agregarLibro (libro3);
            biblioteca.agregarLibro (libro4);
            biblioteca.agregarLibro (libro5);
        }catch (RuntimeException e){
            System.out.println("Excepcion capturada: "+e.getMessage());
        }


        biblioteca.mostrarCatalogo();

    }
}
