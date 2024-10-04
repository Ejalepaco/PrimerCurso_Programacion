package Ejercicio1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int operando1;

        System.out.println("Introduce un operando: ");
        operando1 = scanner.nextInt();

        operando1 += 20;

        operando1 *= 5;

        System.out.println("El operando con los operadores de asignacion tiene un total de: "+operando1);


    }
}
