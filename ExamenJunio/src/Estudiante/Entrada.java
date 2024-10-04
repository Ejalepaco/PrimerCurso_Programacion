package Estudiante;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Juan", 27, 3.2, 5.6, 8.3);
        Estudiante estudiante2 = new Estudiante("Ana", 35, 7.4, 6.5, 3.9);

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        estudiante2.calcularMedia();
        estudiante1.calcularMedia();


    }
}
