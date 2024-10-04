import model.Estudiante;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("paco",4, 6, 8);
        Estudiante estudiante2 = new Estudiante("pedro",9,8,7);

        Estudiante.leerEstudiante("src/ejercicio3/resources/estudiantes.txt");

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);

        for ( Estudiante estudiante: listaEstudiantes ) {
            System.out.println(estudiante.getNombre());
            System.out.println(estudiante.getNota1());
            System.out.println(estudiante.getNota2());
            System.out.println(estudiante.getNota3());
            estudiante.calcularMedia();


        }

    }
}
