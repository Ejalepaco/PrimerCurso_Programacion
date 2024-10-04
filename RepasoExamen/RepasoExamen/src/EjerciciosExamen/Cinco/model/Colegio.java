package EjerciciosExamen.Cinco.model;

import java.util.ArrayList;

public class Colegio {

    private ArrayList<Alumno> listaAlumnos;

    private int contador = 0;

    // métodos: listarAlummno, darAlta (Alumno alumno) en ArrayList, calificarAlumno (int matricula, double calificacion


    public Colegio() {

        listaAlumnos = new ArrayList<>();
        contador = 1; // incializo el contador para que no comience en cero.
    }

    public void darAlta(Alumno alumno) {
        alumno.setMatricula(contador);// cuando meto alumno en la lista, la matricula cambia.
        this.listaAlumnos.add(alumno);
        contador++;
    }

    public void listarAlumnos() {
        for (Alumno alumno : listaAlumnos) {
            alumno.mostrarDatos();
        }

    }

    public void calificarAlumno(int matricula, double calificacion){
         Alumno alumno = null;

         for ( Alumno alumnoItem : listaAlumnos){
             if (alumnoItem.getMatricula() == matricula){ // si la matricula es la misma, lo añado al item y rompo la búsqueda.
                 alumno = alumnoItem;
                 break;
             }
        }
         if (alumno!=null){
             alumno.setCalificacion(calificacion);
         }else {
             System.out.println("No se puede calificar, no existe");
         }
    }

}
