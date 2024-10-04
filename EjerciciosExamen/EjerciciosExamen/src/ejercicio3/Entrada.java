package ejercicio3; // Calculo IMC

import java.util.Scanner;

public class Entrada {

    /*
    2.	Realiza las siguientes acciones dentro de una misma clase:
a.	Una clase llamada Entrada que contenga un método main. Realiza las siguientes acciones dentro de la clase
i.	Crea las siguientes variables: nombre, apellido, edad, altura, peso, sexo (M/F). Pon el tipo que consideres correcto
ii.	Pide por consola cada uno de los datos anteriores y guárdalos en las variables
iii.	Crea una variable llamada IMC
b.	Crea un método estático llamado calculoIMC el cual pida por parámetros el peso (en kg) y la altura (en m).
Este método retornará el valor obtenido en la siguiente fórmula peso
c.	En el método main, iguala el valor de la variable IMC al retorno del método creado en el punto anterior
d.	Imprime por consola un mensaje con el siguiente formato

“Hola Borja tu IMC teniendo en cuenta tu altura de 174cm y tu peso de 68kg, tiene un valor de 19,54”

    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombre, apellido, sexo;
        int edad, altura, peso;
        double imc = 0.0;

        System.out.println("Dime tu nombre");
        nombre = scanner.next();
        System.out.println("Dime tu apellido");
        apellido = scanner.next();
        System.out.println("Dime tu sexo (M/F)");
        sexo = scanner.next();
        System.out.println("Dime tu edad");
        edad = scanner.nextInt();
        System.out.println("Dime tu altura en cm");
        altura = scanner.nextInt();
        System.out.println("Dime tu peso");
        peso = scanner.nextInt();

        imc = calculoIMC(peso,altura);

        System.out.println("Hola "+nombre +" tu IMC teniendo en cuenta tu altura de "+altura +" y tu peso de "
        +peso +" tiene un valor de "+imc);

    }

    public static double calculoIMC(int peso, int altura) {
        double imc = peso / Math.pow(((double) altura /100),2);
        return imc;
    }
}
