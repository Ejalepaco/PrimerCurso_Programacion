package ejercicio5;

import ejercicio5.model.Estudiante;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Paco", 6, 7, 8);
        Estudiante estudiante2 = new Estudiante("Domingo", 8, 5, 6);

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);

        // Mostrar datos por pantalla de los estudiantes

        for (Estudiante estudiante: listaEstudiantes) {
            System.out.println(estudiante.getNombre());
            System.out.println(estudiante.getNota1());
            System.out.println(estudiante.getNota2());
            System.out.println(estudiante.getNota3());
            estudiante.calcularMedia();

        }


    }
}
