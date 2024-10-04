package Estudiante;

import java.util.Objects;

public class Estudiante {

    private String nombre;
    private int edad;

    private double nota1, nota2, nota3;

    public Estudiante() {
    }

    //public static void leerFichero("src/Estudiante/estudiantes.txt"){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return edad == that.edad && Double.compare(nota1, that.nota1) == 0 && Double.compare(nota2, that.nota2) == 0 && Double.compare(nota3, that.nota3) == 0 && Objects.equals(nombre, that.nombre);
    }

    public void calcularMedia(){
        double v = (nota1 + nota2 + nota3) / 3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, nota1, nota2, nota3);
    }
    public Estudiante(String nombre, int edad, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}
