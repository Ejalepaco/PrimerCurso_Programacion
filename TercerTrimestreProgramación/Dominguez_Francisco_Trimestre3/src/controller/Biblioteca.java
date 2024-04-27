package controller;

import model.*;

import java.util.ArrayList;


public class Biblioteca { // Controller
    private String nombre, director;
    private int maximoNumeroLibros;

    public Biblioteca(String nombre, String director) {
        this.catalogo = new ArrayList<>();
        this.nombre = nombre;
        this.director = director;
    }

    ArrayList<Libro> catalogo;

    // Buscar informacion de un libro del catalogo con sus datos completos


    // Construir catalogo: numero de libros

    public void crearCatalogo(int numeroLibros) {
        this.maximoNumeroLibros = numeroLibros;
        catalogo = new ArrayList<>(numeroLibros);
    }


    // Eliminar libros del catalogo


    // Agregar libros al catalogo
    public void agregarLibro(Libro libro) {
        // Comprobar si tengo capacidad de almacenar mas libros
        // Si tengo capacidad, añado el libro
        // Si no tengo capacidad, excepcion

        if (catalogo.size() < maximoNumeroLibros) {
            catalogo.add(libro);

        } else {
            throw new RuntimeException("No se pueden añadir mas libros");
        }

    }

    // Consultar numero de libros del catalogo

    public void mostrarCatalogo(){
        System.out.println("El numero de libros es "+catalogo.size());

        // Mostrar la informacion de todos los libros
        System.out.println("Esta es la informacion de todos los libros ");
        for (Libro libro : catalogo) {
            libro.mostrarDatos();
        }
    }

    public Libro buscarLibro(String isbn) {
        Libro libroBuscado = null;
        // Iteramos sobre todo el catalogo
        for (Libro libro: catalogo) {
            // Buscamos el libro cuyo isbn sea igual al que queremos encontrar
            if (libro.getIsbn().equals(isbn)){
                libroBuscado = libro;
                // muestro los datos
                System.out.println("Libro buscado:");
                libro.mostrarDatos();
            }
        }

        // Si no hemos encontrado el libro, es que no está
        if (libroBuscado == null) {
            System.out.println("Libro con isbn " + isbn + " no encontrado");
        }

        // Devuelvo el libro para poder reusar esta función en eliminarLibro
        return libroBuscado;
    }

    // Eliminar libros del catalogo
    public void eliminarLibro(String isbn) {
        // Buscamos el libro a eliminar
        Libro libro = buscarLibro(isbn);

        // Si no lo encuentra, salimos sin hacer nada
        if (libro == null) return;

        System.out.println("Libro con isbn " + isbn + " borrado");
        // Si lo encuentra, lo borramos
        catalogo.remove(libro);
    }





}






