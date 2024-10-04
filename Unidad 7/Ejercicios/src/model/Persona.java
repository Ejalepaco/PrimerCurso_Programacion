package model;

public class Persona {

    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;

public Persona (){}

    public Persona (String nombre, String apellido, String dni, int edad, int altura, double peso){
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.edad = edad;
    this.altura = altura;
    this.peso = peso;
    }

}
