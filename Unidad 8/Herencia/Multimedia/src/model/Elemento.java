package model;

// clase base para libro, audio, video.
// id, titulo, autor, tamaño, formato

public abstract class Elemento {

    private int id, tamanio;

    private Persona autor; // lo he creado como otra clase con sus atributos y metodos
    private String titulo, formato;

}
