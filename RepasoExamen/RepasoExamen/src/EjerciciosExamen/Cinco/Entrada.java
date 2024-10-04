package EjerciciosExamen.Cinco;

import EjerciciosExamen.Cinco.model.Alumno;
import EjerciciosExamen.Cinco.model.Colegio;

public class Entrada {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Paco", "123");
        Alumno alumno2 = new Alumno("Lucas", "541");
        Alumno alumno3 = new Alumno("Paula", "432");
        Alumno alumno4 = new Alumno("Maria", "234");

        Colegio colegio = new Colegio();

        colegio.darAlta(alumno1);
        colegio.darAlta(alumno2);
        colegio.darAlta(alumno3);
        colegio.darAlta(alumno4);

        colegio.calificarAlumno(1, 8.8);
        colegio.calificarAlumno(2, 5.8);
        colegio.calificarAlumno(3, 4.8);
        colegio.calificarAlumno(4, 9.8);

        colegio.listarAlumnos();
    }
}
