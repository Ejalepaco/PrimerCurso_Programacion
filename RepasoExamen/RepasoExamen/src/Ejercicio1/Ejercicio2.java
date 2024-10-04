package Ejercicio1;

import java.sql.SQLOutput;
import java.util.Scanner;

// lea dos enteros y compruebe si el primero es o no mayor que el segundo
// sout el primero es mayor que el segundo, o sout el primero no es mayor que el segundo
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo numero");
        int numero2 = scanner.nextInt();

        if (numero1<numero2){
            System.out.println("El primer numero no es mayor que el segundo");

        }else {
            System.out.println("El primer numero es mayor que el segundo");
        }
scanner.close();
    }

}
