package ejercicio2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*
1.	Realizar un programa que pida por teclado las 20 notas (5 para rapidez) de todos los alumnos de una clase y las guarde dentro de una colección.
(Puede ser array o arraylist) Al finalizar, imprimir por pantalla los siguientes datos:
a.	La nota más alta obtenida
b.	La nota más baja obtenida
c.	La cantidad de aprobados
d.	La cantidad de suspensos
e.	La nota media

Creo las variables que necesitaré

 */
public class Entrada {

    public static void main(String[] args) {

        double media = 0.0;
        int aprobados = 0;
        int suspensos = 0;


        ArrayList<Integer> notas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("introduce la nota");
            int nota = scanner.nextInt();
            notas.add(nota);
            if (nota < 5) {
                suspensos++;
            } else if (nota >= 5) {
                aprobados++;
            }
            media += nota;

        }
        Collections.sort(notas);

        System.out.println("La nota media es "+media/(notas.size()));
        System.out.println("El numero de aprobados es " + aprobados);
        System.out.println("El numero de suspensos es " + suspensos);
        System.out.println("La nota mas alta es " + notas.get(notas.size()-1));
        System.out.println("La nota mas baja es " + notas.get(0));





    }
}
