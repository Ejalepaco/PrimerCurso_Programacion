package ejercicio6;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = 0; //inicializo

        do {
            System.out.println("1. Introduce nombre");
            System.out.println("2. Introduce apellido");
            System.out.println("3. Introduce dni");
            System.out.println("4. Introduce email");
            System.out.println("5. Salir");
            System.out.println("Que opcion eliges");
            opcion = scanner.nextInt();


        }while (opcion!=5); // opcion distinta a cinco

    }
}
