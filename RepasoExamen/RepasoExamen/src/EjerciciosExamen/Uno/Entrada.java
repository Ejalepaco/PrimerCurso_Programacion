package EjerciciosExamen.Uno; // Metodo sort, ejercicio 20 notas para alumnos


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        ArrayList<Integer> notas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double media = 0.0;
        int aprobados = 0;
        int suspensos = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce la nota");
            int nota = sc.nextInt();
            notas.add(nota);

            if (nota>=5){
                aprobados++;

            }else if (nota<=5) {
                suspensos++;
            }
            media += nota;
        }

        Collections.sort(notas);

        System.out.println("La media de las notas es "+media/notas.size());
        System.out.println("La nota mas alta es "+notas.get(notas.size()-1));
        System.out.println("La nota mas baja es "+notas.get(0));
        System.out.println("El numero de aprobados es "+aprobados);
        System.out.println("El numero de suspensos es "+suspensos);


    }
}
