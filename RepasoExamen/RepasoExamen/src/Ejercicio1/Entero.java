package Ejercicio1;

import java.util.Scanner;

public class Entero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero entero: ");
        int entero = scanner.nextInt();

        if (entero % 2 == 0){
            entero += 2;
            System.out.println("El numero es entero, y se incrementa en dos unidades ");
        } else if (entero % 3 == 0) {
            entero += 3;
            System.out.println("El numero es entero, multiplo de tres, y se incrementa en tres. Resultado: ");

        } else {
            System.out.println("El numero no es par, ni multiplo de tres ");
        }
    }
}
