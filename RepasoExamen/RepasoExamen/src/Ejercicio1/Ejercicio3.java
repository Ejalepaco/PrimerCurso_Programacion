package Ejercicio1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer entero");
        int entero1 = scanner.nextInt();
        System.out.println("Introduce el segundo entero");
        int entero2 = scanner.nextInt();
        System.out.println("Introduce el tercer entero");
        int entero3 = scanner.nextInt();

        if (entero1==(entero2+entero3)){;
        System.out.println("El primer entero es la suma de los otros dos");

        } else if (entero2==(entero1+entero3)) {
            System.out.println("El segundo entero es la suma de los otros dos");
        }
        {
            System.out.println("El tercer entero es la suma de los otros dos");

        }

    }
    }
