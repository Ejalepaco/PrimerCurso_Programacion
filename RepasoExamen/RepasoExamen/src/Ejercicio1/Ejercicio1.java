package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el valor del primer operando");
        int operando1 = scanner.nextInt();
        System.out.println("Introduce el valor del segundo operando");
        int operando2 = scanner.nextInt();

        System.out.println("El resultado de la suma es "+(operando2+operando1));
        //System.out.println();
        System.out.println("El resultado del resto es "+(operando2%operando1));


    }
}
