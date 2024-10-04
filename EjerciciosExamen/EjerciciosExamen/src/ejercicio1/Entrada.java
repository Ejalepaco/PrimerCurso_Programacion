package ejercicio1;

import java.util.Scanner;

public class Entrada { // EJERCICIO COMBINACION CAJA FUERTE

    public static void main(String[] args) {

        int combinacionCajaFuerte = (int) (Math.random() * (5000 - 1000 + 1)) + 1000;

        // Inicializar el contador de intentos
        int intentos = 5;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca la combinación
        while (intentos > 0) {
            System.out.print("Introduce la combinación de la caja fuerte: ");
            int intento = scanner.nextInt();

            // Verificar si el intento coincide con la combinación de la caja fuerte
            if (intento == combinacionCajaFuerte) {
                System.out.println("¡Enhorabuena, has abierto la caja!");
                break;
            } else {
                intentos--;
                System.out.println("Error, te quedan " + intentos + " intentos.");
            }
        }

        // Cerrar el scanner
        scanner.close();

        // Si se agotan los intentos y no se abre la caja, mostrar mensaje de error
        if (intentos == 0) {
            System.out.println("Se han agotado los intentos. La caja fuerte permanece cerrada.");
        }
    }
    }

