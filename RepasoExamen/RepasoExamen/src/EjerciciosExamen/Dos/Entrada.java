package EjerciciosExamen.Dos;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        String nombre, sexo;
        int edad, altura, peso;
        double imc = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre completo");
        nombre = scanner.next();
        System.out.println("Introduce tu sexo (M/F)");
        sexo = scanner.next();
        System.out.println("Introduce tu edad");
        edad = scanner.nextInt();
        System.out.println("Introduce tu altura en centrímetros");
        altura = scanner.nextInt();
        System.out.println("Introduce tu peso");
        peso = scanner.nextInt();

        imc = calculoIMC(peso,altura);

        System.out.println("Hola "+nombre+" teniendo en cuenta tu altura de "+altura+" y tu peso de "+peso+"tu IMC tiene un valor de "+imc);
    }

    public static double calculoIMC(int peso, int altura){
        double imc = peso / Math.pow(((double) altura /100),2);
        return imc;

    }
}
