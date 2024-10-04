package EjerciciosExamen.Cuatro;

import java.util.Random;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        // numero entre 100 y 5000 aleatorio para clave
        int clave = (int) (Math.random() * 4001) + 1000; // sumo mil para asegurar minimo de 1000
        System.out.println(clave); // para probar la clave
        Scanner scanner = new Scanner(System.in);
        int numeroIntentos = 5;
        int claveUsuario = 0;
        boolean apertura = false;
        boolean bloqueo = false;

        // método do while, como minimo tengo que evaluar una vez. "Pide al usuario..."


        do {
            System.out.println("Indica la clave");
            claveUsuario = scanner.nextInt();
            if (claveUsuario == clave) {
                apertura = true;
            } else {
                numeroIntentos--; // resto un intento al total inicial de cinco, si no lo consigo.
                if (numeroIntentos == 0) {
                    bloqueo = true; // si gastas todos los intentos, hay bloqueo.
                }
            }
        } while (!apertura && numeroIntentos > 0); // pido intento de nuevo, si la caja está cerrada, y me
        // queden intentos.

        if (apertura) {
            System.out.println("Enhorabuena, has abierto la caja.");
        } else {
            System.out.println("Bloqueada");
        }


    }
}
