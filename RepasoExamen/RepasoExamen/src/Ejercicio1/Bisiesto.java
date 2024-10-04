package Ejercicio1;

import java.util.Scanner;

public class Bisiesto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un año para comprobar si es bisiesto");
        int year = scanner.nextInt();

        boolean esBisiesto = year % 4 == 0;

        if (esBisiesto) {
            System.out.println("El año es bisiesto");

        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}