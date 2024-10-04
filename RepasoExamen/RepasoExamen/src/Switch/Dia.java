package Switch;

import java.util.Scanner;

public class Dia {

    public static void main(String[] args) {

        // Dia de la semana dependiendo el numero que el usuario inserte
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero del 1 al 7");
        int dia = scanner.nextInt();

        switch (dia){
            case 1:
                System.out.println("el dia de la semana es el lunes");
                break;

            case 2:
                System.out.println("El dia de la semana es el martes");
                break;
            case 3:
                System.out.println("El dia de la semana es el miercoles");
                break;
            case 4:
                System.out.println("El dia de la semana es el jueves");
                break;
            case 5:
                System.out.println("El dia de la semana es el viernes");
                break;

            default:
                System.out.println("El finde es para descansar");

        }


    }
}
