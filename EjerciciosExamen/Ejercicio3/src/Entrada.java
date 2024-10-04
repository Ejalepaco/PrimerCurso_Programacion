import java.util.Random;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(30)+1;

        int intentosMaximos = 10;

        for (int intento = 1; intento <intentosMaximos ; intento++) {
            System.out.println("Intento "+intento+": Ingresa tu numero");
            int numeroIngresado = scanner.nextInt();

            if (numeroIngresado == numeroAleatorio){
                System.out.println("Has avidinado en "+intento + " intentos");
                return;
            }else {
                System.out.println("Incorrecto, intenta de nuevo");
            }
        }
        System.out.println("Has agotado los intentos");




    }
}
