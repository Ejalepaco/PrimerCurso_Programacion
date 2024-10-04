package Ejercicio1;

import java.util.Scanner;

public class NumeroEntero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int numeroEntero = scanner.nextInt();

        boolean multiploVeinte = (numeroEntero % 20 == 0);
        boolean dentroRango = (numeroEntero >= -100 && numeroEntero < 100);

        if (multiploVeinte && dentroRango){
            System.out.println("El numero introducido es multiplo de 20 y esta en el rango -100 y 100");
    } else if (multiploVeinte) {
            System.out.println("El numero introducido es multiplo de 20 pero no esta en rango");
        } else if (dentroRango) {
            System.out.println("El numero introducido esta en el rango pero no es multiplo de 20");

        }else {
            System.out.println("El numero introducido no es multiplo ni esta en el rango");
        }

    }
    }
